package com.company;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        printPrime();
    }

    public static boolean  checkPrime(int num){

        if(num == 0 || num == 1){
            return false;
        }
        for(int i =2 ; i < 10 ; i ++){
            if( (num != i) && (num % i  == 0) ){
                return false;
            }
        }
        return  true;
    }

    public static void printPrime(){

        int[] saveNumbers =new int[10];

        for(int i=2;i< 10;i++){

            for(int j=0;j<100;j++){
                if (j % i != 0) {
                    saveNumbers[i] = j;
                }
                j++;
            }
        }

        for(int x: saveNumbers){
            System.out.println(x);
        }
    }



}
