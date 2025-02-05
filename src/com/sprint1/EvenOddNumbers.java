package com.sprint1;

import java.util.Scanner;
public class EvenOddNumbers {
    public static void main(String[] args){
        System.out.println("Enter your number: ");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%2==0){
            System.out.println("This is an Even Number");
        }else{
            System.out.println("This is an odd Number");
        }


    }
}
