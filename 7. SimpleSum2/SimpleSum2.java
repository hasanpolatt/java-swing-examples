
package AppForm;

import java.awt.GridLayout;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleSum2 extends JFrame {
    JButton b1,b2;
    JTextField t1,t2;
    JLabel l1,l2;
    
    public SimpleSum2() {
        //b1 = new JButton("CLICK");
        
        //t1  = new JTextField("Hello");
        
        b1 = new JButton("+");
        b2 = new JButton("-");
        t1 = new JTextField("");
        t2 = new JTextField("");
        l1 = new JLabel("Number-1: ");
        l2 = new JLabel("Number-2: ");
        
        add(l1);add(t1);add(l2);add(t2);add(b1);add(b2);
        //setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        setLayout(new GridLayout(3, 2));
        setSize(500, 600);
        
            b1.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
            int s1 = Integer.parseInt(t1.getText());
            int s2 = Integer.parseInt(t2.getText());
            System.out.println("Total: " +(s1+s2));
            setTitle("Total: " + (s1+s2));
        }
    });
                    
            b2.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
            int s1 = Integer.parseInt(t1.getText());
            int s2 = Integer.parseInt(t2.getText());
            System.out.println("Subtract:  " +(s1-s2));
            setTitle("Subtract: " + (s1-s2));
        }
    });
    }
    public static void main(String[] args) {
        SimpleSum2 uf = new SimpleSum2();
        
        uf.setTitle("First Application");
        //uf.setSize(500, 600);
        uf.setLocationRelativeTo(null);
        uf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        uf.setVisible(true);
    }
    
}
