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

public class Destination extends JFrame implements Runnable {

    JLabel  l2, l3, l4, l5, l6,l7,l8,l9;
    JLabel caption;
    Thread th;

    public void run() {
        try {

            l2.setVisible(true);
            caption.setText("Leh Ladakh");
            Thread.sleep(2800);
            l2.setVisible(false);
            l3.setVisible(true);
            caption.setText("Leh Ladakh");
            l3.setVisible(true);
            Thread.sleep(2800);
            l3.setVisible(false);
            l4.setVisible(true);
            caption.setText("Kolkata");
            Thread.sleep(2800);
            l4.setVisible(false);
            l5.setVisible(true);
            caption.setText("Kolkata");
            Thread.sleep(2800);
            l5.setVisible(false);
            l6.setVisible(true);
            caption.setText("Thailand");
            Thread.sleep(2800);
            l6.setVisible(false);
             l7.setVisible(true);
            caption.setText("Thailand");
            Thread.sleep(2800);
            l7.setVisible(false);
            l8.setVisible(true);
            caption.setText("Baku");
            Thread.sleep(2800);
            l8.setVisible(false);
             l9.setVisible(true);
            caption.setText("Baku");
            Thread.sleep(2800);
            l9.setVisible(false);
            
            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public Destination() {

        setBounds(400, 70, 900, 700);
        getContentPane().setBackground(new Color(220, 250, 250));
        
        th = new Thread(this);
        caption = new JLabel();
        caption.setBounds(50, 550, 1000, 70);
        caption.setForeground(Color.WHITE);
        caption.setFont(new Font("Tahoma", Font.PLAIN, 40));
        add(caption);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/dest3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 700);
        add(l2);

        setLayout(null);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/leh2.jpg"));
        Image i5 = i4.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i6);
        l3.setBounds(0, 0, 900, 700);
        add(l3);
        l3.setVisible(false);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/kolkata.jpg"));
        Image i8 = i7.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(0, 0, 900, 700);
        add(l4);
        l4.setVisible(false);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/kolkata1.jpg"));
        Image i11 = i10.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(0, 0, 900, 700);
        add(l5);
        l5.setVisible(false);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/thai1.jpg"));
        Image i14 = i13.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l6 = new JLabel(i15);
        l6.setBounds(0, 0, 900, 700);
        add(l6);
        l6.setVisible(false);
        
        ImageIcon i113 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/thai3.jpg"));
        Image i114 = i113.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i115 = new ImageIcon(i114);
        l7 = new JLabel(i115);
        l7.setBounds(0, 0, 900, 700);
        add(l7);
        l7.setVisible(false);
        
        ImageIcon i1113 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/baku1.jpg"));
        Image i1114 = i1113.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i1115 = new ImageIcon(i1114);
        l8 = new JLabel(i1115);
        l8.setBounds(0, 0, 900, 700);
        add(l8);
        l8.setVisible(false);
        
        ImageIcon i23 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/baku2.jpg"));
        Image i24 = i23.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i25 = new ImageIcon(i24);
        l9 = new JLabel(i25);
        l9.setBounds(0, 0, 900, 700);
        add(l9);
        l9.setVisible(false);

      
        th.start();

    }

    public static void main(String args[]) {
        new Destination().setVisible(true);

    }

}
