package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

public class CalendarClick extends AppCompatActivity {

    CalendarView myCalender;
    TextView date_view;
    Button calendar_back_button;
    Intent back_intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_click);

        myCalender = findViewById(R.id.myCalender);
        date_view = findViewById(R.id.date_view);
        calendar_back_button = findViewById(R.id.calendar_back_button);

        myCalender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override

            // In this Listener have one method
            // and in this method we will
            // get the value of DAYS, MONTH, YEARS
            public void onSelectedDayChange(@NonNull CalendarView view,
                                            int year, int month, int dayOfMonth){

                // Store the value of date with
                // format in String type Variable
                // Add 1 in month because month
                // index is start with 0
                String Date= dayOfMonth + "-"+ (month + 1) + "-" + year;
                // set this date in TextView for Display
                date_view.setText(Date);
            }

        });

        calendar_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back_intent = new Intent(CalendarClick.this, MainActivity.class);
                startActivity(back_intent);
            }
        });
    }
}
