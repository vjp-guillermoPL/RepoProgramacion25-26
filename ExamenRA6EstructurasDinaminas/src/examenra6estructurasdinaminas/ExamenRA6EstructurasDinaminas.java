/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra6estructurasdinaminas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author alumno
 */
public class ExamenRA6EstructurasDinaminas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Deporte> clubDeportivo = new ArrayList<>();
        
        HashMap ganadoresMas3 = new HashMap<Integer, Equipos>();

        menu(clubDeportivo,ganadoresMas3);
    }

    /**
     * Método que muestra las opciones del menú
     */
    public static void mostrarMenu() {
        System.out.println("Elige una de las siguientes opciones");
        System.out.println("1. Añadir un deporte");
        System.out.println("2. Mostrar deportes y equipos");
        System.out.println("3. Buscar equipo en deporte");
        System.out.println("4. Mostrar equipos con más de 3 trofeos");
        System.out.println("5. Mostrar todos los equipos de todos los deportes de mayor a menor");
        System.out.println("6. Salir");
    }

    /**
     * Método que pide un número al usuario
     *
     * @return el número
     */
    public static int pedirNum() {
        Scanner entrada = new Scanner(System.in);

        return entrada.nextInt();
    }

    /**
     * Método que pide una cadena al usuario
     *
     * @return la cadena
     */
    public static String pedirCadena() {
        Scanner entrada = new Scanner(System.in);

        return entrada.nextLine().toLowerCase();
    }

    /**
     * Método que contiene el menú
     *
     * @param clubDeportivo
     * @param ganadoresMas3 
     */
    public static void menu(ArrayList<Deporte> clubDeportivo, HashMap ganadoresMas3) {
        int opcion;

        do {
            mostrarMenu();
            opcion = pedirNum();

            switch (opcion) {
                case 1:
                    meterDeporte(clubDeportivo,ganadoresMas3);
                    break;
                case 2:
                    mostrarEquipos(clubDeportivo);
                    break;
                case 3:
                    buscarEquipo(clubDeportivo);
                    break;
                case 4:
                    mostrarMapaEquipos(ganadoresMas3);
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Introduce un número del 1 al 6");
            }

        } while (opcion != 6);
    }

    /**
     * Método que añade un deporte al ArrayList con tantos equipos como quiera
     * el usuario, mínimo uno
     *
     * @param clubDeportivo
     * @param ganadoresMas3
     */
    public static void meterDeporte(ArrayList<Deporte> clubDeportivo, HashMap ganadoresMas3) {
        Deporte nuevoDeporte = new Deporte();

        System.out.println("introduce el nombre del deporte");
        nuevoDeporte.setNombre(pedirCadena());

        do {
            meterEquipo(nuevoDeporte,ganadoresMas3);
        } while (seguir());

        clubDeportivo.add(nuevoDeporte);
    }

    /**
     * Método que pregunta al usuario si quiere añadir más equipos al deporte
     *
     * @return un boolean de la respuesta
     */
    public static boolean seguir() {
        boolean seguir;

        System.out.println("¿Quieres añadir más equipos? s/n");
        seguir = pedirCadena().equals("s");

        return seguir;
    }

    /**
     * Método que mete un equipo al deporte
     *
     * @param nuevoDeporte
     * @param ganadoresMas3
     */
    public static void meterEquipo(Deporte nuevoDeporte, HashMap ganadoresMas3) {
        int codigo, numTrofeos;
        String nombre;

        System.out.println("Introduce el código del equipo");
        codigo = pedirNum();
        System.out.println("Introduce el nombre del equipo");
        nombre = pedirCadena();
        System.out.println("Introduce el número de trofeos ganados");
        numTrofeos = pedirNum();
        
        if (numTrofeos > 3) {
            ganadoresMas3.put(codigo, nombre);
        }

        Equipos nuevoEquipo = new Equipos(codigo, nombre, numTrofeos);

        HashSet equipos = new HashSet<Equipos>();

        equipos.add(nuevoEquipo);

        nuevoDeporte.setEquipos(equipos);
    }

    /**
     * Método que muestra todos los deportes con sus equipos
     *
     * @param clubDeportivo
     */
    public static void mostrarEquipos(ArrayList<Deporte> clubDeportivo) {
        if (!clubDeportivo.isEmpty()) {
            for (int i = 0; i < clubDeportivo.size(); i++) {
                clubDeportivo.get(i).toString();
            }
        } else {
            System.out.println("No hay ningún deporte añadido");
        }
    }

    /**
     * Método que busca un equipo por su nombre y muestra el deporte al que juega
     * 
     * @param clubDeportivo 
     */
    public static void buscarEquipo(ArrayList<Deporte> clubDeportivo) {
        String busNombre;
        int i = 0;
        boolean encontrado = false;

        System.out.println("Introduce el nombre de un equipo");
        busNombre = pedirCadena();
        try {
            while (!encontrado || i < clubDeportivo.size() - 1) {
                if (clubDeportivo.get(i).getEquipos().contains(busNombre)) {
                    System.out.println("El equipo juega " + clubDeportivo.get(i).getNombre());
                    encontrado = true;
                }
                i++;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error inesperado");
        }

        if (!encontrado) {
            System.out.println("Nombre de equipo no encontrado");
        }
    }
    
    /**
     * Método que muestra el mapa de equipos con más de 3 trofeos
     * 
     * @param ganadoresMas3 
     */
    public static void mostrarMapaEquipos(HashMap ganadoresMas3){
        for (Iterator it = ganadoresMas3.keySet().iterator(); it.hasNext();) {
            Object next = it.next();
            
            System.out.println(next);
        }
    }

}
