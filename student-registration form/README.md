# 🎓 Student Registration Web App (Java + Maven + Tomcat)

This is a dynamic student registration web application built using **Java Servlet**, **JSP (optional)**, and packaged as a **Maven WAR** project. The form collects student data and shows a "Successfully Registered" message. It can be deployed on **Apache Tomcat**.

---

## 📦 Tech Stack

- **Java** (Servlet)
- **Maven** (Project build & dependency management)
- **HTML, CSS, JavaScript** (Frontend)
- **Apache Tomcat** (Web server)
- **JSP (optional)** for dynamic view rendering

---

## 📁 Project Structure

```

student-registration/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/tejasri/
│       │       └── StudentServlet.java       # Handles POST request
│       ├── resources/
│       └── webapp/
│           ├── index.jsp                     # Registration Form UI
│           ├── result.jsp                    # Success page (optional)
│           └── WEB-INF/
│               └── web.xml                   # Servlet configuration
├── pom.xml                                   # Maven configuration
└── README.md

````

---

## 🛠️ Features

- Submit student details (name, roll, email, branch, year)
- Java Servlet processes form submission
- Displays "Successfully Registered" message after submission
- Deployable `.war` file using Maven
- Clean UI with responsive layout

---

## 🚀 How to Run

### 🔹 Prerequisites

- Java JDK 8 or later
- Apache Maven
- Apache Tomcat 9/10

---

### 🔹 1. Clone or Create Project

```bash
git clone https://github.com/yourusername/student-registration.git
cd student-registration
````

---

### 🔹 2. Build the WAR File

```bash
mvn clean package
```

If successful, this creates:

```
target/student-registration.war
```

---

### 🔹 3. Deploy to Tomcat

1. Copy the `.war` file to:

   ```
   <tomcat-directory>/webapps/
   ```

2. Start Tomcat:

   ```
   <tomcat-directory>/bin/startup.bat
   ```

3. Open your browser and visit:

   ```
   http://localhost:8080/student-registration/
   ```

---

### 🔹 4. Access the Form

You'll see the registration form. After submitting, it forwards to a JSP (like `result.jsp`) that shows:

```
✅ Successfully Registered
```

---

## 🧪 Example Servlet Snippet

```java
@WebServlet("/register")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String roll = request.getParameter("roll");
        String email = request.getParameter("email");
        String branch = request.getParameter("branch");
        String year = request.getParameter("year");

        request.setAttribute("message", "✅ Successfully Registered");
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
```

---

## 📌 Future Enhancements

* Persist student data to **MySQL**
* Add **validation** for inputs
* Include **login/logout** for admin users
* Add **search** functionality on backend
* Export student list as CSV or Excel

---

## 🙋 Author

**Teja Sri Koduru**


---

```

---


