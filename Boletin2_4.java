
package boletin2_4;

import javax.swing.JOptionPane;


public class Boletin2_4 {

   
    public static void main(String[] args) {
        float num1, num2;
        float resta, suma;
        float multiplicacion, division;
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Primer numero "));
        num2 =Float.parseFloat(JOptionPane.showInputDialog("Segundo numero "));
        resta= num1-num2;
        suma= num1+num2;
        multiplicacion= num1*num2;
        division= num1/num2;
        JOptionPane.showMessageDialog(null,"Resta =" +resta);
        JOptionPane.showMessageDialog(null,"Suma =" +suma);
        JOptionPane.showMessageDialog(null,"Multiplicacion =" +multiplicacion);
        JOptionPane.showMessageDialog(null,"Division =" +division);
    }
    
}
