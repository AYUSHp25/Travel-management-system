/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Home extends JFrame{
    String username;
    public static void main(String[] args) {
        new Home("").setVisible(true);
    }
    
    public Home(String username) {
        super("Travel Management System");
	this.username = username;
        setForeground(new Color(179, 158,181));
        setLayout(null); 

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/6666.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JLabel l1 = new JLabel("Travel Management System");
	l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 90));
	l1.setBounds(40, 50, 1300, 120);
	NewLabel.add(l1);
		
		
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(255, 192, 203));
	setJMenuBar(menuBar);
		
        JMenu m1 = new JMenu("CUSTOMER");
        m1.setBackground(new Color(255, 192, 203));
        m1.setForeground(Color.WHITE);
	menuBar.add(m1);
		
        JMenuItem mi1 = new JMenuItem("ADD CUSTOMER");
        mi1.setBackground(new Color(152, 251, 152));
        mi1.setForeground(Color.WHITE);
	m1.add(mi1);
        
        JMenuItem mi2 = new JMenuItem("UPDATE CUSTOMER DETAIL");
        mi2.setBackground(new Color(152, 251, 152));
        mi2.setForeground(Color.WHITE);
	m1.add(mi2);
        
        JMenuItem mi3 = new JMenuItem("VIEW CUSTOMER DETAILS");
        mi3.setBackground(new Color(152, 251, 152));
        mi3.setForeground(Color.WHITE);
	m1.add(mi3);
       
        
        mi1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddCustomer(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new UpdateCustomer(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewCustomers().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        
        
        
		
	JMenu m2 = new JMenu("PACKAGES");
        m2.setForeground(Color.WHITE);
	menuBar.add(m2);
        
        JMenuItem mi6 = new JMenuItem("CHECK PACKAGE");
         mi6.setBackground(new Color(152, 251, 152));
        mi6.setForeground(Color.WHITE);
	m2.add(mi6);
        
        JMenuItem mi7 = new JMenuItem("BOOK PACKAGE");
         mi7.setBackground(new Color(152, 251, 152));
        mi7.setForeground(Color.WHITE);
	m2.add(mi7);
        
        JMenuItem mi5 = new JMenuItem("VIEW PACKAGE");
	 mi5.setBackground(new Color(152, 251, 152));
        mi5.setForeground(Color.WHITE);
        m2.add(mi5);
        
        
        mi6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new CheckPackage().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

        mi7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new BookPackage(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        

	mi5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewPackage(username).setVisible(true);
                }catch(Exception e ){}
                
            }
	});
        
        
        JMenu m3 = new JMenu("HOTELS");
        m3.setForeground(Color.WHITE);
	menuBar.add(m3);
        
        JMenuItem mi8 = new JMenuItem("BOOK HOTELS");
         mi8.setBackground(new Color(152, 251, 152));
        mi8.setForeground(Color.WHITE);
	m3.add(mi8);
        
        JMenuItem mi9 = new JMenuItem("VIEW HOTELS");
         mi9.setBackground(new Color(152, 251, 152));
        mi9.setForeground(Color.WHITE);
	m3.add(mi9);
        
        JMenuItem mi10 = new JMenuItem("VIEW BOOKED HOTEL");
         mi10.setBackground(new Color(152, 251, 152));
        mi10.setForeground(Color.WHITE);
	m3.add(mi10);
        
        mi8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new BookHotel(username).setVisible(true);
            }
	});
        
        
        
	mi9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new CheckHotels().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewBookedHotel(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        JMenu m4 = new JMenu("DESTINATION");
        m4.setForeground(Color.WHITE);
	menuBar.add(m4);
        
        JMenuItem mi11 = new JMenuItem("DESTINATION");
         mi11.setBackground(new Color(152, 251, 152));
        mi11.setForeground(Color.WHITE);
	m4.add(mi11);
        
        mi11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Destination().setVisible(true);
            }
	});
        
        
        JMenu m5 = new JMenu("PAYMENT");
        m5.setForeground(Color.WHITE);
	menuBar.add(m5);
        
        JMenuItem mi12 = new JMenuItem("PAY USING PAYTM");
         mi12.setBackground(new Color(152, 251, 152));
        mi12.setForeground(Color.WHITE);
        
	m5.add(mi12);
        
        mi12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Payment().setVisible(true);
            }
	});
        
        JMenu m6 = new JMenu("UTILITY");
        m6.setForeground(Color.WHITE);
	menuBar.add(m6);
        
        JMenuItem mi13 = new JMenuItem("NOTEPAD");
         mi13.setBackground(new Color(152, 251, 152));
        mi13.setForeground(Color.WHITE);
	m6.add(mi13);
        
        JMenuItem mi14 = new JMenuItem("CALCULATOR");
	 mi14.setBackground(new Color(152, 251, 152));
        mi14.setForeground(Color.WHITE);
        m6.add(mi14);
        
        mi13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("notepad.exe");
                }catch(Exception e){ }
            }
	});
        
        
        mi14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("calc.exe");
                }catch(Exception e){ }
            }
	});
        
        JMenu m7 = new JMenu("ABOUT");
        m7.setForeground(Color.WHITE);
	menuBar.add(m7);
        
        JMenuItem mi15 = new JMenuItem("ABOUT");
         mi15.setBackground(new Color(152, 251, 152));
        mi15.setForeground(Color.WHITE);
	m7.add(mi15);
        
        mi15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new About().setVisible(true);
            }
	});
        
        
        
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }

    Home() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}