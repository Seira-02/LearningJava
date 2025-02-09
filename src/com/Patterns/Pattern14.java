package com.Patterns;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int num = sc.nextInt();

        ForPattern(num);

    }
    static void ForPattern(int num){
        for(int i = 0; i<=num; i++){
            for(char ch = 'A'; ch <= 'A'+ i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
