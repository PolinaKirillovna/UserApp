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
    <title>Register</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column; /* ???????? ?? column ??? ????????????? ???????????? */
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        div#registerForm {
            width: 300px;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin-bottom: 20px; /* ????????? ??? ??????? ????? ?????? ? ??????? */
        }

        form > div {
            margin-bottom: 15px;
        }

        label {
            font-weight: bold;
        }

        input[type="text"],
        input[type="password"],
        input[type="email"] {
            width: calc(100% - 16px);
            padding: 8px;
            margin-top: 5px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #0C243C;
            color: #fff;
            cursor: pointer;
            border: none;
            padding: 10px;
            width: 100%;
            border-radius: 5px;
        }

        div#message {
            text-align: center;
            margin-top: 20px;
        }

        .back-button-container {
            text-align: left; /* ???????????? ?????? Back ?? ?????? ???? */
            width: 300px; /* ?????? ?????????? ??? ?????? ????????????? ?????? ????? */
        }

        a.back-button {
            text-decoration: none;
            color: #55C2C3;
            font-weight: bold;
        }
    </style>
</head>
<body>

<div id="registerForm">
    <form action="registerProcess" method="post">
        <div>
            <label for="username">Username:</label><br />
            <input type="text" id="username" name="username" required />
        </div>
        <div>
            <label for="password">Password:</label><br />
            <input type="password" id="password" name="password" required />
        </div>
        <div>
            <label for="email">Email:</label><br />
            <input type="email" id="email" name="email" required />
        </div>
        <div>
            <input type="submit" value="Register" />
        </div>
    </form>

    <div id="message">${message}</div>
</div>

<div class="back-button-container">
    <a href="/" class="back-button">Back</a>
</div>

</body>
</html>
