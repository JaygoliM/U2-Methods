import javax.swing.*;
import java.text.DecimalFormat;

public class LemonadeStand {

    public static double price16 = 0.50;
    public static double price20 = 0.90;
    public static double tax = 7.5;
    /*
        You run a very successful Lemonade Stand.

        You sell 16 oz. cups of lemonade for $0.50 and
        20 oz. cups of lemonade for $0.99.

        You also have to report your income to the IRS,
        so you include a 7.5% sales tax on all purchases.

        Create a program which will ask the number of 16oz and 20oz cups of lemonade and display the total cost with tax.

        Your program should include at least ONE method with two parameters.

     */
    public static void main(String[] args) {

        //prompt for number of 16's
        int num20 = Integer.parseInt(JOptionPane.showInputDialog("How many 20 oz cups?"));

        int num16 = Integer.parseInt(JOptionPane.showInputDialog("How many 16 oz cups"));


        calculateCost(num16,num20);
    }




    public static void calculateCost(int num16, int num20){

        DecimalFormat round = new DecimalFormat("$#,###.00");

        double cost16 = num16 * price16;

        double cost20 = num20 * price20;

        double totalCost = (cost16 + cost20) * (1 + tax/100);

        String message = "Your Order: ";
        message += "\nNumber of 16oz: " +num16;
        message += "\nNUmber of 20oz: " + num20;
        message += "\n\nYour total is: " + round.format(totalCost);

        JOptionPane.showMessageDialog(null,message);
    }
}
