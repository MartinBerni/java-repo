package holamundo;
public class HolaMundo {

    public static void main(String[] args) {
        
        
        //VARIABLES PRIMITIVAS
        
        // VARIABLES ENTERAS
        
       byte corto=12; //va desde -128 a 127 
       short longer=10000; //desde -32.768 hasta 32.768
       int usual=50000; //desde -2 millones a 2 millones (mas usado) 
       long longest=100000; //mas largo de todos}
       
       //PARA IMPRIMIR UNA VARIABLE PONEMOS +"NOMBRE DE LA VARIABLE"
        System.out.println("el nuemero es: "+corto);
        
       //VARIABLES CON NUMEROS REALES
       
       float real=3.45f; //Variable real DEBO COLOCAR F DESPUES DEL NUMERO CON COMA
       double doble=1000.15; //variable real pero muy grande (NO HACE FALTA LA F)
       
       //VARIABLES TIPO CARACTER
       
       char inicial='a'; //guarda una letra, numero, simbolo y va con commillas simples
       boolean estado=true; //toma dos valores unicamente V o F
       
       
       //-----VARIABLES NO PRIMITIVAS-----ALMACENAN NULL Y PERMITEN LOS METODOS (NOMBRE DE LA VARIABLE Y UN .)
       
       Integer hola=null; //ME DEJA GUARDAR TANTO ENTEROS COMO EL NULL (VACIO), YA QUE INT NO ME DEJARIA
       
       String palabras = "Esta es la variable palabra"; //CADENA DE CARACTERES
       
       //CONSTANTES EN JAVA
       
       final int esto_es_cte = 3; //CON EL FINAL DEFINIMOS UNA CTE 
       
       
       
       
       
       
    
    }
}
