package holamundo.tutorial.com.practicai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import holamundo.tutorial.com.practicai.modelo.Persona;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int i;

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto= (TextView) findViewById(R.id.textoEvento);
     /*   texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "HAs hecho click con escuchador!..", Toast.LENGTH_SHORT).show();
            }
        });*/
     texto.setOnClickListener(this);

        Log.i("ciclo vida","ciclo vida: onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ciclo vida","ciclo vida: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ciclo vida","ciclo vida: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ciclo vida","ciclo vida: onPause");
    }


    public void initSecundarioActivity(View view){

        Toast.makeText(this, "Has hecho click en el texto", Toast.LENGTH_SHORT).show();
        
    }


    public void iniciarIntentActivity(View view){
        Persona p= new Persona();
        p.setNombre("Edwin");
        p.setApellido("Zamora");
        p.setDireccion("Ciudadela Ejercito");
        Bundle bundle= new Bundle();
        bundle.putSerializable("persona", p);


        Intent intent= new Intent(this,IntentActivity.class);
        intent.putExtra("numero",4);
        intent.putExtras(bundle);


        startActivity(intent);

    }


    @Override
    public void onClick(View v) {
        int id= v.getId();
        if (id== R.id.textoEvento) {
            Toast.makeText(this, "Has hecho click en el texto", Toast.LENGTH_SHORT).show();
        }
    }
}
