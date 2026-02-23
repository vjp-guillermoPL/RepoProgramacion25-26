/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04cambiarduplicados;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio04CambiarDuplicados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> duplicados = new ArrayList<>();

        rellenarLista(duplicados);
        mostrarLista(duplicados);
        
        mostrarLista(duplicados);
    }

    /**
     * Método que pide al usuario rellenar la lista con números positivos
     * 
     * @param duplicados 
     */
    public static void rellenarLista(ArrayList<Integer> duplicados) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca un número positivo");
        int num = entrada.nextInt();

        while (num >= 0) {
            duplicados.add(num);

            System.out.println("Introduzca un número positivo");
            num = entrada.nextInt();
        }
    }
    
    /**
     * Método que muestra la lista completa
     * 
     * @param duplicados 
     */
    public static void mostrarLista(ArrayList<Integer> duplicados){
        for (int i = 0; i < duplicados.size(); i++) {
            System.out.println("Lista:");
            System.out.print(duplicados.get(i) +" ");
        }
    }
    
    /**
     * Método que sustituye los números duplicados por 0
     * 
     * @param duplicados 
     */
    public static void quitarDuplicados(ArrayList<Integer> duplicados){
        for (int i = 0; i < duplicados.size(); i++){
            if (true) {
                duplicados.set(i, 0);
            }
        }
    }

}
