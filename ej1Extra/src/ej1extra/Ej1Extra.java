/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ej1extra;

import java.util.Scanner;


public class Ej1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
        System.out.println("INGRESE CANTIDAD DE MINUTOS");
        int num = leer.nextInt();
      
       calcular(num);
       
       
    }
    
     public static void calcular(int num) {
         int j = 0;
         int k = 0;
         int num2 = 0;
         for (int i = 0; i < num; i++) {
             
             if ( num >= 1440 ){
             
                 num = num - 1440;
                 j++;
             }
             
           
         }
         
              
          for (int i = 0; i < num; i++) {
             
                 if ( num >= 60 ){
             
                 num = num - 60;
                 k++;
             }
             
              
         }
          System.out.println(" la cantidad de dias es "+j+ " la cantidad de horas es "+k);
          
          
    }
}
