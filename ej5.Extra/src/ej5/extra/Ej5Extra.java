/*
Una obra social tiene tres clases de socios:

Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.

 Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.

 Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.

o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package ej5.extra;

import java.util.Scanner;

public class Ej5Extra {

  
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
        
        
        System.out.println(" ingrese que tipo de socio es usted si el A,B o C");
        String respuesta = leer.nextLine();
        
        System.out.println(" ingrese el valor del tratamiento");
        int num = leer.nextInt();
        
        
        switch (respuesta){
        
            case "a":{
                
                System.out.println(" USTED ES UN SOCIO TIPO A, TIENE UN DESCUENTO DEL 50%, EL TOTAL SERIA: "+ num / 2);
                
            }break;
         case "b":{
                
                System.out.println(" USTED ES UN SOCIO TIPO B, TIENE UN DESCUENTO DEL 35%, EL TOTAL SERIA: "+ (num -(num * 0.35)));
                
            }break;
            case "c":{
                
                System.out.println(" USTED ES UN SOCIO TIPO C,NO CUENTA CON DESCUENTOS: "+ num );
                
            }break;
        
        }
        
    }
    
}
