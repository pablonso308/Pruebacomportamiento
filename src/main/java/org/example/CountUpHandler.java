package org.example;

public class CountUpHandler implements Handler {
    private Handler nextHandler;

    @Override
    public String handle(Program program) {
        if (program instanceof CountUp) {
            return "never"; // CountUp nunca termina, así que devolvemos false
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