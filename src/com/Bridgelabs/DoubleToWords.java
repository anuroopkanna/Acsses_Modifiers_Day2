package com.Bridgelabs;

import java.util.Scanner;

public class DoubleToWords {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number here:");
        int s= sc.nextInt();
        if (s==1){
            System.out.println("Unit");
        } else if (s==10){
            System.out.println("Ten");
        } else if(s==100){
            System.out.println("Hundred");
        } else if (s==1000){
            System.out.println("Thousand");
        }
        else  {
            System.out.println("Enter valid number.");
        }
    }
}
