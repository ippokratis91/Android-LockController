package com.example.i.lockcontroller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private static final String[] OPERATIONS = {"Entrance", "Air Condition", "Lights"};

    private ListView operationsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operationsListView = (ListView) findViewById(R.id.operationsListView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, OPERATIONS);
        operationsListView.setAdapter(arrayAdapter);

        operationsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Intent entranceIntent = new Intent(MainActivity.this, EntranceLockActivity.class);
                    startActivity(entranceIntent);
                }
                else if(position == 1) {
                    Intent entranceIntent = new Intent(MainActivity.this, AirConditionActivity.class);
                    startActivity(entranceIntent);
                }
                else if(position == 2){
                    Intent entranceIntent = new Intent(MainActivity.this, LightsActivity.class);
                    startActivity(entranceIntent);
                }
            }
        });
    }
}