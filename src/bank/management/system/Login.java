


package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{ //JFrame is a class available in swing package
                                                            //ActionListener interface uses for click event of buttons
    
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login(){ //Constructor
        
        setTitle("AUTOMATED TELLER MACHINE"); //title of frame
         
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg")); //image class ka object classLoader is a class with methodgetsys system s image lene k liye
        Image i2 =i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel text =new JLabel("Welcome to ATM"); //JLabel is used to add heading on frame
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        JLabel cardno =new JLabel("Card No : "); //JLabel is used to add heading on frame
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);
        
        cardTextField = new JTextField(); //textfeild infront of cardno
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
        JLabel pin =new JLabel("PIN : "); //JLabel is used to add heading on frame
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120, 220, 250, 30);
        add(pin);
        
        pinTextField = new JPasswordField(); //textfeild infront of pinno
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
        
        
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.WHITE);
        login.addActionListener(this); //for click event
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this); //for click event
        add(clear);
        
        signup = new JButton("SIGNUP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this); //for click event
        add(signup);
        
        getContentPane().setBackground(Color.WHITE); //function to get frame and set bg color
        setSize(800, 480); //length and width of frame
        setVisible(true);
        setLocation(350, 200); //location left,top
       
    }
    public void actionPerformed(ActionEvent ae){ //this is function used jb ye btana ho ki button p click krke ky hoo
        if(ae.getSource()== clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
    else if(ae.getSource() == login){
        Conn conn =new Conn();
        String cardnumber = cardTextField.getText();
        String pinnumber =pinTextField.getText();
        String query= "select * from login where cardnumber = '"+cardnumber+"' and pin ='"+pinnumber+"'"; 
        
        try{
            ResultSet rs =conn.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }else if(ae.getSource() == signup){
        setVisible(false);
        new SignupOne().setVisible(true);
    }
        
    }
    
    public static void main(String []args){
        new Login(); //Object of Login Class
    }
    
}

