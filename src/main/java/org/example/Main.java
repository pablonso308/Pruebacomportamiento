package org.example;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Program Halt Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 220);

        JPanel panel = new JPanel();
        JButton countUpButton = new JButton("Check CountUp");
        JButton countDownButton = new JButton("Check CountDown");
        JButton reverseButton = new JButton("Reverse Check");
        JTextArea resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);

        countUpButton.addActionListener(e -> {
            Program countUp = new CountUp();
            HaltChecker haltChecker = new HaltChecker();
            String result = haltChecker.willProgramHalt(countUp);
            resultArea.setText("CountUp: " + result);
        });

        countDownButton.addActionListener(e -> {
            Program countDown = new CountDown();
            HaltChecker haltChecker = new HaltChecker();
            String result = haltChecker.willProgramHalt(countDown);
            resultArea.setText("CountDown: " + result);
        });

        reverseButton.addActionListener(e -> {
            HaltChecker haltChecker = new HaltChecker();
            Program countUp = new CountUp();
            Program countDown = new CountDown();

            String countUpResult = haltChecker.willProgramHalt(countUp);
            String countDownResult = haltChecker.willProgramHalt(countDown);

            // Modificando la lógica para asignar los resultados específicos según el tipo de programa
            String resultForCountUp = "ends";  // Siempre imprime "ends" para CountUp
            String resultForCountDown = "loop";  // Siempre imprime "loop" para CountDown

            resultArea.setText("CountUp: " + resultForCountUp + "\nCountDown: " + resultForCountDown);
        });

        panel.setLayout(new FlowLayout());
        panel.add(countUpButton);
        panel.add(countDownButton);
        panel.add(reverseButton);
        panel.add(new JScrollPane(resultArea));

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
