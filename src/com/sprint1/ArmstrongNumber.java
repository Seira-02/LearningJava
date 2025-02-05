package com.sprint1;
import java.util.Scanner;


public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int sum = 0;
        int orgNumber = num;

        while(num!= 0){
            int temp = num%10;
            System.out.println(temp);
            sum += Math.pow(temp, 3);
            System.out.println(sum);
            num = num/10;
            System.out.println(num);
        }
        if(sum == orgNumber){
            System.out.println("This is an armstrong Number");
        }else{
            System.out.println("Not an armstrong Number");
        }


    }
}
