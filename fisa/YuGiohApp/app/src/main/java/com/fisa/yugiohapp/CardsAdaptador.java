package com.fisa.yugiohapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.fisa.yugiohapp.dto.Datum;
import com.squareup.picasso.Picasso;

import java.util.List;


public class CardsAdaptador extends ArrayAdapter<Datum> {

    Context context;
    int layoutTemplate;
    List<Datum> data;

    public CardsAdaptador(@NonNull Context context, int resource, @NonNull List<Datum> objects) {
        super(context, resource, objects);
        this.context = context;
        this.layoutTemplate = resource;
        this.data = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(context).inflate(layoutTemplate, parent, false);
        //obtener la informacion de la lista/**/
        Datum itemCurrent = data.get(position);
        //rescatar los elementos IU del template
        TextView textViewId = (TextView) v.findViewById(R.id.textViewId);
        TextView textViewName = (TextView) v.findViewById(R.id.textViewName);
        TextView textViewType = (TextView) v.findViewById(R.id.TextViewType);
        TextView textViewframeType = (TextView) v.findViewById(R.id.textViewframeType);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        TextView textViewatk = (TextView) v.findViewById(R.id.textViewatk);
        TextView textViewdef = (TextView) v.findViewById(R.id.textViewdef);
        TextView textViewLevel = (TextView) v.findViewById(R.id.textViewLevel);


        textViewId.setText(String.valueOf(itemCurrent.getId()));
        textViewName.setText(itemCurrent.getName());
        textViewType.setText(itemCurrent.getType());
        textViewType.setText(itemCurrent.getFrameType());
        Picasso.get().load(itemCurrent.getCard_images().get(0).getImage_url_small()).into(imageView);
        textViewatk.setText(String.valueOf( itemCurrent.getAtk()));
        textViewdef.setText(String.valueOf( itemCurrent.getDef()));
        textViewLevel.setText(String.valueOf(itemCurrent.getLevel()));

        return v;
    }

}
