package com.company;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(findFactorial(4));
    }

    public static float findFactorial(int num) {
        int total = 1;
        for (int i = 1; i < num+1; i++) {
            total = total * i;
        }
        return total;
    }

}
