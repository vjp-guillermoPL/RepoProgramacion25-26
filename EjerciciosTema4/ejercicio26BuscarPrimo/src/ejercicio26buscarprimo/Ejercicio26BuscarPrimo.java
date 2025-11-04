/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26buscarprimo;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio26BuscarPrimo {
    
    /**
     * Método que comprueba si un número es primo o no
     * 
     * @param num
     * @return un boolean que, si el número es primo será false, si no lo es será true
     */
    public static boolean esPrimo(int num){
        int i = 2;
        boolean buscar = false;
        while (i < num && buscar == false){
            if (num % i == 0) {
                buscar = true;
            } else {
                i++;
            }
        }
        return buscar;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;                                        //Declaro las variables
        boolean buscar;
        Scanner entrada = new Scanner(System.in);       //Creo el Scanner

        do {            
            System.out.println("Introduzca un número entero");     //Pido al usuario un número entero
            num = entrada.nextInt();
            
        } while (num <= 0);
        
        buscar = esPrimo(num);                       //Llamo al método y guardo el valor en el boolean
        if (buscar == true) {
            System.out.println("Su número no es primo");    //Si la busqueda encontró otro divisor, muestra por pantalla que no es primo
        } else {
            System.out.println("Su número es primo");       //Si la busqueda no encontró nada, muestra por pantalla que el número es primo
        }
    }
    
}
