package com.Patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int n = sc.nextInt();

        FindPattern(n);
    }
    static void FindPattern(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars;
            if (i <= n) {
                stars = i;  // increasing pattern up to n
            } else {
                stars = 2 * n - i;  // decreasing pattern after n
            }

            // Print stars for current row
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
