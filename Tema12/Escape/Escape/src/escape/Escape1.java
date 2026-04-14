/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escape;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Escape1 {

    public final static String DATOS_EMP = "../datos_empleados.txt";
    public final static String ZONA_CERO = "sospechosos_zona_cero.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            leerFichero(DATOS_EMP, ZONA_CERO);

        } catch (InputMismatchException e) {
            System.out.println("ERROR: Has escrito un tipo de dato incorrecto.");
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("ERROR: Ha ocurrido un error en la escritura o lectura del fichero.");
        } catch (Exception e) {
            System.out.println("ERROR: Ha ocurrido un error desconocido.");
        }
    }

    /**
     * Método que lee el fichero, comprueba los empleados de la zona cero y los
     * guarda en un ArrayList
     *
     * @param fichero
     * @param fichero2
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void leerFichero(String fichero, String fichero2) throws FileNotFoundException, IOException {
        System.out.println("\n- LEYENDO FICHERO -");

        ArrayList<String> emp = new ArrayList<>();
        int contador = 0;

        try (
                FileReader fr = new FileReader(fichero); BufferedReader br = new BufferedReader(fr);) {
            String linea = br.readLine();

            while (linea != null) {
                linea = linea.replace(";", " ");

                System.out.println(linea);

                linea = br.readLine();

                if (linea != null && linea.contains("Zona Cero")) {
                    contador++;
                    emp.add(linea);
                }
            }
            escribirFichero(fichero2, emp);
            System.out.println("El número de empleados ubicados en la zona cero es de: " + contador);
        }
    }

    /**
     * Método que escribe en un fichero el ArrayList que se le pase
     * 
     * @param fichero
     * @param linea
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void escribirFichero(String fichero, ArrayList<String> linea) throws FileNotFoundException, IOException {
        System.out.println("\n- ESCRIBIENDO FICHERO -");

        try (
                FileWriter fw = new FileWriter(fichero); PrintWriter pw = new PrintWriter(fw);) {
            for (String nombre : linea) {
                pw.println(nombre + ";");
            }

        }
    }

}
