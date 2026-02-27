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
        quitarDuplicados(duplicados);
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
    public static void mostrarLista(ArrayList<Integer> duplicados) {
        System.out.println("Lista:");

        for (int i = 0; i < duplicados.size(); i++) {
            System.out.print(duplicados.get(i) + " ");
        }
    }

    /**
     * Método que sustituye los números duplicados por 0
     *
     * @param duplicados
     */
    public static void quitarDuplicados(ArrayList<Integer> duplicados) {
        for (int i = 0; i < duplicados.size(); i++) {
            for (int j = i + 1; j < duplicados.size(); j++) {
                if (duplicados.get(i).equals(duplicados.get(j))) {
                    duplicados.set(i, 0);
                    duplicados.set(j, 0);
                }
            }
        }
        System.out.println("");
        System.out.println("Duplicados eliminados");
    }

}
