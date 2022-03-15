package Calculators;

public class Calculator {
    private static Calculator taxCalc = new Calculator();
    private Calculator() {
    }
    public static Calculator getInstance() {
        return taxCalc;
    }
    public double usn6Tax = 0.06;
    public double usn15Tax = 0.15;
    private double expense;
    private double income;
    private String result;

    public String getResult() {
        return result;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
    //TODO сделать геттеры и сеттеры на налоговые ставки, чтобы можно было устанавливать свои ставки в соотв.
    //с налоговым законодальством.
    //TODO инкапсулировать переменные

    public double getTax6() {
        double tax6 = income * usn6Tax;
        return tax6;
    }

    public double getTax15() {
        double tax15 = (income - expense) * usn15Tax;
        return tax15;
    }

    public void compareProfit() {
        double tax6 = getTax6();
        double tax15 = getTax15();
        double compareResult;
        if (tax15 > tax6) {
            result = ("Для вас выгоднее УСН Доходы, налог составит: " +
                    tax6 + " по УСН Доходы - расходы вышло бы: " + tax15);
        } else if (tax15 < tax6) {
            result = ("Для вас выгоднее УСН Доходы минус Расходы, налог составит: " +
                    tax15 + " по УСН Доходы вышло бы: " + tax6);
        } else if (tax15 == tax6) {
            result = ("Для вас обе системы одинаковы, итоговый налог будет равен." +
                    " Если расходы будут увеличиваться, то лучше выбрать УСН Д-Р");
        }
        //TODO сделать валидацию вводимых данных на выход за пределы УСН или на повышенную ставку
    }
}

