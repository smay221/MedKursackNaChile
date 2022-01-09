package com.example.medproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMedWorker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_worker);
        Button btn = (Button) findViewById(R.id.buttonPacients);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMedWorker.this, ActivityPatientsAppointment.class);
                startActivity(intent);
            }
        });
        Button btn2 = (Button) findViewById(R.id.buttonCalendar);
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMedWorker.this, ActivityWorkerCalendar.class);
                startActivity(intent);
            }
        });
        Button btn3 = (Button) findViewById(R.id.buttonAboutWorker);
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMedWorker.this, ActivityAbout.class);
                startActivity(intent);
            }
        });
        Button btn4 = (Button) findViewById(R.id.buttonBack1);
        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMedWorker.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}