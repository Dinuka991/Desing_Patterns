package com.company;


import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {
           String str;

           do{
               System.out.println("Please enter the word");
                str =  new Scanner(System.in).nextLine();
                if(checkPal(str)){
                    System.out.println("This is paradigam");
                }else {
                    System.out.println("This is not paradigam");
                }
           } while (!str.equalsIgnoreCase("A"));
    }

    public static boolean checkPal(String text){

        String reverse="";
        int rvLength = text.length();
        for(int i = 1 ; i < rvLength+1 ; i ++){
            reverse = reverse + text.charAt(rvLength- i);
        }
        System.out.println(reverse);
        return text.equalsIgnoreCase(reverse);
    }
}
