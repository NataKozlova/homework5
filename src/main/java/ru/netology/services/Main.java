package ru.netology.services;
public class Main {
    public static void main(String[] args) {
        int income = 10000; //доход от работы
        int expense = 3000; //обязательные месячные траты
        int threshold = 20000;
        CalcService calcService = new CalcService();
        int months = calcService.calculate(income,expense,threshold);
        System.out.println(months);
    }
}
