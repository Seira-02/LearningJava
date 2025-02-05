package com.sprint1;

import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int a = sc.nextInt();
        System.out.println("Enter second Number: ");
        int b = sc.nextInt();
        FindArmstrongNumber(a,b);


    }

    static void FindArmstrongNumber(int a, int b) {
        for (int i = a; i <= b; i++) {
            int sum = 0;
            int num = i;
            int count = String.valueOf(i).length();

            while (num > 0) {
                int temp = num % 10;
                sum += (int) Math.pow(temp, count);
                num = num/10;
            }
            if(sum==i){
                System.out.println(sum);
            }
        }

    }

}
