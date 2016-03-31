package rbh9dm.cs4720.com.scavengerhunt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;

public class Add_Hunt_Item extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__hunt__item);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Add a Task");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText nameField = (EditText) findViewById(R.id.nameHuntItem);
                String name = ""+nameField.getText();
                EditText descField = (EditText) findViewById(R.id.description);
                String desc = ""+descField.getText();
                CheckBox picReqField = (CheckBox) findViewById(R.id.picReq);
                boolean picReq = picReqField.isChecked();
                CheckBox locReqField = (CheckBox) findViewById(R.id.locReq);
                boolean locReq = locReqField.isChecked();


                LineItem item = new LineItem(name, desc, picReq, locReq);
                HuntItems.itemList.add(item);

                Intent intent = getIntent();

                Tab1.myHuntDB.insertHunt(intent.getStringExtra("name"), name, desc, picReq, locReq);

                HuntItems.itemAdapter.notifyDataSetChanged();

                finish();
            }
        });


    }

}
