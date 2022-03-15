<%@ page import="Calculators.Calculator" %><%--
  Created by IntelliJ IDEA.
  User: Art
  Date: 03/15/22
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Результат выгодности:</title>
</head>
<body>
<div>
    <h1>Результат расчета:</h1>
</div>
<%
   Calculator taxCalc = Calculator.getInstance();
   taxCalc.compareProfit();
   out.println(taxCalc.getResult());
%>
<button onclick="location.href='/profitTax'">Посчитать еще раз!</button>
<button onclick="location.href='/'">На главную</button>
</body>
</html>
