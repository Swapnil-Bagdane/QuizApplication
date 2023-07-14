package quiz.application;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Swapnil Bagdane
 */
public class Login extends JFrame implements ActionListener {
    
    JButton rules,back;
    JTextField tframe;
    Login(){
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
           
        
        add(image);
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD,40));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel name = new JLabel("Enter Your Name:");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD,18));
        name.setForeground(Color.BLUE);
        add(name);
        
        tframe = new JTextField();
        tframe.setBounds(735,200,300,25);
        tframe.setFont(new Font("Times new Roman", Font.ITALIC,20));
        add(tframe);
        
        rules = new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);
        
        
        back = new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        setSize(1200,500);
        setLocation(150,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name= tframe.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==back){
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
        
    }
}
