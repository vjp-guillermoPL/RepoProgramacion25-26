/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05cambiarparimpar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio05CambiarParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();                 //Creo la lista
        
        rellenarLista(numeros);                                         //Llamo a los métodos
        mostrarLista(numeros);

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

            System.out.println("¿Quieres añadir más números? S / N");
            seguir = entrada2.nextLine();
        } while (seguir.toLowerCase().equals("s"));
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
     * Método que comprueba si un número es par o no
     * 
     * @param numeros
     * @param num
     * 
     * @return si el número es par
     */
    public static boolean esPar(ArrayList<Integer> numeros, int num){
        boolean esPar = false;
        
        if (num % 2 == 0) {
            esPar = true;
        }
        
        return esPar;
    }
    
    /**
     * Método que comprueba el mayor número de la lista
     * 
     * @param numeros
     * 
     * @return el mayor número de la lista
     */
    public static int mayorNum(ArrayList<Integer> numeros){
        int mayor = numeros.get(0);
        
        for (int i = 0; i < numeros.size(); i++) {
            if (mayor < numeros.get(i)) {
                mayor = numeros.get(i);
            }
        }
        
        return mayor;
    }
    
    /**
     * Método que comprueba el menor número de la lista
     * 
     * @param numeros
     * 
     * @return el menor número de la lista
     */
    public static int menorNum(ArrayList<Integer> numeros){
        int menor = numeros.get(0);
        
        for (int i = 0; i < numeros.size(); i++) {
            if (menor > numeros.get(i)) {
                menor = numeros.get(i);
            }
        }
        
        return menor;
    }
    
    public static boolean comprobarMayorPar(ArrayList<Integer> numeros){
        boolean mayorNumPar = false;
        if (esPar(numeros, mayorNum(numeros))) {
            mayorNumPar = true;
        }
        return mayorNumPar;
    }
    
}
