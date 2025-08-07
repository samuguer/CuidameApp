package com.example.cuidame;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] reminders = {
            "8:00 - Tomar pastilla para la tensión",
            "13:00 - Inhalador para el asma",
            "21:00 - Pastilla para dormir"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.reminder_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, reminders);
        listView.setAdapter(adapter);
    }
}
