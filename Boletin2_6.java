
package boletin2_6;

import javax.swing.JOptionPane;


public class Boletin2_6 {

    
    public static void main(String[] args) {
        float tarifa;
        float pagado, porcentaje;
        tarifa = Float.parseFloat(JOptionPane.showInputDialog("Precio inicial "));
        pagado =Float.parseFloat(JOptionPane.showInputDialog("Precio final "));
        porcentaje= 100*tarifa/pagado;
        JOptionPane.showMessageDialog(null,"Porcentaje descuento =" +porcentaje );
    }
    
}
