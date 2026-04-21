/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12bis2escribircadenasenarchivo;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio12Bis2EscribirCadenasEnArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] cadenas = new String[4];
        String fichero;
        
        System.out.println("Introduce el nombre del fichero que quieras crear");
        fichero = pedirCadena() + ".txt";
        
        rellenarArray(cadenas);
        
        try {
            escribirCadenasEnArchivo(cadenas, fichero);
            
        } catch(InputMismatchException e) {
            System.out.println("ERROR: Has escrito un tipo de dato incorrecto.");
        } catch(FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado.");
        } catch(IOException e) {
            System.out.println("ERROR: Ha ocurrido un error en la escritura o lectura del fichero.");
        } catch(Exception e) {
            System.out.println("ERROR: Ha ocurrido un error desconocido.");
        }
    }

    /**
     * Método que pide al usuario una cadena
     *
     * @return la cadena
     */
    public static String pedirCadena() {
        Scanner entrada = new Scanner(System.in);

        return entrada.nextLine();
    }

    /**
     * Método que rellena el Array con las cadenas introducidas por el usuario
     *
     * @param cadenas
     */
    public static void rellenarArray(String[] cadenas) {
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println("Introduzca la cadena número " + (i + 1));
            cadenas[i] = pedirCadena();
        }
    }

    /**
     * Método que escribe las cadenas introducidas por el usuario en un archivo
     * con el nombre que elija el usuario
     * 
     * @param cadenas
     * @param fichero
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void escribirCadenasEnArchivo(String[] cadenas, String fichero) throws FileNotFoundException, IOException {
        try (
                FileWriter fw = new FileWriter(fichero); 
                PrintWriter pw = new PrintWriter(fw);
        )   {
                for (String cadena : cadenas) {
                    pw.print(cadena + "*");
                }
            }
    }

}
