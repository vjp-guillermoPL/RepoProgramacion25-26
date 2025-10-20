/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27menuexcepciones;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio27MenuExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, control, resultado;                 //Declaro las variables
        Scanner entrada = new Scanner(System.in);           //Creo el Scanner
        
        System.out.println("Introduce un número");          //Pido los números al usuario
        num1 = entrada.nextInt();
        
        System.out.println("Introduce otro número");
        num2 = entrada.nextInt();

        do {                                                //Abro el bucle
            
        System.out.println("Elige la acción 1.- Sumar los números. 2.- Restar los números. 3.- Multiplicar los números. 4.- Dividir los números. 5.- Salir del programa.");
        control = entrada.nextInt();                        //Pido al usuario que eliga la acción a seguir
        
            try {                                           //Recoge los errores que pueda haber en es siguiente código
                switch (control){                           //Creo una condicional en la cual se mostrará el resultado de la operación que elija el usuario
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
            } catch(ArithmeticException e){                 //En caso de que el "try" detecte un error, se mostrará por pantalla cual es el error y seguirá con el programa
                System.out.println("No puedes dividir por cero");
                System.out.println(e);
            }
        
        } while (control != 5);                             //El bucle se repetirá mientras que el usuario no elija la opción 5
        
    }
    
}
