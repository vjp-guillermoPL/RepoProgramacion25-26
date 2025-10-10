/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09creciente;

import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio09Creciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        int auxiliar;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduce un número");
        num1 = entrada.nextInt();
        
        System.out.println("Introduce un número");
        num2 = entrada.nextInt();
        
        System.out.println("Introduce un número");
        num3 = entrada.nextInt();
        
        System.out.println("Introduce un número");
        num4 = entrada.nextInt();
        
        if (num1 > num2) {
            auxiliar = num1;
            num1 = num2;
            num2 = auxiliar;
        }
        if (num2 > num3) {
            auxiliar = num2;
            num2 = num3;
            num3 = auxiliar;
        }
        if (num3 > num4) {
            auxiliar = num3;
            num3 = num4;
            num4 = auxiliar;
        }
        
        
        if (num1 > num2) {
            auxiliar = num1;
            num1 = num2;
            num2 = auxiliar;
        }
        if (num2 > num3) {
            auxiliar = num2;
            num2 = num3;
            num3 = auxiliar;
        }
        if (num3 > num4) {
            auxiliar = num3;
            num3 = num4;
            num4 = auxiliar;
        }
        
        System.out.println("Los números en orden creciente son: "+ num1 +", "+ num2 +", "+ num3 +" y "+ num4);
    }
    
}
