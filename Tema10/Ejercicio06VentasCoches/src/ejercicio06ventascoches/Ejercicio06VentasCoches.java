/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06ventascoches;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06VentasCoches {

    final static int MESES = 12;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> ventas = new ArrayList<>();                          //Creo el ArrayList
        String[] nombreMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        int opcion = 0;

        do {                                                                    //Creo el menú con sus opciones
            try {
                mostrarMenu();

                opcion = pedirNum();
                switch (opcion) {
                    case 1:
                        rellenarVentas(ventas, nombreMeses);
                        break;
                    case 2:
                        if (ventas.isEmpty()) {
                            System.out.println("No hay temperaturas registradas que mostrar");
                        } else {
                            mostarVentas(ventas, nombreMeses);
                        }
                            break;
                    case 3:
                        if (ventas.isEmpty()) {
                            System.out.println("No hay temperaturas registradas que mostrar");
                        } else {
                            mostarVentasReves(ventas, nombreMeses);
                        }
                        break;
                    case 4:
                        if (ventas.isEmpty()) {
                            System.out.println("No hay temperaturas registradas que mostrar");
                        } else {
                            mostrarVentasTotales(ventas);
                        }
                        break;
                    case 5:
                        if (ventas.isEmpty()) {
                            System.out.println("No hay temperaturas registradas que mostrar");
                        } else {
                            mostrarVentasMesesConA(ventas, nombreMeses);
                        }
                        break;
                    case 6:
                        if (ventas.isEmpty()) {
                            System.out.println("No hay temperaturas registradas que mostrar");
                        } else {
                            mostrarMesMasVentas(ventas, nombreMeses);
                        }
                        break;
                    case 7:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error, introduzca un número entre 1 y 7");
            }

        } while (opcion != 7);
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
        System.out.println("3. Mostrar ventas al revés");
        System.out.println("4. Ventas totales en el año");
        System.out.println("5. Ventas totales de meses cuyo nombre contenga la a");
        System.out.println("6. Mostrar mes o meses con más ventas");
        System.out.println("7. Salir");
        System.out.println("----------------------------------------------------");
    }

    /**
     * Método que pide al usuario rellenar las ventas de cada mes
     *
     * @param ventas
     * @param nombreMeses
     */
    public static void rellenarVentas(ArrayList<Integer> ventas, String[] nombreMeses) {
        for (int i = 0; i < MESES; i++) {
            System.out.println("Introduzca las ventas de " + nombreMeses[i]);
            //ventas.add(pedirNum());
            ventas.add((int) (Math.random() * 1000) + 1000);
        }
    }
    
    /**
     * Método que muestra las ventas de todos los meses
     * 
     * @param ventas
     * @param nombreMeses 
     */
    public static void mostarVentas(ArrayList<Integer> ventas, String[] nombreMeses){
        for (int i = 0; i < MESES; i++){
            System.out.println("En "+ nombreMeses[i] +" hubo "+ ventas.get(i) +" euros en ventas");
        }
    }
    
    /**
     * Método que muestra las ventas de todos los meses al revés
     * 
     * @param ventas
     * @param nombreMeses 
     */
    public static void mostarVentasReves(ArrayList<Integer> ventas, String[] nombreMeses){
        for (int i = MESES -1; i >= 0; i--){
            System.out.println("En "+ nombreMeses[i] +" hubo "+ ventas.get(i) +" euros en ventas");
        }
    }
    
    /**
     * Método que suma todas las ventas del año y las muestra por pantalla
     * 
     * @param ventas 
     */
    public static void mostrarVentasTotales(ArrayList<Integer> ventas){
        int total = 0;
        
        for (int i = 0; i < MESES; i++){
            total += ventas.get(i);
        }
        
        System.out.println("El total de las ventas del año es de "+ total +" euros");
    }
    
    /**
     * Método que muestra las ventas de todos los meses que contengan la letra a
     * 
     * @param ventas 
     * @param nombreMeses 
     */
    public static void mostrarVentasMesesConA(ArrayList<Integer> ventas, String[] nombreMeses){
        for (int i = 0; i < MESES; i++){
            if (nombreMeses[i].contains("a") || nombreMeses[i].contains("A")) {
                System.out.println("Las ventas de "+ nombreMeses[i] +" son de: "+ ventas.get(i) +" euros");
            }
        }
    }
    
    /**
     * Método que muestra el mes o meses con más ventas
     * 
     * @param ventas
     * @param nombreMeses 
     */
    public static void mostrarMesMasVentas(ArrayList<Integer> ventas, String[] nombreMeses){
        int mayorVentas = 0;
        
        System.out.println("El mes o meses con más ventas son:");
        
        for (int i = 0; i < MESES; i++){
            if (ventas.get(i) > mayorVentas) {
                mayorVentas = ventas.get(i);
            }
        }
        
        for (int i = 0; i < MESES; i++){
            if (ventas.get(i) == mayorVentas) {
                System.out.println(nombreMeses[i] +" con "+ ventas.get(i) +" euros");
            }
        }
        
    }

}
