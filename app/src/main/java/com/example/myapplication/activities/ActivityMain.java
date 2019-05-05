package com.example.myapplication.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication.R;
import com.example.myapplication.enums.SelectionWork;

public class ActivityMain extends AppCompatActivity {

    private Button buttonResume;
    private Button buttonVacancy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonResume = (Button)findViewById(R.id.buttonResume);
        buttonResume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMain.this, ActivityWorkList.class);
                intent.putExtra(SelectionWork.NAME_PARAM, SelectionWork.RESUME);
                startActivity(intent);
            }
        });

        buttonVacancy = (Button)findViewById(R.id.buttonVacancy);
        buttonVacancy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMain.this, ActivityWorkList.class);
                intent.putExtra(SelectionWork.NAME_PARAM, SelectionWork.VACANCY);
                startActivity(intent);
            }
        });
    }
}
