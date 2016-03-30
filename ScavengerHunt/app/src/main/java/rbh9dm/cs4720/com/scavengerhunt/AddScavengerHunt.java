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
        Firebase.setAndroidContext(this);

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

                ScavengerHuntDBHelper myDB = new ScavengerHuntDBHelper(AddScavengerHunt.this);
                myDB.insertHunt(name);

                Firebase myFirebaseRef = new Firebase("https://scavengerhuntapp.firebaseio.com/");
                myFirebaseRef.child("hunt").setValue(name);

                MainActivity.huntList.add(name);
                MainActivity.huntsAdapter.notifyDataSetChanged();

                finish();
            }
        });
    }

}
