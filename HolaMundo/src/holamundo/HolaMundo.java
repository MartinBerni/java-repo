

package holamundo;


import java.util.Scanner;
import javax.swing.JOptionPane;




public class HolaMundo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // METODO SECUENCIAL
        // BUSCA NUMERO A NUMERO HASTA ENCONTRALO
        // EJEMPLO
        
        int [] arreglo= {5, 3, 6, 8};
        int num;
        boolean flag =false;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero a buscar: "));
        
        int i = 0;
        
        while (i<5 && (flag == false)){
            if (arreglo [i] == num) {
                flag = true; 
            }
            i++;
            
        System.out.println("jajaja");
        }
        
        if (flag == false) {
            JOptionPane.showMessageDialog(null, "No se a encontrado el numero");
        }else{
            JOptionPane.showMessageDialog(null, "El numero se encontro y esta en la posicion: "+(i-1)+" (notacion de arreglo)");
        }
    }
}