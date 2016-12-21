package com.sd.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcAreaGUIMain2 extends JFrame implements ActionListener{
    JTextField radiusTf1;
    JTextField areaTf2;
    public CalcAreaGUIMain2(){
        //JFrame f= new JFrame();
        JPanel panel=new JPanel(new GridLayout(3,2));
        getContentPane().add(panel);
        JLabel label1=new JLabel("radius");
        JLabel label2=new JLabel("area");
        JTextField radiusTf1=new JTextField(10);
        JTextField areaTf2=new JTextField(10);
        JButton b1=new JButton("calcarea");
        JButton b2=new JButton("cancel");
        b1.setPreferredSize(new Dimension(40,40));
        b1.addActionListener(this);
        panel.add(label1);
        panel.add(radiusTf1);
        panel.add(label2);
        panel.add(areaTf2);
        panel.add(b1);
        panel.add(b2);
        //f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        JButton b=(JButton)e.getSource();
        Double r=Double.parseDouble(radiusTf1.getText());
        areaTf2.setText(Double.toString(Math.PI*Math.pow(r,2)));
        b.setText("Complete calcarea");
    }
    public static void main(String[] args){
        CalcAreaGUIMain2 c=new CalcAreaGUIMain2();
        c.pack();
        c.setVisible(true);
    }

}