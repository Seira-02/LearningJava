package com.sprint1;

import java.util.Scanner;

public class SumOfEvenInRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second number: ");
        int b = sc.nextInt();

        findSum(a,b);
    }
    static void findSum(int a, int b){
        int sum = 0;
        for(int i=a; i<=b; i++){
            if(i%2==0){
                sum += i;
            }
        }
        System.out.println(sum);

    }
}
