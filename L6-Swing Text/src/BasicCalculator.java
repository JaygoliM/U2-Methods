import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */
    static JTextField textInputField;
    static JTextField textInputField2;
    static double Product = 0.00;
    static JLabel ProductShower;

    public static void main(String[] args) {

        JFrame window = new JFrame("Click me!");
        JPanel panel = new JPanel();
        textInputField = new JTextField(10);
        textInputField2 = new JTextField(10);
        ProductShower = new JLabel("0.00");
        JLabel textInputLabel = new JLabel("Enter a number: ");
        JLabel textInputLabel2 = new JLabel("Enter a number: ");
        JButton Multiplication = new JButton("Multiplication");
        JButton Division = new JButton("Division");
        JButton Add = new JButton("Add");
        JButton Subtract = new JButton("Subtract");

        window.setSize(250, 250);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        Add.addActionListener(new ClickerAdd());
        Subtract.addActionListener(new ClickerSub());
        Multiplication.addActionListener(new ClickerMulti());
        Division.addActionListener(new ClickerDivise());

        panel.add(textInputLabel);
        panel.add(textInputField);
        panel.add(textInputLabel2);
        panel.add(textInputField2);
        panel.add(ProductShower);
        panel.add(Multiplication);
        panel.add(Division);
        panel.add(Add);
        panel.add(Subtract);
        window.add(panel);
        window.setVisible(true);


    }

    private static class ClickerAdd implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            double add = Double.parseDouble(textInputField.getText()) + Double.parseDouble(textInputField2.getText());

            Product += add;
            ProductShower.setText("" + Product);
        }
    }

    private static class ClickerSub implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            double subtract = Double.parseDouble(textInputField.getText()) - Double.parseDouble(textInputField2.getText());

            Product += subtract;
            ProductShower.setText("" + Product);
        }
    }

    private static class ClickerMulti implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            double multiply = Double.parseDouble(textInputField.getText()) * Double.parseDouble(textInputField2.getText());

            Product += multiply;
            ProductShower.setText("" + Product);
        }
    }

    private static class ClickerDivise implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            double divide = Double.parseDouble(textInputField.getText()) / Double.parseDouble(textInputField2.getText());

            Product += divide;
            ProductShower.setText("" + Product);
        }
    }
}

