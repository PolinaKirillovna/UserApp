<%--
  Created by IntelliJ IDEA.
  User: thedpk
  Date: 01/02/2024
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Change Password</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        .form-container {
            width: 300px;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            display: flex; /* Добавлено для вертикального выравнивания */
            flex-direction: column; /* Добавлено для вертикального выравнивания */
            align-items: center; /* Добавлено для горизонтального выравнивания */
        }

        .form-group {
            padding: 10px;
            width: 100%; /* Добавлено для корректного отображения внутри контейнера */
        }

        input {
            width: calc(100% - 20px);
            padding: 8px;
            margin: 5px 0;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #0C243C;
            color: #fff;
            cursor: pointer;
            border: none;
            padding: 10px;
            border-radius: 5px;
        }

        label {
            display: block;
            margin-bottom: 5px;
        }

        .button-container {
            width: 100%; /* Изменено на 100% для корректного отображения */
            display: flex;
            justify-content: space-between; /* Выравнивание кнопок по краям */
            margin-top: 10px; /* Добавлено для отступа от формы */
        }

        a {
            text-decoration: none;
            color: #55C2C3;
            font-weight: bold;
            padding: 10px;
        }
    </style>
</head>
<body>
<div class="form-container">
    <h2>Change Password</h2>
    <!-- Проверка на наличие сообщения об ошибке -->
    <c:if test="${not empty error}">
        <div style="color: red;">${error}</div>
    </c:if>
    <form action="changePassword" method="post">
        <div class="form-group">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
        </div>
        <div class="form-group">
            <label for="oldPassword">Old Password:</label>
            <input type="password" id="oldPassword" name="oldPassword" required>
        </div>
        <div class="form-group">
            <label for="newPassword">New Password:</label>
            <input type="password" id="newPassword" name="newPassword" required>
        </div>
        <div class="form-group">
            <input type="submit" value="Change Password">
        </div>
    </form>
    <div class="button-container">
        <a href="/lk" class="back-button">Back</a>
        <a href="/" class="home-button">Home</a>
    </div>
</div>

</body>
</html>

