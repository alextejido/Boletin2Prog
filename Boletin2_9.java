
package boletin2_9;

import javax.swing.JOptionPane;


public class Boletin2_9 {

   
    public static void main(String[] args) {
        double b100, b20, b5, m1, cantidad;
        b100=Double.parseDouble(JOptionPane.showInputDialog("Introducir cantidad de billetes de 100"))*100;
        b20=Double.parseDouble(JOptionPane.showInputDialog("Introducir cantidad de billetes de 20"))*20;
        b5=Double.parseDouble(JOptionPane.showInputDialog("Introducir cantidad de billetes de 5"))*5;
        m1=Double.parseDouble(JOptionPane.showInputDialog("Introducir cantidad de monedas de 1"))*1;
        cantidad= b100+b20+b5+m1;
        JOptionPane.showMessageDialog(null,"La cantida total de euros es "+cantidad);
    }
    
}
