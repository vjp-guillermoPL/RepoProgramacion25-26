/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02arraylisthastanegativo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio02ArrayListHastaNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();                     //Creo la lista

        rellenarLista(num);                                             //Llamo a los métodos
        mostrarLista(num);
        mostrarMayor(num);
        mostrarMenor(num);
        mostrarSuma(num);
    }

    /**
     * Método que rellena la lista hasta que se introduzca un número negativo
     *
     * @param num
     */
    public static void rellenarLista(ArrayList<Integer> num) {
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Introduce un número para la lista");
            num.add(entrada.nextInt());

        } while (num.getLast() >= 0);
    }

    /**
     * Método que muestra la lista entera
     *
     * @param num
     */
    public static void mostrarLista(ArrayList<Integer> num) {
        for (int i = 0; i < num.size(); i++) {
            System.out.println("El número correspondiente a la posición " + (i + 1) + " es: " + num.get(i));
        }
    }
    
    /**
     * Método que muestra el mayor número de la lista
     * 
     * @param num 
     */
    public static void mostrarMayor(ArrayList<Integer> num) {
        int mayor = num.get(0);
        
        for (int i = 0; i < num.size(); i++){
            if (mayor < num.get(i)) {
                mayor = num.get(i);
            }
        }
        
        System.out.println("El mayor número de la lista es: "+ mayor);
    }
    
    /**
     * Método que muestra el menor número de la lista
     * 
     * @param num 
     */
    public static void mostrarMenor(ArrayList<Integer> num) {
        int menor = num.get(0);
        
        for (int i = 0; i < num.size(); i++){
            if (menor > num.get(i)) {
                menor = num.get(i);
            }
        }
        
        System.out.println("El menor número de la lista es: "+ menor);
    }
    
    /**
     * Método que muestra la suma de los números de la lista
     * 
     * @param num 
     */
    public static void mostrarSuma(ArrayList<Integer> num) {
        int suma = 0;
        
        for (int i = 0; i < num.size(); i++){
            suma += num.get(i);
        }
        
        System.out.println("La suma de los números de la lista es: "+ suma);
    }

}
