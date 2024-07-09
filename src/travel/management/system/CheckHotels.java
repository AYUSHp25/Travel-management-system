/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class CheckHotels extends JFrame implements Runnable {

    JLabel  l2, l4, l5,l6;
    JLabel caption;
    Thread th;

    public void run() {
        try {

            l2.setVisible(true);
            caption.setText("JW Marriott Hotel");
            l2.add(caption);
            Thread.sleep(3500);
            l2.setVisible(false);
           
            l4.setVisible(true);
            caption.setText("Four Seasons Hotel");
            l4.add(caption);
            Thread.sleep(3500);
            l4.setVisible(false);
            
            
            l6.setVisible(true);
            caption.setText("Samaya Hotel");
            l6.add(caption);
            Thread.sleep(3500);
            l6.setVisible(false);
             
            l5.setVisible(true);
            caption.setText("Holtin Hua Hin Hotel");
            caption.setForeground(Color.cyan);
            l5.add(caption);
            Thread.sleep(3500);
            l5.setVisible(false);
            
            
           
            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public CheckHotels() {

        setBounds(400, 70, 900, 700);
        getContentPane().setBackground(new Color(220, 250, 250));
        
        th = new Thread(this);
    
        caption = new JLabel();
        caption.setBounds(50, 550, 1000, 70);
        caption.setForeground(Color.WHITE);
        caption.setFont(new Font("Tahoma", Font.PLAIN, 40));
        add(caption);

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/hotel1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 700);
        add(l2);

        setLayout(null);


        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/hotel3.jpg"));
        Image i8 = i7.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(0, 0, 900, 700);
        add(l4);
        l4.setVisible(false);
                
                
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/thotel.jpg"));
        Image i12 = i11.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i13 = new ImageIcon(i12);
        l5 = new JLabel(i13);
        l5.setBounds(0, 0, 900, 700);
        add(l5);
        l5.setVisible(false);
        
        ImageIcon i14 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/lehotel.jpg"));
        Image i15 = i14.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i16 = new ImageIcon(i15);
        l6 = new JLabel(i16);
        l6.setBounds(0, 0, 900, 700);
        add(l6);
        l6.setVisible(false);
         



       

        th.start();

    }

    public static void main(String args[]) {
        new CheckHotels().setVisible(true);

    }

}
