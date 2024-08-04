

package holamundo;

import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        
        float num1,num2,suma,resta,div,mult,resto;
        
        System.out.print("Dame el numero 1: ");
        num1 = input.nextFloat();
        System.out.print("Dame el numero 2: ");
        num2 = input.nextFloat();
        
        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1/num2;
        resto = num1%num2;
        
        int numero = 3,y;
        
        numero += 5; //numero = numero + 5 es lo mismo
        numero -= 5; //numero = numero - 5 es lo mismo
        numero /= 5; //numero = numero / 5 es lo mismo
        numero *= 5; //numero = numero * 5 es lo mismo
        numero %= 5; //numero = numero % 5 es lo mismo
        
        numero++; //Inc
        numero--; //Dec
        
        
        numero=2;
        y = numero++ ; // y valdra 2 y numero despues se incrementara y valdra 3
        //Si usamos el operador como prefijo (++numero) primero se incrementa y luego se asigna, entonces y valdria 3
        
        /*numero=2;
        y = numero-- mismo caso para esto */
        
    }
}
