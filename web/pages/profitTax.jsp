<%@ page import="Calculators.Calculator" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Выгодная СНО</title>
</head>
<body>
<div>
    <h1>Введите данные для расчета:</h1>
</div>
<form method="post">
    <label>Доход:
        <input type="text" name="income">
    </label>
    <label>Расход:
        <input type="text" name="expense">
    </label>
    <button type="submit">Рассчитать!</button>
</form>
<button onclick="location.href='/'">Вернуться на главную</button>
</body>
</html>
