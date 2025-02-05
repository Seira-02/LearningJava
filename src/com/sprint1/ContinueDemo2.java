package com.sprint1;

public class ContinueDemo2 {
    public static void main(String[] args) {
        int i, j;


    outer:
            for(i=1;i<=5;i++) {
                for (j = 1; j <= 5; j++) {
                    System.out.println("Hello ");
                    continue outer;
                }
            }
            System.out.println("Good bye!!");

    }
}

