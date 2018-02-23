package webuy.itahir.fr.webuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button versMagasinsActivity = (Button) findViewById(R.id.magasinsActivity);

        versMagasinsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentMagasins = new Intent(MainActivity.this, MagasinsActivity.class);
                startActivity(intentMagasins);
            }
        });
    }
}
