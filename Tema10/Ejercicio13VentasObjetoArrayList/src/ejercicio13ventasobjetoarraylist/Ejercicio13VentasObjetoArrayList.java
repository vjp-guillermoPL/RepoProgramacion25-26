/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13ventasobjetoarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio13VentasObjetoArrayList {

    static final String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Ventas> ventasCoches = new ArrayList<>();

        int opcion = 0;

        do {                                                                    //Creo el menú con sus opciones
            try {
                mostrarMenu();

                opcion = pedirNum();
                switch (opcion) {
                    case 1:
                        rellenarVentas(ventasCoches);
                        break;
                    case 2:
                        if (ventasCoches.isEmpty()) {
                            System.out.println("No hay temperaturas registradas que mostrar");
                        } else {
                            mostrarVentas(ventasCoches);
                        }
                        break;
                    case 3:
                        if (ventasCoches.isEmpty()) {
                            System.out.println("No hay temperaturas registradas que mostrar");
                        } else {
                            mostrarVentasTotales(ventasCoches);
                        }
                        break;
                    case 4:
                        if (ventasCoches.isEmpty()) {
                            System.out.println("No hay temperaturas registradas que mostrar");
                        } else {

                        }
                        break;
                    case 5:
                        if (ventasCoches.isEmpty()) {
                            System.out.println("No hay temperaturas registradas que mostrar");
                        } else {

                        }
                        break;
                    case 6:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error, introduzca un número entre 1 y 6");
            }

        } while (opcion != 6);
    }

    /**
     * Método que pide un número
     *
     * @return el número pedido
     */
    public static int pedirNum() {
        Scanner entrada = new Scanner(System.in);

        return entrada.nextInt();
    }

    /**
     * Método que muestra las opciones del menú
     */
    public static void mostrarMenu() {
        System.out.println("1. Rellenar ventas");
        System.out.println("2. Mostrar ventas");
        System.out.println("3. Ventas totales en el año");
        System.out.println("4. Ventas totales de meses cuyo nombre contenga la a");
        System.out.println("5. Mostrar mes con más ventas");
        System.out.println("6. Salir");
        System.out.println("----------------------------------------------------");
    }

    /**
     * Método que rellena las ventas de todos los meses
     *
     * @param ventasCoches
     */
    public static void rellenarVentas(ArrayList<Ventas> ventasCoches) {
        for (int i = 0; i < MESES.length; i++) {
            System.out.println("Introduzca las ventas de " + MESES[i]);
            //ventasCoches.add(new Ventas(MESES[i], pedirNum()));
            ventasCoches.add(new Ventas(MESES[i], ((int) (Math.random() * 1000) + 1000)));
        }
    }

    /**
     * Método que muestra las ventas de todos los meses
     *
     * @param ventasCoches
     */
    public static void mostrarVentas(ArrayList<Ventas> ventasCoches) {
        for (int i = 0; i < MESES.length; i++) {
            System.out.println(ventasCoches.get(i).toString());
        }
    }

    /**
     * Método que muestra el total de ventas del año
     *
     * @param ventasCoches
     */
    public static void mostrarVentasTotales(ArrayList<Ventas> ventasCoches) {
        int total = 0;

        for (int i = 0; i < MESES.length; i++) {
            total += ventasCoches.get(i).getVentas();
        }

        System.out.println("El total de las ventas del año es de " + total + " euros");
    }

    /**
     * Método que muestra las ventas de todos los meses que contengan la letra a
     *
     * @param ventasCoches
     */
    public static void mostrarVentasMesesConA(ArrayList<Integer> ventasCoches) {
        for (int i = 0; i < MESES.length; i++) {
            if (ventasCoches.get(i).getMes().contains("a") || ventasCoches.get(i).getMes().contains("A")) {
                System.out.println("Las ventas de " + ventasCoches.get(i).getMes() + " son de: " + ventasCoches.get(i) + " euros");
            }
        }
    }

}
