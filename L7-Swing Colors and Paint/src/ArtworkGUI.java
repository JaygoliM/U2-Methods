import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    //DECLARE VARIABLES
    JFrame frame;
    public ArtworkGUI()
    {
        //CREATE THE GUI
        frame = new JFrame("ART WKLW");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new MyDrawing();

        frame.add(panel);
        frame.setVisible(true);
    }

    private class MyDrawing extends JPanel
    {
        public MyDrawing(){
            //Set the background color
            setBackground(new Color(30, 132, 211));
        }

        //Add the PaintComponent Method and create your drawing.
        public void paintComponent(Graphics g){

            super.paintComponent(g);
            g.setColor(new Color(4, 108, 6));
            g.fillRect(0,370,700,450);

            g.setColor(Color.WHITE);
            g.fillRect(150,50,100,50);
            g.setColor(Color.WHITE);
            g.fillRect(100,75,50,25);
            g.setColor(Color.WHITE);
            g.fillRect(250,75,50,25);

            g.setColor(Color.WHITE);
            g.fillRect(450,150,100,50);
            g.setColor(Color.WHITE);
            g.fillRect(400,175,50,25);
            g.setColor(Color.WHITE);
            g.fillRect(550,175,50,25);

            g.setColor(Color.YELLOW);
            g.fillRect(600,0,100,50);

            g.setColor(Color.GRAY);
            g.fillRect(280,370,100,450);

            g.setColor(new Color(218, 173, 29));
            g.fillRect(325,380,10,45);
            g.fillRect(325,450,10,25);

            g.setColor(new Color(96, 40, 0));
            g.fillRect(50,270,200,100);

            g.setColor(new Color(203, 103, 31));
            g.fillRect(150,345,10,25);
        }
    }
}
