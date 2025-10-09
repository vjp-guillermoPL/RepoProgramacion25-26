/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05parimpar;

import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio05ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int num;
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Introduce un número");
        num = entrada.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("Su número es par");
        } else {
            System.out.println("Su número es impar");
        }
    }
    
}
