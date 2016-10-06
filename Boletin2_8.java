
package boletin2_8;

import javax.swing.JOptionPane;

public class Boletin2_8 {

  
    public static void main(String[] args) {
        float centigrados;
        float fare, kelvin;
        centigrados= Float.parseFloat(JOptionPane.showInputDialog("Intoducir grados Centigrados"));
        fare= (1.8f*centigrados)+32;
        kelvin= centigrados+273;
        JOptionPane.showMessageDialog(null, centigrados + " graos centigrados son " + fare + " graos farenheit y " + kelvin +" graos kelvin");
                
    }
    
}
