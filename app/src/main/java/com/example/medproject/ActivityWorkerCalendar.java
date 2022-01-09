package com.example.medproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityWorkerCalendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_calendar);
        Button btn = (Button) findViewById(R.id.buttonBack2);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityWorkerCalendar.this, ActivityMedWorker.class);
                startActivity(intent);
            }
        });
    }
}