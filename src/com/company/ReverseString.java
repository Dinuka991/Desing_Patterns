package com.company;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Tez"));

    }

    public static String reverseString(String str){

        String reverse = "";
        int length = str.length() -1 ;

        for(int i=0; i< length+1;i++){
            reverse = reverse + str.charAt(length-i);
        }
        return reverse;
    }
}
