package org.example;
public class Reverser implements Handler {
    private Handler nextHandler;

    @Override
    public String handle(Program program) {
        if (nextHandler != null) {
            String result = nextHandler.handle(program);
            // Invertir el resultado
            return invertResult(result);
        }
        return "undefined";  // O manejo de caso cuando no hay siguiente manejador.
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    private String invertResult(String result) {
        if ("never".equals(result)) {
            return "end";
        } else if ("halts".equals(result)) {
            return "loop";
        }
        return "undefined"; // Manejo en caso de que se reciban resultados inesperados
    }
}
