package com.Patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rows: ");
        int num = sc.nextInt();

        ForPattern(num);

    }
    static void ForPattern(int num){
        for(int i = 0; i<=num; i++){
            char ch = (char) ('A'+ i);
            for(int j= 0; j<=i; j++){
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}
