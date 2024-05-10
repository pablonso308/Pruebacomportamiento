package org.example;


// HaltChecker implementa Handler
public class HaltChecker {
    private Handler firstHandler;

    // Constructor de la clase HaltChecker
    public HaltChecker() {
        // Configurar la cadena de responsabilidad
        Handler countDownHandler = new CountDownHandler(); // Creamos un manejador para CountDown
        Handler countUpHandler = new CountUpHandler();     // Creamos un manejador para CountUp

        countDownHandler.setNextHandler(countUpHandler);  // Enlazamos el manejador de CountDown al de CountUp

        this.firstHandler = countDownHandler;  // Establecemos el primer manejador en la cadena como el de CountDown
    }

    // Método para verificar si el programa se detiene o no
    public String willProgramHalt(Program program) {
        return firstHandler.handle(program);  // Pasamos el programa al primer manejador en la cadena de responsabilidad
    }
}
