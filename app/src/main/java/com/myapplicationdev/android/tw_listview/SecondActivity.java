package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lvYears;
    TextView tvYear;
    ArrayAdapter aa;
    ArrayList<Modules> module;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvYear = (TextView) findViewById(R.id.tvYears);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        lvYears = (ListView) this.findViewById(R.id.lvYears);
        // Create a few food objects in Food array
        module = new ArrayList<Modules>();
        module.add(new Modules("C208", false));
        module.add(new Modules("C200", true));
        module.add(new Modules("C346", true));

        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new ModuleAdapter(this, R.layout.rows, module);
        lvYears.setAdapter(aa);



    }



}
