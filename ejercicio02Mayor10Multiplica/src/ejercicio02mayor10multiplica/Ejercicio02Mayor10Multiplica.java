/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02mayor10multiplica;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio02Mayor10Multiplica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        int resultado;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe un número: ");
        num1 = entrada.nextInt();
        
        System.out.println("Escribe otro número: ");
        num2 = entrada.nextInt();
        
        if (num1 > 10) {
            resultado = Multiplicacion.multiplicacion(num1, num2);
            System.out.println(num1 +" * "+ num2 +" = "+ resultado);
        } else {
            resultado = Suma.suma(num1, num2);
            System.out.println(num1 +" + "+ num2 +" = "+ resultado);
        }
    }
    
}
