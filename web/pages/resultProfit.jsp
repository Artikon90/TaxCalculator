<%@ page import="Calculators.Calculator" %>
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
