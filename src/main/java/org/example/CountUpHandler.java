package org.example;

public class CountUpHandler implements Handler {
    @Override
    public boolean handle(Program program) {
        if (program instanceof CountUp) {
            return false; // CountUp tiene un bucle infinito
        }
        return false;
    }
}