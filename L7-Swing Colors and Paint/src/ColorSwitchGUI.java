import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    //Declare your frame, panel and three buttons.

    JFrame window;
    JPanel panel;

    JButton colorBlue;
    JButton colorRed;
    JButton colorYellow;
   Color coolBlue = new Color(176,224,230);
   Color Blueback = new Color(72, 72, 253);
   Color Bluefront = new Color(5, 30, 132);
   Color NiceRed = new Color(128,0,0);
    Color Redback = new Color(255, 0, 0);
    Color Redfront = new Color(255, 2, 2);
   Color WeirdYellow = new Color(255, 229, 70);
    Color Yellowback = new Color(255, 211, 67);
    Color Yellowfront = new Color(255, 242, 154);

    public ColorSwitchGUI(){
        //create your GUI
        window = new JFrame("Color Switcher");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340, 127);
        window.setLocationRelativeTo(null);
///
        panel = new JPanel();
        colorBlue = new JButton("Change the color blue");
        colorRed = new JButton("Change the color red");
        colorYellow = new JButton("Change the color yellow");

        colorBlue.addActionListener(new BlueColorListener());
        colorRed.addActionListener(new RedColorListener());
        colorYellow.addActionListener(new YellowColorListener());
        panel.add(colorBlue);
        panel.add(colorRed);
        panel.add(colorYellow);

        window.add(panel);

        window.setVisible(true);
    }

    //add listeners to change the colors. Don't forget to link them to buttons.
    private class BlueColorListener implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            panel.setBackground(coolBlue);
            colorBlue.setForeground(Bluefront);
            colorBlue.setBackground(Blueback);
        }
    }
    private class RedColorListener implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            panel.setBackground(NiceRed);
            colorRed.setForeground(Redfront);
            colorRed.setBackground(Redback);
        }
    }
    private class YellowColorListener implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            panel.setBackground(WeirdYellow);
            colorYellow.setForeground(Yellowfront);
            colorYellow.setBackground(Yellowback);
        }
    }
}
