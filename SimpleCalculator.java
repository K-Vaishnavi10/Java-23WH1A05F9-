import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame {
    private JTextField display;
    private StringBuilder currentInput;
    private String operator;
    private double firstOperand;

    public SimpleCalculator() {
        // Set up the frame
        setTitle("Simple Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        currentInput = new StringBuilder();

        // Display screen
        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        add(display, BorderLayout.NORTH);

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 10, 10));

        // Create number and operator buttons
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C", "±", "%", "="
        };

        // Add buttons to panel
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            switch (command) {
                case "=":
                    // Evaluate the expression when "=" is pressed
                    try {
                        double result = evaluateExpression(currentInput.toString());
                        display.setText(String.valueOf(result));
                        currentInput.setLength(0); // Clear the input after evaluation
                    } catch (Exception ex) {
                        display.setText("Error");
                        currentInput.setLength(0); // Clear input on error
                    }
                    break;

                case "C":
                    // Clear the display
                    currentInput.setLength(0);
                    display.setText("");
                    break;

                case "±":
                    // Toggle sign of the number
                    if (currentInput.length() > 0 && currentInput.charAt(0) == '-') {
                        currentInput.deleteCharAt(0);
                    } else {
                        currentInput.insert(0, '-');
                    }
                    display.setText(currentInput.toString());
                    break;

                case "%":
                    // Calculate percentage
                    if (currentInput.length() > 0) {
                        double value = Double.parseDouble(currentInput.toString());
                        value = value / 100;
                        currentInput.setLength(0);
                        currentInput.append(value);
                        display.setText(currentInput.toString());
                    }
                    break;

                default:
                    // If a number or operator is pressed, add to the current input
                    currentInput.append(command);
                    display.setText(currentInput.toString());
                    break;
            }
        }
    }

    private double evaluateExpression(String expression) throws Exception {
        // This method handles basic arithmetic operations
        // It's a very simple implementation that evaluates just basic expressions

        String[] tokens = expression.split("[-+*/]");
        if (tokens.length < 2) {
            throw new Exception("Invalid expression");
        }

        double operand1 = Double.parseDouble(tokens[0]);
        double operand2 = Double.parseDouble(tokens[1]);

        char operator = expression.charAt(tokens[0].length());

        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new Exception("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new Exception("Invalid operator");
        }
    }

    public static void main(String[] args) {
        // Create and show the calculator
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SimpleCalculator calculator = new SimpleCalculator();
                calculator.setVisible(true);
            }
        });
    }
}
