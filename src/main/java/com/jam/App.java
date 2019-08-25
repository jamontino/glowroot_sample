package com.jam;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Running test");

        Integer iterations = Integer.valueOf(args[0]);
        Integer noOfSecondsToSleep = Integer.valueOf(args[1]);

        MyTestApplication myTestApplication = new MyTestApplication(iterations, noOfSecondsToSleep);
        myTestApplication.run();
    }
}
