
package boletin2_5;

import javax.swing.JOptionPane;


public class Boletin2_5 {

 
    public static void main(String[] args) {
        float millas;
        float metros;
        millas = Float.parseFloat(JOptionPane.showInputDialog("Millas "));
        metros= millas*1852;
        JOptionPane.showMessageDialog(null,"Metros =" +metros);
    }
    
}
