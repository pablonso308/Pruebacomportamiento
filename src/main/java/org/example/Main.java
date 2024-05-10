package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Program Halt Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Crear paneles y componentes
        JPanel panel = new JPanel();
        JButton countUpButton = new JButton("Check CountUp");
        JButton countDownButton = new JButton("Check CountDown");
        JTextArea resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);

        // Agregar manejadores de eventos a los botones
        countUpButton.addActionListener(e -> {
            Program countUp = new CountUp();
            HaltChecker haltChecker = new HaltChecker();
            String result = haltChecker.willProgramHalt(countUp);
            resultArea.setText("CountUp " + result);
        });

        countDownButton.addActionListener(e -> {
            Program countDown = new CountDown();
            HaltChecker haltChecker = new HaltChecker();
            String result = haltChecker.willProgramHalt(countDown);
            resultArea.setText("CountDown " + result);
        });

        // Configurar el panel y agregar componentes
        panel.setLayout(new FlowLayout());
        panel.add(countUpButton);
        panel.add(countDownButton);
        panel.add(new JScrollPane(resultArea));

        // Añadir el panel al frame y hacerlo visible
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
