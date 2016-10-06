
package boletin2_3;

import javax.swing.JOptionPane;


public class Boletin2_3 {

    
    public static void main(String[] args) {
        float euros, cambio;
        float dolares;
        euros = Float.parseFloat(JOptionPane.showInputDialog("euros "));
        cambio =Float.parseFloat(JOptionPane.showInputDialog("cambio "));
        dolares= euros*cambio;
        JOptionPane.showMessageDialog(null,"area =" +dolares);
    }
    
}
