//2_2_5
import javax.swing.JOptionPane;

public class TwoSum2_2_5 {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog("Enter the first num :");
        String strNum2 = JOptionPane.showInputDialog("Enter the second num :");

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        String quotient;

        if (num2 != 0) {
            quotient = String.valueOf(num1 / num2);
        } else {
            quotient = "can not division";
        }

        String message = "Sum: " + sum + "\n"
                       + "Difference: " + difference + "\n"
                       + "Product: " + product + "\n"
                       + "Quotient: " + quotient;

        JOptionPane.showMessageDialog(null, message, "Calculation Results", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
