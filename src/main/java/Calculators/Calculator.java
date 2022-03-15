package Calculators;

public class Calculator {
    public double usn6Tax = 6.0;
    public double usn15Tax = 15.0;
    //TODO сделать геттеры и сеттеры на налоговые ставки, чтобы можно было устанавливать свои ставки в соотв.
    //с налоговым законодальством.
    //TODO инкапсулировать переменные

    public double getTax6(double income) {
        double tax6 = income * usn6Tax;
        return tax6;
    }

    public double getTax15(double income, double expenses) {
        double tax15 = (income - expenses) * usn15Tax;
        return tax15;
    }

    public void compareProfit(double income, double expenses) {
        double tax6 = getTax6(income);
        double tax15 = getTax15(income, expenses);
        double compareResult;
        if (tax15 > tax6) {
            System.out.println("Для вас выгоднее УСН Доходы, налог составит: " +
                    tax6 + " по УСН Доходы - расходы вышло бы: " + tax15);
        } else if (tax15 < tax6) {
            System.out.println("Для вас выгоднее УСН Доходы минус расходы, налог составит: " +
                    tax15 + " по УСН Доходы - расходы вышло бы: " + tax6);
        } else if (tax15 == tax6) {
            System.out.println("Для вас обе системы одинаковы, итоговый налог будет равен." +
                    " Если расходы будут увеличиваться, то лучше выбрать УСН Д-Р");
        }
        //TODO сделать валидацию вводимых данных на выход за пределы УСН или на повышенную ставку
    }
}

