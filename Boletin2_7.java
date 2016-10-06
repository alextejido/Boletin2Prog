
package boletin2_7;
import javax.swing.JOptionPane;


public class Boletin2_7 {

    
    public static void main(String[] args) {
         float i,t,n;
      i = 1/1200;
      n =Float.parseFloat(JOptionPane.showInputDialog(null,"Inserte o nominal"));
      t =Float.parseFloat(JOptionPane.showInputDialog("Inserte o numero de anos"));
      JOptionPane.showMessageDialog(null,"a renda mensual e " + (n * (Math.pow(1+i,t)*i)/ Math.pow(1+i,t)-1));
      t = (t*12);
        
    }
    
}
