import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {
area();
        //create and run the program
perimeter();
    }
public static void area(){

    DecimalFormat round = new DecimalFormat("#.##");

    double radius = Double.parseDouble(JOptionPane.showInputDialog("Whats the radius?"));
    double area = Math.PI * Math.pow(radius,2);

    JOptionPane.showMessageDialog(null,"The area of this circle is: " + round.format(area));

}
    //re-write the method to calculate a circle's area using parameters
public static void perimeter(){

    DecimalFormat round = new DecimalFormat("#.##");

    double radius = Double.parseDouble(JOptionPane.showInputDialog("Whats the radius?"));
    double perimeter = 2 * Math.PI * radius;


    JOptionPane.showMessageDialog(null,"The perimeter of this circle is: " + round.format(perimeter));
}

    //re-write the method to calculate a circle's perimeter using parameters

}
