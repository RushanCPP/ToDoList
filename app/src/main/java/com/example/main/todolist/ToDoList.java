package com.example.main.todolist;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Employment> employments;

    public void setEmployments(List<Employment> employments) {
        this.employments = employments;
    }

    public ToDoList() {
        employments = new ArrayList<>();
    }

    public ToDoList(List<Employment> employments) {
        this.employments = employments;
    }

    public Employment get(int index) {
        return employments.get(index);
    }

    public boolean addEmployment(Employment employment) {
        return employments.add(employment);
    }

    public List<Employment> getEmployments() {
        return employments;
    }
}
