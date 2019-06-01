package work.chessman.mobile.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import work.chessman.mobile.R;
import work.chessman.mobile.WorkAdapter;
import work.chessman.mobile.dao.SQLiteDataBase;
import work.chessman.mobile.dao.RepoResume;
import work.chessman.mobile.dao.RepoVacancy;
import work.chessman.mobile.enums.SelectionWork;
import work.chessman.mobile.objects.Work;

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
        SQLiteDataBase SQLiteDataBase = new SQLiteDataBase(this);

        Bundle arguments = getIntent().getExtras();

        SelectionWork selectionWork = (SelectionWork) arguments.get(SelectionWork.NAME_PARAM);

        List<Work> listWork = new ArrayList<>();
        if (selectionWork.equals(SelectionWork.RESUME)) {
            listWork = repoResume.findAll(SQLiteDataBase.getReadableDatabase());
        } else if (selectionWork.equals(SelectionWork.VACANCY)) {
            listWork = repoVacancy.findAll(SQLiteDataBase.getReadableDatabase());
        }

        setContentView(R.layout.activity_work_list);

        listView = (ListView)findViewById(R.id.listViewWork);
        WorkAdapter adapter = new WorkAdapter(this, listWork);
        adapter.setActivity(this);
        listView.setAdapter(adapter);
    }
}