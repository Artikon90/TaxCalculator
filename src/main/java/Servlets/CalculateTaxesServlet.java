package Servlets;

import Calculators.Calculator;

import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CalculateTaxesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("pages/calculatorTax.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Calculator taxCalc = Calculator.getInstance();
        taxCalc.setIncome(Double.parseDouble(req.getParameter("income")));
        taxCalc.setExpense(Double.parseDouble(req.getParameter("expense")));
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("pages/resultTax.jsp");
        requestDispatcher.forward(req, resp);
    }

}