package rbh9dm.cs4720.com.scavengerhunt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class More_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        int pos = intent.getIntExtra(HuntItems.POSITION, 0);
        getSupportActionBar().setTitle(HuntItems.itemList.get(pos).getName());
        TextView description = (TextView) findViewById(R.id.Mdescription);
        description.setText(HuntItems.itemList.get(pos).getDescription());
        CheckBox chk = (CheckBox) findViewById(R.id.chkcamera);
        if(HuntItems.itemList.get(pos).isPictureRequired())
            chk.setText("Required");
        chk.setChecked(HuntItems.itemList.get(pos).isPictureOk());
        chk = (CheckBox) findViewById(R.id.chklocation);
        if(HuntItems.itemList.get(pos).isLocationRequired())
            chk.setText("Required");
        chk.setChecked(HuntItems.itemList.get(pos).isLocationOk());
    }

}
