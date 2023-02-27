package com.Bridgelabs;

import java.util.Scanner;

public class NaturalWhile {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number here:");
        int s1= sc.nextInt();
        int n=s1, i=1,sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of N natural numbers is:" + sum);
    }
}
