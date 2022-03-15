<%@ page import="Calculators.Calculator" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Итого налог:</title>
</head>
<body>
<div>
    <h1>Итого налог:</h1>
</div>
<%
    Calculator taxCalc = Calculator.getInstance();
    if(taxCalc.getExpense() == 0) {
        out.println("Налог по системе УСН Д: " + taxCalc.getTax6());
    } else if(taxCalc.getExpense()>0) {
        out.println("Налог по системе УСН Д-Р: " + taxCalc.getTax15());
    }
    //TODO добавить учет фиксов
%>
<button onclick="location.href='/calculateTax'">Провести расчет еще раз</button>
<button onclick="location.href='/'">Вернуться на главную</button>
</body>
</html>
