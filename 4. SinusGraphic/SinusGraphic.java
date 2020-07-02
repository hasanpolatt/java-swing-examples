
package SinusGraphic;

import java.applet.Applet;
import java.awt.*;
public class SinusGraphic extends Applet {


    public void init(){
       this.setSize(700, 500);
    }
    
    public void paint(Graphics g){
        
        int CYCLE = 4;
        int MAX = 1000;
        int WEIGHT = 100;
        int x1 = 0;
        int x2 = 0;
        
        g.setColor(Color.red);
        g.drawLine(0, 150, 700, 150);
        g.drawLine(240, 0, 240, 500);
        g.drawString("X-axis", 430, 140);
        g.drawString("Y-axis", 200, 270);
        g.setColor(Color.blue);
        
        for (int i = -138; i <367; i++) {
            x1 = (int)(WEIGHT*Math.sin(((i)*2*Math.PI*CYCLE)/(MAX)));
            x2 = (int)(WEIGHT*Math.sin(((i+1)*2*Math.PI*CYCLE)/(MAX)));
            g.drawLine(i+121, x1+138, (i+1)+121, x2+138);
        }
    }
}
