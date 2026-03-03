/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07arraylistdearraylist;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio07ArrayListDeArrayList {

    public final static int SEMANAS = 4;            //Creo las constantes
    public final static int DIAS = 7;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> temperaturas = new ArrayList<>();         //Creo el ArrayList de ArrayLis
        String[] nombreDias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        int opcion = 0;

        do {                                                                    //Creo el menú con sus opciones
            try {
                System.out.println("1. Rellenar temperaturas");
                System.out.println("2. Mostrar temperaturas");
                System.out.println("3. Temperatura media");
                System.out.println("4. Mostrar días más calurosos");
                System.out.println("5. Salir");

                opcion = pedirOpcion();

                switch (opcion) {
                    case 1:
                        rellenar(temperaturas);
                        break;
                    case 2:
                        mostrar(temperaturas, nombreDias);
                        break;
                    case 3:
                        calcularMedia(temperaturas);
                        break;
                    case 4:
                        mostrarTemperaturasMaximas(temperaturas, nombreDias);
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error, introduzca un número entre 1 y 5");
            }

        } while (opcion != 5);
    }

    /**
     * Método que rellena la lista de listas con 28 temperaturas aleatorias
     *
     * @param temperaturas
     */
    public static void rellenar(ArrayList<ArrayList<Integer>> temperaturas) {
        for (int i = 0; i < SEMANAS; i++) {
            ArrayList<Integer> dias = new ArrayList<>();

            for (int j = 0; j < DIAS; i++) {
                dias.add((int) (Math.random() * 15));
            }

            temperaturas.add(dias);
        }
    }

    /**
     * Método que muestra las temperaturas del mes
     *
     * @param temperaturas
     * @param nombreDias
     */
    public static void mostrar(ArrayList<ArrayList<Integer>> temperaturas, String[] nombreDias) {
        if (temperaturas.isEmpty()) {
            System.out.println("No hay temperaturas registradas que mostrar");
        } else {
            for (int i = 0; i < SEMANAS; i++) {
                System.out.println("Semana " + (i + 1));

                for (int j = 0; j < DIAS; i++) {
                    System.out.println(nombreDias[j] + ": " + temperaturas.get(i).get(j) + "ºC");

                }
            }
        }
    }

    /**
     * Método que muestra la temperatura media del mes
     *
     * @param temperaturas
     */
    public static void calcularMedia(ArrayList<ArrayList<Integer>> temperaturas) {
        if (temperaturas.isEmpty()) {
            System.out.println("No hay temperaturas registradas que mostrar");
        } else {
            int media = 0;

            for (int i = 0; i < SEMANAS; i++) {
                for (int j = 0; j < DIAS; i++) {
                    media += temperaturas.get(i).get(j);
                }
            }

            media /= SEMANAS * DIAS;
            System.out.println("La temperatura media del mes es: " + media);
        }

    }

    /**
     * Método que comprueba cual es la temperatura máxima y todos los dias que
     * la tengan
     *
     * @param temperaturas
     * @param nombreDias
     */
    public static void mostrarTemperaturasMaximas(ArrayList<ArrayList<Integer>> temperaturas, String[] nombreDias) {
        if (temperaturas.isEmpty()) {
            System.out.println("No hay temperaturas registradas que mostrar");
        } else {
            int maxTemp = 0;
            int tempActual;

            for (int i = 0; i < SEMANAS; i++) {
                for (int j = 0; j < DIAS; i++) {
                    tempActual = temperaturas.get(i).get(j);

                    if (tempActual > maxTemp) {
                        maxTemp = tempActual;
                    }
                }
            }

            System.out.println("El día o días con temperaturas más altas son: ");
            for (int i = 0; i < SEMANAS; i++) {
                for (int j = 0; j < DIAS; i++) {
                    if (temperaturas.get(i).get(j) == maxTemp) {
                        System.out.println("El " + nombreDias[j] + " de la semana " + (i + 1) + " con " + maxTemp);
                    }
                }
            }
        }
    }

    /**
     * Método que pide una opción
     *
     * @return la opción pedida
     */
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);

        return entrada.nextInt();
    }

}
