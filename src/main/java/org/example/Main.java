package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

        public static void main(String[] args) {
            Program countUp = new CountUp();
            Program countDown = new CountDown();

            HaltChecker checker = new HaltChecker();
            checker.setNextHandler(null); // No hay siguiente manejador en esta configuración

            // Ejecutar programas
            new Thread(() -> countUp.execute()).start();
            new Thread(() -> countDown.execute()).start();

            // Verificación de terminación
            checker.handleRequest(countUp);
            checker.handleRequest(countDown);
        }
    }