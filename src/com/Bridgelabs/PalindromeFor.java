package com.Bridgelabs;

import java.util.Scanner;

public class PalindromeFor {
    public static void main(String[] args) {
        int num,a,sum=0,lastDigit;
        System.out.println("Enter the number: ");
        Scanner r=new Scanner(System.in);
        num=r.nextInt();
        a=num;
        for ( ;num != 0; num=num/10){
            lastDigit=num%10;
            sum=(sum*10)+lastDigit;
        }
        if (sum==a){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }
}
