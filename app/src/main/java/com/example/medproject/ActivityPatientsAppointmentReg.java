package com.example.medproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class ActivityPatientsAppointmentReg extends AppCompatActivity {

    private ViewPager2 regPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patients_appointment_reg);

        this.regPager = findViewById(R.id.regPager);

        EmployeeFragmentStateAdapter adapter = new EmployeeFragmentStateAdapter(this);
        this.regPager.setAdapter(adapter);

        this.regPager.setPageTransformer(new ZoomOutPageTransformer());

    }
}