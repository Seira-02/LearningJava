package com.Patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int num = sc.nextInt();

        ForPattern(num);

    }
    static void ForPattern(int num){
        int count =1;
        for(int i = 1; i<= num; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(count + " ");
                count++;

            }
            System.out.println();
        }

    }
}
