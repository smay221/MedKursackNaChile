package com.example.medproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class ActivitySingUp extends AppCompatActivity {
    private static final String TAG = "medproject";
    EditText editTextTextPersonName4, editTextTextPassword4;
    Button button12, buttonBack4;
    DBClass dbClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        DBClass dbClass = new DBClass(this);


        EditText loginText = (EditText) findViewById(R.id.editTextTextPersonName4);
        EditText passwordText = (EditText) findViewById(R.id.editTextTextPassword4);
        Button btnSingIn = (Button) findViewById(R.id.button12);
        Button btn = (Button) findViewById(R.id.buttonBack4);

        btnSingIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dbClass.insertlogin(loginText.getText().toString(), passwordText.getText().toString());
                Log.i(TAG, "Логин и пароль добавлены в БД");
                Intent intent = new Intent(ActivitySingUp.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySingUp.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}