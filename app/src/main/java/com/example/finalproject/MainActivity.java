package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView calendar;
    ImageView todo;
    ImageView sched;
    Intent cal_intent;
    Intent todo_intent;
    Intent sched_intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendar = findViewById(R.id.calendar);
        todo = findViewById(R.id.todo);
        sched = findViewById(R.id.sched);

        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal_intent = new Intent(MainActivity.this, CalendarClick.class);
                startActivity(cal_intent);
            }
        });

        todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                todo_intent = new Intent(MainActivity.this,ToDo.class);
                startActivity(todo_intent);
            }
        });

        sched.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sched_intent = new Intent(MainActivity.this, ScheduleClick.class);
                startActivity(sched_intent);
            }
        });

    }

}
