//Returning prime numbers when we click on any button

package Example;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PrimeNumber {
    
    JButton b1 = new JButton("2");
    JButton b2 = new JButton("3");
    JButton b3 = new JButton("5");
    
    public PrimeNumber() {
        
        //creating the interface
        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setSize(500, 600);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(3,1));
        jf.setLocationRelativeTo(null);
        
        //adding buttons
        jf.add(b1); jf.add(b2); jf.add(b3);
        
        //button click
        b1.addActionListener(new buttonListen());
        b2.addActionListener(new buttonListen());
        b3.addActionListener(new buttonListen());
    }
    
    int findNextPrime(int x) {
        int i = x + 1;
        
        while(true) {
            
            if (prime(i)) {
                return i;
            }
            else{
                i++;
            }
        }
    }
    
    boolean prime(int number) {
        
        boolean prime = true;
        
        for (int i = 2; i < number; i++) {
            
            if(number % i == 0) {
                prime = false;
            }
        }
        return prime;
    }
    
    public static void main(String[] args) {
        PrimeNumber as = new PrimeNumber();
    }
    
    class buttonListen implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            
            int last = Integer.parseInt(b3.getText());
            
            int primeNumber = findNextPrime(last);
            
            b1.setText(b2.getText());
            b2.setText(b3.getText());
            b3.setText(primeNumber + "");
        }
    }
}
