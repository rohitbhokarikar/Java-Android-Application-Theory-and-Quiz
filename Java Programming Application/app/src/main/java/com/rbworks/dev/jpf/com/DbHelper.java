package com.rbworks.dev.jpf.com;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.rbworks.dev.jpf.com.QuizContract.MovieEntry.KEY_ANSWER;
import static com.rbworks.dev.jpf.com.QuizContract.MovieEntry.KEY_ID;
import static com.rbworks.dev.jpf.com.QuizContract.MovieEntry.KEY_OPTA;
import static com.rbworks.dev.jpf.com.QuizContract.MovieEntry.KEY_OPTB;
import static com.rbworks.dev.jpf.com.QuizContract.MovieEntry.KEY_OPTC;
import static com.rbworks.dev.jpf.com.QuizContract.MovieEntry.KEY_QUES;
import static com.rbworks.dev.jpf.com.QuizContract.MovieEntry.TABLE_QUEST;

//import com.delaroystudios.quiz.Question;

public class DbHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "quizzer";
    // tasks table name

    private SQLiteDatabase dbase;
    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase=db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT)";
        db.execSQL(sql);
        addQuestions();
        //db.close();
    }
    private void addQuestions()
    {
        Question q1=new Question("The old name of Java was ..... ?","J Language", "oct ", "oak", "oak");
        this.addQuestion(q1);
        Question q2=new Question("Which of the following feature is not supported by Java", "Multithreading", "Reflection", "Operator Overloading", "Operator Overloading");
        this.addQuestion(q2);
        Question q3=new Question("Which of the following is not a keyword in Java ?","import", "Volatile","null", "null" );
        this.addQuestion(q3);
        Question q4=new Question("Java was first developed in ?", "1991", "1990", "1993","1991");
        this.addQuestion(q4);
        Question q5=new Question("What do you mean by javap ?","Java Compiler","Java Disassembler","Java Debugger","Java Disassembler");
        this.addQuestion(q5);
        Question q6=new Question("What is Hot Java ?","Web Browser","IDE","Java Environment","Web Browser");
        this.addQuestion(q6);
        Question q7=new Question("In Java 'char' allocate how many bits ?","8","16","32","16");
        this.addQuestion(q7);
        Question q8=new Question("'String' contains in which package ?","java.lang","java.awt","java.util","java.lang");
        this.addQuestion(q8);

        Question q9=new Question("Can we extend more than on","Compilation","Execution","None of the Above","Compilation");
        this.addQuestion(q9);

        Question q10=new Question("Who invented Java ?","James Gosling","Dennis Ritchie","None of the Above","James Gosling");
        this.addQuestion(q10);

        Question q11=new Question("Does Java supports Graphics ?","No","Yes","Not Sure","Yes");
        this.addQuestion(q11);

        Question q12=new Question("Does Java supports Multithreading  ?","Yes","No","Not Sure","Yes");
        this.addQuestion(q12);




    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        // Create tables again
        onCreate(db);
    }
    // Adding new question
    public void addQuestion(Question quest) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
        // Inserting Row
        dbase.insert(TABLE_QUEST, null, values);
    }
    public List<Question> getAllQuestions() {
        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST + " ORDER BY "+ "RANDOM()";
        dbase=this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quesList.add(quest);
            } while (cursor.moveToNext());
            Collections.shuffle(quesList);
        }
        // return quest list
        return quesList;
    }
    public int rowcount()
    {
        int row=0;
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row=cursor.getCount();
        return row;
    }
}
