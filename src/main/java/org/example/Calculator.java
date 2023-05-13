package org.example;
/*
  Створити класс Calculator, який буде мати статичні методи для базових арифметичних обчислень.
  В классі Main, викликати методи классу Calculator, для перевірки
 */

public class Calculator {
    // Створюю статичні методи
    public static double addition(double firstOperand, double secondOperand){
        return firstOperand + secondOperand;
    }
    public static double substraction(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }
    public static double multiplication(double firstOperand, double secondOperand){
        return firstOperand * secondOperand;
    }
    public static double division(double firstOperand, double secondOperand){
        return firstOperand / secondOperand;
    }
}
