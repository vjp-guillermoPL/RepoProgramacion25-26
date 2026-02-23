/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01arraylistnombres;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01ArrayListNombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> personas = new ArrayList<>();           //Creo la lista

        rellenarLista(personas);                                    //Llamo a los métodos
        mostrarLista(personas);
    }

    /**
     * Método que rellena la lista preguntando si se quiere seguir ampliando
     * después de añadir cada nombre
     *
     * @param personas
     */
    public static void rellenarLista(ArrayList<String> personas) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        String seguir;

        do {
            System.out.println("Introduce un nombre para la lista");
            personas.add(entrada.nextLine());

            System.out.println("¿Quieres añadir más personas? Si / No");
            seguir = entrada2.nextLine();
        } while (seguir.toLowerCase().equals("si"));
    }

    /**
     * Método que muestra la lista entera
     *
     * @param personas
     */
    public static void mostrarLista(ArrayList<String> personas) {
        for (int i = 0; i < personas.size(); i++) {
            System.out.println("La persona correspondiente a la posición " + (i + 1) + " es: " + personas.get(i));
        }
    }

}
