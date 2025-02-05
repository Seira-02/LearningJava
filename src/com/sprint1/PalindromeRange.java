package com.sprint1;

import java.util.Scanner;

public class PalindromeRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second number: ");
        int b = sc.nextInt();
        findPalindrome(a,b);
    }

    static void findPalindrome(int a, int b){

        for(int i=a; i<b; i++) {
            int sum = 0;
            int num = i;

            while (num != 0) {
                int remainder = num % 10;
                sum = sum * 10 + remainder;
                num = num / 10;
            }
            if(i == sum){
                System.out.println(i);
            }
        }

    }
}
