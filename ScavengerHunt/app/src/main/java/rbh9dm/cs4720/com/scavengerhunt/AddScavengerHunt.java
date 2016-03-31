package rbh9dm.cs4720.com.scavengerhunt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.firebase.client.Firebase;

public class AddScavengerHunt extends AppCompatActivity {

    public static final String RESULT = "result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
        Firebase.setAndroidContext(this);
         */

        setContentView(R.layout.activity_add_scavenger_hunt);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Add a Scavenger Hunt");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nameField = (EditText) findViewById(R.id.editText);
                String name = nameField.getText().toString();

                Tab1.myDB.insertHunt(name, false);
                Tab1.huntList.add(new ScavengerHunt(name));
                Tab1.huntsAdapter.notifyDataSetChanged();

                finish();
            }
        });
    }

}
