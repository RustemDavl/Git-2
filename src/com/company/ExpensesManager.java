package com.company;

public class ExpensesManager {
    double[] expenses;                                     //Объявите одно поле — массив трат double[] expenses.

    ExpensesManager() {                                        //Объявите конструктор, а внутри него инициализируйте
        /*double[] */  expenses = new double[7];                       //массив также, как это происходит сейчас в классе
        //Praktikum — в нём должно храниться семь значений.
    }
    //Перенесите в ExpensesManager код методов saveExpense,
    //findMaxExpense и printAllExpenses. Удалите перед
    //Удалите перед названием методов слова public и static
    double saveExpense(double moneyBeforeSalary, double expense, int day) { //Параметры метода saveExpenseвнутри
        //класса ExpensesManager изменятся: теперь
        //он должен принимать остаток на счёте
        //moneyBeforeSalary, размер траты expense и номер
        //дня недели day, за который нужно её учесть.

        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses[day - 1] = expenses[day - 1] + expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    double findMaxExpense() {  // Уберите из методов findMaxExpense и printAllExpenses параметр double[] expenses.
        // Теперь он стал полем класса, и его не нужно передавать.
        double maxExpense = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
        }
        return maxExpense;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("День " + (i + 1) + ". Потрачено " + expenses[i] + " рублей");
        }
    }

}
