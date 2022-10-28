package employee;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

class Front_Page implements ActionListener{
    JFrame f; 
    JLabel id,l1;
    JButton b;

    Front_Page(){
 
        f=new JFrame("Employee Management System");
        f.setBackground(Color.red);
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employee/icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1150,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        
        l1.setBounds(0,100,1260,500);
        f.add(l1);


        b = new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.YELLOW);
        

        b.setBounds(500,540,250,50);
        b.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,1260,700);
        id.setLayout(null);
        
   

        JLabel lid=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(30,8,1400,100);
        lid.setFont(new Font("serif",Font.PLAIN,70));
        lid.setForeground(Color.blue);
        id.add(lid);

        id.add(b);
        f.add(id);
        
        
        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(1260,650);
        f.setLocation(10,10);

        while(true){
            lid.setVisible(false); // lid =  j label
            try{
                Thread.sleep(500); //1000 = 1 second
            }catch(Exception e){} 
            lid.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }

    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            f.setVisible(false);
            new Login();    
        }
    }

    public static void main(String[] arg){
        Front_Page f = new Front_Page();
    }
}