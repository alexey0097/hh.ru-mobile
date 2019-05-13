package com.example.myapplication.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.example.myapplication.R;
import com.example.myapplication.objects.Resume;
import com.example.myapplication.objects.Vacancy;
import com.example.myapplication.objects.Work;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepoVacancy {

    final public static String SQL_CREATE_TABLE_VACANCY =
            " CREATE TABLE vacancy (" +
            " id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
            " wageCount INTEGER," +
            " wageType VARCHAR(100)," +
            " profession VARCHAR(300)," +
            " exepreinceYears INTEGER," +
            " education VARCHAR(300)," +
            " image INTEGER," +
            " numberPhone VARCHAR(300)," +
            " email VARCHAR(300)," +
            " nameCompany VARCHAR(300)," +
            " graphicWork VARCHAR(300)," +
            " aboutCompany LONGTEXT," +
            " aboutObyas LONGTEXT," +
            " aboutTrebov LONGTEXT," +
            " aboutUsl LONGTEXT);";

    final public static String SQL_DROP_TABLE_VACANCY = "DROP TABLE IF EXISTS vacancy";

    public RepoVacancy() {}

    public void createTable(SQLiteDatabase dataBase) { dataBase.execSQL(RepoVacancy.SQL_CREATE_TABLE_VACANCY); }

    public void dropTable(SQLiteDatabase dataBase) { dataBase.execSQL(RepoVacancy.SQL_DROP_TABLE_VACANCY); }

    public void insert(Vacancy vacancy, SQLiteDatabase dataBase) {
        // создаем объект для данных
        ContentValues cv = new ContentValues();
        cv.put("wageCount", vacancy.getWageCount());
        cv.put("wageType", vacancy.getWageType());
        cv.put("profession", vacancy.getProfession());
        cv.put("exepreinceYears", vacancy.getExepreinceYears());
        cv.put("education", vacancy.getEducation());
        cv.put("image", vacancy.getImage());
        cv.put("numberPhone", vacancy.getNumberPhone());
        cv.put("email", vacancy.getEmail());
        cv.put("nameCompany", vacancy.getNameCompany());
        cv.put("graphicWork", vacancy.getGraphicWork());
        cv.put("aboutCompany", vacancy.getAboutCompany());
        cv.put("aboutObyas", vacancy.getAboutObyas());
        cv.put("aboutTrebov", vacancy.getAboutTrebov());
        cv.put("aboutUsl", vacancy.getAboutUsl());

        dataBase.insert("vacancy", null, cv);

    }

    public List<Work> findAll(SQLiteDatabase dataBase) {
        // Define a projection that specifies which columns from the database
        // you will actually use after this query.
        String[] projection = { "id", "wageCount", "wageType", "profession", "exepreinceYears",
                "education", "image", "numberPhone", "email", "nameCompany", "graphicWork",
                "aboutCompany", "aboutObyas", "aboutTrebov", "aboutUsl"};

        // How you want the results sorted in the resulting Cursor
        String sortOrder = "id" + " DESC";

        Cursor cursor = dataBase.query(
                "vacancy",   // The table to query
                projection,             // The array of columns to return (pass null to get all)
                null,              // The columns for the WHERE clause
                null,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                sortOrder               // The sort order
        );

        List<Work> listVacancy = new ArrayList<>();
        while(cursor.moveToNext()) {
            long id = cursor.getLong(cursor.getColumnIndexOrThrow("id"));
            int wageCount = cursor.getInt(cursor.getColumnIndexOrThrow("wageCount"));
            String wageType = cursor.getString(cursor.getColumnIndexOrThrow("wageType"));
            String profession = cursor.getString(cursor.getColumnIndexOrThrow("profession"));
            int exepreinceYears = cursor.getInt(cursor.getColumnIndexOrThrow("exepreinceYears"));
            String education = cursor.getString(cursor.getColumnIndexOrThrow("education"));
            int image = cursor.getInt(cursor.getColumnIndexOrThrow("image"));
            String numberPhone = cursor.getString(cursor.getColumnIndexOrThrow("numberPhone"));
            String email = cursor.getString(cursor.getColumnIndexOrThrow("email"));
            String nameCompany = cursor.getString(cursor.getColumnIndexOrThrow("nameCompany"));
            String graphicWork = cursor.getString(cursor.getColumnIndexOrThrow("graphicWork"));
            String aboutCompany = cursor.getString(cursor.getColumnIndexOrThrow("aboutCompany"));
            String aboutObyas = cursor.getString(cursor.getColumnIndexOrThrow("aboutObyas"));
            String aboutTrebov = cursor.getString(cursor.getColumnIndexOrThrow("aboutTrebov"));
            String aboutUsl = cursor.getString(cursor.getColumnIndexOrThrow("aboutUsl"));
            listVacancy.add(new Vacancy(id, nameCompany, wageCount, wageType, profession, exepreinceYears, education, image, numberPhone, email, graphicWork, aboutCompany, aboutObyas, aboutTrebov, aboutUsl));
        }
        cursor.close();

        return listVacancy;
    }


}
