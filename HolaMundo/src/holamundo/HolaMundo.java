

package holamundo;

import javax.swing.JOptionPane;

public class HolaMundo {

    public static void main(String[] args) {        
        
        int numero, dato = 10;
        
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hola"));
        
        if (numero == dato) {
            JOptionPane.showMessageDialog(null, "EL numero es 10");
        }else{
            JOptionPane.showMessageDialog(null, "El numero no es 10");
        }
        
        // numero == dato igual
        // numero != dato distinto
        // numero > dato mayor
        // numero < dato menor
        // numero <= dato menor igual
        // numero >= dato mayor igual
        
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero para ver el switch del 1 al 5: "));
        
        switch (num) {
            case 1: JOptionPane.showMessageDialog(null, "El numero es 1");
                    break;                                                 
            case 2: JOptionPane.showMessageDialog(null, "El numero es 2");
                    break;
            case 3: JOptionPane.showMessageDialog(null, "El numero es 3");
                    break;
            case 4: JOptionPane.showMessageDialog(null, "El numero es 4");
                    break;
            case 5: JOptionPane.showMessageDialog(null, "El numero es 5");
                    break;
            default: JOptionPane.showMessageDialog(null, "EL numero no esta entre 1-5");
        }
        //breack termina el segun caso y el default es el caso q no se cumplio nunca 
    }
}
