package com.example.myapplication.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import com.example.myapplication.R;
import com.example.myapplication.WorkAdapter;
import com.example.myapplication.dao.RepoResume;
import com.example.myapplication.dao.RepoVacancy;
import com.example.myapplication.enums.SelectionWork;
import com.example.myapplication.objects.Work;

import java.util.ArrayList;
import java.util.List;

public class ActivityWorkList extends AppCompatActivity {

    private List<Work> listResume = RepoResume.findAll();
    private List<Work> listVacancy = RepoVacancy.findAll();

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle arguments = getIntent().getExtras();

        SelectionWork selectionWork = (SelectionWork) arguments.get(SelectionWork.NAME_PARAM);

        List<Work> listWork = new ArrayList<>();
        if (selectionWork.equals(SelectionWork.RESUME)) {
            listWork = listResume;
        } else if (selectionWork.equals(SelectionWork.VACANCY)) {
            listWork = listVacancy;
        }

        setContentView(R.layout.activity_work_list);

        listView = (ListView)findViewById(R.id.listViewWork);
        WorkAdapter adapter = new WorkAdapter(this, listWork);
        adapter.setActivity(this);
        listView.setAdapter(adapter);
    }
}