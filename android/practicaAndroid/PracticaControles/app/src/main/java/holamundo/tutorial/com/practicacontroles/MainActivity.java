package holamundo.tutorial.com.practicacontroles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irAControles(View view) {
        Intent intent= new Intent(this, ControlesActivity.class);
        startActivity(intent);

    }


    public void irAimagenesVectoriales(View view) {
        Intent  intent=  new Intent(this,ImagenesVentorialesActivity.class);
        startActivity(intent);
    }

    public void irAlibreriaPicasso(View view) {
        Intent intent= new Intent(this,LibreriaPicassoActivity.class);
        startActivity(intent);
    }
}
