import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    // Components for the calculator
    private JTextField display;  // Display for the entire expression
    private JPanel buttonPanel;  // Panel for buttons
    private double firstNumber = 0;  // First operand
    private String operator = "";  // Current operator (+, -, *, /)
    private boolean isOperatorClicked = false;  // To track if the last button was an operator

    // Constructor to set up the GUI
    public Calculator() {
        // Set up the frame
        setTitle("Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Display field
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Buttons
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));

        // Button labels
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        // Add buttons to the panel
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true); // Show the GUI
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // Clear the display
        if (command.equals("C")) {
            display.setText("");
            firstNumber = 0;
            operator = "";
            isOperatorClicked = false;
        }
        // Handle numbers
        else if ("0123456789".contains(command)) {
            if (isOperatorClicked) {
                display.setText(display.getText() + " ");  // Add space after operator
                isOperatorClicked = false;
            }
            display.setText(display.getText() + command);
        }
        // Handle operators
        else if ("+-*/".contains(command)) {
            if (!display.getText().isEmpty() && !isOperatorClicked) {
                firstNumber = Double.parseDouble(display.getText().split(" ")[0]);  // Get the first number
                operator = command;
                display.setText(display.getText() + " " + command);  // Append operator to the display
                isOperatorClicked = true;
            }
        }
        // Handle equals
        else if (command.equals("=")) {
            if (!display.getText().isEmpty() && !operator.isEmpty()) {
                String[] parts = display.getText().split(" ");
                if (parts.length >= 2) {
                    double secondNumber = Double.parseDouble(parts[parts.length - 1]);
                    double result = 0;

                    switch (operator) {
                        case "+" -> result = firstNumber + secondNumber;
                        case "-" -> result = firstNumber - secondNumber;
                        case "*" -> result = firstNumber * secondNumber;
                        case "/" -> {
                            if (secondNumber == 0) {
                                display.setText("Error");
                                return;
                            }
                            result = firstNumber / secondNumber;
                        }
                    }
                    display.setText(display.getText() + " = " + result);  // Show full expression with result
                    operator = "";  // Reset operator
                    isOperatorClicked = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
