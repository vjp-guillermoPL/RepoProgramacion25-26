/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06ficheropares;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06FicheroPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int seleccion = -1;

        do {
            try {

                mostrarMenu();
                seleccion = entrada.nextInt();

                entrada.nextLine();

                switch (seleccion) {
                    case 1:
                        volcarLosParesEnElFichero();
                        break;
                    case 2:
                        mostrarElFichero();
                        break;
                    case 3:
                        System.out.println("Cerrando la aplicación...");
                        break;
                    default:
                        System.out.println("Opción introducida fuera de rango");
                }

            } catch (InputMismatchException e) {
                System.out.println("Dato erróneo, se esperaba un número entero");
                entrada.nextLine();
            } catch (Exception e) {
                System.out.println("Fallo inesperado del sistema");
                entrada.nextLine();
            }
        } while (seleccion != 3);

    }

    /**
     * Método que muestra las opciones del menú
     */
    public static void mostrarMenu() {

        System.out.println("--- GESTOR DE NÚMEROS PARES ---");
        System.out.println("1.Guardar los 100 primeros números pares en un archivo");
        System.out.println("2.Leer el archivo de números");
        System.out.println("3.Finalizar ejecución");
    }

    /**
     * Método que genera los números pares y los guarda en un archivo
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void volcarLosParesEnElFichero() throws FileNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);
        int[] listaPares = new int[100];
        int valorPar = 2;

        for (int i = 0; i < listaPares.length; i++) {
            listaPares[i] = valorPar;
            valorPar = valorPar + 2;
        }

        System.out.println("Escribe el nombre del archivo a crear: ");
        String archivoDestino = entrada.nextLine();

        try (FileWriter flujoEscritura = new FileWriter(archivoDestino); PrintWriter impresora = new PrintWriter(flujoEscritura)) {

            for (int parActual : listaPares) {
                impresora.println(parActual);
            }

            System.out.println("Array exportado correctamente");

        } catch (IOException e) {
            System.out.println("Fallo durante la escritura del disco: " + e.getMessage());
        }
    }

    /**
     * Método que lee y muestra el contenido del archivo
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void mostrarElFichero() throws FileNotFoundException, IOException {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Indica el nombre del archivo a abrir: ");
        String archivoDestino = entrada.nextLine();

        File documento = new File(archivoDestino);

        if (!documento.exists()) {
            System.out.println("El archivo solicitado no se encuentra en la ruta");
            return;
        }

        try (FileReader flujoLectura = new FileReader(documento); BufferedReader lectorLineas = new BufferedReader(flujoLectura)) {

            String filaActual;
            System.out.println("=== DATOS DEL ARCHIVO ===");

            while ((filaActual = lectorLineas.readLine()) != null) {
                System.out.println(filaActual);
            }

        } catch (IOException e) {
            System.out.println("Problema al abrir el archivo para lectura: " + e.getMessage());
        }
    }
}
