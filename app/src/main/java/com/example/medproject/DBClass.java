package com.example.medproject;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DBClass extends SQLiteOpenHelper {
    private static final String TAG = "medproject";
    public static final int DATABASE_VERSION=2;
    public static final String DATABASE_NAME = "manzoniDataBase";

    public static final String USERS = "users";
    public static final String _id = "id";
    public static final String login = "login";
    public static final String password = "password";
    public static final String Accesslevel = "Accesslevel";
    public static final String PACIENTS = "pacients";
    public static final String FIO = "fio";
    public static final String age = "age";
    public static final String reason = "reason";
    public static final String doctorPick = "doctorPick";
    public static final String reasonTime = "reasonTime";
    public static final String DOCTORS = "doctors";
    public static final String FIODOCTOR = "fio_doctor";
    public static final String speciality = "speciality";
    public static final String ageDoctor = "age_doctor";
    public static final String freeTime = "freeTime";
    public static final String DOCTORCALENDA = "doctor_calendar";
    public static final String dateName = "date_name";
    public static final String dateReal = "date_real";

    public DBClass(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    public void onCreate(SQLiteDatabase medDB) {
        medDB.execSQL("CREATE TABLE USERS \n" +
                "        (_id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "        login TEXT,\n" +
                "        password TEXT,\n" +
                "        Accesslevel INTEGER);");
        medDB.execSQL("CREATE TABLE PACIENTS \n" +
                "        (_id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "        FIO TEXT,\n" +
                "        age INTEGER,\n" +
                "        reason TEXT, \n" +
                "        doctorPick INTEGER ,\n" +
                "        reasonTime TEXT, \n" +
                "        FOREIGN KEY (doctorPick)  REFERENCES DOCTORS (_id));");
        medDB.execSQL("CREATE TABLE DOCTORS \n" +
                "        (_id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "        FIODOCTOR TEXT,\n" +
                "        speciality TEXT,\n" +
                "        ageDoctor INTEGER,\n" +
                "        freeTime TEXT);");
        medDB.execSQL("CREATE TABLE DOCTORCALENDA \n" +
                "        (_id INTEGER,\n" +
                "        dateName TEXT,\n" +
                "        dateReal TEXT PRIMARY KEY );");
    }

    @Override
    public void onUpgrade(SQLiteDatabase medDB, int oldVersion, int newVersion) {
        medDB.execSQL("drop table if exists " + USERS);
        medDB.execSQL("drop table if exists " + PACIENTS);
        medDB.execSQL("drop table if exists " + DOCTORS);
        medDB.execSQL("drop table if exists " + DOCTORCALENDA);

        onCreate(medDB);
    }
    public void insertlogin (String login, String password){
        SQLiteDatabase medDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("login", login);
        contentValues.put("password", password);
        Log.i(TAG, login + password);
        long ins = medDB.insert("USERS", null, contentValues);
    }
    public String testLogin(String resultLogin){
        SQLiteDatabase medDB = this.getReadableDatabase();
        Cursor cursor = medDB.rawQuery("Select * from USERS", new  String[] {resultLogin});
        return resultLogin;
    }

    public void insertTime(String doctorPick, String reasonTime){
        SQLiteDatabase medDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("doctorPick", doctorPick);
        contentValues.put("reasonTime", reasonTime);
        Log.i(TAG, doctorPick + reasonTime);
        long ins = medDB.insert("PACIENTS", null, contentValues);
    }
}
