package com.example.main.todolist;

import java.util.ArrayList;
import java.util.List;

public class Employment {
    private String data;
    private State state;
    private List<Employment> employments;
    public enum State {
        TO_DO,
        DOING,
        DONE
    }

    public Employment(String data) {
        this.data = data;
        this.state = State.TO_DO;
    }

    public Employment(String data, State state) {
        this.data = data;
        this.state = state;
        this.employments = new ArrayList<>();
    }

    public Employment(String data, State state, List<Employment> employments) {
        this.data = data;
        this.state = state;
        this.employments = employments;
    }

    public String getData() {
        return data;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Employment{" +
                "data='" + data + '\'' +
                ", employments=" + employments +
                '}';
    }

    public List<Employment> getEmployments() {
        return employments;
    }

    public void setEmployments(List<Employment> employments) {
        this.employments = employments;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean addEmployment(Employment employment) {
        return this.employments.add(employment);
    }
}
