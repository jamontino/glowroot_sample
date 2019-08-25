package com.jam;

public class MyTestApplication {

    private final int noOfSecondsToSleep;
    private final int iterations;
    private int millisecondModifier = 1000;

    public MyTestApplication(int iterations, int noOfSecondsToSleep) {
        this.iterations = iterations;
        millisecondModifier = 1000;
        this.noOfSecondsToSleep = noOfSecondsToSleep;
    }

    public void run() {
        System.out.println("Sleeping for " + noOfSecondsToSleep + " seconds, " + iterations + " times.");

        for (int i = 1; i <= iterations; i++) {
            try {
                System.out.println("Iteration [" + i + "]...");
                Thread.sleep(noOfSecondsToSleep * millisecondModifier);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sleep complete.");
    }
}
