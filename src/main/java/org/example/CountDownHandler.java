package org.example;

public class CountDownHandler implements Handler {

    private Handler nextHandler;
    @Override
    public boolean handle(Program program) {
        if (program instanceof CountDown) {
            return true; // CountDown se detiene cuando count es menor que 1
        }
        if (nextHandler != null) {
            return nextHandler.handle(program);
        }
        return false;
    }
    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}