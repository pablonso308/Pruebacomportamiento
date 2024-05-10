package org.example;

public class CountUpHandler implements Handler {
    private Handler nextHandler;

    @Override
    public boolean handle(Program program) {
        if (program instanceof CountUp) {
            return false; // CountUp nunca termina, así que devolvemos false
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