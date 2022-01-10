package com.example.medproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class ActivityPatients extends AppCompatActivity {
    Button appointmentReg, aboutB, backB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patients);
        Button appointmentReg = (Button) findViewById(R.id.button17);
        Button aboutB = (Button) findViewById(R.id.button18);
        Button backB = (Button) findViewById(R.id.button20);

        appointmentReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPatients.this, ActivityPatientsAppointmentReg.class);
                startActivity(intent);
            }
        });
        aboutB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPatients.this, ActivityAbout.class);
                startActivity(intent);
            }
        });
        backB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPatients.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}