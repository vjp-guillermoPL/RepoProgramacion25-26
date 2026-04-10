/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11alumnos;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author alumno
 */
public class Ejercicio11Alumnos {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Usamos TreeSet para mantener el orden natural de los objetos Alumno
        Set<Alumno> listaAlumnos = new TreeSet<>();
        int seleccion = 0;

        while (seleccion != 5) {
            try {
                imprimirMenu();
                seleccion = sc.nextInt();

                switch (seleccion) {
                    case 1:
                        registrarAlumno(listaAlumnos);
                        break;
                    case 2:
                        listarOrdenados(listaAlumnos);
                        break;
                    case 3:
                        consultarPorExpediente(listaAlumnos);
                        break;
                    case 4:
                        filtrarPorNota(listaAlumnos);
                        break;
                    case 5:
                        System.out.println("Cerrando sistema...");
                        break;
                    default:
                        System.out.println("Opción no reconocida. Inténtalo de nuevo.");
                }
            } catch (InputMismatchException ime) {
                System.out.println(">>> ERROR: Debes introducir un número, no texto.");
                sc.next(); // Limpiamos el buffer del scanner para evitar bucle infinito
            }
        }
    }

    /**
     * Método que da de alta un nuevo alumno
     * 
     * @param alumnos 
     */
    public static void registrarAlumno(Set<Alumno> alumnos) {
        Scanner sc = new Scanner(System.in);

        System.out.print("DNI del alumno: ");
        String dni = sc.nextLine();

        System.out.print("Número de expediente: ");
        int exp = sc.nextInt();

        System.out.print("Nota media: ");
        float nota = sc.nextFloat();
        sc.nextLine(); // Consumir salto de línea

        if (alumnos.add(new Alumno(dni, exp, nota))) {
            System.out.println("Alumno insertado correctamente.");
        } else {
            System.out.println("Error: El alumno ya existe o los datos son inválidos.");
        }
    }

    /**
     * Método que muestra el listado completo ordenado
     * @param alumnos 
     */
    public static void listarOrdenados(Set<Alumno> alumnos) {
        if (alumnos.isEmpty()) {
            System.out.println("La base de datos está vacía.");
        } else {
            System.out.println("--- LISTADO ORDENADO ---");
            for (Alumno a : alumnos) {
                System.out.printf("DNI: %s | Exp: %d | Nota: %.2f%n",
                        a.getDni(), a.getNumExpediente(), a.getNotaMedia());
            }
        }
    }

    /**
     * Método que busca un alumno específico por su ID de expediente
     * 
     * @param alumnos 
     */
    public static void consultarPorExpediente(Set<Alumno> alumnos) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nº de expediente a buscar: ");
        int idBuscar = sc.nextInt();

        boolean localizado = false;
        // Recorremos con un for-each, más sencillo que el Iterator
        for (Alumno a : alumnos) {
            if (a.getNumExpediente() == idBuscar) {
                System.out.println(">> ENCONTRADO: DNI " + a.getDni() + " | Nota: " + a.getNotaMedia());
                localizado = true;
                break; // Salimos del bucle al encontrarlo
            }
        }

        if (!localizado) {
            System.out.println("No hay ningún alumno con expediente " + idBuscar);
        }
    }

    /**
     * Método que filtra y muestra alumnos que tienen una nota exacta
     * 
     * @param alumnos 
     */
    public static void filtrarPorNota(Set<Alumno> alumnos) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Qué nota media buscas?: ");
        float objetivo = sc.nextFloat();

        int cuenta = 0;
        System.out.println("Coincidencias encontradas:");

        for (Alumno a : alumnos) {
            // Usamos compare para floats o casteo directo si la lógica lo permite
            if (Float.compare(a.getNotaMedia(), objetivo) == 0) {
                System.out.println(" - DNI: " + a.getDni() + " (Exp: " + a.getNumExpediente() + ")");
                cuenta++;
            }
        }

        if (cuenta == 0) {
            System.out.println("Ningún alumno tiene esa nota exacta.");
        }
    }

    /**
     * Método que imprime el menú
     */
    public static void imprimirMenu() {
        System.out.println("\n=============================");
        System.out.println("      GESTIÓN DE ALUMNOS     ");
        System.out.println("=============================");
        System.out.println("1. Nuevo alumno");
        System.out.println("2. Ver listado ordenado");
        System.out.println("3. Buscar por expediente");
        System.out.println("4. Buscar por nota media");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
    }

}
