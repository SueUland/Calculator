import javax.swing.*;

/**
 * This program using Dialog Boxes to gather numbers from the user and then
 * performs 4 basic math operations: addition subtraction multiplication and division
 *
 * @author Sue Uland
 * @version 1.0
 */
public class Calculator {

    public static void main(String[] args) {
        // ask the user for two numbers
        // in two separate dialog boxes
        String text1 = JOptionPane.showInputDialog("Enter a number: ");
        String text2 = JOptionPane.showInputDialog("Enter another number: ");

        String result = "";

        try {
            //need to do math with the string form of the numbers in text1 and text2
            int num1 = Integer.parseInt(text1);
            int num2 = Integer.parseInt(text2);

            result = String.format("%d + %d = %d\n" +
                            "%d - %d = %d\n" +
                            "%d * %d = %d\n",
                    num1, num2, (num1 + num2),
                    num1, num2, (num1 - num2),
                    num1, num2, (num1 * num2));

            if (num2 == 0) {
                result += "Can't divide by zero.\n";
            } else {
                result += String.format("%d / %d = %d\n", num1, num2, num1 / num2);
            }
            //result = num1 \n+ " + " + num2 + " = " + (num1 + num2);
        } catch (IllegalArgumentException e) {
            result = "Cannot perform arithmetic with " + text1 + " and " + text2;
        }
        JOptionPane.showMessageDialog(null, result);
        // try to rid yourself of the habit of using System.exit
    }
}
