/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15tablamultiplicar;

import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio15TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, resultado;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe un número");
        num = entrada.nextInt();
        
        System.out.println("La tabla de multiplicar del "+ num +" es: ");
        for (int i = 0; i <= 10; i++) {
            resultado = num * i;
            System.out.println(num +" x "+ i +" = "+ resultado);
        }
    }
    
}
