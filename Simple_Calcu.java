import javax.swing.JOptionPane;

class Simple_Calcu {
    public static void main(String[] args) {
        int num1, num2, result;
        int choice;

        // Menu for operation
        String menu = "Choose operation:\n"
                    + "1. Addition\n"
                    + "2. Subtraction\n"
                    + "3. Multiplication\n"
                    + "4. Division";
        choice = Integer.parseInt(JOptionPane.showInputDialog(menu));

        switch (choice) {
            case 1:
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
                result = addition(num1, num2);
                JOptionPane.showMessageDialog(null, "The sum of " + num1 + " and " + num2 + " is " + result);
                break;

            case 2:
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
                result = subtraction(num1, num2);
                JOptionPane.showMessageDialog(null, "The difference of " + num1 + " and " + num2 + " is " + result);
                break;

            case 3:
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
                result = multiplication(num1, num2);
                JOptionPane.showMessageDialog(null, "The product of " + num1 + " and " + num2 + " is " + result);
                break;

            case 4:
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
                if (num2 != 0) {
                    result = divide(num1, num2);
                    JOptionPane.showMessageDialog(null, "The quotient of " + num1 + " and " + num2 + " is " + result);
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Division by zero is not allowed!");
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Invalid choice!");
        }
    }

    // Methods
    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }
}
