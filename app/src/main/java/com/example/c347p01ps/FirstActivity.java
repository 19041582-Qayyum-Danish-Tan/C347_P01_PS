package com.example.c347p01ps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<String> holidayList;
    ArrayAdapter<String> aaHoliday;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lvHoliday);

        holidayList = new ArrayList();
        holidayList.add("Secular");


        aaHoliday = new ArrayAdapter(this, android.R.layout.simple_list_item_1, holidayList);
        lv.setAdapter(aaHoliday);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String selectedHoliday = holidayList.get(position);

                // start the SecondActivity
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("selectedHoliday", selectedHoliday);
                startActivity(intent);
            }
        });


    }

}
