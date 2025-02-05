package com.sprint1;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");

        int n = sc.nextInt();
        int sum = 0;
        int r;

        while(n>0){
            r = n%10;
            sum += r;
            n = n/10;
        }
        System.out.println("Sum of digits: " +sum);
    }
}
