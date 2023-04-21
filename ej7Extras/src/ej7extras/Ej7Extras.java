/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.

 */
package ej7extras;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class Ej7Extras {

  
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     
        System.out.println(" ingrese cantidad de numero");
        int n = leer.nextInt();
        int total = 0;
         int auxM=0;
         int auxMin=9999;
        
     while(n != 0)
     {
     int j= 0;
        
        
     
         
         
         do{
           
        
         System.out.println(" ingrese un numero");
         int num = leer.nextInt();
         total = num + total;
         
          
         
          if (num > auxM){
          
              auxM = num;
          }
          
           if (num < auxMin){
          
              auxMin = num;
          }
             
           j++; 
           
         }
         while(n > j);
         

         System.out.println(" la sumatoria en total es : "+ total);
         System.out.println(" el numero maximo es : "+ auxM);
         System.out.println(" el numero minimo es : "+ auxMin);
         break;
         
         
     
    
       
    }}
    
}
