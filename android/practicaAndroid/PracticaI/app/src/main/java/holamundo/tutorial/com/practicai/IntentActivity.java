package holamundo.tutorial.com.practicai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Toast;

import holamundo.tutorial.com.practicai.modelo.Persona;

public class IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        //Obtener valores que se envia
        Bundle bundle = getIntent().getExtras();
        int n = bundle.getInt("numero");
        Persona persona = new Persona();
        persona = (Persona) bundle.getSerializable("persona");

        Toast.makeText(this, "Numero :" + n + " recibe" + persona.toString() + " persona", Toast.LENGTH_SHORT).show();

    }

    public void crearAlarma(View view) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "Ir al Trabajo")
                .putExtra(AlarmClock.EXTRA_HOUR, 11)
                .putExtra(AlarmClock.EXTRA_MINUTES, 30);
        if (intent.resolveActivity(getPackageManager()) != null) startActivity(intent);


    }


    public void marcaTelefonoEmergencia(View view) {
        Intent intent= new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:112"));
        if (intent.resolveActivity(getPackageManager()) != null) startActivity(intent);

    }

}
