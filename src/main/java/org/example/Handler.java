package org.example;

public interface Handler {
    String handle(Program program);
    void setNextHandler(Handler handler);
}
