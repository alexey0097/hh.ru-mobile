package work.chessman.mobile.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import work.chessman.mobile.objects.Resume;
import work.chessman.mobile.objects.Work;

import java.util.ArrayList;
import java.util.List;

public class RepoResume implements DaoWork{

    final public static String SQL_CREATE_TABLE_RESUME =
            " CREATE TABLE resume (" +
            " id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
            " wageCount INTEGER," +
            " wageType VARCHAR(100)," +
            " profession VARCHAR(300)," +
            " exepreinceYears INTEGER," +
            " education VARCHAR(300)," +
            " image INTEGER," +
            " numberPhone VARCHAR(300)," +
            " email VARCHAR(300)," +
            " firstName VARCHAR(300)," +
            " lastName VARCHAR(300)," +
            " middleName VARCHAR(300)," +
            " oldYears INTEGER," +
            " gender VARCHAR(300)," +
            " aboutMe LONGTEXT," +
            " aboutEucation LONGTEXT," +
            " aboutExperience LONGTEXT);";

    final public static String SQL_DROP_TABLE_RESUME = "DROP TABLE IF EXISTS resume";

    public RepoResume() {}

    /**
     * @see {@link DaoWork#createTable(SQLiteDatabase)}
     */
    @Override
    public void createTable(SQLiteDatabase dataBase) { dataBase.execSQL(RepoResume.SQL_CREATE_TABLE_RESUME); }

    /**
     * @see {@link DaoWork#dropTable(SQLiteDatabase)}
     */
    @Override
    public void dropTable(SQLiteDatabase dataBase) { dataBase.execSQL(RepoResume.SQL_DROP_TABLE_RESUME); }

    /**
     * @see {@link DaoWork#insert(Work, SQLiteDatabase)}
     */
    @Override
    public void insert(Work work, SQLiteDatabase dataBase) {
        Resume resume = (Resume) work;
        // создаем объект для данных
        ContentValues cv = new ContentValues();
        cv.put("wageCount", resume.getWageCount());
        cv.put("wageType", resume.getWageType());
        cv.put("profession", resume.getProfession());
        cv.put("exepreinceYears", resume.getExepreinceYears());
        cv.put("education", resume.getEducation());
        cv.put("image", resume.getImage());
        cv.put("numberPhone", resume.getNumberPhone());
        cv.put("email", resume.getEmail());
        cv.put("firstName", resume.getFirstName());
        cv.put("lastName", resume.getLastName());
        cv.put("middleName", resume.getMiddleName());
        cv.put("oldYears", resume.getOldYears());
        cv.put("gender", resume.getGender());
        cv.put("aboutMe", resume.getAboutMe());
        cv.put("aboutEucation", resume.getAboutEucation());
        cv.put("aboutExperience", resume.getAboutExperience());

        dataBase.insert("resume", null, cv);

    }

    /**
     * @see {@link DaoWork#findAll(SQLiteDatabase)}
     */
    @Override
    public List<Work> findAll(SQLiteDatabase dataBase) {
        // Define a projection that specifies which columns from the database
        // you will actually use after this query.
        String[] projection = { "id", "wageCount", "wageType", "profession", "exepreinceYears",
                "education", "image", "numberPhone", "email", "firstName", "lastName",
                "middleName", "oldYears", "gender", "aboutMe", "aboutEucation", "aboutExperience"};

        // How you want the results sorted in the resulting Cursor
        String sortOrder = "id" + " DESC";

        Cursor cursor = dataBase.query(
                "resume",   // The table to query
                projection,             // The array of columns to return (pass null to get all)
                null,              // The columns for the WHERE clause
                null,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                sortOrder               // The sort order
        );

        List<Work> listResume = new ArrayList<>();
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
            String firstName = cursor.getString(cursor.getColumnIndexOrThrow("firstName"));
            String lastName = cursor.getString(cursor.getColumnIndexOrThrow("lastName"));
            String middleName = cursor.getString(cursor.getColumnIndexOrThrow("middleName"));
            int oldYears = cursor.getInt(cursor.getColumnIndexOrThrow("oldYears"));
            String gender = cursor.getString(cursor.getColumnIndexOrThrow("gender"));
            String aboutMe = cursor.getString(cursor.getColumnIndexOrThrow("aboutMe"));
            String aboutEucation = cursor.getString(cursor.getColumnIndexOrThrow("aboutEucation"));
            String aboutExperience = cursor.getString(cursor.getColumnIndexOrThrow("aboutExperience"));

            listResume.add(new Resume(id, wageCount, wageType, profession, exepreinceYears, education, image, numberPhone, email, firstName, lastName, middleName, oldYears, gender, aboutMe, aboutEucation, aboutExperience));
        }
        cursor.close();

        return listResume;
    }



}
