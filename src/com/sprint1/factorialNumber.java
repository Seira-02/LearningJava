package com.sprint1;

import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        int n = 1;
        for(int i = 1; i<=num; i++){
            n *= i;
        }
        System.out.println("Factorial of " +num+ " is: " +n);
    }
}
