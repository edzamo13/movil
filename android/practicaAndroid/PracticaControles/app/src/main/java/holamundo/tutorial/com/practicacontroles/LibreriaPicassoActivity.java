package holamundo.tutorial.com.practicacontroles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class LibreriaPicassoActivity extends AppCompatActivity {

    ImageView logoTipo, logoTipoGlide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libreria_picasso);

        logoTipo = (ImageView) findViewById(R.id.imageViewLogotipo);

        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(logoTipo);




      /*  logoTipoGlide =(ImageView) findViewById(R.id.imageViewGlide);

        Glide.with(this)
                .load("https://image.freepik.com/vector-gratis/conjunto-feliz-tierra-kawaii-ilustracion_24908-60675.jpg")
                .into(logoTipoGlide);*/

    }


}
