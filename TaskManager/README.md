# ✅ Task Manager CLI App

A simple command-line Task Manager built with **Java** and **Maven**. This app allows users to add, view, complete, and delete tasks using a clean CLI interface.

---

## 📌 Features

- ➕ Add a task with a title, description, and due date
- 📋 View all tasks (pending or completed)
- ✅ Mark tasks as completed
- 🗑️ Delete tasks by ID
- 🚀 CLI-based interface for simple interaction

---

## 🛠️ Tech Stack

- **Java 8+**
- **Maven** (build & dependency management)
- **JUnit** (for testing)
- **Lombok** (optional - for reducing boilerplate code)

---

## 📁 Project Structure

task-manager/
├── src/
│ ├── main/
│ │ └── java/
│ │ └── com/
│ │ └── tejasri/
│ │ ├── App.java # Main CLI logic
│ │ ├── model/
│ │ │ └── Task.java # Task data class
│ │ ├── service/
│ │ │ └── TaskService.java # Core task operations
│ │ └── utils/
│ │ └── InputUtils.java # Input handling helpers
│ └── test/
│ └── java/
│ └── com/
│ └── tejasri/
│ └── TaskServiceTest.java # (Optional) Unit tests
├── pom.xml
└── README.md

yaml
Copy
Edit

---

## 🚀 How to Run

### ✅ In IntelliJ IDEA:

1. Clone or download the project.
2. Open IntelliJ → **File > Open** → Select `task-manager` folder.
3. Wait for Maven dependencies to load.
4. Navigate to `App.java` → Right-click on `main()` → Click **Run**.


# Run the jar (after Maven Shade Plugin setup)
java -jar target/task-manager-1.0-SNAPSHOT.jar
