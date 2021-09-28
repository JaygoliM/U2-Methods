import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */
    public static void main(String[] args) {
        JFrame window = new JFrame();
        JPanel panel = new JPanel();
        JButton button1 = new JButton("I'm Quote 1");
        JButton button2 = new JButton("I'm Quote 2");
        JButton button3 = new JButton("I'm Quote 3");

        window.setSize(350,100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);


        button1.addActionListener(new ButtonListener1());
        button2.addActionListener(new ButtonListener2());
        button3.addActionListener(new ButtonListener3());


        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        window.add(panel);
        window.setVisible(true);
    }
    private static class ButtonListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {JOptionPane.showMessageDialog(null,"You will survive 100 years if you wish to!!!! :D");}
    }

    private static class ButtonListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {JOptionPane.showMessageDialog(null,"Bad things are around the corner :((");}
    }
    private static class ButtonListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {JOptionPane.showMessageDialog(null,"Your luck is looking up! >:)))");}
    }
}
