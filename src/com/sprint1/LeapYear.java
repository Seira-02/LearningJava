package com.sprint1;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int num = sc.nextInt();

        if((num % 4 == 0 && num %100 != 0) || (num%400 == 0)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}

