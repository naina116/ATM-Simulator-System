
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Statement;


public class SignupTwo extends JFrame implements ActionListener{//JFrame class is in swing package
    long random;
    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion, category, income, occupation;
    String formno, sreligion, scategory, sincome, seducation, soccupation, seniorcitizen,span, saadhar, existingaccount;
    Statement s;
    
    
    SignupTwo(){
        //this.formno =formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
         
             
        
        JLabel additionalDetails = new JLabel("Page 1 : Additional Details"); //to write text on frame
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion : "); //to write text on frame
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        String valReligion[]={"hindu", "Muslim", "sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        
        JLabel fname = new JLabel("Category : "); //to write text on frame
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        
        String valcategory[]={"General","OBC","SC","ST","Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        JLabel dob = new JLabel("Income : "); //to write text on frame
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String incomecategory[]={"Null","<1,50,000","<2,50,000","<5,00,000","upto10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        
//        JLabel gender = new JLabel("Educational "); //to write text on frame
//        gender.setFont(new Font("Raleway",Font.BOLD,20));
//        gender.setBounds(100, 290, 200, 30);
//        add(gender);
//      
//        
//        JLabel email = new JLabel("Qualification : "); //to write text on frame
//        email.setFont(new Font("Raleway",Font.BOLD,20));
//        email.setBounds(100, 315, 200, 30);
//        add(email);
//        
//        String educationValues[]={"Non-Graduation","Graduate","post-Graduate","Doctorate","others"};
//        education = new JComboBox(educationValues);
//        education.setBounds(300,240,400,30);
//        education.setBackground(Color.WHITE);
//        add(education);
        
        JLabel marital = new JLabel("Occupation : "); //to write text on frame
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        String occupationValues[]={"Salaried","Self-Employed","Buiseness","Student","Retired","Other"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        JLabel address = new JLabel("PAN Number : "); //to write text on frame
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD, 14));
        pan.setBounds(300,440,400,30);
        add(pan);
     
        JLabel city = new JLabel("Aadhar Number : "); //to write text on frame
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD, 14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        JLabel state = new JLabel("Senior Citizen : "); //to write text on frame
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        syes= new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno= new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
     
        
        JLabel pincode = new JLabel("Existing Account : "); //to write text on frame
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        eyes= new JRadioButton("Yes");
        eyes.setBounds(300, 590, 60, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno= new JRadioButton("No");
        eno.setBounds(450, 590, 120, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
        
        next =new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
//    public void actionPerormed(ActionEvent ae){
//        String formno = "" + random;
//        String sreligion =(String) religion.getSelectedItem();
//        String scategory=(String) category.getSelectedItem();
//        String sincome = (String) income.getSelectedItem();
//        String seducation = (String) education.getSelectedItem();
//        String soccupation = (String) occupation.getSelectedItem();
//        String seniorcitizen = null;
//        
//        if(syes.isSelected()){
//            seniorcitizen = "Yes";
//} else if(sno.isSelected()){
//            seniorcitizen = "No";
//        }
//        
//        
//        String existingaccount =null;
//        if(eyes.isSelected()){
//            existingaccount ="Yes";
//        }else if(eno.isSelected()){
//            existingaccount ="No";
//        }
//        
//        String span = pan.getText();
//        String saadhar = aadhar.getText();
//        
//        try{
//            
//                Conn c = new Conn();
//                String query ="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
//                c.s.executeUpdate(query);
//                
//                setVisible(false);
//                new SignupTwo(formno).setVisible(true);
//        }catch(Exception e){
//            System.out.println(e);
//        }
//    }
    
    
    public static void main(String args[]){
        new SignupTwo();
        
    }
    

   
    public void actionPerformed(ActionEvent e)
    {
      //   System.out.println("in event");
        if(e.getSource()==next){    
        
       // formno = "" + random;
        sreligion =(String) religion.getSelectedItem();
        scategory=(String) category.getSelectedItem();
        sincome = (String) income.getSelectedItem();
        //seducation = (String) education.getSelectedItem();
        soccupation = (String) occupation.getSelectedItem();
        seniorcitizen = null;
        
        if(syes.isSelected()){
            seniorcitizen = "Yes";
} else if(sno.isSelected()){
            seniorcitizen = "No";
        }
        
        
        existingaccount =null;
        if(eyes.isSelected()){
            existingaccount ="Yes";
        }else if(eno.isSelected()){
            existingaccount ="No";
        }
        
         span = pan.getText();
         saadhar = aadhar.getText();
        JOptionPane.showMessageDialog(null, "Data is Required");
         
        try{
            if(pan.equals(" " )){
                JOptionPane.showMessageDialog(null, "Pan is Required");
            } else{
             //   Conn c = new Conn();
               // String query ="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                
             //   int yy=Conn.s.executeUpdate(query);
            }
            if(aadhar.equals(" " )){
                JOptionPane.showMessageDialog(null, "aadhar is Required");
            } else{
             //   Conn c = new Conn();
               // String query ="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                
             //   int yy=Conn.s.executeUpdate(query);
            }


            
        }
        catch(Exception em){
            System.out.println(em);
        }
        
        try{
            
                Conn c = new Conn();
                String query ="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                Statement st=c.getStatement();
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Data inserted");
                setVisible(false);
                new SignupThree(""+SignupOne.random);
                
                
                
        }catch(Exception er){
            System.out.println("Exception in connection :="+er);
        }
    }

    }
 

    //@Override
    //public void actionPerformed(ActionEvent e) {
    
    //}
}






