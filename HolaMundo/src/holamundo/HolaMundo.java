

package holamundo;


import java.util.Scanner;
import javax.swing.JOptionPane;




public class HolaMundo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // METODO BURBUJA EN ARREGLO 
        // ORDENAMOS UNA TRAS OTRO EL QUE ESTAMOS VIENDO CON EL SIGUIENTE
        // EJEMPLO
        
        int [] arreglo;
        int narreglo, aux;
        
        narreglo = Integer.parseInt(JOptionPane.showInputDialog("Dame el tamaño del arreglo: "));
        
        arreglo = new int [narreglo]; //ASIGNAMOS LA CANTIDAD DE ELEMENTOS 
        
        for (int i = 0; i < narreglo; i++) { //ARGANDO EL ARREGLO
            System.out.print((i+1)+". ");
            arreglo [i] = input.nextInt();
        }
        
        //METODO DE BURBUJA
        
        for (int i=0; i<(narreglo - 1); i++) { //COLOCAMOS EL -1 PORQUE CON UNA VUELTA MENOS ESTARA BIEN ORDENADO
            for (int j=0; j<(narreglo - 1); j++) {//ACA ORDENAMOS
                if (arreglo [j]>arreglo[j+1]){//SI NUMERO EN EL QUE ESTAMOS ES MAYOR HAY QUE CAMBIARLO
                    aux = arreglo [j];
                    arreglo [j] = arreglo [j+1];
                    arreglo [j+1] = aux;
                }
            }
        }
        
        //MOSTRANDO EL ARREGLO
        System.out.println("Arreglo creciente: ");
        for (int i:arreglo) {
            System.out.print(i+" - ");
        }
        System.out.println("");
        System.out.println("Arreglo decreciente: ");
        for (int i=(narreglo - 1); i>=0; i--) {
            System.out.print(arreglo[i]+" - ");
        }
        
    }
}