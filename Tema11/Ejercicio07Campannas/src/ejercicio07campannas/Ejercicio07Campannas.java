/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07campannas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Ejercicio07Campannas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Campanna> campannas = new HashSet<>();
        
        menu(campannas);
    }
    
    /**
     * Método que muestra las opciones del menú
     */
    public static void mostrarMenu(){
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Añadir campaña");
        System.out.println("2. Añadir donación");
        System.out.println("3. Mostrar todo");
        System.out.println("4. Mostrar campaña específica");
        System.out.println("5. Mostrar total donado");
        System.out.println("6. Mostrar donación máxima");
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
     * Método que pide un número double
     * 
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
    
    /**
     * Método que ejecuta el menú
     * 
     * @param campannas
     */
    public static void menu(Set<Campanna> campannas) {
        int opcion;

        do {
            mostrarMenu();
            System.out.println("Elija una opción");
            opcion = pedirNum();

            switch (opcion) {
                case 1:
                    anadirCampanna(campannas);
                    break;
                case 2:
                    anadirDonacion(campannas);
                    break;
                case 3:
                    mostrarTodo(campannas);
                    break;
                case 4:
                    mostrarCampannaEspecifica(campannas);
                    break;
                case 5:
                    mostrarTotalDonado(campannas);
                    break;
                case 6:
                    mostrarDonacionMaxima(campannas);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Número introducido inválido");
            }

        } while (opcion != 7);
    }

    /**
     * Método para añadir una nueva campaña al conjunto
     * 
     * @param campannas 
     */
    public static void anadirCampanna(Set<Campanna> campannas) {
        System.out.print("Introduce el nombre de la nueva campaña: ");
        String nombre = pedirCadena();
        
        Campanna nueva = new Campanna(nombre);
        if (campannas.add(nueva)) {
            System.out.println("Campaña añadida correctamente.");
        } else {
            System.out.println("Error: Ya existe una campaña con ese nombre.");
        }
    }

    /**
     * Método para añadir una nueva donación a una campaña existente
     * 
     * @param campannas 
     */
    public static void anadirDonacion(Set<Campanna> campannas) {
        if (campannas.isEmpty()) {
            System.out.println("No hay campañas creadas. Cree una primero.");
            return;
        }

        System.out.print("Introduce nombre del donante: ");
        String nombre = pedirCadena();
        System.out.print("Introduce cantidad a donar: ");
        double cantidad = pedirDouble();
        Donacion nueva = new Donacion(nombre, cantidad);

        System.out.print("Introduce el nombre de la campaña a la que pertenece: ");
        String nombreCampanna = pedirCadena();
        
        Campanna c = buscarCampannaPorNombre(campannas, nombreCampanna);
        
        if (c != null) {
            c.agregarDonacion(nueva);
        } else {
            System.out.println("Campaña no encontrada.");
        }
    }

    /**
     * Método para mostrar todas las campañas y sus donaciones
     * 
     * @param campannas 
     */
    public static void mostrarTodo(Set<Campanna> campannas) {
        if (campannas.isEmpty()) {
            System.out.println("No hay campañas registradas.");
        } else {
            for (Campanna c : campannas) {
                System.out.println(c.toString());
            }
        }
    }

    /**
     * Método para mostrar una campaña específica por nombre
     * 
     * @param campannas 
     */
    public static void mostrarCampannaEspecifica(Set<Campanna> campannas) {
        System.out.print("Introduce el nombre de la campaña a buscar: ");
        String nombre = pedirCadena();
        
        Campanna c = buscarCampannaPorNombre(campannas, nombre);
        
        if (c != null) {
            System.out.println("Campaña encontrada:");
            System.out.println(c.toString());
        } else {
            System.out.println("No se encontró la campaña.");
        }
    }

    /**
     * Método para mostrar el total de dinero donado en todas las campañas
     * 
     * @param campannas 
     */
    public static void mostrarTotalDonado(Set<Campanna> campannas) {
        double total = 0;
        for (Campanna c : campannas) {
            total += c.totalRecaudado();
        }
        System.out.println("Dinero total recaudado en todas las campañas: " + total);
    }

    /**
     * Método para mostrar la donación más grande de todo el sistema
     * 
     * @param campannas 
     */
    public static void mostrarDonacionMaxima(Set<Campanna> campannas) {
        double maxima = -1;
        Donacion donacionMaxima = null;
        
        for (Campanna c : campannas) {
            for (Donacion d : c.getDonaciones()) {
                if (d.getDonacion() > maxima) {
                    maxima = d.getDonacion();
                    donacionMaxima = d;
                }
            }
        }
        
        if (donacionMaxima != null) {
            System.out.println("La donación máxima es: " + donacionMaxima);
        } else {
            System.out.println("No hay donaciones registradas.");
        }
    }
    
    /**
     * Método auxiliar para buscar una campaña por su nombre
     * 
     * @param campannas
     * @param nombre
     * @return La campaña encontrada o null si no existe
     */
    public static Campanna buscarCampannaPorNombre(Set<Campanna> campannas, String nombre) {
        for (Campanna c : campannas) {
            if (c.getNombreCampanna().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }
}