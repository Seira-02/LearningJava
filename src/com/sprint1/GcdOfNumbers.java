package com.sprint1;
import java.util.Scanner;

public class GcdOfNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int first = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int second= sc.nextInt();

        int g = 1;
        for(int i=1; i<= first; i++){
            if(first%i==0 && second%i == 0)
                g=i;
        }
        System.out.print("GCD = " +g);

    }
}
