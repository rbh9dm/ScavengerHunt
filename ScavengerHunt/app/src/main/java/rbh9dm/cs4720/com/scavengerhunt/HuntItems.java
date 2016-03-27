package rbh9dm.cs4720.com.scavengerhunt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HuntItems extends AppCompatActivity {

    public static ArrayList<LineItem> itemList = new ArrayList<LineItem>();
    public static ArrayAdapter<LineItem> itemAdapter;
    public static final String POSITION = "position";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hunt_items);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        String title = intent.getStringExtra(MainActivity.TITLE);
        getSupportActionBar().setTitle(title);

        ListView listView = (ListView)findViewById(R.id.listview2);
        itemAdapter = new ArrayAdapter<LineItem>(this, android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(HuntItems.this, More_info.class);
                intent.putExtra(POSITION, position);
                startActivity(intent);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HuntItems.this, Add_Hunt_Item.class);
                startActivity(intent);
            }
        });
    }

}
