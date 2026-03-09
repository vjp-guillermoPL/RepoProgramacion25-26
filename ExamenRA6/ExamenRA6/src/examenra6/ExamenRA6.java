/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra6;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ExamenRA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche[][] garaje = new Coche[3][3];

        for (int i = 0; i < garaje.length; i++) {
            for (int j = 0; j < garaje[i].length; j++) {
                garaje[i][j] = new Coche();
            }
        }

        int opcion;

        do {
            mostrarMenu();
            System.out.println("Introduzca un número entre 1 y 7");
            opcion = pedirNum();

            switch (opcion) {
                case 1:
                    aparcarCoche(garaje);
                    break;
                case 2:
                    mostrarPlazasLibres(garaje);
                    break;
                case 3:
                    mostrarCochesAparcados(garaje);
                    break;
                case 4:
                    buscarNombre(garaje);
                    break;
                case 5:
                    mostrarPosicionMatriculaBuscada(garaje);
                    break;
                case 6:
                    mostrarEstadoPlazas(garaje);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Error: Introduce un valor entre 1 y 7");
            }
        } while (opcion != 7);

    }

    /**
     * Método que muestra el menú por pantalla
     */
    public static void mostrarMenu() {
        System.out.println("1. Aparcar un coche");
        System.out.println("2. Mostrar plazas libres");
        System.out.println("3. Mostrar los datos de todos los coches aparcados");
        System.out.println("4. Buscar nombre de los titulares");
        System.out.println("5. Buscar por matrícula");
        System.out.println("6. Mostrar todas las plazas, libres(L) y ocupadas(X)");
        System.out.println("7. Salir");
        System.out.println("----------------------------------------------------");
    }

    /**
     * Método que pide un número al usuario
     *
     * @return el número que introduzca el usuario
     */
    public static int pedirNum() {
        Scanner entrada = new Scanner(System.in);
        int num = -1;

        do {
            try {
                num = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor introducido inválido");
            }
        } while (num == -1);

        return num;
    }

    /**
     * Método que pide una cadena al usuario
     *
     * @return la cadena que introduzca el usuario
     */
    public static String pedirCadena() {
        Scanner entrada = new Scanner(System.in);
        String cadena = null;

        do {
            try {
                cadena = entrada.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Valor introducido inválido");
            }
        } while (cadena.isEmpty());
        return cadena;
    }

    /**
     * Método que pide al usuario una posición y, si está vacía, introduce los
     * datos del coche que elija el usuario
     *
     * @param garaje
     */
    public static void aparcarCoche(Coche[][] garaje) {
        int columna = -1;
        int fila = -1;
        boolean aparcado = false;

        while (!aparcado) {
            do {
                System.out.println("¿En qué columna(0,1,2) le gustaría aparcar el coche?");
                columna = pedirNum();
            } while (columna > 2 || columna < 0);

            do {
                System.out.println("¿En qué fila(0,1,2) de la columna " + columna + " le gustaría aparcar el coche?");
                fila = pedirNum();
            } while (fila > 2 || fila < 0);

            if (garaje[columna][fila].getMatricula().isEmpty()) {
                System.out.println("Introduzca la matrícula");
                garaje[columna][fila].setMatricula(pedirCadena());

                System.out.println("Introduzca el nombre del titular");
                garaje[columna][fila].setNombreTitular(pedirCadena());

                aparcado = true;
            } else {
                System.out.println("Posición indicada inexistente o ya rellena");
            }
        }
    }

    /**
     * Método que comprueba si una plaza está libre, si lo está, muestra su
     * posición por pantalla
     *
     * @param garaje
     */
    public static void mostrarPlazasLibres(Coche[][] garaje) {
        System.out.println("Las plazas libres disponibles son:");

        for (int i = 0; i < garaje.length; i++) {
            for (int j = 0; j < garaje[i].length; j++) {
                if (garaje[i][j].getMatricula().isBlank()) {
                    System.out.println("[" + i + j + "]");
                }
            }
        }
    }

    /**
     * Método que comprueba si una plaza está ocupada, si lo está, muestra sus
     * datos y su posición por pantalla
     *
     * @param garaje
     */
    public static void mostrarCochesAparcados(Coche[][] garaje) {
        System.out.println("Los datos de los coches aparcados son:");

        for (int i = 0; i < garaje.length; i++) {
            for (int j = 0; j < garaje[i].length; j++) {
                if (!garaje[i][j].getMatricula().isBlank()) {
                    System.out.println(garaje[i][j].toString()
                            + " y se encuentra en la plaza: [" + i + j + "]");
                }
            }
        }
    }

    /**
     * Método que pide un texto al usuario y lo muestra con todos los nombres de
     * titulares que empiecen por ese texto separados por un "#"
     *
     * @param garaje
     */
    public static void buscarNombre(Coche[][] garaje) {
        String texto;

        System.out.println("Introduzca un texto");
        texto = pedirCadena();

        String busqueda = texto;

        for (int i = 0; i < garaje.length; i++) {
            for (int j = 0; j < garaje[i].length; j++) {
                if (garaje[i][j].getNombreTitular().toLowerCase().contains(texto)) {
                    busqueda = busqueda.concat("#").concat(garaje[i][j].getNombreTitular());
                }
            }
        }

        System.out.println(busqueda);
    }

    /**
     * Método que pide al usuario una matrícula y la busca
     *
     * @param garaje
     * @return posición del coche con la matrícula pedida
     */
    public static int buscarMatricula(Coche[][] garaje) {
        String busquedaMatricula;
        int posicionMatricula = -1;

        System.out.println("Introduzca una matrícula por la que buscar");
        busquedaMatricula = pedirCadena();

        for (int i = 0; i < garaje.length; i++) {
            for (int j = 0; j < garaje[i].length; j++) {
                if (garaje[i][j].getMatricula().equalsIgnoreCase(busquedaMatricula)) {
                    posicionMatricula = i + j;
                }
            }
        }

        return posicionMatricula;
    }

    /**
     * Método que recibe la posición del coche con la matrícula indicada y la
     * muestra por pantalla en caso de que se haya encontrado
     *
     * @param garaje
     */
    public static void mostrarPosicionMatriculaBuscada(Coche[][] garaje) {
        int posicionMatricula = buscarMatricula(garaje);

        if (posicionMatricula == -1) {
            System.out.println("Matrícula no encontrada");
        } else {
            System.out.println("El coche con la matrícula indicada está en la "
                    + (posicionMatricula + 1) + "ª plaza del garaje");
        }
    }

    /**
     * Método que comprueba si cada plaza está ocupada o no, lo guarda en una
     * matriz extra y después lo muestra por pantalla
     *
     * @param garaje
     */
    public static void mostrarEstadoPlazas(Coche[][] garaje) {
        String[][] estado = new String[3][3];

        for (int i = 0; i < garaje.length; i++) {
            for (int j = 0; j < garaje[i].length; j++) {
                if (!garaje[i][j].getMatricula().isBlank()) {
                    estado[i][j] = "X";
                } else {
                    estado[i][j] = "L";
                }
            }
        }

        for (int i = 0; i < estado.length; i++) {
            for (int j = 0; j < estado[i].length; j++) {
                System.out.print("[" + estado[i][j] + "]");
            }
            System.out.println();
        }
    }

}
