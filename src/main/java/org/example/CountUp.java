package org.example;

class CountUp extends Program {
    private int count = 1;

    @Override
    boolean shouldTerminate() {
        return false; // Nunca termina
    }

    @Override
    void execute() {
        while (!shouldTerminate()) {
            System.out.println(count++);
            // Simular alguna condición de espera
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}