
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Fill the form</h1>
<form action="servlet" method="post">
    <label for="fname">Name</label>
    <input type="text" name="fname" id="fname" placeholder="Enter your first name"><br>
    <label for="lname">Enter your last name</label>
    <input type="text" id="lname" name="lname" placeholder="Enter your last name"><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
