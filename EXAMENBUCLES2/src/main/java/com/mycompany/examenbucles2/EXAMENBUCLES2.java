/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenbucles2;

import java.util.Scanner;



/**
 *
 * @author Jesus
 */
public class EXAMENBUCLES2 {

    public static void main(String[] args) {
        
        //declaramos las variables y el scanner
        
        int n1;
        int maximo = 0;
        int minimo = 0;
        int decision;
        int suma = 0;
        int contador = 0;
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        // hacemos un bucle while para que mientras sea mayor a 0 se repita con las condicion es de maximo y minimo
        
        do {            
            
           System.out.println("Ingrese un numero entero. Negativo para salir."); 
           
           n1 = sc.nextInt();
           
            if (n1 > maximo) {
                maximo = n1;
            }
            
            if (n1 < minimo) {
                minimo = n1;
            }
            
           suma = suma + n1;
           contador++;
            
        } while (n1>0);
        
        
        //creamos el menu del ususario y le preguntamos
        
        System.out.println("Que quieres hacer?");
        System.out.println("1.maximo");
        System.out.println("2.minimo");
        System.out.println("3.media");
        
        decision = sc.nextInt();
        
        // hacemos el switch para determinar que hacer seegun la respuesta del usuario
        
        switch (decision) {
            case 1:
                System.out.println(maximo);
                break;
                
            case 2:
                System.out.println(maximo);
                break;
                
            case 3:
                System.out.println(suma / contador);
                break;
            default:
                throw new AssertionError();
        }
        
        
        
        
        
    }
}
