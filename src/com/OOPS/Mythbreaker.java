package com.OOPS;

class Mythbreaker {
    static void getSum1(int x, int y) {
        int result;
        result = x + y;
        System.out.println("The result is: " + result);
    }

    static int getSum2(int x, int y) {
        int result;
        result = x + y;
        return result;
    }

    public static void main(String[] args) {
        getSum1(10,20);
        Mythbreaker mb = new Mythbreaker();
        System.out.println("The result is: " +mb.getSum2(10,30));
    }
}