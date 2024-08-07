

package holamundo;

import java.util.Scanner;


public class HolaMundo {

    public static void main(String[] args) {        
      Scanner entrada = new Scanner(System.in);
    
      //WHILE
      
      System.out.println("WHILE");
      int i=1, cont;
        
        System.out.print("Diga cuantos numeros quiere imprimir: ");
        cont = entrada.nextInt();
        
        while (i<=cont){
            System.out.println(i);
            i++;
        }
        
        
        //DO while
        
        System.out.println("DO WHILE");
        
        int x=1;
        
        do {
            System.out.println(x);
            x++;
        }while (x<=5);
    
        //FOR
        
        int f; 
        
        for (f=1; f<=10;f++){
            System.out.println(f);
        }
    }
}
