<%--
  Created by IntelliJ IDEA.
  User: thedpk
  Date: 31/01/2024
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        #loginForm {
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
        }

        input[type="text"],
        input[type="password"],
        input[type="submit"] {
            width: 100%;
            padding: 8px;
            margin: 5px 0;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #0C243C;
            color: #fff;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0A1E32;
        }

        a {
            text-decoration: none;
            color: #55C2C3;
        }

        #errorMessage {
            font-style: italic;
            color: red;
            margin-top: 10px;
        }
    </style>
</head>
<body>

<div id="loginForm">
    <form action="loginProcess" method="post">
        <div>
            <label for="username">Username:</label><br />
            <input type="text" id="username" name="username" required="required" />
        </div>
        <div>
            <label for="password">Password:</label><br />
            <input type="password" id="password" name="password" required="required" />
        </div>
        <div>
            <input type="submit" value="Login" />
        </div>
    </form>

    <div id="errorMessage">${message}</div>
</div>

</body>
</html>

