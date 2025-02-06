package com.sprint1;

import java.util.Scanner;

public class SumOfOddInRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second number:");
        int b= sc.nextInt();

        findOdd(a, b);

    }
    static void findOdd(int a, int b){
        int sum = 0;
        for(int i=a; i<=b; i++){
            if(i%2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
