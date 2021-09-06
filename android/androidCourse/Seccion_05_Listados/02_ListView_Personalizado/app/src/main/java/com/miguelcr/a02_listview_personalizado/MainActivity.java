package com.miguelcr.a02_listview_personalizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    List<Averia> averiaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.listViewAverias);

        averiaList = new ArrayList<>();
        averiaList.add(new Averia("Espejo roto","Audi - A4","http://blog.mister-auto.es/wp-content/uploads/2014/09/23116650_m.jpg",2));
        averiaList.add(new Averia("Paragolpes delantero","Citroen - C4","",0));
        averiaList.add(new Averia("Embrague","Seat - Ibiza","",0));
        averiaList.add(new Averia("Cambio de aceite","Seat - Toledo","",1));

        MiAdaptadorAverias adaptadorAverias = new MiAdaptadorAverias(
                this,
                R.layout.averia_item,
                averiaList
        );

        lista.setAdapter(adaptadorAverias);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "valor "+averiaList.get(i).getTitulo()+"", Toast.LENGTH_SHORT).show();
            }
        });

    }


}
