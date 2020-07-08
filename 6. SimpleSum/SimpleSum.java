// Simple summing app

package AppForm;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;


public class SimpleSum extends JFrame{
    
    JButton b1,b2,b3,b4,b5;
    JTextField t1;
    String S="";
    int s1,s2;
    public SimpleSum() {
        
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("+");
        b5 = new JButton("=");
        t1 = new JTextField("", 15);
        t1.setEditable(false);
        setSize(500, 600);
        JPanel p1 =new JPanel(new GridLayout(2, 3, 5, 5));  //JPanel p1 =new JPanel(new GridLayout(2, 3, 5, 5))
        
        p1.add(t1);p1.add(b1);p1.add(b2);p1.add(b3);p1.add(b4);p1.add(b5);
        add(p1);
        
        buttonlisten b = new buttonlisten();
        
        b1.addActionListener(b);b2.addActionListener(b);
        b3.addActionListener(b);b4.addActionListener(b);
        b5.addActionListener(b);
    }
    
    class buttonlisten implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == b1){
                S = S + b1.getText(); t1.setText(S);
                t1.setText(S);}
            else if(e.getSource() == b2){
                S = S + b2.getText();t1.setText(S);
                t1.setText(S);}
            else if(e.getSource() == b3){
                S = S + b3.getText();t1.setText(S);
                t1.setText(S);}
            else if(e.getSource() == b4){
                s1 = Integer.parseInt(S);
                S="";
                t1.setText(S);}
            else if(e.getSource() == b5){
                s2 = Integer.parseInt(S);
                S="";
                t1.setText(S);
                setTitle("Total: " + (s1+s2));
            }
            
    }
    }
    public static void main(String[] args) {
        SimpleSum uf = new SimpleSum();
        
        uf.setTitle("First Application");
        //uf.setSize(500, 600);
        uf.setLocationRelativeTo(null);
        uf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        uf.setVisible(true);
    }
}


