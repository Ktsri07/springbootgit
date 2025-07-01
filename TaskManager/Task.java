package com.tejasri.model;

import java.time.LocalDate;

public class Task {
    private static int counter = 0;
    private final int id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private boolean completed;

    public Task(String title, String description, LocalDate dueDate) {
        this.id = ++counter;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.completed = false;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public LocalDate getDueDate() { return dueDate; }
    public boolean isCompleted() { return completed; }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Title: %s | Due: %s | Status: %s",
                id, title, dueDate, completed ? "Completed" : "Pending");
    }
}

