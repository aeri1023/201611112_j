package com.sd.yutgame;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class YutGamePlay extends YutGame{
    public static void main(String[] args){
        JFrame f= new JFrame();
        JPanel panel=new JPanel(new GridLayout(3,2));
        f.getContentPane().add(panel);
        JLabel label1=new JLabel("Player1");
        JLabel label2=new JLabel("Player2");
        JTextField p1=new JTextField(p1.getYut());
        JTextField p2=new JTextField(p2.getYut());
        JButton b1=new JButton("reslt");
        JButton b2=new JButton("cancel");
        panel.add(label1);
        panel.add(p1);
        panel.add(label2);
        panel.add(p2);
        panel.add(b1);
        panel.add(b2);
        f.pack();
        f.setVisible(true);
    }
}