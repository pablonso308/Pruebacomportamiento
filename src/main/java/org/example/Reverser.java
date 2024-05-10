package org.example;
public class Reverser {
    private Program program;
    private HaltChecker haltChecker;

    public Reverser(Program program) {
        this.program = program;
        this.haltChecker = new HaltChecker();  // Asume que HaltChecker está configurado correctamente.
    }

    public void execute() {
        String result = haltChecker.willProgramHalt(program);
        if (result.equals("never")) {
            while (true) { // Bucle infinito si el programa nunca se detiene.
                System.out.println("Looping forever...");
                try {
                    Thread.sleep(1000); // Espera para hacer el bucle visible.
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Buena práctica para manejar la interrupción.
                }
            }
        } else {
            System.out.println("Program halts, ending Reverser.");
        }
    }
}
