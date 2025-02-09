package com.sprint1;

import java.util.Scanner;

public class SumFactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int num = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= num; i++) {
            count *= i;
        }
        int sum = 0;
        while(count>0){
            int remainder = count%10;
            sum += remainder;
            count = count/10;
        }
        System.out.println(sum);
    }
}
