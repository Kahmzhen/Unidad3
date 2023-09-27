
package com.mycompany.numerospar;
import java.util.Scanner;

public class Numerospar {
    public static void main(String[] args) {
       Scanner lectura = new Scanner (System.in);
       System.out.println("Ingresa un numero");
       int ing1 = lectura.nextInt();
       
       int ing = 2;
    
       if (((ing1)%2)==0)
           System.out.println("El numero es par.");
       else{
           System.out.println("El número no es par");
       }
    }
    
}
