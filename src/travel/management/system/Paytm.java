/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Paytm extends JFrame implements ActionListener{
JButton b;
    Paytm(){
         getContentPane().setBackground(Color.white);
        setLayout(null);
       
         
      
        
         b = new JButton("Back");
         b.setBounds(270, 490, 220, 80);
         b.setFont(new Font("Viner Hand ITC",Font.BOLD, 30));
         b.setBackground(Color.black);
         b.setForeground(Color.white);
         b.addActionListener(this);
         add(b);
         
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/payy.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(-100,-70, 900, 800);
        add(image);
         
        
        setLocation(400,60);
          setSize(700,700);
          setVisible(true);
       
   
}
      public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b){
            setVisible(false);
           new Payment();
        } 
    } 
 public static void main(String[] args){
     new Paytm();
         
    }
}