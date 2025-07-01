package com.tejasri;

import com.tejasri.service.TaskService;
import com.tejasri.utils.InputUtils;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        TaskService service = new TaskService();

        while (true) {
            System.out.println("\n=== Task Manager ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            int choice = InputUtils.readInt("Choose an option: ");

            switch (choice) {
                case 1:
                    String title = InputUtils.readLine("Enter title: ");
                    String desc = InputUtils.readLine("Enter description: ");
                    LocalDate date = InputUtils.readDate("Enter due date");
                    service.addTask(title, desc, date);
                    System.out.println("✅ Task added.");
                    break;

                case 2:
                    System.out.println("📋 All Tasks:");
                    service.getAllTasks().forEach(System.out::println);
                    break;

                case 3:
                    int completeId = InputUtils.readInt("Enter task ID to mark as completed: ");
                    if (service.markCompleted(completeId)) {
                        System.out.println("✅ Task marked as completed.");
                    } else {
                        System.out.println("❌ Task not found.");
                    }
                    break;

                case 4:
                    int deleteId = InputUtils.readInt("Enter task ID to delete: ");
                    if (service.deleteTask(deleteId)) {
                        System.out.println("🗑️ Task deleted.");
                    } else {
                        System.out.println("❌ Task not found.");
                    }
                    break;

                case 5:
                    System.out.println("👋 Exiting...");
                    return;

                default:
                    System.out.println("❌ Invalid choice.");
            }
        }
    }
}
