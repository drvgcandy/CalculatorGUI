import javax.swing.JOptionPane;
import java.util.*;
public class CalculatorGUI {
    public static void main(String[] args) {
        String fnum= JOptionPane.showInputDialog("Enter first number: ");
        double a= Double.parseDouble(fnum);
        String snum=JOptionPane.showInputDialog("Enter second number: ");
        double b= Double.parseDouble(snum);
        String op=JOptionPane.showInputDialog("Enter operation: ");
        double result=0;
        boolean validOperation=true;

        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("*")) {
            result = a * b;
        } else if (op.equals("/")) {
            if (b != 0) {
                result = a / b;
            } else {
                JOptionPane.showMessageDialog(null, "Error: Division by zero");
                validOperation = false;
            }
        } else if (op.equals("%")) {
            if (b != 0) {
                result = a % b;
            } else {
                JOptionPane.showMessageDialog(null, "Error: Division by zero");
                validOperation = false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid operation");
            validOperation = false;
        }
        if (validOperation){
            JOptionPane.showMessageDialog(null, "Result: " + result);
        }
    }
}