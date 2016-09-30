
package boletín2_1;

import javax.swing.JOptionPane;


public class Boletín2_1 {

   
     
    public static void main(String[] args) {
    
        int base,altura;
        
       base = Integer.parseInt(JOptionPane.showInputDialog("inserte la base"));
       altura = Integer.parseInt(JOptionPane.showInputDialog("introduzca la altura"));
       JOptionPane.showMessageDialog(null," el area del triangulo es " + base*altura/2);
    }
    
}
