import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;


public class anspage {

    JFrame box = new JFrame("bmi");
    JLabel text;

    public anspage(double x, double y){

        Dimension  size = new Dimension(500, 300);
        box.setSize(size);
        box.setLayout(null);
        box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        text = new JLabel("the answer is: "+ (y/((x/100)*(x/100))) );
        text.setBounds(150, 150, 200, 20);

        box.add(text);

        box.setVisible(true);

    }
    
}
