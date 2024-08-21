

package holamundo;


import java.util.Scanner;
import javax.swing.JOptionPane;




public class HolaMundo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // METODO INSERCION
        // AL ENCONTRAR UN MENOR VA COMPARANDO CON LOS ANTERIORES SI ES MENOR Y LOS VA MOVIENDO
        // EJEMPLO
        
        int [] arreglo;
        int narreglo, aux, pos;
        
        narreglo = Integer.parseInt(JOptionPane.showInputDialog("Dame el tamaño del arreglo: "));
        
        arreglo = new int [narreglo]; //ASIGNAMOS LA CANTIDAD DE ELEMENTOS 
        
        for (int i = 0; i < narreglo; i++) { //ARGANDO EL ARREGLO
            System.out.print((i+1)+". ");
            arreglo [i] = input.nextInt();
        }
        
        //METODO DE INSERCION
        
        for (int i=0; i<(narreglo - 1); i++) { //POS INDICA LA POSICION
            pos = i;
            aux = arreglo [i];
            
            while ((pos>0) && (arreglo[i-1] > aux)){ //POS > 0 PORQUE NO COMPARAMOS EL PRIMERO
                arreglo [pos] = arreglo [pos-1];
                pos--;
            }
            arreglo [pos] = aux;
        }
        
        //MOSTRANDO EL ARREGLO
        System.out.println("Arreglo creciente: ");
        for (int i:arreglo) {
            System.out.print(i+" / ");
        }
        System.out.println("");
        System.out.println("Arreglo decreciente: ");
        for (int i=(narreglo - 1); i>=0; i--) {
            System.out.print(arreglo[i]+" / ");
        }
        
    }
}