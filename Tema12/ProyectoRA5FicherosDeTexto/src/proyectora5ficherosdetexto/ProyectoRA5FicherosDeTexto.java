/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectora5ficherosdetexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ProyectoRA5FicherosDeTexto {

    public final static String FICHERO = "inventario.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Producto> inventario = new ArrayList<>();

        try {
            menu(inventario);
        } catch (InputMismatchException e) {
            System.out.println("Error: Valor introducido erroneo");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error: Fallo con la lectura o escritura del fichero");
        } catch (Exception e) {
            System.out.println("Error: Fallo no identificado");
        }
    }

    /**
     * Método que pide una cadena al usuario
     *
     * @return la cadena
     */
    public static String pedirCadena() {
        Scanner entrada = new Scanner(System.in);

        return entrada.nextLine();
    }

    /**
     * Método que pide un número entero al usuario
     *
     * @return el número
     */
    public static int pedirInt() {
        Scanner entrada = new Scanner(System.in);

        return entrada.nextInt();
    }

    /**
     * Método que pide un número decimal al usuario
     *
     * @return el número
     */
    public static double pedirDouble() {
        Scanner entrada = new Scanner(System.in);

        return entrada.nextDouble();
    }

    /**
     * Método que muestra las opciones del menú
     */
    public static void mostrarMenu() {
        System.out.println("Elija una de las siguientes opciones");
        System.out.println("1. Rellenar inventario");
        System.out.println("2. Guardar los datos del inventario en un fichero");
        System.out.println("3. Leer los datos del inventario");
        System.out.println("4. Salir");
    }

    /**
     * Método que contiene el menú
     *
     * @param inventario
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void menu(ArrayList<Producto> inventario) throws FileNotFoundException, IOException {
        int opcion;

        do {
            mostrarMenu();
            opcion = pedirInt();

            switch (opcion) {
                case 1:
                    rellenarInventario(inventario);
                    break;
                case 2:
                    guardarInventarioEnFichero(inventario, FICHERO);
                    break;
                case 3:
                    leerFichero(inventario, FICHERO);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Introduzca un número entre el 1 y el 4");
            }
        } while (opcion != 4);
    }

    /**
     * Método que pregunta al usuario si quiere seguir
     *
     * @return la respuesta del usuario
     */
    public static boolean seguir() {
        boolean seguir;

        System.out.println("¿Quieres seguir? s/n");
        seguir = pedirCadena().equalsIgnoreCase("s");

        return seguir;
    }

    /**
     * Método que añade productos al inventario hasta que el usuario quiera
     *
     * @param inventario
     */
    public static void rellenarInventario(ArrayList<Producto> inventario) {
        
        do {
            Producto nuevoProducto = new Producto();

            System.out.println("Introduzca el nombre del producto");
            nuevoProducto.setNombre(pedirCadena());
            System.out.println("Introduzca la cantidad de productos");
            nuevoProducto.setCantidad(pedirInt());
            System.out.println("Introduzca el precio del producto");
            nuevoProducto.setPrecio(pedirDouble());

            inventario.add(nuevoProducto);
        } while (seguir());
    }

    /**
     * Método que escribe el inventario en el fichero
     *
     * @param inventario
     * @param fichero
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void guardarInventarioEnFichero(ArrayList<Producto> inventario, String fichero) throws FileNotFoundException, IOException {
        System.out.println("Escribiendo fichero");

        try (
                FileWriter fw = new FileWriter(fichero); PrintWriter pw = new PrintWriter(fw);) {
            for (Producto producto : inventario) {
                pw.println(producto.getNombre() + "#" + producto.getCantidad() + "#" + producto.getPrecio());
            }
        }
    }

    /**
     * Método que lee el fichero y muestra sus datos por pantalla
     *
     * @param inventario
     * @param fichero
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void leerFichero(ArrayList<Producto> inventario, String fichero) throws FileNotFoundException, IOException {
        double precioTotalInventario = 0.0;

        try (
                FileReader fr = new FileReader(fichero); BufferedReader br = new BufferedReader(fr);) {
            String linea = br.readLine();

            while (linea != null) {
                String[] partes = linea.split("#");

                System.out.println("Producto: " + partes[0]);
                System.out.println("Cantidad: " + partes[1]);
                System.out.println("Precio: " + partes[2] + " €");
                System.out.println();

                int cantidad = Integer.parseInt(partes[1]);
                double precio = Double.parseDouble(partes[2]);

                precioTotalInventario += (cantidad * precio);

                linea = br.readLine();
            }
            System.out.println("Precio total de productos: " + precioTotalInventario + " €");
        }
    }

}
