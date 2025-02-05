package com.sprint1;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        int x= 0;
        int y= 1;

        for(int i=0; i<=n; i++) {
            System.out.print(x + "  ");
            int next = x + y;
            x = y;
            y = next;
        }
    }
}
