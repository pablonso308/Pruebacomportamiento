package org.example;

import javax.swing.*;

// Interfaz básica para manejadores en la cadena
interface Handler {
    void setNextHandler(Handler next);
    void handleRequest(Program program);
}
