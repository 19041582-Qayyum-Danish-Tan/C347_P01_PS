package com.example.c347p01ps;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    ListView lv;
    TextView tvHoliday, tvDate;
    ArrayAdapter aa;
    ArrayList<Holiday> holiday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        lv = findViewById(R.id.lvHoliday);
        tvHoliday = findViewById(R.id.tvHolidayType);
        tvDate = findViewById(R.id.tvDate);

        Intent i = getIntent();
        String holiday2 = i.getStringExtra("selectedHoliday");
        String date2 = i.getStringExtra("selectedDate");
        tvHoliday.setText(holiday2);
        tvDate.setText(date2);

        holiday = new ArrayList<Holiday>();

        if (holiday2.equals("Secular")) {
            holiday.add(new Holiday("New Year's Day", "1 Jan 2017", false));
            holiday.add(new Holiday("Labour Day", "1 May 2017", true ));


            aa = new HolidayAdapter(this, R.layout.row, holiday);
            lv.setAdapter(aa);




        }


    }
}
