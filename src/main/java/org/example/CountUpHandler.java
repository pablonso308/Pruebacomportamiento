package org.example;

public class CountUpHandler implements Handler {
    private Handler nextHandler;

    // Método para manejar el programa
    @Override
    public String handle(Program program) {
        // Verificar si el programa es una instancia de CountUp
        if (program instanceof CountUp) {
            return "never"; // CountUp nunca termina, así que devolvemos "never"
        }
        // Si no es un CountUp y hay un próximo manejador, pasamos la responsabilidad al próximo manejador
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
