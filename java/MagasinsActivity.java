package webuy.itahir.fr.webuy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by TAHIR on 22/02/2018.
 */

public class MagasinsActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.magasins_activity);

        Button achatGroup = (Button) findViewById(R.id.achatGroupActivity);

        achatGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAchatGroup = new Intent(MagasinsActivity.this, AchatGroupeActivity.class);
                startActivity(intentAchatGroup);
            }
        });
    }
}
