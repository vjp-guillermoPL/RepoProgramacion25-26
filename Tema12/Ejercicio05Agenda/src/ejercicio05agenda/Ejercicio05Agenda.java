/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05agenda;

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
public class Ejercicio05Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcionElegida = -1;

        do {
            try {
                imprimirMenu();
                opcionElegida = entrada.nextInt();

                switch (opcionElegida) {
                    case 1:
                        guardarContacto();
                        break;
                    case 2:
                        leerAgenda();
                        break;
                    case 3:
                        System.out.println("Terminando programa...");
                        break;
                    default:
                        System.out.println("Número introducido no válido");
                }

            } catch (InputMismatchException error) {
                System.out.println("Error: No puedes escribir letras, usa números");
                entrada.nextLine();
            } catch (Exception error) {
                System.out.println("Ha ocurrido un problema general");
                entrada.nextLine();
            }

        } while (opcionElegida != 3);
    }

    /**
     * Método que muestra las opciones del menú
     */
    public static void imprimirMenu() {
        System.out.println("1 - Crear nuevo contacto");
        System.out.println("2 - Ver agenda de contactos");
        System.out.println("3 - Abandonar el programa");
    }

    /**
     * Método que añade un contacto
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void guardarContacto() throws FileNotFoundException, IOException {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.print("Dime el nombre del contacto: ");
        String nombrePersona = lectorTeclado.nextLine();
        System.out.print("Dime su edad: ");
        String anosPersona = lectorTeclado.nextLine();
        System.out.print("Dime su teléfono: ");
        String numeroPersona = lectorTeclado.nextLine();

        boolean anadirAlFinal = true;
        try (FileWriter archivoEscritura = new FileWriter("agenda.txt", anadirAlFinal); PrintWriter escritorLineas = new PrintWriter(archivoEscritura)) {
            escritorLineas.print("Nombre: " + nombrePersona);
            escritorLineas.print("Edad: " + anosPersona);
            escritorLineas.print("Teléfono: " + numeroPersona);
            System.out.println("Se ha añadido a la lista");

        } catch (IOException errorEscritura) {
            System.out.println("No se pudo guardar por: " + errorEscritura.getMessage());
        }
    }

    /**
     * Método que muestra el contenido del fichero
     */
    public static void leerAgenda() {
        File ficheroAgenda = new File("agenda.txt");

        if (!ficheroAgenda.exists()) {
            System.out.println("Aún no hay ningún fichero de agenda");
            return;
        }

        try (FileReader lectorFichero = new FileReader(ficheroAgenda); BufferedReader lectorBuffer = new BufferedReader(lectorFichero)) {
            String lineaActual;
            System.out.println("=== LISTADO DE LA AGENDA ===");

            while ((lineaActual = lectorBuffer.readLine()) != null) {
                System.out.println(lineaActual);
            }

        } catch (IOException errorLectura) {
            System.out.println("Hubo un error al abrir el archivo: " + errorLectura.getMessage());
        }
    }
}
