import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Whats the radius?"));
     area(radius);
     perimeter(radius);
        //call the area method

        //call the circumference method


    }
    public static void area(double radius){
        double area = Math.PI * Math.pow(radius,2);
        DecimalFormat round = new DecimalFormat("#.##");
        JOptionPane.showMessageDialog(null,"The area of this circle is: " + round.format(area));

    }
    public static void perimeter(double radius){
        double perimeter = 2 * Math.PI * radius;
        DecimalFormat round = new DecimalFormat("#.##");
        JOptionPane.showMessageDialog(null,"The perimeter of this circle is: " + round.format(perimeter));

    }
    //write a method to calculate a circle's area


    //write a method to calculate a circle's circumference

}
