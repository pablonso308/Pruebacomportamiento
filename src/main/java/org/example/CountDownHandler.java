package org.example;

public class CountDownHandler implements Handler {

    private Handler nextHandler;

    // Método para manejar el programa
    @Override
    public String handle(Program program) {
        // Verificar si el programa es una instancia de CountDown
        if (program instanceof CountDown) {
            return "halts"; // CountDown se detiene cuando count es menor que 1, así que devolvemos "halts"
        }
        // Si no es un CountDown y hay un próximo manejador, pasamos la responsabilidad al próximo manejador
        if (nextHandler != null) {
            return nextHandler.handle(program);
        }
        // Si no hay próximo manejador, devolvemos "never"
        return "never";
    }

    // Método para establecer el próximo manejador en la cadena de responsabilidad
    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
