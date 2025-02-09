package com.Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int n = sc.nextInt();

        FindPattern(n);
    }
    static void FindPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            int i1 = 2*n - (2 * i + 1);
            for (int j = 1; j <= i1; j++) {
                System.out.print(" ");
            }
            for (int j= i; j>=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
