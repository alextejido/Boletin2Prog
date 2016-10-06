
package boletin2_2;

import javax.swing.JOptionPane;


public class Boletin2_2 {

   
    public static void main(String[] args) {
        float lado, area;
        lado = Float.parseFloat(JOptionPane.showInputDialog("lado "));
        area= lado*lado;
        JOptionPane.showMessageDialog(null,"area =" +area);
    }
    
}
