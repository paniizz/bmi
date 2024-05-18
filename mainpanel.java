import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

public class mainpanel  implements ActionListener{

    JButton button;
    JFrame box = new JFrame("bmi");

    public mainpanel(){
        Dimension  size = new Dimension(500, 300);
        box.setSize(size);
        box.setLayout(null);
        box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("start");
        JLabel text = new JLabel("BMI calculator: ");
        JLabel text2 = new JLabel("this app calculates body mass index");

        
        button.setBounds(200, 70, 80, 30);
        text.setBounds(200, 10, 100, 100);
        text2.setBounds(120, 125, 300, 30);

        button.addActionListener(this);
       

        box.add(button);
        box.add(text);
        box.add(text2);

        
        
     

        box.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //box.setVisible(false);
        new input();
    }
}
