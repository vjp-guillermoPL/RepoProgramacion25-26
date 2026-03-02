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
        mostrarMayorPar(numeros);
        mostrarMenorImpar(numeros);
        cambiarPosiciones(numeros);
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
     * Método que comprueba si un número es par o no y si lo es, lo mete en una
     * lista de sólo pares
     *
     * @param numeros
     *
     * @return la lista de pares
     */
    public static ArrayList esPar(ArrayList<Integer> numeros) {
        ArrayList<Integer> pares = new ArrayList<>();

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                pares.add(numeros.get(i));
            }
        }

        return pares;
    }

    /**
     * Método que comprueba si un número es par o no y si no lo es, lo mete en
     * una lista de sólo impares
     *
     * @param numeros
     *
     * @return la lista de impares
     */
    public static ArrayList esImpar(ArrayList<Integer> numeros) {
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 != 0) {
                impares.add(numeros.get(i));
            }
        }

        return impares;
    }

    /**
     * Método que comprueba el mayor número de la lista de pares
     *
     * @param pares
     *
     * @return el mayor número de la lista
     */
    public static int mayorNum(ArrayList<Integer> pares) {
        int mayor = pares.get(0);

        for (int i = 0; i < pares.size(); i++) {
            if (mayor < pares.get(i)) {
                mayor = pares.get(i);
            }
        }

        return mayor;
    }

    /**
     * Método que comprueba el menor número de la lista de impares
     *
     * @param impares
     *
     * @return el menor número de la lista
     */
    public static int menorNum(ArrayList<Integer> impares) {
        int menor = impares.get(0);

        for (int i = 0; i < impares.size(); i++) {
            if (menor > impares.get(i)) {
                menor = impares.get(i);
            }
        }

        return menor;
    }

    /**
     * Método que muestra por pantalla el mayor número par
     * 
     * @param numeros 
     */
    public static void mostrarMayorPar(ArrayList<Integer> numeros) {
        System.out.println("El mayor número par es: "+ mayorNum(esPar(numeros)));
    }
    
    /**
     * Método que muestra por pantalla el menor número impar
     * 
     * @param numeros 
     */
    public static void mostrarMenorImpar(ArrayList<Integer> numeros) {
        System.out.println("El menor número impar es: "+ menorNum(esImpar(numeros)));
    }

    /**
     * Método que cambia la posición del mayor número par con la del menor número impar
     * 
     * @param numeros 
     */
    public static void cambiarPosiciones(ArrayList<Integer> numeros){
        int aux = menorNum(esImpar(numeros));
        int aux2 = mayorNum(esPar(numeros));
        
        numeros.set(numeros.indexOf(mayorNum(esPar(numeros))), aux);
        numeros.set(numeros.indexOf(menorNum(esImpar(numeros))), aux2);
        
        System.out.println("Mayor número par y menor número impar cambiados");
    }
    
}
