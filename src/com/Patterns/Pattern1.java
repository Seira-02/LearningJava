package com.Patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int n = sc.nextInt();

        System.out.println("Enter Columns: ");
        int num = sc.nextInt();

        ForDesign(n, num);

    }
    static void ForDesign( int n, int num){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
