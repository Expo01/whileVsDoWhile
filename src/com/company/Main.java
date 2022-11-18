package com.company;

public class Main {

    public static void main(String[] args) {
        whileLoop();
        doWhileLoopMandatoryExecution();
        doWhileLoop();
    }

    public static void whileLoop() {
        System.out.println("===== while loop stuff =====");
        int counter = 0;
        int sum = 0;
        while (counter < 4) {
            counter++;
            sum += counter;
            System.out.println(sum);
            if (counter == 4) {
                System.out.println("exiting while loop with sum of " + sum);
            }
        }
    }

    public static void doWhileLoopMandatoryExecution() {
        System.out.println("======== mandatory execution stuff =======");
        int counter = 5;
        int sum = 0;
        do {
            counter++;
            sum += counter;
            System.out.println(sum);
        } while (counter <4);
        System.out.println("exiting while loop with sum of " + sum);
    }

    public static void doWhileLoop() {
        System.out.println("======== do while loop stuff =======");
        int counter = 0;
        int sum = 0;
        do {
            counter++;
            sum += counter;
            System.out.println(sum);
        } while (counter <4);
        System.out.println("exiting while loop with sum of " + sum);
    }


}
