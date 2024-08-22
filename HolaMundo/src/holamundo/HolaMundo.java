

package holamundo;


import java.util.Scanner;
import javax.swing.JOptionPane;




public class HolaMundo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        /*
        int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
                        //fila      fila     fila
        
        
        //IMPRIMIENDO LA MATRIZ                
                        
        for (int i=0; i<3; i++) {//variamos las filas
            for (int j=0; j<3; j++) {//variamos las columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        */
        //MATRIZ QUE COLOCA EL USUARIO
        
        int [][] mat;
        int nFilas,nCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Dame la cantidad de filas de la matriz: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Dame la cantidad de columnas de la matriz: "));
        
        mat = new int [nFilas][nCol];
        
        for (int i=0; i<nFilas; i++) {
            for (int j=0; j<nCol; j++) {
                System.out.print("Digite el valor para la fila: "+(i+1)+" y la columna: "+(j+1)+": ");
                mat [i][j] = input.nextInt();
            }
        }
        
        for (int i=0; i<nFilas; i++) {//variamos las filas
            for (int j=0; j<nCol; j++) {//variamos las columnas
                System.out.print(mat[i][j]+" - ");
            }
            System.out.println("");
        }
    }
}