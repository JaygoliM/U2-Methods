import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
    */
    public static void main(String[] args) {
        JFrame window = new JFrame("FeetToMeters");
        JPanel panel = new JPanel();
        JButton FTM = new JButton("Feet to Meters");
        JButton MTF = new JButton("Meters to Feet");
        window.setSize(350, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);


        FTM.addActionListener(new FeetToMeter());
        MTF.addActionListener(new MeterToFeet());

        panel.add(MTF);
        panel.add(FTM);
        window.add(panel);
        window.setVisible(true);
    }

    private static class FeetToMeter implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double feet = Double.parseDouble(JOptionPane.showInputDialog("Enter Feet"));
            double meters = feet / 3.28;

            JOptionPane.showMessageDialog(null, meters + " meters.");
        }
    }
        private static class MeterToFeet implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                double meters = Double.parseDouble(JOptionPane.showInputDialog("Enter Meters"));
                double feet = meters * 3.28;

                JOptionPane.showMessageDialog(null, feet + " feet.");
            }
        }

}


