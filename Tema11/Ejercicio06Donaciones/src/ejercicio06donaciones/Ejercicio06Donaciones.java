/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06donaciones;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06Donaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    /**
     * Método que muestra las opciones del menú
     */
    public static void mostrarMenu(){
        System.out.println("1. Añadir donación");
        System.out.println("2. Mostrar donaciones");
        System.out.println("3. Buscar donaciones de un donante");
        System.out.println("4. Mostrar número de donaciones");
        System.out.println("5. Mostrar dinero total recaudado");
        System.out.println("6. Mostrar donaciones ordenadas (de mayor a menor)");
        System.out.println("7. Salir");
        System.out.println("----------------------------------------------------");
    }
    
    /**
     * Método que pide un número
     *
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
     *
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
     * 
     */
    public static void menu() {
        int opcion;

        do {
            mostrarMenu();
            System.out.println("Elija una opción");
            opcion = pedirNum();

            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Número introducido inválido");
            }

        } while (opcion != 7);
    }
    
}
