package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ToDo extends AppCompatActivity {

    Intent back_intent;
    Button add_button;
    Button todo_back_button;
    EditText new_item;

    ListView list;
    ArrayList<String> items;
    ArrayAdapter<String> itemsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);

        todo_back_button = findViewById(R.id.todo_back_button);
        add_button = findViewById(R.id.add_button);
        new_item = findViewById(R.id.new_item);

        list = findViewById(R.id.list);
        items = new ArrayList<String>();
        itemsAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items);
        list.setAdapter(itemsAdapter);
        items.add("Do homework");
        items.add("Clean the house");

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                items.add(new_item.getText().toString());
                new_item.setText("");
            }
        });
        todo_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back_intent = new Intent(ToDo.this, MainActivity.class);
                startActivity(back_intent);
            }
        });
    }


}
