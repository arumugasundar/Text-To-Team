package com.example.testapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class StudentList extends ArrayAdapter<Student> {
    private Activity context;
    private List<Student> studentList;

    public StudentList(Activity context,List<Student> studentList){
        super(context,R.layout.listlayout,studentList);
        this.context = context;
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.listlayout,null,true);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textView);
        TextView textViewRoll = (TextView) listViewItem.findViewById(R.id.textView2);
        TextView textViewPhone = (TextView) listViewItem.findViewById(R.id.textView3);

        Student student = studentList.get(position);

        textViewName.setText(student.getName());
        textViewRoll.setText(student.getRoll_no());
        textViewPhone.setText(student.getPhone());
        return listViewItem;
    }
}
