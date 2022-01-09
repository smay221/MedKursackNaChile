package com.example.medproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    private Employee employee;
    private TextView fullName;
    private TextView speciality;
    private TextView age;
    private ImageView imageView1;
    private static int counter = 0;
    private Button buttonDoctor;

    public FirstFragment() {

    }

    public FirstFragment(Employee employee) {
        this.employee = employee;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = (ViewGroup) inflater.inflate(
                R.layout.fragment_first, container, false);
        counter++;
        if (counter % 2 == 0) {
            view.setBackgroundResource(R.drawable.vain_logo_transp);
        } else {
            view.setBackgroundResource(R.drawable.vain_logo_transp);
        }
        this.age = view.findViewById(R.id.textView_fullName);
        this.speciality = view.findViewById(R.id.textView3);
        this.fullName = view.findViewById(R.id.textView5);
        this.imageView1 = view.findViewById(R.id.imageView1);
        this.buttonDoctor = view.findViewById(R.id.button);
        return view;
        
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        Bundle dataBundle = this.employeeToBundle(this.employee);
        outState.putAll(dataBundle);
        super.onSaveInstanceState(outState);
    }

    private Bundle employeeToBundle(Employee employee) {
        Bundle bundle = new Bundle();
        bundle.putString("fullName", employee.getFullName());
        bundle.putString("age", employee.getAge());
        bundle.putString("speciality", employee.getSpeciality());
        bundle.putInt("photo", employee.getPhoto());

        return bundle;
    }

    private Employee bundleToEmployee(Bundle savedInstanceState) {
        String fullName = savedInstanceState.getString("fullName");
        String age = savedInstanceState.getString("age");
        String speciality = savedInstanceState.getString("speciality");
        Integer photo = savedInstanceState.getInt("photo");
        this.buttonDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return new Employee(fullName, speciality, age, photo);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        if (this.employee == null) {

            this.employee = this.bundleToEmployee(savedInstanceState);
        }
        this.showInGUI(this.employee);
    }

    private void showInGUI(Employee employee) {
        this.age.setText(employee.getFullName());
        this.fullName.setText(employee.getAge());
        this.speciality.setText(employee.getSpeciality());
        this.imageView1.setImageResource(employee.getPhoto());
    }
}