package org.example;

public class Main {
    public static void main(String[] args) {
        Program countDown = new CountDown();
        Program countUp = new CountUp();
        HaltChecker haltChecker = new HaltChecker();

        System.out.println("CountDown will halt: " + haltChecker.willProgramHalt(countDown));
        System.out.println("CountUp will halt: " + haltChecker.willProgramHalt(countUp));
    }
}
