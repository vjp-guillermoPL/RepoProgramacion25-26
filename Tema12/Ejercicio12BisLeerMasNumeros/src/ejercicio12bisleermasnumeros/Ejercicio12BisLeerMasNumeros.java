/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12bisleermasnumeros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Ejercicio12BisLeerMasNumeros {
    
    public final static String FICHERO = "./masnumeros.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            leerFichero(FICHERO);  
            
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
     * Método que lee el fichero, suma todos sus números y muestra la suma 
     * por pantalla
     * 
     * @param fichero
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void leerFichero(String fichero) throws FileNotFoundException, IOException {
        System.out.println("\n- LEYENDO FICHERO -");
        
        int suma = 0;
        
        try(
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
        ) {
            String linea = br.readLine();
            
            while(linea != null) {
                String[] numeros = linea.split(";");
                
                for (String n : numeros) {
                    suma += Integer.parseInt(n.trim()); 
                }
                
                System.out.println(linea);
                
                linea = br.readLine();
            }
        }
        System.out.println("La suma de todos los números es: " +suma);
    }
    
}
