/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,

49
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package ej2extras;

import java.util.Scanner;


public class Ej2Extras {

    /**
    
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       
        System.out.println(" ingrese el valor de a ");
        int a = leer.nextByte();
        
          System.out.println(" ingrese el valor de b ");
        int b = leer.nextByte();
        
        
          System.out.println(" ingrese el valor de c ");
        int c = leer.nextByte();
        
          System.out.println(" ingrese el valor de d ");
        int d = leer.nextByte();
        
        
        
        System.out.println("el valor de a es : "+a);
        System.out.println("el valor de b es : "+b);
        System.out.println("el valor de c es : "+c);
        System.out.println("el valor de d es : "+ d);
     
        resultado(a,b,c,d);
    }
    
    public static void resultado(int a, int b,int c, int d) {
        
        int aux = 0;
        int aux2 = 0;
        
        aux2=b;
        b = aux;
        b=c;
        c=a;
        a=d;
        d=aux2;
             
        
        System.out.println("el valor de a cambiado es : "+a);
        System.out.println("el valor de b cambiado es : "+b);
        System.out.println("el valor de c cambiado es : "+c);
        System.out.println("el valor de d  cambiado es : "+ d);
    }
    
}
