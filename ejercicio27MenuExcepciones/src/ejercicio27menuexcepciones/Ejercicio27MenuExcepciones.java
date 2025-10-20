/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27menuexcepciones;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Ejercicio27MenuExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, control, resultado;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        num1 = entrada.nextInt();
        
        System.out.println("Introduce otro número");
        num2 = entrada.nextInt();

        do {
            
        System.out.println("Elige la acción 1.- Sumar los números. 2.- Restar los números. 3.- Multiplicar los números. 4.- Dividir los números. 5.- Salir del programa.");
        control = entrada.nextInt();
        
        if(num2 == 0 && control == 4){
            try {
                switch (control){
            case 1: resultado = num1 + num2;
                System.out.println(num1 +" + "+ num2 +" = "+ resultado);
                break;
            case 2: resultado = num1 - num2;
                System.out.println(num1 +" - "+ num2 +" = "+ resultado);
                break;
            case 3: resultado = num1 * num2;
                System.out.println(num1 +" * "+ num2 +" = "+ resultado);
                break;
            case 4: resultado = num1 / num2;
                System.out.println(num1 +" / "+ num2 +" = "+ resultado);
                break;
            default: System.out.println("Introduzca un número el 1 al 5");
        }
            } catch(ArithmeticException e){
                System.out.println("No puedes dividir por cero");
                System.out.println(e);
            }
        }else 
        switch (control){
            case 1: resultado = num1 + num2;
                System.out.println(num1 +" + "+ num2 +" = "+ resultado);
                break;
            case 2: resultado = num1 - num2;
                System.out.println(num1 +" - "+ num2 +" = "+ resultado);
                break;
            case 3: resultado = num1 * num2;
                System.out.println(num1 +" * "+ num2 +" = "+ resultado);
                break;
            case 4: resultado = num1 / num2;
                System.out.println(num1 +" / "+ num2 +" = "+ resultado);
                break;
            default: System.out.println("Introduzca un número el 1 al 5");
        }
        } while (control != 5);
        
    }
    
}
