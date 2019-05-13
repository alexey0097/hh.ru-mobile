package com.example.myapplication.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import com.example.myapplication.R;
import com.example.myapplication.WorkAdapter;
import com.example.myapplication.dao.DBHelper;
import com.example.myapplication.dao.RepoResume;
import com.example.myapplication.dao.RepoVacancy;
import com.example.myapplication.enums.SelectionWork;
import com.example.myapplication.objects.Work;

import java.util.ArrayList;
import java.util.List;

public class ActivityWorkList extends AppCompatActivity {
    private ListView listView;

    private RepoVacancy repoVacancy = new RepoVacancy();
    private RepoResume repoResume = new RepoResume();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // создаем объект для создания и управления версиями БД
        DBHelper dbHelper = new DBHelper(this);

        Bundle arguments = getIntent().getExtras();

        SelectionWork selectionWork = (SelectionWork) arguments.get(SelectionWork.NAME_PARAM);

        List<Work> listWork = new ArrayList<>();
        if (selectionWork.equals(SelectionWork.RESUME)) {
            listWork = repoResume.findAll(dbHelper.getReadableDatabase());
        } else if (selectionWork.equals(SelectionWork.VACANCY)) {
            listWork = repoVacancy.findAll(dbHelper.getReadableDatabase());
        }

        setContentView(R.layout.activity_work_list);

        listView = (ListView)findViewById(R.id.listViewWork);
        WorkAdapter adapter = new WorkAdapter(this, listWork);
        adapter.setActivity(this);
        listView.setAdapter(adapter);
    }
}