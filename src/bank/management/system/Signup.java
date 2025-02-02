package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame  implements ActionListener {
    Random ran=new Random();
    JButton next;
    JRadioButton r1,r2,m1,m2,m3;
    long first4=(ran.nextLong()%9000L)+1000L;
    String first =""+Math.abs(first4);
    JDateChooser dateChooser;

    JTextField textName,tfFName,tEmail,tadd,tCity,tPin,tState;
    Signup(){
        super("Application Form");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("Application Form No: "+ first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2=new JLabel("Page1");
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setBounds(290,100,600,30);
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        add(label3);


        JLabel labelName=new JLabel("Name");
        labelName.setBounds(100,190,100,30);
        labelName.setFont(new Font("Raleway",Font.BOLD,22));
        add(labelName);

        JLabel labelFName=new JLabel("Father's Name");
        labelFName.setBounds(100,240,300,30);
        labelFName.setFont(new Font("Raleway",Font.BOLD,22));
        add(labelFName);

        JLabel DOB=new JLabel("Date of Birth");
        DOB.setBounds(100,290,200,30);
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        add(DOB);

        dateChooser =new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,400,30);
        add(dateChooser);

        JLabel labelG=new JLabel("Gender");
        labelG.setBounds(100,330,200,30);
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelG);

        JLabel labelEmail=new JLabel("Email");
        labelEmail.setBounds(100,380,200,30);
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelEmail);

        tEmail=new JTextField();
        tEmail.setFont(new Font("Raleway",Font.BOLD,14));
        tEmail.setBounds(300,380,400,30);
        add(tEmail);

        textName=new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        tfFName=new JTextField();
        tfFName.setFont(new Font("Raleway",Font.BOLD,14));
        tfFName.setBounds(300,240,400,30);
        add(tfFName);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,20));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,330,80,30);
        add(r1);
        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,20));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,330,120,30);
        add(r2);

        ButtonGroup bg =new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JLabel labelMS=new JLabel("Marital Status");
        labelMS.setBounds(100,430,200,30);
        labelMS.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelMS);

        m1=new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,430,100,30);
        add(m1);

        m2=new JRadioButton("UnMarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBounds(450,430,100,30);
        m2.setBackground(new Color(222,255,228));
        add(m2);

        m3=new JRadioButton("Other");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBounds(600,430,100,30);
        m3.setBackground(new Color(222,255,228));
        add(m3);

        JLabel labeladd=new JLabel("Address");
        labeladd.setBounds(100,480,200,30);
        labeladd.setFont(new Font("Raleway",Font.BOLD,20));
        add(labeladd);

        tadd=new JTextField();
        tadd.setFont(new Font("Raleway",Font.BOLD,14));
        tadd.setBounds(300,480,400,30);
        add(tadd);

        JLabel labelCity=new JLabel("City");
        labelCity.setBounds(100,540,200,30);
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelCity);

        tCity=new JTextField();
        tCity.setFont(new Font("Raleway",Font.BOLD,14));
        tCity.setBounds(300,540,400,30);
        add(tCity);

        JLabel labelPin=new JLabel("Pincode");
        labelPin.setBounds(100,590,200,30);
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelPin);

        tPin=new JTextField();
        tPin.setFont(new Font("Raleway",Font.BOLD,14));
        tPin.setBounds(300,590,400,30);
        add(tPin);


        JLabel labelState=new JLabel("State");
        labelState.setBounds(100,640,200,30);
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelState);

        tState=new JTextField();
        tState.setFont(new Font("Raleway",Font.BOLD,14));
        tState.setBounds(300,640,400,30);
        add(tState);


        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Signup();
        String formno=first;
        String name= textName.getText();
        String fname= tfFName.getText();
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        }
        else if(r2.isSelected()){
            gender="Female";
        }
        String email=tEmail.getText();
        String marital=null;
        if(m1.isSelected()){
            marital="married";
        }else if(m2.isSelected()){
            marital="unmarried";
        }else if(m3.isSelected()) {
            marital = "other";
        }

        String add=tadd.getText();
        String city=tCity.getText();
        String pincode=tPin.getText();
        String state=tState.getText();
        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill alll the fields");
            }else{
                con  con1 =new con();
                String q="insert into SignUp values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+add+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup();

    }
}
