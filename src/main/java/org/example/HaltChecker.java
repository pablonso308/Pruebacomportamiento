package org.example;


// HaltChecker implementa Handler
public class HaltChecker {
    private Handler firstHandler;

    public HaltChecker() {
        // Configurar la cadena de responsabilidad
        Handler countDownHandler = new CountDownHandler();
        Handler countUpHandler = new CountUpHandler();

        countDownHandler.setNextHandler(countUpHandler); // Enlazamos el handler de CountDown al de CountUp

        this.firstHandler = countDownHandler;
    }

    public String willProgramHalt(Program program) {
        return firstHandler.handle(program);
    }
}
