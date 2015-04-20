package com.example.select_lesson;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ASUS on 2015/4/19.
 */
public class MyDataBaseHelper extends SQLiteOpenHelper {


    private static final String CREATE_STUDENT= "create table Student("
            +"studentId text primary key,"
            +"name text,"
            +"password integer,"
            +"class text,"
            +"sex text)";

    private static final String CREATE_LESSON = "create table LESSON("
            +"lessonId text primary key,"
            +"lessonName text,"
            +"studentNumber integer,"
            +"lessonTime text,"
            +"teacherId integer)";
    private static final String CREATE_TEACHER = "create table TEACHER("
            +"teacherId integer primary key,"
            +"teacherName text,"
            +"teacherCollege text,"
            +"teacherSex text)";
    private static final String CREATE_CLASSROOM = "create table CLASSROOM("
            +"className text primary key,"
            +"studentNumber integer,"
            +"classCollege text,"
            +"classType text)";
private static final String CREATE_SELECTION_LESSON= "create table SELECT_LESSON("
        +"id integer primary key autoincrement,"
        +"studentId integer,"
        +"classId integer)";
    private static final String CREATE_TEACH= "create table TEACH("
            +"id integer primary key autoincrement,"
            +"teacherId integer,"
            +"className text)";


    private Context mContext;
    public MyDataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_STUDENT);
        db.execSQL(CREATE_LESSON);
        db.execSQL(CREATE_CLASSROOM);
        db.execSQL(CREATE_TEACHER);
        db.execSQL(CREATE_SELECTION_LESSON);
        db.execSQL(CREATE_TEACH);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
