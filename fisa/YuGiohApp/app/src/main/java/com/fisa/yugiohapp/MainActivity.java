package com.fisa.yugiohapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.fisa.yugiohapp.dto.ArchetypeDto;
import com.fisa.yugiohapp.serviceRestInterfaces.ApiServiceRest;
import com.fisa.yugiohapp.util.Constante;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinnerMesa;

    List<ArchetypeDto> archetypeDtos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerMesa = findViewById(R.id.spinnerArchetypes);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constante.API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiServiceRest apiServiceRest = retrofit.create(ApiServiceRest.class);
        Call<List<ArchetypeDto>> call = apiServiceRest.getArchetypes();
        call.enqueue(new Callback<List<ArchetypeDto>>() {
            @Override
            public void onResponse(Call<List<ArchetypeDto>> call, Response<List<ArchetypeDto>> response) {
                archetypeDtos = response.body();
                System.out.println(archetypeDtos + "archetypeDtos");
                List<String> archetypes = new ArrayList<>();
                for (ArchetypeDto m : archetypeDtos) {
                    archetypes.add(m.getArchetype_name());
                }
                archetypes.add(0, "");
                ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, archetypes);
                dataAdapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);
                spinnerMesa.setAdapter(dataAdapter);


            }

            @Override
            public void onFailure(Call<List<ArchetypeDto>> call, Throwable t) {
                Toast.makeText(getBaseContext(), "eroor " + t.getMessage() + "", Toast.LENGTH_SHORT).show();
                Log.e("error", "error " + t.getMessage() + "");
            }
        });

        // on below line we are adding click listener for our spinner
        spinnerMesa.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
       // Toast.makeText(MainActivity.this, "" + position + " Selected..", Toast.LENGTH_SHORT).show();
        if (!spinnerMesa.getSelectedItem().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "You Select letter!.." + position  , Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getBaseContext(), CardsActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}