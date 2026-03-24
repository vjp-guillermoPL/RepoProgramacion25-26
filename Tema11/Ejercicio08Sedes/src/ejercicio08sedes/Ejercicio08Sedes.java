/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08sedes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio08Sedes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Ciudades> ciudades = new ArrayList<>();
    }
    
    /**
     * Método que muestra las opciones del menú
     */
    public static void mostrarMenu(){
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Añadir ciudad");
        System.out.println("2. Mostrar ciudades y sedes");
        System.out.println("3. Mostrar sedes con ingresos mayores a la media");
        System.out.println("4. Buscar por nombre de sede");
        System.out.println("5. Añadir sede");
        System.out.println("6. Mostrar sedes ordenadas por ingresos anuales (de mayor a menor)");
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
     * Método que pide una cadena
     * @return la cadena
     */
    public static String pedirCadena() {
        String cadena;
        Scanner entrada = new Scanner(System.in);
        cadena = entrada.nextLine();
        return cadena;
    }
    
}
