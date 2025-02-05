package com.sprint1;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean flag = false;


//        for(int i = 2; i<=Math.sqrt(number); i++){
//            if (number%i == 0){
//                System.out.println("Not a Prime number");
//                flag = true;
//                break;
//            }
//        }
//        if(flag==false){
//            System.out.println("Is a Prime number");
//        }

        for(int i= 2; i<=Math.sqrt(number); i++){
            if(number%i == 0){
                System.out.println("This is not a Prime Number");
                flag = true;
                break;
            }
        }
        if(flag==false){
            System.out.println("This is Prime Number");
        }


    }
}
