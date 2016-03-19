package de.kodeaffe.corinnaspflanzenbestimmung;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;

import java.util.List;


public class FamilyActivity extends AppCompatActivity {
    public final static String FAMILY_ID = "family_id";

    private void setFamily() {
        Intent intent = getIntent();
        String id = intent.getStringExtra(FamilyActivity.FAMILY_ID);
        Log.d("FamilyActiviy.setFamily", "Id: " + id);
        List family = new Datastorage(this).getFamily(id);
        Log.d("FamilyActivity.setFamily", "Family: " + family.toString());
        TextView name = (TextView) findViewById(R.id.family_name);
        name.setText((String) family.get(0));
        TextView scientific_name =
			(TextView) findViewById(R.id.family_scientific_name);
        scientific_name.setText((String) family.get(1));
        TextView examples = (TextView) findViewById(R.id.family_examples);
        examples.setText((String) family.get(2));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setFamily();
    }

}
