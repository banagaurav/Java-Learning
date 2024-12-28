// a GUI program using components to find sum and difference of two numbers.Use two text fields for giving input and a label for output.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SumDifferenceCalculator {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Sum and Difference Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        // Create components
        JLabel label1 = new JLabel("Enter first number:");
        JTextField textField1 = new JTextField();
        JLabel label2 = new JLabel("Enter second number:");
        JTextField textField2 = new JTextField();
        JLabel resultLabel = new JLabel("Result: ");
        
        // Add components to frame
        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(resultLabel);

        // Add mouse listeners
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    // Get numbers from text fields
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    // Display sum
                    resultLabel.setText("Result: Sum = " + (num1 + num2));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Error: Please enter valid numbers!");
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                try {
                    // Get numbers from text fields
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    // Display difference
                    resultLabel.setText("Result: Difference = " + (num1 - num2));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Error: Please enter valid numbers!");
                }
            }
        });

        // Make frame visible
        frame.setVisible(true);
    }
}
