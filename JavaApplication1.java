/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author SIDNEY9
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame myframe=new JFrame();
        JPanel mypane=new JPanel();
        JLabel label1=new JLabel("Username");
        JLabel label2=new JLabel("Password");
        JButton Submit=new JButton("Submit");
        JTextField Username=new JTextField();
        JTextField password=new JTextField();
        Username.setPreferredSize(new Dimension(200,100));
        password.setPreferredSize(new Dimension(200,100));
        Username.setVisible(true);
        password.setVisible(true);
        Submit.setSize(20, 10);
        label1.setText("Username");
        label2.setText("Password");
        myframe.setVisible(true);
        myframe.setSize(200, 100);
        myframe.add(mypane);
        mypane.add(label1);
        mypane.add(Username);
        mypane.add(label2);
         mypane.add(password);
         mypane.add(Submit);
        Submit.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Username.setText(" ");
                mypane.setBackground(Color.red);
            }
            
            
        });
        
    }    
    
    
}
