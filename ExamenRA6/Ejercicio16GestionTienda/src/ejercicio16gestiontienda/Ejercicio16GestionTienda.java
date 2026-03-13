/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16gestiontienda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Iterator;

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
        System.out.println("3. Eliminar productos de la lista");
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
                    menuCompra(almacen);
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
    public static void menuAdmin(ArrayList<Producto> almacen) {
        int opcion;

        do {

            mostrarMenuAdmin();
            opcion = pedirNum();
            switch (opcion) {
                case 1:
                    introducirProductos(almacen);
                    break;
                case 2:
                    mostrarListaProductos(almacen);
                    break;
                case 3:
                    eliminarProductos(almacen);
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
    public static void introducirProductos(ArrayList<Producto> almacen) {
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

    /**
     * Método que muestra todos los productos de la lista
     *
     * @param almacen
     */
    public static void mostrarListaProductos(ArrayList<Producto> almacen) {
        System.out.println("Los productos disponibles son los siguientes:");

        for (int i = 0; i < almacen.size(); i++) {
            System.out.println((i + 1) + ". " + almacen.get(i).toString());
        }
    }

    /**
     * Método que busca un producto por su nombre, si lo encuentra lo borra, si
     * no, avisa al usuario
     *
     * @param almacen
     */
    public static void eliminarProductos(ArrayList<Producto> almacen) {
        Iterator<Producto> it = almacen.iterator();
        String busqueda;
        boolean encontrado = false;

        System.out.println("Introduzca el nombre del producto que quiera eliminar");
        busqueda = pedirCadena();

        while (!encontrado && it.hasNext()) {
            Producto aux = it.next();

            if (aux.getNombre().equalsIgnoreCase(busqueda)) {
                it.remove();
                encontrado = true;

                System.out.println("Producto con nombre " + busqueda + " eliminado");
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado");
        }
    }

    /**
     * Método que contiene el menú de compra
     *
     * @param almacen
     */
    public static void menuCompra(ArrayList<Producto> almacen) {
        int opcion;

        do {

            mostrarMenuCompra();
            opcion = pedirNum();
            switch (opcion) {
                case 1:
                    comprarProductos(almacen);
                    break;
                case 2:
                    System.out.println("Redirigiendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción introducida inválida");
            }
        } while (opcion != 2);
    }

    /**
     * Método que pide al usuario que productos quiere comprar y cuantos, después le muestra
     * 
     * @param almacen 
     */
    public static void comprarProductos(ArrayList<Producto> almacen) {
        mostrarListaProductos(almacen);
        String busqueda;
        int cantidadCompra;
        boolean encontrado;
        String opcion;
        boolean seguir = true;
        float totalCompra = 0;

        ArrayList<Producto> cesta = new ArrayList<>();

        Iterator<Producto> it = almacen.iterator();

        do {
            encontrado = false;

            System.out.println("Introduzca el nombre del producto que quiera comprar");
            busqueda = pedirCadena();
            
            System.out.println("¿Cuantas unidades quiere comprar?");
            cantidadCompra = pedirNum();
            
            while (!encontrado && it.hasNext()) {
                Producto aux = it.next();

                if (aux.getNombre().equalsIgnoreCase(busqueda) && aux.getStock() >= cantidadCompra) {
                    aux.setStock(aux.getStock() - cantidadCompra);

                    cesta.add(aux);

                    encontrado = true;

                    System.out.println("Producto con nombre " + busqueda + " añadido a la cesta");
                } else if (aux.getStock() < cantidadCompra) {
                    System.out.println("Producto con stock insuficiente");
                    
                    System.out.println("Quedan "+ aux.getStock() +" unidades de "+ busqueda +" en el almacen");
                    
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("Producto no encontrado");
            }

            System.out.println("¿Quiere seguir comprando? s/n");
            opcion = pedirCadena();
            if (opcion.equalsIgnoreCase("n")) {
                seguir = false;
            }
        } while (seguir);

        for (int i = 0; i < cesta.size(); i++) {
            totalCompra += cesta.get(i).getPrecio();
        }

        System.out.println("Su importe total de compra es: " + totalCompra);
    }

}
