package com.company;

public class ReverseArray {

    public static void main(String[] args) {
        reverseArrayMethod( new int[]{1, 2, 4, 5});
    }

    public static void reverseArrayMethod(int[] arr){

        int length = arr.length;
        int[] reverse = new int[length];

        for(int i=0; i<length; i++){
            reverse[i] = arr[length-i-1];
        }
        for(int val: reverse){
            System.out.println(val);
        }

    }
}
