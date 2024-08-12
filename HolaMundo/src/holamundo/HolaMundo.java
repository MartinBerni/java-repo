

package holamundo;


import java.util.Scanner;



public class HolaMundo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        
        
       int [] edad = new int [4];
       long [] dni = new long[4];
       float [] estatura = new float[3];
       double [] estarura = new double[5];
       boolean [] estado = new boolean[4];
       char [] sexo = new char [2];
       String [] nombre = new String [2];
       
       //DAR VALORES
       
       edad[0]=15;
       long [] calle = {2,3,8}; //DECLARAMOS E INICIALIZAMOS 
       
       //PARA RECORRER USAMOS FOR pero con int i = 0 ; i<6 ; i++ no ponemos ((<=))
       
       //PARA LLENAR UN ARREGLO SOLICITAMOS LA CANTIDAD DESEADA POR EL USUARIO DE ESPACIO
       
        
       String [] nombres = {"Juan", "pedro", "Yo", "luz"};
       
        for (int i=0; i<nombres.length; i++) { //al poner (nombres.length) java identificara la longitud del arreglo
            System.out.println(nombres[i]);
        }
       
        //for each
        
        /* for ("TIPO DE DATO DEL ARREGLO" "INDICE" : "NOMBRE DEL ARREGLO"){
            lo que quiero hacer con el subindice 
        }
        */
        
        for (String i:nombres)  {
            System.out.println(i);
        }
    }
}