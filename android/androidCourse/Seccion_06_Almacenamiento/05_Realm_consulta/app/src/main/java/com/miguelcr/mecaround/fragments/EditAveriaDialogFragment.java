package com.miguelcr.mecaround.fragments;


import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.miguelcr.mecaround.R;
import com.miguelcr.mecaround.interfaces.OnNuevaAveriaListener;
import com.miguelcr.mecaround.models.AveriaDB;

public class EditAveriaDialogFragment extends DialogFragment {

    private long idAveria;
    private String titulo, descripcion, modelo;
    AlertDialog.Builder builder;
    OnNuevaAveriaListener mListener;
    View v;
    EditText editTextTitulo, editTextDescripcion, editTextModeloCoche;
    Context ctx;

    public EditAveriaDialogFragment() {
        // Required empty public constructor
    }

    public static EditAveriaDialogFragment newInstance(long idA, String t, String d, String m) {
        EditAveriaDialogFragment fragment = new EditAveriaDialogFragment();
        Bundle args = new Bundle();
        args.putLong(AveriaDB.AVERIADB_ID, idA);
        args.putString(AveriaDB.AVERIADB_TITULO, t);
        args.putString(AveriaDB.AVERIADB_DESCRIPCION, d);
        args.putString(AveriaDB.AVERIADB_MODELOCOCHE, m);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            idAveria = getArguments().getLong(AveriaDB.AVERIADB_ID);
            titulo = getArguments().getString(AveriaDB.AVERIADB_TITULO);
            descripcion = getArguments().getString(AveriaDB.AVERIADB_DESCRIPCION);
            modelo = getArguments().getString(AveriaDB.AVERIADB_MODELOCOCHE);
        }
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        builder = new AlertDialog.Builder(getActivity());

        ctx = getActivity();

        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();

        v = inflater.inflate(R.layout.dialogo_nueva_averia, null);
        editTextTitulo = (EditText) v.findViewById(R.id.editTextTitulo);
        editTextDescripcion = (EditText) v.findViewById(R.id.editTextDescripcion);
        editTextModeloCoche = (EditText) v.findViewById(R.id.editTextModeloCoche);

        editTextTitulo.setText(titulo);
        editTextDescripcion.setText(descripcion);
        editTextModeloCoche.setText(modelo);

        builder.setView(v);

        builder.setTitle("Editando aver??a")
                .setPositiveButton("Guardar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getActivity(), "Aver??a guardada", Toast.LENGTH_SHORT).show();

                        String titulo = editTextTitulo.getText().toString();
                        String descripcion = editTextDescripcion.getText().toString();
                        String modeloCoche = editTextModeloCoche.getText().toString();
                        if(!titulo.isEmpty() && !descripcion.isEmpty() && !modeloCoche.isEmpty()) {
                            mListener.onAveriaUpdateClickListener(idAveria,titulo, descripcion, modeloCoche);

                            dialog.dismiss();
                        } else {
                            Toast.makeText(ctx, "Introduzca todos los datos", Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Cancelar > cerrar el cuadro de di??logo
                        dialog.dismiss();
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();

    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        // Verify that the host activity implements the callback interface
        try {
            // Instantiate the NoticeDialogListener so we can send events to the host
            mListener = (OnNuevaAveriaListener) activity;
        } catch (ClassCastException e) {
            // The activity doesn't implement the interface, throw exception
            throw new ClassCastException(activity.toString()
                    + " must implement OnNuevaAveriaListener");
        }
    }

}
