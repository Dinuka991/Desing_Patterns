package com.company;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        System.out.println("Enter number upto which Fibonacci series to print: ");
        int maxLength =  new Scanner(System.in).nextInt();
        fibonacciSeries(maxLength);
    }

    public static void fibonacciSeries(int max){
        int[] arr = new int[max];
        arr[0] = 1;
        arr[1] =  arr[0] + 1;

        for(int i = 2; i < max ; i++){
            arr[i] = arr[i-1]+ arr[i-2];
        }

        for(int arrVal: arr){
            System.out.println(arrVal);
        }
    }
}
