/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03metodomayornum;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio03MetodoMayorNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe un número: ");
        num1 = entrada.nextInt();
        
        System.out.println("Escribe otro número: ");
        num2 = entrada.nextInt();
        
        System.out.println("Escribe otro número: ");
        num3 = entrada.nextInt();
        
        MayorNum.MayorNum.mayorNum(num1, num2, num3);
    }
    
}
