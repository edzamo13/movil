package holamundo.tutorial.com.practicacontroles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class ControlesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controles);
    }

    public void tipoAveriaClicked(View view) {

        CheckBox checkBox = (CheckBox) view;
        boolean chequeado = checkBox.isChecked();
        String tipo = "";
        switch (view.getId()) {
            case R.id.checkBoxChapa:
                tipo = "chapa y pintura";
                break;
            case R.id.checkBoxCristal:
                tipo = "Cristal";
                break;
            case R.id.checkBoxMecanica:
                tipo = "Avería mecanica";
                break;

        }
        Toast.makeText(this, tipo + "("+ chequeado+")", Toast.LENGTH_SHORT).show();

    }
}
