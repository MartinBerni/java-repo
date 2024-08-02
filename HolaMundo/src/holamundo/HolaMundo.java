package holamundo;

import java.util.Scanner; //IMPORTACION AL TOCAR EL ERROR DEL SCANNER

public class HolaMundo {

    public static void main(String[] args) {
      //PARA LA ENTRADA DE DATOS Y ALMACENAMIENTO EN VAIRABLES DEBEMOS PONER:
      Scanner entrada = new Scanner (System.in); //la variable entrada es el medio por el cual meto los datos
      //AL PONERLO SOLO, SALTARA ERROR LO CUAL REQUEIRE QUE IMPORTEMOS EL JAVA.UTIL (TOCANDO EL ERROR SE COLOCA SOLO)
      
      float numero;
      String nombre; 
      char letra;
      
      System.out.print("Escribe un nuemro: "); 
      numero = entrada.nextFloat(); //AL PONER EL ENTRADA NESESITA SABER EL TIPO DE ENTRADA, POR ESO SE COLOCA EL NEXTINT
      
      //SI NECESITO MOSTRAR UN int COLOCO .NEXTINT
      //EN LOS FLOAT DEBO USAR SI O SI LA COMA, NO EL PUNTO
      
        System.out.println("El nuemero jaun es: "+numero);
        
      //PROCEDIMIENTO PARA CADENA
        System.out.print("Ingrese cadena: ");
        nombre = entrada.next(); // EL .NEXT SOLO GUARDA LA PRIMERA PALABRA
        System.out.println(nombre);
        
        System.out.print("ingrese la cadena nuevamente: ");
        nombre = entrada.nextLine(); // EL .NEXTLINE GUARDA TODA LA CADENA
        System.out.println(nombre);
        
      //PROCEDIMINETO PARA UN CHAR
      
        System.out.println("ingrese la letra que quiera");
        letra = entrada.next().charAt(0); //CON EL CHARAT LOGRAMOS QUE SE MUESTRE LA LETRA EN LA POSICION 0 ES DECIR LA QUE YO COLOQUE
        System.out.println("La letra es: "+letra);
        
        
      
        
    }
}
