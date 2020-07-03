//A small form where you can enter your information

package Example;
import javax.swing.*;
public class Joption {

    public static void main(String[] args) {
        
        String ad = JOptionPane.showInputDialog("Enter your name: ");
        String soyad = JOptionPane.showInputDialog("Enter your surname: ");
        String yas = JOptionPane.showInputDialog("Enter your age: ");
        String yer = JOptionPane.showInputDialog("Enter where you live: ");
        
        JOptionPane.showMessageDialog(null, "Name: "+ ad + "\nSurname: " 
         + soyad + "\nAge: " + yas  + "\nWhere you live: " + yer,
                "Your information " , JOptionPane.INFORMATION_MESSAGE);
        
    }
}
