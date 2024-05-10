package org.example;


// HaltChecker implementa Handler
class HaltChecker implements Handler {
    private Handler next;

    @Override
    public void setNextHandler(Handler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(Program program) {
        if (program.shouldTerminate()) {
            System.out.println("Program should terminate.");
        } else {
            if (next != null) {
                next.handleRequest(program);
            }
        }
    }
}