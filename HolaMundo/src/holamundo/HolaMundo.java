

package holamundo;

public class HolaMundo {

    public static void main(String[] args) {        
        
        
        //RAIZ
        double raiz = Math.sqrt(9); //Math.sqrt es la raiz cuadrada simpre con double
       
        //EXPONENTE
       double base = 2 , exponente = 3; //Para el exponente uso todo double
       double resultado = Math.pow(base, exponente); //Math.pow es el exponente (base, exponenete)
        
       //REDONDEO
       double numero = 3.4;
       long redondeo = Math.round(numero); //Cuando pongo Math.round el resultado lo almaceno en un long o int
       
       //NUMERO RANDOM
       double raro = Math.random(); //Genera un numero ramdom
       
    }
}
