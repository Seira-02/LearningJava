package com.sprint1;

import java.util.Scanner;

public class ArmstrongDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        sc.close();

        FindArmstrong(a,b);

    }
    static void FindArmstrong(int a, int b){
        for(int i= a; i<=b; i++){
            int num = i;
            int sum = 0;

            while(num!= 0){
                int remainder = num%10;
                sum = sum*10 + remainder;
                num = num/10;
                if(i==sum){
                    System.out.println(i);
                }
            }

        }
    }
}
