package com.example.select_lesson;

import android.app.Activity;
import android.content.ContentValues;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;



public class WelcomeActivity extends Activity {
    private MyDataBaseHelper dbHelper;

    private boolean isFirstUse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        dbHelper = new MyDataBaseHelper(this, "StudentManager.db", null, 1);
        dbHelper.getWritableDatabase();



        SharedPreferences preferences = getSharedPreferences("isFirstUse", MODE_PRIVATE);

        isFirstUse = preferences.getBoolean("isFirstUse", true);

        /**
         *如果用户不是第一次使用则直接调转到显示界面,否则调转到引导界面
         */
        if (isFirstUse) {
            initData();
            startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
        } else {
            startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
        }
        finish();

        //实例化Editor对象
        SharedPreferences.Editor editor = preferences.edit();
        //存入数据
        editor.putBoolean("isFirstUse", false);
        //提交修改
        editor.commit();

    }

    private void initData() {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
       //初始化教师数据

        ContentValues values1 = new ContentValues();
        values1.put("teacherId",001);
        values1.put("teacherName","张伟");
        values1.put("sex","男");
        values1.put("teacherCollege","数学");
        db.insert("TEACHER",null,values1);
        values1.clear();
        values1.put("teacherId",002);
        values1.put("teacherName","梁战伟");
        values1.put("sex","男");
        values1.put("teacherCollege","软件工程");
        db.insert("TEACHER",null,values1);
        values1.clear();
        values1.put("teacherId",003);
        values1.put("teacherName","王增收");
        values1.put("sex","男");
        values1.put("teacherCollege","马克思");
        db.insert("TEACHER",null,values1);
        values1.clear();
        values1.put("teacherId",004);
        values1.put("teacherName","方长杰");
        values1.put("sex","男");
        values1.put("teacherCollege","数学");
        db.insert("TEACHER",null,values1);
        values1.clear();
        values1.put("teacherId",005);
        values1.put("teacherName","蒋春玉");
        values1.put("sex","女");
        values1.put("teacherCollege","英语");
        db.insert("TEACHER",null,values1);
        values1.clear();
        values1.put("teacherId",006);
        values1.put("teacherName","陈君");
        values1.put("sex","女");
        values1.put("teacherCollege","软件工程");
        db.insert("TEACHER",null,values1);
        values1.clear();
        values1.put("teacherId",007);
        values1.put("teacherName","何宏兵");
        values1.put("sex","男");
        values1.put("teacherCollege","马克思");
        db.insert("TEACHER",null,values1);
     //初始化课程数据


        ContentValues values2 = new ContentValues();
        values2.put("className","高等数学");
        values2.put("studentNumber",10);
        values2.put("classCollege","数学");
        values2.put("classType", "必修");
        db.insert("CLASSROOM", null, values2);
        values2.clear();
        values2.put("className","离散数学");
        values2.put("studentNumber",8);
        values2.put("classCollege","数学");
        values2.put("classType", "必修");
        db.insert("CLASSROOM", null, values2);
        values2.clear();
        values2.put("className","概率论");
        values2.put("studentNumber",11);
        values2.put("classCollege","数学");
        values2.put("classType", "数学");
        db.insert("CLASSROOM", null, values2);
        values2.clear();
        values2.put("className","趣味数学");
        values2.put("studentNumber",5);
        values2.put("classCollege","数学");
        values2.put("classType", "任选");
        db.insert("CLASSROOM", null, values2);
        values2.clear();
        values2.put("className","面向过程程序设计");
        values2.put("studentNumber",10);
        values2.put("classCollege","软件工程");
        values2.put("classType", "必修");
        db.insert("CLASSROOM", null, values2);
        values2.clear();
        values2.put("className","面向对象程序设计");
        values2.put("studentNumber",10);
        values2.put("classCollege","软件工程");
        values2.put("classType", "必修");
        db.insert("CLASSROOM", null, values2);
        values2.clear();
        values2.put("className","数据库");
        values2.put("studentNumber",7);
        values2.put("classCollege","软件工程");
        values2.put("classType", "必修");
        db.insert("CLASSROOM", null, values2);
        values2.clear();
        values2.put("className","软件工程");
        values2.put("studentNumber",8);
        values2.put("classCollege","软件工程");
        values2.put("classType", "必修");
        db.insert("CLASSROOM", null, values2);
        values2.clear();
        values2.put("className","大学英语");
        values2.put("studentNumber",9);
        values2.put("classCollege","英语");
        values2.put("classType", "必修");
        db.insert("CLASSROOM", null, values2);
        values2.clear();
        values2.put("className","趣味英语");
        values2.put("studentNumber",5);
        values2.put("classCollege","英语");
        values2.put("classType", "任选");
        db.insert("CLASSROOM", null, values2);
        values2.clear();
        values2.put("className","思修");
        values2.put("studentNumber",10);
        values2.put("classCollege","马克思");
        values2.put("classType", "必修");
        db.insert("CLASSROOM", null, values2);
        values2.clear();
        values2.put("className","马克思");
        values2.put("studentNumber",7);
        values2.put("classCollege","马克思");
        values2.put("classType", "必修");
        db.insert("CLASSROOM", null, values2);
        values2.clear();
        values2.put("className","毛概");
        values2.put("studentNumber",8);
        values2.put("classCollege","马克思");
        values2.put("classType", "必修");
        db.insert("CLASSROOM", null, values2);
        values2.clear();
        values2.put("className","趣味哲学");
        values2.put("studentNumber",5);
        values2.put("classCollege","马克思");
        values2.put("classType", "任选");
        db.insert("CLASSROOM", null, values2);
        //插入授课表的数据
        ContentValues values3 = new ContentValues();
        values3.put("teacherId",001);
        values3.put("className","高等数学");
        db.insert("TEACH",null,values3);
        values3.clear();
        values3.put("teacherId",001);
        values3.put("className","概率论");
        db.insert("TEACH",null,values3);
        values3.clear();
        values3.put("teacherId",001);
        values3.put("className","趣味数学");
        db.insert("TEACH",null,values3);
        values3.clear();
        values3.put("teacherId",002);
        values3.put("className","面向过程程序设计");
        db.insert("TEACH",null,values3);
        values3.clear();
        values3.put("teacherId",002);
        values3.put("className","面向对象程序设计");
        db.insert("TEACH",null,values3);
        values3.clear();
        values3.put("teacherId",002);
        values3.put("className","软件工程");
        db.insert("TEACH",null,values3);
        values3.clear();
        values3.put("teacherId",003);
        values3.put("className","思修");
        db.insert("TEACH",null,values3);
        values3.clear();
        values3.put("teacherId",003);
        values3.put("className","马克思");
        db.insert("TEACH",null,values3);
        values3.clear();
        values3.put("teacherId",003);
        values3.put("className","趣味哲学");
        db.insert("TEACH",null,values3);
        values3.clear();
        values3.put("teacherId",004);
        values3.put("className","离散数学");
        db.insert("TEACH",null,values3);
        values3.clear();
        values3.put("teacherId",004);
        values3.put("className","趣味数学");
        db.insert("TEACH",null,values3);
        values3.clear();
        values3.put("teacherId",005);
        values3.put("className","大学英语");
        db.insert("TEACH",null,values3);
        values3.clear();
        values3.put("teacherId",005);
        values3.put("className","趣味英语");
        db.insert("TEACH",null,values3);
        values3.clear();
        values3.put("teacherId",006);
        values3.put("className","面向过程程序设计");
        db.insert("TEACH",null,values3);
        values3.clear();
        values3.put("teacherId",006);
        values3.put("className","面向对象程序设计");
        db.insert("TEACH",null,values3);
        values3.clear();
        values3.put("teacherId",006);
        values3.put("className","数据库");
        db.insert("TEACH",null,values3);
        values3.clear();
        values3.put("teacherId",007);
        values3.put("className","马克思");
        db.insert("TEACH",null,values3);
        values3.clear();
        values3.put("teacherId",007);
        values3.put("className","毛概");
        db.insert("TEACH",null,values3);
        values3.clear();
        values3.put("teacherId",007);
        values3.put("className","趣味哲学");
        db.insert("TEACH",null,values3);
        //插入课堂的数据
        ContentValues values4 = new ContentValues();
        values4.put("lessonId","001");
        values4.put("lessonName","高等数学");
        values4.put("studentNumber",5);
        values4.put("lessonTime","周一1、2;周五7、8");
        values4.put("teacherId",001);
        db.insert("LESSON", null, values4);
        values4.clear();
        values4.put("lessonId", "002");
        values4.put("lessonName","高等数学");
        values4.put("studentNumber",5);
        values4.put("lessonTime","周二5、6;周四3、4");
        values4.put("teacherId",004);
        db.insert("LESSON", null, values4);
        values4.clear();
        values4.put("lessonId", "003");
        values4.put("lessonName","离散数学");
        values4.put("studentNumber",4);
        values4.put("lessonTime","周三1、2;周五5、6");
        values4.put("teacherId",004);
        db.insert("LESSON", null, values4);
        values4.clear();
        values4.put("lessonId", "004");
        values4.put("lessonName","离散数学");
        values4.put("studentNumber",4);
        values4.put("lessonTime","周一7、8;周四9、10");
        values4.put("teacherId",004);
        db.insert("LESSON", null, values4);
        values4.clear();
        values4.put("lessonId", "005");
        values4.put("lessonName","概率论");
        values4.put("studentNumber",6);
        values4.put("lessonTime","周二11、12");
        values4.put("teacherId",001);
        db.insert("LESSON", null, values4);
        values4.clear();
        values4.put("lessonId", "006");
        values4.put("lessonName","概率论");
        values4.put("studentNumber",5);
        values4.put("lessonTime","周三1、2");
        values4.put("teacherId",001);
        db.insert("LESSON", null, values4);
        values4.clear();
        values4.put("lessonId", "007");
        values4.put("lessonName","趣味数学");
        values4.put("studentNumber",2);
        values4.put("lessonTime","周一5、6");
        values4.put("teacherId",001);
        db.insert("LESSON", null, values4);
        values4.clear();
        values4.put("lessonId", "008");
        values4.put("lessonName","趣味数学");
        values4.put("studentNumber",3);
        values4.put("lessonTime","周二5、6");
        values4.put("teacherId",004);
        db.insert("LESSON", null, values4);
        values4.clear();
        values4.put("lessonId", "009");
        values4.put("lessonName","面向过程程序设计");
        values4.put("studentNumber",5);
        values4.put("lessonTime","周三7、8;周四7、8");
        values4.put("teacherId",002);
        db.insert("LESSON",null,values4);
        values4.clear();
        values4.put("lessonId","010");
        values4.put("lessonName","面向过程程序设计");
        values4.put("studentNumber",5);
        values4.put("lessonTime","周四1/2;周五11、12");
        values4.put("teacherId",006);
        db.insert("LESSON",null,values4);
        values4.clear();
        values4.put("lessonId","011");
        values4.put("lessonName","面向对象程序设计");
        values4.put("studentNumber",5);
        values4.put("lessonTime","周一1、2");
        values4.put("teacherId",002);
        db.insert("LESSON",null,values4);
        values4.clear();
        values4.put("lessonId","012");
        values4.put("lessonName","面向对象程序设计");
        values4.put("studentNumber",5);
        values4.put("lessonTime","周三7、8");
        values4.put("teacherId",006);
        db.insert("LESSON",null,values4);
        values4.clear();
        values4.put("lessonId","013");
        values4.put("lessonName","数据库");
        values4.put("studentNumber",7);
        values4.put("lessonTime","周五11、12");
        values4.put("teacherId",006);
        db.insert("LESSON",null,values4);
        values4.clear();
        values4.put("lessonId","014");
        values4.put("lessonName","软件工程");
        values4.put("studentNumber",8);
        values4.put("lessonTime","周一3/4");
        values4.put("teacherId",002);
        db.insert("LESSON",null,values4);
        values4.clear();
        values4.put("lessonId","015");
        values4.put("lessonName","大学英语");
        values4.put("studentNumber",4);
        values4.put("lessonTime","周一3、4;周三5/6");
        values4.put("teacherId",005);
        db.insert("LESSON",null,values4);
        values4.clear();
        values4.put("lessonId","016");
        values4.put("lessonName","大学英语");
        values4.put("studentNumber",5);
        values4.put("lessonTime","周二3、4；周五5、6");
        values4.put("teacherId",005);
        db.insert("LESSON",null,values4);
        values4.clear();
        values4.put("lessonId","017");
        values4.put("lessonName","趣味英语");
        values4.put("studentNumber",5);
        values4.put("lessonTime","周二7、8");
        values4.put("teacherId",005);
        db.insert("LESSON",null,values4);
        values4.clear();
        values4.put("lessonId","018");
        values4.put("lessonName","思修");
        values4.put("studentNumber",5);
        values4.put("lessonTime","周三3、4");
        values4.put("teacherId",003);
        db.insert("LESSON",null,values4);
        values4.clear();
        values4.put("lessonId","019");
        values4.put("lessonName","思修");
        values4.put("studentNumber",5);
        values4.put("lessonTime","周五1、2");
        values4.put("teacherId",003);
        db.insert("LESSON",null,values4);
        values4.clear();
        values4.put("lessonId","020");
        values4.put("lessonName","马克思");
        values4.put("studentNumber",3);
        values4.put("lessonTime","周一3、4");
        values4.put("teacherId",003);
        db.insert("LESSON",null,values4);
        values4.clear();
        values4.put("lessonId","021");
        values4.put("lessonName","马克思");
        values4.put("studentNumber",4);
        values4.put("lessonTime","周二3、4");
        values4.put("teacherId",007);
        db.insert("LESSON",null,values4);
        values4.clear();
        values4.put("lessonId","022");
        values4.put("lessonName","毛概");
        values4.put("studentNumber",8);
        values4.put("lessonTime","周一7、8");
        values4.put("teacherId",007);
        db.insert("LESSON",null,values4);
        values4.clear();
        values4.put("lessonId","023");
        values4.put("lessonName","趣味哲学");
        values4.put("studentNumber",2);
        values4.put("lessonTime","周三9、10");
        values4.put("teacherId",003);
        db.insert("LESSON",null,values4);
        values4.clear();
        values4.put("lessonId","024");
        values4.put("lessonName","趣味哲学");
        values4.put("studentNumber",3);
        values4.put("lessonTime","周二9、10");
        values4.put("teacherId",007);
        db.insert("LESSON",null,values4);
        values4.clear();
       //插入学生的数据
        ContentValues values5 = new ContentValues();
        values5.put("studentId","001");
        values5.put("name","喻超宁");
        values5.put("password",100);
        values5.put("class","1");
        values5.put("sex","男");
        db.insert("Student", null, values5);
        values5.clear();
        values5.put("studentId","002");
        values5.put("name","刘航");
        values5.put("password",200);
        values5.put("class","2");
        values5.put("sex","男");
        db.insert("Student",null,values5);
        values5.clear();
        values5.put("studentId","003");
        values5.put("name","李晓蝶");
        values5.put("password",300);
        values5.put("class","2");
        values5.put("sex","女");
        db.insert("Student",null,values5);
        values5.clear();
        values5.put("studentId","004");
        values5.put("name","夏瑞");
        values5.put("password",400);
        values5.put("class","3");
        values5.put("sex","女");
        db.insert("Student",null,values5);
        values5.clear();
        values5.put("studentId","005");
        values5.put("name","刘亚");
        values5.put("password",500);
        values5.put("class","1");
        values5.put("sex","男");
        db.insert("Student",null,values5);
        values5.clear();
        values5.put("studentId","006");
        values5.put("name","刘宁");
        values5.put("password",600);
        values5.put("class","3");
        values5.put("sex","女");
        db.insert("Student",null,values5);
        values5.clear();
        values5.put("studentId","007");
        values5.put("name","孙佳瑜");
        values5.put("password",700);
        values5.put("class","2");
        values5.put("sex","女");
        db.insert("Student",null,values5);
        values5.clear();
        values5.put("studentId","008");
        values5.put("name","周航");
        values5.put("password",800);
        values5.put("class","1");
        values5.put("sex","男");
        db.insert("Student",null,values5);
        values5.clear();
        values5.put("studentId","009");
        values5.put("name","洪永俊");
        values5.put("password",900);
        values5.put("class","1");
        values5.put("sex","男");
        db.insert("Student",null,values5);
        values5.clear();
        values5.put("studentId","010");
        values5.put("name","唐卫");
        values5.put("password",010);
        values5.put("class","3");
        values5.put("sex","男");
        db.insert("Student",null,values5);



        db.close();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcome, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
