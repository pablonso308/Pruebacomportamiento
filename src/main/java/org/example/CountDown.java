package org.example;


class CountDown extends Program {
    private int count = 5;

    @Override
    boolean shouldTerminate() {
        return count < 1;
    }

    @Override
    void execute() {
        while (!shouldTerminate()) {
            System.out.println(count--);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}