package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.myapplication.activities.ActivityWork;
import com.example.myapplication.objects.Work;

import java.util.List;

public class WorkAdapter extends BaseAdapter {

    Context context;
    List<Work> data;
    private static LayoutInflater inflater = null;

    private FragmentActivity activity;

    public void setActivity(FragmentActivity activity) {
        this.activity = activity;
    }

    public WorkAdapter(Context context, List<Work> data) {
        // TODO Auto-generated constructor stub
        this.context = context;
        this.data = data;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View vi = convertView;
        if (vi == null) vi = inflater.inflate(R.layout.row, null);

        ImageView imageView = (ImageView) vi.findViewById(R.id.img);

        TextView peofession = (TextView) vi.findViewById(R.id.profession);

        final Work work = data.get(position);

        peofession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, ActivityWork.class);
                intent.putExtra("work", work);
                activity.startActivity(intent);
            }
        });

        TextView wageCount = (TextView) vi.findViewById(R.id.wageCount);
        TextView wageType = (TextView) vi.findViewById(R.id.wageType);

        TextView education = (TextView) vi.findViewById(R.id.education);
        TextView experience = (TextView) vi.findViewById(R.id.experience);
        TextView experienceType = (TextView) vi.findViewById(R.id.experienceType);

        try {
            imageView.setImageResource(work.getImage());
        } catch (Exception ex) {
            System.out.println("Ошибка чтения поля Image в объекте Work ( id ="+work.getId()+" )...");
        }

        peofession.setText(work.getProfession());

        wageCount.setText(String.valueOf(work.getWageCount()));
        wageType.setText(work.getWageType());

        education.setText(work.getEducation());
        experience.setText(String.valueOf(work.getExepreinceYears()));
        experienceType.setText(work.getExperienceType());


        return vi;
    }
}
