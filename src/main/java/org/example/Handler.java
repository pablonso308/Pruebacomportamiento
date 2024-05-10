package org.example;

public interface Handler {
    boolean handle(Program program);
    void setNextHandler(Handler handler);
}
