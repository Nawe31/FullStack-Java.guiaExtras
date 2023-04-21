/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package ej6.extras;

import java.util.Scanner;


public class Ej6Extras {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       
        System.out.println(" ingrese cantidad de personas para medir");
        int num = leer.nextInt();
        int j = 0;
        double aux = 0;
        
        for (int i = 0; i < num; i++) {
            
            System.out.println(" ingrese estatura de la persona en mts");
            double estatura = leer.nextDouble();
            
            
            if ( estatura <= 1.60)
            {
                aux = aux + estatura;
                j++;
            }
            
            
            
        }
        
        System.out.println("la cantidad de personas menores a 1.60 son "+j +" y su promedio de altura es "+aux / j);
    }
    
}
