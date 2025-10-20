package ru.netology.services;

public class CustomServices {
    final static int bet = 100;

    public static int feeCalc(int price, int weight) {

        return (int) (price / 100 + weight * bet);
    }
}
