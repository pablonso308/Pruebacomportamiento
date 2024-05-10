package org.example;

public class CountDownHandler implements Handler {
    @Override
    public boolean handle(Program program) {
        if (program instanceof CountDown) {
            return true; // CountDown se detiene cuando count es menor que 1
        }
        return false;
    }
}