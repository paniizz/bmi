import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;


public class input implements ActionListener{ 
    
    JFrame box = new JFrame("bmi");
    JButton button1;
    JTextArea height = new JTextArea(), weight = new JTextArea();
    JLabel text, text2;


    public input(){
        Dimension  size = new Dimension(500, 300);
        box.setSize(size);
        box.setLayout(null);
        box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1 = new JButton("Enter");
        button1.addActionListener(this);

        text = new JLabel("enter your height: ");
        text2 = new JLabel("enter your weight: ");
       
       
        height.setBounds(200, 10, 80, 15);
        weight.setBounds(200, 100, 80, 15);
       
        button1.setBounds(50, 150, 80, 30);
        text.setBounds(50, 10, 200, 20);
        text2.setBounds(50, 100, 200,20);
        

       

        box.add(button1);
        box.add(text);
        box.add(text2);
        box.add(height);
        box.add(weight);
        
        
     

        box.setVisible(true);
    }   
    
    @Override
    public void actionPerformed(ActionEvent e) {

        box.setVisible(false);

        double H = Double.parseDouble(height.getText());
        double W = Double.parseDouble(weight.getText());
        //box.setVisible(false);
        new anspage(H, W);
        

    }
}
