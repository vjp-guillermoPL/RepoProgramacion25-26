/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16gestiontienda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Ejercicio16GestionTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Producto> almacen = new ArrayList<>();

        menuPrincipal(almacen);
    }

    /**
     * Método que muestra las opciones del menú principal
     */
    public static void mostrarMenuPrincipal() {
        System.out.println("----------------------------");
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1. Menú de administración");
        System.out.println("2. Menú de compra");
        System.out.println("3. Salir");
        System.out.println("----------------------------");
    }

    /**
     * Método que muestra el menú de administración
     */
    public static void mostrarMenuAdmin() {
        System.out.println("------------------------------------");
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1. Introducir productos en la lista");
        System.out.println("2. Visualizar la lista de productos");
        System.out.println("3. Eliminar la lista de productos");
        System.out.println("4. Volver al menú principal");
        System.out.println("------------------------------------");
    }

    /**
     * Método que muestra el menú de compra
     */
    public static void mostrarMenuCompra() {
        System.out.println("-----------------------------");
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1. Comprar productos");
        System.out.println("2. Volver al menú principal");
        System.out.println("-----------------------------");
    }

    /**
     * Método que pide un número al usuario
     * 
     * @return el número que introduzca el usuario
     */
    public static int pedirNum() {
        int num = -1;
        Scanner entrada = new Scanner(System.in);

        while (num < 0) {
            try {
                num = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Dato introducido inválido");
                entrada.next();
            }
        }

        return num;
    }
    
    /**
     * Método que pide una cadena al usuario
     * 
     * @return la cadena que introduzca el usuario
     */
    public static String pedirCadena() {
        String cadena = "";
        Scanner entrada = new Scanner(System.in);

        while (cadena.isBlank()) {
            try {
                cadena = entrada.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Dato introducido inválido");
                entrada.next();
            }
        }

        return cadena;
    }
    
    /**
     * Método que pide un número decimal al usuario
     * 
     * @return el número que introduzca el usuario
     */
    public static float pedirFoat() {
        float num = -1;
        Scanner entrada = new Scanner(System.in);

        while (num < 0) {
            try {
                num = entrada.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Dato introducido inválido");
                entrada.next();
            }
        }

        return num;
    }

    /**
     * Método que contiene el menú principal
     * 
     * @param almacen 
     */
    public static void menuPrincipal(ArrayList<Producto> almacen) {
        int opcion;

        do {

            mostrarMenuPrincipal();
            opcion = pedirNum();
            switch (opcion) {
                case 1:
                    menuAdmin(almacen);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción introducida inválida");
            }
        } while (opcion != 3);
    }
    
    /**
     * Método que contiene el menú de administración
     * 
     * @param almacen 
     */
    public static void menuAdmin(ArrayList<Producto> almacen){
        int opcion;

        do {

            mostrarMenuAdmin();
            opcion = pedirNum();
            switch (opcion) {
                case 1:
                    introducirProductos(almacen);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Redirigiendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción introducida inválida");
            }
        } while (opcion != 4);
    }
    
    /**
     * Método que introduce productos hasta que el usuario elija parar
     * 
     * @param almacen 
     */
    public static void introducirProductos(ArrayList<Producto> almacen){
        String opcion;
        boolean seguir = true;
        
        do {
            System.out.println("Introduzca el nombre, precio y stock en ese orden");
            almacen.add(new Producto(pedirCadena(), pedirFoat(), pedirNum()));
            
            System.out.println("¿Quiere seguir introduciendo productos? s/n");
            opcion = pedirCadena();
            if (opcion.equalsIgnoreCase("n")) {
                seguir = false;
            }
        } while (seguir);
    }

}
