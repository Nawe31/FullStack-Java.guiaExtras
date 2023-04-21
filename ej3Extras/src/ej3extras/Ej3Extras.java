/*
Elabore un algorito el cual se ingrese una letra y se detecte si se trara de una vocal. caso contrario, mostrar un mensaje
Nota: investigar la funcion equals() de la clase String;
 */
package ej3extras;

import java.util.Scanner;


public class Ej3Extras {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("ingrese una letra");
        String letra = leer.nextLine();
        
        if (letra.equalsIgnoreCase("a")){
            System.out.println(" vocal ,a, contradad");
        }
        else if (letra.equalsIgnoreCase("e")){
            System.out.println(" vocal ,e, contradad");
    }
        else if (letra.equalsIgnoreCase("i")){
            System.out.println(" vocal ,i, contradad");
    }
            else if (letra.equalsIgnoreCase("o")){
            System.out.println(" vocal ,o, contradad");
    }
            else if (letra.equalsIgnoreCase("u")){
            System.out.println(" vocal ,u, contradad");
    }else {
            
            System.out.println(" vocal no encotrada");}
    
}}
