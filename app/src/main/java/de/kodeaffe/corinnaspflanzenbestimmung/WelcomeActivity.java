package de.kodeaffe.corinnaspflanzenbestimmung;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;


import java.util.List;



public class WelcomeActivity extends AppCompatActivity {

    private Button getFamilyButton(final List family) {
        Button button = new Button(WelcomeActivity.this);
        button.setText((String) family.get(1));
        final WelcomeActivity caller = this;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(caller, FamilyActivity.class);
                Log.d("WelcomeActivity.getFamilyButton",
                        "Id: " + family.get(0));
                intent.putExtra(
					FamilyActivity.FAMILY_ID, (String) family.get(0));
                startActivity(intent);
            }
        });
        return button;
    }


    private void addFamilies(LinearLayout container) {
        List families = new Datastorage(this).getFamilies();
        for (int i = 0; i < families.size(); i++) {
            List family = (List) families.get(i);
            Log.d("WelcomeActivity.addFamilies", "Family: " + family.toString());
            Button button = getFamilyButton(family);
            container.addView(button);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        LinearLayout container = (LinearLayout) findViewById(R.id.container_families);
        addFamilies(container);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcome, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_about:
                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
