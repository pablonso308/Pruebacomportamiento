package org.example;

public class CountDownHandler implements Handler {

    private Handler nextHandler;
    @Override
    public String handle(Program program) {
        if (program instanceof CountDown) {
            return "halts"; // CountDown se detiene cuando count es menor que 1
        }
        if (nextHandler != null) {
            return nextHandler.handle(program);
        }
        return "never";
    }
    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}