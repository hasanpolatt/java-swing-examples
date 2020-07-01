
package sinusgraphic;

import javax.swing.JFrame;

public class main {
    
    public static void main(String[] args) {
        
        SinusGraphic s = new SinusGraphic();
        JFrame f = new JFrame();
        
        f.add(s);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 400);
        
    }
}
