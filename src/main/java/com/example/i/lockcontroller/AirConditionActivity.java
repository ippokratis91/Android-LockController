package com.example.i.lockcontroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class AirConditionActivity extends AppCompatActivity {

    private static final String[] OPERATIONS= {"Automatic","Heating","Cooling","Fan","Dehydrator"};

    Button plusBtn,minusBtn;
    TextView tempTV;
    TextView roomTempTV;
    ListView roomsListView;

    double Temperature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air_condition);

        plusBtn = (Button)findViewById(R.id.plusBtn);
        minusBtn = (Button)findViewById(R.id.minusBtn);
        tempTV = (TextView)findViewById(R.id.tempTV);
        roomTempTV = (TextView)findViewById(R.id.roomTempTV);
        roomsListView = (ListView) findViewById(R.id.roomsListView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, OPERATIONS);
        roomsListView.setAdapter(arrayAdapter);

        Temperature = 20;
    }

    public void increaseTemp(View view) {
        Temperature = Temperature + 0.5;
        tempTV.setText( Double.toString(Temperature) );
        roomTempTV.setText( "Room Temperature: " + Double.toString(Temperature) );
    }

    public void decreaseTemp(View view)
    {
        Temperature = Temperature - 0.5;
        tempTV.setText( Double.toString(Temperature) );
        roomTempTV.setText( "Room Temperature: " + Double.toString(Temperature) );
    }
}
