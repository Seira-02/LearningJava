package com.sprint1;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int num = sc.nextInt();
        System.out.println("Multiplication Table of " +num+ " is: ");

        for(int i=1; i<=10; i++){
            int sum = num*i;
            System.out.println(num + "x" +i+ "=" +sum );
        }
    }
}
