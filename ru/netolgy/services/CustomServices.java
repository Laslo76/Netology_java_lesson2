package ru.netolgy.services;

public class CustomServices {
    public static int feeCalc(int price, int weight) {
        return (int) (price / 100 + weight * 100);
    }
}
