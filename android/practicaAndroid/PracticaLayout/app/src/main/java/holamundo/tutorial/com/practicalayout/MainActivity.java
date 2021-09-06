package holamundo.tutorial.com.practicalayout;

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

    public void irRelativeActivity(View view) {
        Intent intent= new Intent(this,LayoutRelativeActivity.class);
        startActivity(intent);

    }

    public void irLinealActivity(View view) {
        Intent intent= new Intent(this,LayoutLinealActivity.class);
        startActivity(intent);

    }
}
