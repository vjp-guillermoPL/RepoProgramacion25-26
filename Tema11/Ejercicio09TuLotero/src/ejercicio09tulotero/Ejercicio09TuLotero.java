/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09tulotero;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author alumno
 */
public class Ejercicio09TuLotero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // El TreeMap ordena las claves (fechas) automáticamente
        TreeMap<LocalDate, Sorteo> sorteos = new TreeMap<>();

        int opc = 0;

        do {
            try {
                pintarMenu();
                opc = sc.nextInt();

                switch (opc) {
                    case 1:
                        nuevoSorteo(sorteos);
                        break;
                    case 2:
                        rehacerSorteo(sorteos);
                        break;
                    case 3:
                        verSorteosMes(sorteos);
                        break;
                    case 4:
                        buscarPorFecha(sorteos);
                        break;
                    case 5:
                        crearSorteoFecha(sorteos);
                        break;
                    case 6:
                        listarTodo(sorteos);
                        break;
                    case 7:
                        System.out.println("Cerrando sistema...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }

            } catch (InputMismatchException ime) {
                System.out.println("Error: Debes introducir un número.");
                sc.next(); // Limpiamos el buffer
            }

        } while (opc != 7);

    }

    /**
     * Formatea y muestra los datos de un sorteo por consola.
     *
     * @param s Objeto Sorteo a imprimir.
     */
    public static void imprimirSorteo(Sorteo s) {
        System.out.print("Fecha: " + s.getFecha() + " | Números: ");
        for (int n : s.getGanadores()) {
            System.out.print(n + " ");
        }
        System.out.println("\n");
    }

    /**
     * Genera un sorteo con la fecha del sistema actual.
     *
     * @param lista Mapa donde se almacenan los sorteos.
     */
    public static void nuevoSorteo(TreeMap<LocalDate, Sorteo> lista) {
        LocalDate fActual = LocalDate.now();

        if (lista.containsKey(fActual)) {
            System.out.println("Ya hay un sorteo registrado hoy.");
        } else {
            lista.put(fActual, new Sorteo(fActual));
            System.out.println("Sorteo generado correctamente.");
        }
    }

    /**
     * Elimina el sorteo de hoy y genera uno nuevo con otros números.
     *
     * @param lista Mapa de sorteos.
     */
    public static void rehacerSorteo(TreeMap<LocalDate, Sorteo> lista) {
        LocalDate fActual = LocalDate.now();

        if (lista.containsKey(fActual)) {
            lista.remove(fActual);
            lista.put(fActual, new Sorteo(fActual));
            System.out.println("Sorteo reiniciado con nuevos resultados.");
        } else {
            System.out.println("No existe sorteo hoy para repetir.");
        }
    }

    /**
     * Filtra y muestra los sorteos ocurridos en el mes en curso.
     *
     * @param lista Mapa de sorteos.
     */
    public static void verSorteosMes(TreeMap<LocalDate, Sorteo> lista) {
        LocalDate actual = LocalDate.now();

        System.out.println("---- SORTEOS DE " + actual.getMonth() + " ----");
        boolean hayResultados = false;

        for (Sorteo s : lista.values()) {
            // Coincide mes y año
            if (s.getFecha().getMonth() == actual.getMonth() && s.getFecha().getYear() == actual.getYear()) {
                imprimirSorteo(s);
                hayResultados = true;
            }
        }
        if (!hayResultados) {
            System.out.println("Sin registros este mes.");
        }
    }

    /**
     * Solicita una fecha y muestra el sorteo si existe.
     *
     * @param lista Mapa de sorteos.
     */
    public static void buscarPorFecha(TreeMap<LocalDate, Sorteo> lista) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Año (aaaa): ");
        int year = sc.nextInt();
        System.out.print("Mes (1-12): ");
        int month = sc.nextInt();
        System.out.print("Día (1-31): ");
        int day = sc.nextInt();

        LocalDate fechaBusq = LocalDate.of(year, month, day);

        // Búsqueda manual mediante iterador
        Iterator<Map.Entry<LocalDate, Sorteo>> it = lista.entrySet().iterator();
        Sorteo res = null;

        while (it.hasNext() && res == null) {
            Map.Entry<LocalDate, Sorteo> entry = it.next();
            if (entry.getKey().equals(fechaBusq)) {
                res = entry.getValue();
            }
        }

        if (res != null) {
            imprimirSorteo(res);
        } else {
            System.out.println("No hay resultados para esa fecha.");
        }
    }

    /**
     * Crea un sorteo en una fecha específica introducida por teclado.
     *
     * @param lista Mapa de sorteos.
     */
    public static void crearSorteoFecha(TreeMap<LocalDate, Sorteo> lista) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Año (aaaa): ");
        int year = sc.nextInt();
        System.out.print("Mes (1-12): ");
        int month = sc.nextInt();
        System.out.print("Día (1-31): ");
        int day = sc.nextInt();

        LocalDate fNueva = LocalDate.of(year, month, day);

        if (lista.containsKey(fNueva)) {
            System.out.println("Ya existe un sorteo en esa fecha.");
        } else {
            lista.put(fNueva, new Sorteo(fNueva));
            System.out.println("Sorteo programado creado.");
        }
    }

    /**
     * Recorre y lista todos los sorteos almacenados.
     *
     * @param lista Mapa de sorteos.
     */
    public static void listarTodo(TreeMap<LocalDate, Sorteo> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay datos guardados.");
            return;
        }
        // TreeMap ya devuelve los valores ordenados
        for (Sorteo s : lista.values()) {
            imprimirSorteo(s);
        }
    }

    /**
     * Imprime el menú de opciones por pantalla.
     */
    public static void pintarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("----------------- APP TU LOTERO -------------------");
        System.out.println("---------------- 1. Sorteo Hoy --------------------");
        System.out.println("---------------- 2. Repetir Sorteo ----------------");
        System.out.println("---------------- 3. Ver Mes Actual ----------------");
        System.out.println("---------------- 4. Buscar por Fecha --------------");
        System.out.println("---------------- 5. Crear Sorteo Antiguo ----------");
        System.out.println("---------------- 6. Ver Todo ----------------------");
        System.out.println("---------------- 7. SALIR -------------------------");
        System.out.println("---------------------------------------------------");
    }

}
