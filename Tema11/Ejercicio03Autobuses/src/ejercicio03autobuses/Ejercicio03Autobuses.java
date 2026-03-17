/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03autobuses;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio03Autobuses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autobus[] darsenas = new Autobus[6];

        menu(darsenas);
    }

    /**
     * Método que muestra las opciones del menú
     */
    public static void mostrarMenu() {
        System.out.println("1. Aparcar");
        System.out.println("2. Mostrar dársenas libres");
        System.out.println("3. Buscar autobus");
        System.out.println("4. Buscar conductor");
        System.out.println("5. Buscar autobus con más conductores asignados");
        System.out.println("6. Salir");
        System.out.println("---------------------------------------------------");
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

        return cadena = entrada.nextLine();
    }

    /**
     * Método que ejecuta el menú
     *
     * @param darsenas
     */
    public static void menu(Autobus[] darsenas) {
        int opcion;

        do {
            mostrarMenu();
            System.out.println("Elija una opción");
            opcion = pedirNum();

            switch (opcion) {
                case 1:
                    aparcarAutobus(darsenas);
                    break;
                case 2:
                    mostrarDarsenasLibres(darsenas);
                    break;
                case 3:
                    buscarAutobus(darsenas);
                    break;
                case 4:
                    buscarConductor(darsenas);
                    break;
                case 5:
                    mostrarBusMasConductores(darsenas);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Número introducido inválido");
            }

        } while (opcion != 6);
    }

    /**
     * Método que aparca el autobus en la posición indicada si esta está libre
     *
     * @param darsenas
     */
    public static void aparcarAutobus(Autobus[] darsenas) {
        int posicion;

        do {
            System.out.print("Introduzca la posición de la dársena (0-5): ");
            posicion = pedirNum();

            if (posicion < 0 || posicion >= 6) {
                System.out.println("Error: Posición fuera de rango.");
            } else if (darsenas[posicion] != null) {
                System.out.println("Error: La dársena " + posicion + " está ocupada. Pruebe otra.");
            }

        } while (posicion < 0 || posicion >= 6 || darsenas[posicion] != null);

        System.out.print("Introduzca la matrícula del autobús: ");
        String matricula = pedirCadena();

        Autobus nuevoBus = new Autobus();
        nuevoBus.setMatricula(matricula);

        String respuesta;
        System.out.print("¿Desea asignar conductores? (s/n): ");
        respuesta = pedirCadena();

        while (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Introduzca DNI del conductor: ");
            String dni = pedirCadena();
            System.out.print("Introduzca nombre del conductor: ");
            String nombre = pedirCadena();

            nuevoBus.meterConductor(dni, nombre);

            System.out.print("¿Desea introducir otro conductor? (s/n): ");
            respuesta = pedirCadena();
        }

        darsenas[posicion] = nuevoBus;
        System.out.println("Autobús aparcado correctamente en la dársena " + posicion);
    }

    /**
     * Método que muestra que dársenas están libres
     *
     * @param darsenas
     */
    public static void mostrarDarsenasLibres(Autobus[] darsenas) {
        boolean hayLibres = false;
        int i = 0;

        while (i < darsenas.length) {
            if (darsenas[i] == null) {
                System.out.println("Dársena " + i + " está libre.");
                hayLibres = true;
            }
            i++;
        }
        if (!hayLibres) {
            System.out.println("No hay dársenas libres.");
        }
    }

    /**
     * Método que busca un autobus por su matrícula
     *
     * @param darsenas
     */
    public static void buscarAutobus(Autobus[] darsenas) {
        System.out.print("Introduzca la matrícula a buscar: ");
        String matriculaBus = pedirCadena();
        boolean encontrado = false;
        int i = 0;

        while (i < darsenas.length && !encontrado) {
            if (darsenas[i] != null && darsenas[i].getMatricula().equalsIgnoreCase(matriculaBus)) {
                System.out.println("Autobús encontrado en dársena " + i + ":");
                System.out.println(darsenas[i].toString());
                encontrado = true;
            }
            i++;
        }

        if (!encontrado) {
            System.out.println("No se encontró autobús con esa matrícula.");
        }
    }

    /**
     * Método que busca un conductor por DNI y muestra la matrícula de su
     * autobus
     *
     * @param darsenas
     */
    public static void buscarConductor(Autobus[] darsenas) {
        System.out.print("Introduzca el DNI del conductor a buscar: ");
        String dniBus = pedirCadena();
        boolean encontrado = false;
        int i = 0;

        while (i < darsenas.length && !encontrado) {
            if (darsenas[i] != null) {
                Iterator<String> it = darsenas[i].getConductores().keySet().iterator();
                while (it.hasNext() && !encontrado) {
                    String dniActual = it.next();
                    if (dniActual.equalsIgnoreCase(dniBus)) {
                        String nombreConductor = darsenas[i].getConductores().get(dniActual);
                        System.out.println("Conductor encontrado: " + nombreConductor);
                        System.out.println("Asignado al autobús con matrícula: " + darsenas[i].getMatricula());
                        encontrado = true;
                    }
                }
            }
            i++;
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún conductor con ese DNI.");
        }
    }

    /**
     * Método que muestra el autobus con más conductores
     *
     * @param darsenas
     */
    public static void mostrarBusMasConductores(Autobus[] darsenas) {
        int posicionMax = -1;
        int maxConductores = -1;
        int i = 0;

        while (i < darsenas.length) {
            if (darsenas[i] != null) {
                int cantidadActual = darsenas[i].numConductores();
                if (cantidadActual > maxConductores) {
                    maxConductores = cantidadActual;
                    posicionMax = i;
                }
            }
            i++;
        }

        if (posicionMax != -1) {
            System.out.println("El autobús con más conductores está en la posición: " + posicionMax);
            System.out.println("Matrícula: " + darsenas[posicionMax].getMatricula());
            System.out.println("Número de conductores: " + maxConductores);
        } else {
            System.out.println("No hay autobuses aparcados.");
        }
    }

}
