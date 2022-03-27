package com.example.main.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.main.R;
import com.example.main.todolist.Employment;
import com.example.main.todolist.ToDoList;

import java.util.List;

public class ToDoListAdapter extends ArrayAdapter<Employment> {
    public ToDoListAdapter(@NonNull Context context, int resource, List<Employment> list) {
        super(context, resource, list);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Employment employment = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.to_do_list_adapter_item, null);
        }
        ((TextView) convertView.findViewById(R.id.item_data)).setText(employment.getData());
        if (employment.getEmployments() != null && !employment.getEmployments().isEmpty()) {
            ListView subListView = convertView.findViewById(R.id.item_paragraph);
            subListView.setAdapter(new ToDoListAdapter(getContext(), R.layout.to_do_list_adapter_item, employment.getEmployments()));
        }
        return convertView;
    }
}
