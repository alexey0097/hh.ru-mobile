package com.example.myapplication.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.myapplication.R;
import com.example.myapplication.objects.Resume;
import com.example.myapplication.objects.Vacancy;
import com.example.myapplication.objects.Work;

public class ActivityWork extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle arguments = getIntent().getExtras();

        Work work = (Work) arguments.get("work");

        if (work instanceof Resume) {
            setContentView(R.layout.activity_resume);

            Resume resume = (Resume) work;

            TextView profession = (TextView)findViewById(R.id.profession);
            profession.setText(resume.getProfession());

            ImageView imageView = (ImageView)findViewById(R.id.img);
            imageView.setImageResource(resume.getImage());

            TextView firstName = (TextView)findViewById(R.id.firstName);
            firstName.setText(resume.getFirstName());

            TextView lastName = (TextView)findViewById(R.id.lastName);
            lastName.setText(resume.getLastName());

            TextView middleName = (TextView)findViewById(R.id.middleName);
            middleName.setText(resume.getMiddleName());

            TextView aboutMe = (TextView)findViewById(R.id.aboutMe);
            aboutMe.setText(resume.getAboutMe());

            TextView education = (TextView)findViewById(R.id.education);
            education.setText(resume.getEducation());

            TextView aboutEducation = (TextView)findViewById(R.id.aboutEducation);
            aboutEducation.setText(resume.getAboutEucation());

            TextView experience = (TextView)findViewById(R.id.experience);
            experience.setText(String.valueOf(resume.getExepreinceYears()));

            TextView experienceType = (TextView)findViewById(R.id.experienceType);
            experienceType.setText(resume.getExperienceType());

            TextView aboutExperience = (TextView)findViewById(R.id.aboutExperience);
            aboutExperience.setText(resume.getAboutExperience());

            TextView numberPhone = (TextView)findViewById(R.id.numberPhone);
            numberPhone.setText(resume.getNumberPhone());

            TextView email = (TextView)findViewById(R.id.email);
            email.setText(resume.getEmail());

        } else if (work instanceof Vacancy) {

            setContentView(R.layout.activity_vacancy);

            Vacancy vacancy = (Vacancy) work;

            TextView nameCompany = (TextView)findViewById(R.id.nameCompany);
            nameCompany.setText(vacancy.getNameCompany());

            ImageView imageView = (ImageView)findViewById(R.id.img);
            imageView.setImageResource(vacancy.getImage());

            TextView profession = (TextView)findViewById(R.id.profession);
            profession.setText(vacancy.getProfession());

            TextView wageCount = (TextView) findViewById(R.id.wageCount);
            wageCount.setText(String.valueOf(vacancy.getWageCount()));

            TextView wageType = (TextView) findViewById(R.id.wageType);
            wageType.setText(vacancy.getWageType());

            TextView aboutEducation = (TextView)findViewById(R.id.education);
            aboutEducation.setText(vacancy.getEducation());

            TextView experience = (TextView)findViewById(R.id.experience);
            experience.setText(String.valueOf(vacancy.getExepreinceYears()));

            TextView experienceType = (TextView)findViewById(R.id.experienceType);
            experienceType.setText(vacancy.getExperienceType());

            TextView aboutCompany = (TextView)findViewById(R.id.aboutCompany);
            aboutCompany.setText(vacancy.getAboutCompany());

            TextView aboutObyas = (TextView)findViewById(R.id.aboutObyas);
            aboutObyas.setText(vacancy.getAboutObyas());

            TextView aboutTrebov = (TextView)findViewById(R.id.aboutTrebov);
            aboutTrebov.setText(vacancy.getAboutTrebov());

            TextView aboutUsl = (TextView)findViewById(R.id.aboutUsl);
            aboutUsl.setText(vacancy.getAboutUsl());

            TextView numberPhone = (TextView)findViewById(R.id.numberPhone);
            numberPhone.setText(vacancy.getNumberPhone());

            TextView email = (TextView)findViewById(R.id.email);
            email.setText(vacancy.getEmail());

        }
    }

}
