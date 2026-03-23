/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06donaciones;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06Donaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }
    
    /**
     * Método que muestra las opciones del menú
     */
    public static void mostrarMenu(){
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Añadir donación");
        System.out.println("2. Mostrar donaciones");
        System.out.println("3. Buscar donaciones de un donante");
        System.out.println("4. Mostrar número de donaciones");
        System.out.println("5. Mostrar dinero total recaudado");
        System.out.println("6. Mostrar donaciones ordenadas (de mayor a menor)");
        System.out.println("7. Salir");
        System.out.println("----------------------------------------------------");
    }
    
    /**
     * Método que pide un número entero
     * @return el número
     */
    public static int pedirNum() {
        int num;
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();
        entrada.nextLine();
        return num;
    }
    
    /**
     * Método que pide un número double (para cantidades)
     * @return el número double
     */
    public static double pedirDouble() {
        double num;
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextDouble();
        entrada.nextLine();
        return num;
    }

    /**
     * Método que pide una cadena
     * @return la cadena
     */
    public static String pedirCadena() {
        String cadena;
        Scanner entrada = new Scanner(System.in);
        cadena = entrada.nextLine();
        return cadena;
    }
    
    // --- MÉTODOS DE LÓGICA (ACCIONES DEL MENÚ) ---

    /**
     * Método para añadir una nueva donación a la campaña
     */
    public static void anadirDonacion(Campanna c) {
        System.out.print("Introduce nombre del donante: ");
        String nombre = pedirCadena();
        System.out.print("Introduce cantidad a donar: ");
        double cantidad = pedirDouble();
        
        Donacion nueva = new Donacion(nombre, cantidad);
        c.agregarDonacion(nueva);
    }

    /**
     * Método para mostrar todas las donaciones (orden de inserción)
     */
    public static void mostrarDonaciones(Campanna c) {
        System.out.println("Listado de donaciones (orden de inserción):");
        if(c.getDonaciones().isEmpty()){
            System.out.println("No hay donaciones registradas.");
        } else {
            for(Donacion d : c.getDonaciones()){
                System.out.println(d);
            }
        }
    }

    /**
     * Método para buscar donaciones por nombre de donante
     */
    public static void buscarDonaciones(Campanna c) {
        System.out.print("Introduce el nombre del donante a buscar: ");
        String buscar = pedirCadena();
        List<Donacion> encontradas = c.buscarPorDonante(buscar);
        
        if(encontradas.isEmpty()){
            System.out.println("No se encontraron donaciones de ese donante.");
        } else {
            System.out.println("Donaciones encontradas:");
            for(Donacion d : encontradas){
                System.out.println(d);
            }
        }
    }

    /**
     * Método para mostrar el total de donaciones
     */
    public static void mostrarNumeroDonaciones(Campanna c) {
        System.out.println("Número de donaciones: " + c.getDonaciones().size());
    }

    /**
     * Método para mostrar el dinero total recaudado
     */
    public static void mostrarTotalRecaudado(Campanna c) {
        System.out.println("Dinero total recaudado: " + c.getTotalRecaudado());
    }

    /**
     * Método para mostrar donaciones ordenadas de mayor a menor
     */
    public static void mostrarOrdenadas(Campanna c) {
        System.out.println("Donaciones ordenadas de mayor a menor:");
        List<Donacion> ordenadas = c.getOrdenadasMayorAMenor();
        for(Donacion d : ordenadas){
            System.out.println(d);
        }
    }

    /**
     * Método que ejecuta el menú
     */
    public static void menu() {
        // Inicializamos la campaña
        Campanna campaña = new Campanna("Campaña Solidaria COVID");
        int opcion;

        do {
            mostrarMenu();
            System.out.println("Elija una opción");
            opcion = pedirNum();

            switch (opcion) {
                case 1:
                    anadirDonacion(campaña);
                    break;
                case 2:
                    mostrarDonaciones(campaña);
                    break;
                case 3:
                    buscarDonaciones(campaña);
                    break;
                case 4:
                    mostrarNumeroDonaciones(campaña);
                    break;
                case 5:
                    mostrarTotalRecaudado(campaña);
                    break;
                case 6:
                    mostrarOrdenadas(campaña);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Número introducido inválido");
            }

        } while (opcion != 7);
    }
}