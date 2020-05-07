package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScheduleClick extends AppCompatActivity {

    Button schedule_back_button;
    Intent back_intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_click);

        schedule_back_button = findViewById(R.id.schedule_back_button);

        schedule_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back_intent = new Intent(ScheduleClick.this, MainActivity.class);
                startActivity(back_intent);
            }
        });
    }
}
