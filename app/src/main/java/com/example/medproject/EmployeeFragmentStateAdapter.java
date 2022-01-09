package com.example.medproject;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFragmentStateAdapter extends FragmentStateAdapter {
    private List<Employee> employees;

    public EmployeeFragmentStateAdapter(@NonNull FragmentActivity fragmentActivity){
        super(fragmentActivity);

        this.employees = this.intDatas();
    }

    private List<Employee> intDatas() {
        Employee emp1 = new Employee("Зигмунд Фрейд", "Психолог ", "81 ", R.drawable.sigmund_freud__by_max_halberstadt__cropped_);
        Employee emp2 = new Employee(" Грегори Хаус", "Диагнозт", "42", R.drawable.article_entweeklyhires02);
        Employee emp3 = new Employee("Евдкимов Григорий", "Санитар Леса", "41", R.drawable.xwih2_bh5i8);

        List<Employee> list = new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        return list;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position){
        Employee employee = this.employees.get(position);
        return new FirstFragment(employee);
    }
    @Override
    public int getItemCount(){
        return this.employees.size();
    }


}
