<%--
  TODO добавить учет страховых взносов
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Расчет налога</title>
</head>
<body>
<div>
    <h1>Введите данные для расчета:</h1>
</div>
<form method="post">
    <label>Доход:
        <input type="text" name="income">
    </label>
    <label>Расход: (укажите ноль, если вы на УСН Д)
        <input type="text" name="expense">
    </label>
    <button type="submit">Рассчитать!</button>
</form>
<button onclick="location.href='/'">Выйти на главную</button>
</body>
</html>
