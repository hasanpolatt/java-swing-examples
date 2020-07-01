//Summing 1,2,3,4 with Apllet

package Example;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Summation {
    
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton bk = new JButton("control");
    JTextField tf1 = new JTextField("");
    JLabel l1 = new JLabel("Sum: ");
    
    public Summation() {
    
        JFrame jf = new JFrame();
        
        jf.setVisible(true);
        jf.setSize(500, 600);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(3,3));
        jf.setLocationRelativeTo(null);
        
        //first panel
        JPanel jp1 = new JPanel();
        jf.setLayout(new GridLayout(1,1));
        
        
        //second panel
        JPanel jp2 = new JPanel();
        jf.setLayout(new GridLayout(3,2));
        
        jf.add(jp1);jf.add(tf1); jf.add(jp2);
        jf.add(b1); jf.add(b2); jf.add(b3);
        jf.add(b4); jf.add(bk); jf.add(l1); 
        
        //for action listener
        b1.addActionListener(new Summation.buttonListen());
        b2.addActionListener(new Summation.buttonListen());
        b3.addActionListener(new Summation.buttonListen());
        b4.addActionListener(new Summation.buttonListen());
        bk.addActionListener(new Summation.buttonListen());
        
}
    
    public static void main(String[] args) {
        Summation d1 = new Summation();
    }
    
    class buttonListen implements ActionListener {
        
        public void actionPerformed(ActionEvent e){
            
            String word = tf1.getText();
            
            if(e.getSource() == b1) {
                word += b1.getText();
                tf1.setText(word);
            }
            else if(e.getSource() == b2){
                word += b2.getText();
                tf1.setText(word);
            }
            else if(e.getSource() == b3) {
                word += b3.getText();
                tf1.setText(word);
            }
            else if(e.getSource() == b4) {
                word += b4.getText();
                tf1.setText(word);
            }
            else if(e.getSource() == bk) {
                int sum = 0;
               
                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    sum = sum + (Character.getNumericValue(c));
                }
                l1.setText("Total: " + sum);
            }
        }
    }
}
