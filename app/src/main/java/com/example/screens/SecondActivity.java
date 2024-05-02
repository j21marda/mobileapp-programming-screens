package com.example.screens;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textName = findViewById(R.id.textName);
        TextView textNumb = findViewById(R.id.textNumb);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            int number = extras.getInt("number");

            textName.setText(getString(R.string.extra_name) + name);
            textNumb.setText(getString(R.string.extra_number) + number);
        }
    }
}
