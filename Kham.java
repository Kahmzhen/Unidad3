/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kham;

import java.util.Scanner;

/**
 *
 * @author ce182
 */
public class Kham {

    public static void main(String[] args) {
        Scanner leer =  new Scanner (System .in);
    System.out.println("Cuantos numeros quieres generar");
	    int n= leer.nextInt();
	    int t2 = 1 ;
	    int t1 =0;
	    for  (int i=1;i<n;i++){
	        int f=t1+t2;
            System.out.println(t2);

	        t1=t2;
	        t2=f;
            }    
    }}
    
    

