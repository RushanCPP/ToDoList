package com.example.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.main.adapter.ToDoListAdapter;
import com.example.main.todolist.Employment;
import com.example.main.todolist.ToDoList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToDoList toDoList = new ToDoList();
        List<Employment> list = new ArrayList<>();
        list.add(new Employment("Не"));
        list.add(new Employment("На"));
        list.add(new Employment("Ча"));
        list.add(new Employment("То"));

        Employment employment = new Employment("Не начато", Employment.State.TO_DO, list);
        toDoList.addEmployment(employment);
        // toDoList.addEmployment(new Employment("Начато"));
        //
        // toDoList.addEmployment(new Employment("Закончено"));
        listView = findViewById(R.id.to_do_list);
        listView.setAdapter(new ToDoListAdapter(this, R.layout.to_do_list_adapter_item, toDoList.getEmployments()));
    }
}