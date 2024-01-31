<%--
  Created by IntelliJ IDEA.
  User: thedpk
  Date: 31/01/2024
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        #registerForm {
            margin: 50px auto;
            width: 300px;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        table {
            width: 100%;
        }

        label {
            font-weight: bold;
            color: #555;
        }

        input, button {
            width: 100%;
            padding: 8px;
            margin: 5px 0;
            box-sizing: border-box;
        }

        input::placeholder {
            color: #7E8C9C; /* Set placeholder text color to gray */
        }

        button {
            background-color: #0C243C;
            color: #fff;
            cursor: pointer;
        }

        button:hover {
            background-color: #0C243C;
        }

        a {
            text-decoration: none;
            color: #55C2C3;
        }
    </style>
</head>
<body>
<html>
<head>
    <title>Register</title>
</head>
<body>

<div id="registerForm">
    <form action="registerProcess" method="post">
        <div>
            <label for="username">Username:</label><br />
            <input type="text" id="username" name="username" required="required" />
        </div>
        <div>
            <label for="password">Password:</label><br />
            <input type="password" id="password" name="password" required="required" />
        </div>
        <div>
            <label for="email">Email:</label><br />
            <input type="email" id="email" name="email" required="required" />
        </div>
        <div>
            <input type="submit" value="Register" />
        </div>
    </form>

    <div id="message">${message}</div>
</div>

</body>
</html>



</body>
</html>
