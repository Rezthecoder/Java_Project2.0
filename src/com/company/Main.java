package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter year: ");
        int year =scanner.nextInt();
       boolean c = isLeapYear(year);
           if(c){
               System.out.println("leap year");
            }
           else {
               System.out.println("Not leap year");
           }
        System.out.println(c);
    }


    public static boolean isLeapYear(int year) {
        if(year <1 || year>9999){
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }else {
            return false;
        }
    }
}
