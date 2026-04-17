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
        Scanner entrada = new Scanner(System.in); //creo objeto scanner

        int seleccion = -1; //declaro e inicializo variables para que no tenga problemas con el control de excepciones

        do { //bucle que al menos se repite una vez
            try { //control de excepciones

                mostrarMenu(); //llamo al metodo y imprimo por pantalla sus opciones
                seleccion = entrada.nextInt(); //guardo en la variable la opcion

                entrada.nextLine(); //limpio buffer

                switch (seleccion) { //condicional para elegir una opcion
                    case 1: //caso 1 
                        volcarLosParesEnElFichero(); //llamo al metodo
                        break; //para no saltar al siguiente caso
                    case 2:
                        mostrarElFichero();
                        break;
                    case 3:
                        System.out.println("Cerrando la aplicación...");
                        break;
                    default:
                        System.out.println("Opción introducida fuera de rango");
                }

            } catch (InputMismatchException e) { //capturo las excepciones y las muestro por pantalla
                System.out.println("Dato erróneo, se esperaba un número entero");
                entrada.nextLine(); //limpio el buffer del scanner
            } catch (Exception e) {
                System.out.println("Fallo inesperado del sistema");
                entrada.nextLine(); //limpio el buffer del scanner
            }
        } while (seleccion != 3); //se repite el bucle mientras la opcion sea distinta de 3

    }

    /**
     * Método que muestra las opciones del menú
     */
    public static void mostrarMenu() { //metodo para mostrar el menu

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
    public static void volcarLosParesEnElFichero() throws FileNotFoundException, IOException { //metodo para mostrar los pares en el fichero en el que lanzo las excepciones
        Scanner entrada = new Scanner(System.in); //creo objeto scanner
        int[] listaPares = new int[100]; //creo un array con 100 posiciones
        int valorPar = 2; // declaro e incializo la variable para que empiece en par

        // Rellenamos el array con los 100 primeros pares
        for (int i = 0; i < listaPares.length; i++) { //con el bucle for recorro el array 
            listaPares[i] = valorPar; // Guardamos en la variable para rellenar el array el número con la posición que tiene
            valorPar = valorPar + 2; // voy sumando 2 para añadir los numeros pares         
        }

        System.out.println("Escribe el nombre del archivo a crear: ");
        String archivoDestino = entrada.nextLine(); //guardo en la variable el nombre de la agenda

        try (FileWriter flujoEscritura = new FileWriter(archivoDestino); PrintWriter impresora = new PrintWriter(flujoEscritura)) {
            //// Creo el acceso al fichero para que se abra y se cierre de manera idependiente y para poder escribir le paso el objeto creado por parametros a la impresora

            // Recorremos el array de números
            for (int parActual : listaPares) { // recorro en el Array solo los numeros pares
                impresora.println(parActual); // Escribo los numeros pares en lineas distintas
            }

            System.out.println("Array exportado correctamente"); //imprimo por pantalla que se ha volcado el array

        } catch (IOException e) {
            System.out.println("Fallo durante la escritura del disco: " + e.getMessage()); //muestro el mensaje de la captura de la exccepcion
        }
    }

    /**
     * Método que lee y muestra el contenido del archivo
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void mostrarElFichero() throws FileNotFoundException, IOException { //metodo para mostrar el contenido del fichero lazando las excepciones
        Scanner entrada = new Scanner(System.in); //creo objeto scanner

        System.out.println("Indica el nombre del archivo a abrir: "); //imprimo por pantalla la agenda que quiere leer
        String archivoDestino = entrada.nextLine(); //guardo en la variable el nombre que le pido al usuario

        // Apuntamos al fichero
        File documento = new File(archivoDestino); //apuntando a la agenda guardo el nombre en un objeto

        if (!documento.exists()) { //condicional para ver si el archivo existe del fichero que le llamo agenda
            System.out.println("El archivo solicitado no se encuentra en la ruta");
            return;
        }

        try (FileReader flujoLectura = new FileReader(documento); BufferedReader lectorLineas = new BufferedReader(flujoLectura)) { //uso el try-catch con recursos para abrir y cerrar de forma independiente FileReader y BufferedReader

            String filaActual; // Declaro variable para guardar las lineas que se van leyendo
            System.out.println("=== DATOS DEL ARCHIVO ===");

            while ((filaActual = lectorLineas.readLine()) != null) { //bucle que se repite mientras la linea no este vacia
                System.out.println(filaActual); //imprimo las lineas
            }

        } catch (IOException e) { //capturo la excepcion
            System.out.println("Problema al abrir el archivo para lectura: " + e.getMessage()); //imprimo por pantalla la excepcion erronea con el mensaje correspondiente
        }
    }
}
