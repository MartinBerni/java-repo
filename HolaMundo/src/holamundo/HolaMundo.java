package holamundo;

import javax.swing.JOptionPane;


public class HolaMundo {

    public static void main(String[] args) {
        
        String cadena;
        int numero;
        double decimal;
        char letra;
        
        //JOptionPane nos da pantallas mas lindas
        //Al poner JOptionPane se nos importa la galeria sola
        
        cadena = JOptionPane.showInputDialog("Digite la cadena: ");
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite el numero"));
        //NO PUEDO GUARDAR UN STRING(JOP) EN UN INT(NUMERO)
        // el Integer.parseInt() me permite que el JOP (el cual funciona unicamente con cadena) lo tranforme en un entero
        letra = JOptionPane.showInputDialog("Digite la letra que quiere insertar :").charAt(0);
        //EN EL CASO DEL CHAR AL PONER CHARAT (0) LIMITAMOS LA CADENA A UNA SOLA
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite el decimal: "));
        //SIMILAR AL DEL NUMERO
        //EL DECIMAL VA CON EL "."
        
        
        //PARA LA SALIDA ES CON MESSAGE
        JOptionPane.showMessageDialog(null, "LA cadena fue: "+cadena);
        JOptionPane.showMessageDialog(null, "El nuemero entero es: "+numero);
        JOptionPane.showMessageDialog(null, "El char fue: "+letra);
        JOptionPane.showMessageDialog(null, "Decimal es: "+decimal);
        
    }
}
