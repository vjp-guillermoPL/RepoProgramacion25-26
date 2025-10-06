/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02multiplicacionsuma;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio02MultiplicacionSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int resultado;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        num1 = entrada.nextInt();
        
        System.out.println("Introduce otro número");
        num2 = entrada.nextInt();
        
        if (num1 > 10) {
            resultado = num1*num2;
            System.out.println("La operación que se realizó es la multiplicación y el resultado es: "+ resultado);
        } else {
            resultado = num1+num2;
            System.out.println("La operación que se realizó es la suma y el resultado es: "+ resultado);
        }
    }
    
}
