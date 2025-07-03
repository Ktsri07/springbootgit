<!DOCTYPE html>
<html>
<head><title>Student Registration</title></head>
<body>
<h2>Student Registration Form</h2>
<form action="register" method="post">
    Name: <label>
    <input type="text" name="name" required>
</label><br><br>
    Branch: <label>
    <input type="text" name="branch" required>
</label><br><br>
    Email: <label>
    <input type="email" name="email" required>
</label><br><br>
    Roll Number: <label>
    <input type="text" name="roll" required>
</label><br><br>
    Year of Study:
    <label>
        <select name="year" required>
            <option value="">--Select--</option>
            <option value="1st Year">1st Year</option>
            <option value="2nd Year">2nd Year</option>
            <option value="3rd Year">3rd Year</option>
            <option value="4th Year">4th Year</option>
        </select>
    </label><br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
