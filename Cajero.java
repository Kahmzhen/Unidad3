/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cajero;
import java.util.Scanner;
/**
 *
 * @author gaHELg
 */
public class Cajero {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
               System.out.println("Ingresa el Saldo de la cuenta: ");
        double saldo = scanner.nextDouble();
        
        
        System.out.println("Bienvenido al cajero automático.");
        System.out.println("Por favor, seleccione una opción:");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
        
        int opcion = scanner.nextInt();
  
        switch (opcion) {
                case 1: 
                    System.out.println("Su saldo es: " + saldo);
                break;
                
                 case 2:
             
                System.out.println("¿Cuánto dinero desea depositar?");
                double deposito = scanner.nextDouble();
                saldo += deposito;
                System.out.println("Su nuevo saldo es: " + saldo);
                break;
                
                 case 3:
                       System.out.println("¿Cuánto dinero desea retirar?");
                double retiro = scanner.nextDouble();
                if (retiro <= saldo) {
                    saldo -= retiro;
                    System.out.println("Retiro exitoso. Su nuevo saldo es: " + saldo);
                } else {
                    System.out.println("Fondos insuficientes.");
                }
                break;
                case 4:
                
                System.out.println("Gracias por usar el cajero automático.");
                break;
            default:
              
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                break;
        }
      
        scanner.close();

}
        }


              




 
