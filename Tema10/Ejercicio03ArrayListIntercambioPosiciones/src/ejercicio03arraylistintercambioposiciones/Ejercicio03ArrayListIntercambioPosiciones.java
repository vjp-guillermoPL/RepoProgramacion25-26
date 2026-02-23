/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03arraylistintercambioposiciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio03ArrayListIntercambioPosiciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();                 //Creo la lista
        
        rellenarLista(numeros);                                         //Llamo a los métodos
        mostrarLista(numeros);
        intercambioPosiciones(numeros);
        mostrarLista(numeros);
    }
    
    /**
     * Método que rellena la lista preguntando si se quiere seguir ampliando
     * después de añadir cada número
     *
     * @param numeros
     */
    public static void rellenarLista(ArrayList<Integer> numeros) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        String seguir;

        do {
            System.out.println("Introduce un número para la lista");
            numeros.add(entrada.nextInt());

            System.out.println("¿Quieres añadir más números? Si / No");
            seguir = entrada2.nextLine();
        } while (seguir.toLowerCase().equals("si"));
    }
    
    /**
     * Método que muestra la lista entera
     *
     * @param numeros
     */
    public static void mostrarLista(ArrayList<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("El número correspondiente a la posición " + (i + 1) + " es: " + numeros.get(i));
        }
    }
    
    /**
     * Método que intercambia la 2ª y la 4ª posición de la lista
     * @param numeros 
     */
    public static void intercambioPosiciones(ArrayList<Integer> numeros){
        int aux = numeros.get(1);
        numeros.set(1, numeros.get(3));
        numeros.set(3, aux);
        
        System.out.println("Posiciones 2 y 4 intercambiadas");
    }

}
