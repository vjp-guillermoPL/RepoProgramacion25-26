/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class Escape2 {

    public final static String CLAVES_OCULTAS = "../04dedf8afeb8a4177a009f41bb78018af601e341ed4322d4073911c9ac879726.txt";
    public final static String CLAVES_LIMPIAS = "claves_limpias.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            leerFichero(CLAVES_OCULTAS, CLAVES_LIMPIAS);

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
        int claves = 0;
        int i = 0;

        try (
                FileReader fr = new FileReader(fichero); BufferedReader br = new BufferedReader(fr);) {
            String linea = br.readLine();

            emp.add(linea);
            
            while (claves != 3 && i < linea.length()) {

                if (Character.isDigit(0)) {
                    
                }
                
                
                
                Character.isDigit(0);
                i++;
            }
            escribirFichero(fichero2, emp);
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
