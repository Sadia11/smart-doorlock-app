package com.example.sadi.smartdoorapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ibshar on 29/05/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "FYP.DB";

    public DatabaseHelper(Context context) {
        super(context,DATABASE_NAME,null,1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE USER (User_ID TINYINT PRIMARY KEY NOT NULL,FName VARCHAR(35) NOT NULL,LName VARCHAR(35) NOT NULL,DOB VARCHAR(20),Image MEDIUMBLOB,City VARCHAR(35),Privilege TINYINT(1) NOT NULL DEFAULT 1,Num_of_Doors TINYINT(1) NOT NULL DEFAULT 1,Password_ID TINYINT(1) NOT NULL,Sec_Ques_ID TINYINT(1) NOT NULL,CHECK (Privilege>0 AND Privilege<3),CONSTRAINT uc_USER UNIQUE (Password_ID, Sec_Ques_ID))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE IF EXISTS USER");
        onCreate(db);
    }
}
