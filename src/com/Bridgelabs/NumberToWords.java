package com.Bridgelabs;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int s = sc.nextInt();
        if (s == 0) {

            System.out.println("Zero");
        } else if ( s== 1) {
            System.out.println("one");
        } else if (s==2) {
            System.out.println("Two");
        } else if (s==3) {
            System.out.println("Three");
        } else if (s==4) {
            System.out.println("Four");
        } else if (s==5) {
            System.out.println("Five");
        } else if (s==6) {
            System.out.println("Six");
        } else if (s==7) {
            System.out.println("Seven");
        } else if (s==8) {
            System.out.println("Eight");
        } else if (s==9) {
            System.out.println("Nine");
        }
        else {
            System.out.println("Enter the valid number");
        }
    }
}
