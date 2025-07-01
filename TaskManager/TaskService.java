package com.tejasri.service;

import com.tejasri.model.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String title, String desc, LocalDate dueDate) {
        tasks.add(new Task(title, desc, dueDate));
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public boolean markCompleted(int id) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                t.setCompleted(true);
                return true;
            }
        }
        return false;
    }

    public boolean deleteTask(int id) {
        return tasks.removeIf(t -> t.getId() == id);
    }
}
