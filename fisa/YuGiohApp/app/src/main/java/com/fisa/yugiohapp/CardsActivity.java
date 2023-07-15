package com.fisa.yugiohapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fisa.yugiohapp.dto.Root;
import com.fisa.yugiohapp.serviceRestInterfaces.ApiServiceRest;
import com.fisa.yugiohapp.util.Constante;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CardsActivity extends AppCompatActivity {
    private ListView listViewCards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);
        listViewCards = findViewById(R.id.listViewCards);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constante.API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiServiceRest apiServiceRest = retrofit.create(ApiServiceRest.class);
        Call<JsonObject> call = apiServiceRest.getCards("Nordic");
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                // ObjectMapper instantiation
                ObjectMapper objectMapper = new ObjectMapper();
                // Deserialization into the class
                Root root = null;
                try {
                    root = objectMapper.readValue(response.body().toString(), Root.class);
                    // Print information
                    CardsAdaptador adaptador = new CardsAdaptador(getBaseContext(), R.layout.cards_item, root.getData());
                    listViewCards.setAdapter(adaptador);

                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }


            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Toast.makeText(getBaseContext(), "eroor " + t.getMessage() + "", Toast.LENGTH_SHORT).show();
                Log.e("erro", "error " + t.getMessage());
            }
        });

    }
}