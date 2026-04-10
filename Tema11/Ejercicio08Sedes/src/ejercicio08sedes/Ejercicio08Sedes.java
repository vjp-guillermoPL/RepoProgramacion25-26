/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08sedes;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author alumno
 */
public class Ejercicio08Sedes {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Ciudades> listaCiudades = new ArrayList<>();
        int opcion = 0;

        do {
            try {
                mostrarMenu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        añadirCiudades(listaCiudades);
                        break;
                    case 2:
                        mostrarCiudadesSedes(listaCiudades);
                        break;
                    case 3:
                        sedesSuperioresMedia(listaCiudades);
                        break;
                    case 4:
                        buscarSedeMenu(listaCiudades);
                        break;
                    case 5:
                        añadirSedeACiudad(listaCiudades);
                        break;
                    case 6:
                        mostrarIngMayorAMenor(listaCiudades);
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. Has introducido una letra");
                entrada.nextLine();
            }
        } while (opcion != 7);
    }

    public static void añadirCiudades(ArrayList<Ciudades> lista) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nombre de la ciudad: ");
        String nombreCiudades = entrada.nextLine();

        Ciudades nuevasCiudades = new Ciudades(nombreCiudades);

        String respuesta;
        do {
            System.out.println("Nombre de la sede: ");
            String nombreSedes = entrada.nextLine();

            System.out.println("Ingresos: ");
            double ingresos = entrada.nextDouble();
            entrada.nextLine();

            nuevasCiudades.getSedes().add(new Sedes(nombreSedes, ingresos));

            System.out.println("¿Deseas añadir otra sede en " + nombreCiudades + "? (S/N): ");
            respuesta = entrada.nextLine();

        } while (respuesta.equalsIgnoreCase("S"));

        lista.add(nuevasCiudades);
    }

    public static void mostrarCiudadesSedes(ArrayList<Ciudades> lista) {
        for (Ciudades ciudades : lista) {
            System.out.println("CIUDAD: " + ciudades.getNombre());
            for (Sedes sedes : ciudades.getSedes()) {
                System.out.println("-> " + sedes.getNombre() + ": " + sedes.getIngresosAnuales() + "€");
            }
        }
    }

    public static void sedesSuperioresMedia(ArrayList<Ciudades> lista) {
        double sumaTotal = 0;
        int totalSedes = 0;

        for (Ciudades ciudades : lista) {
            for (Sedes sedes : ciudades.getSedes()) {
                sumaTotal += sedes.getIngresosAnuales();
                totalSedes++;
            }
        }

        if (totalSedes == 0) {
            return;
        }

        double media = sumaTotal / totalSedes;
        System.out.println("Media global: " + media + "€. Sedes que la superan:");

        for (Ciudades ciudades : lista) {
            for (Sedes sedes : ciudades.getSedes()) {
                if (sedes.getIngresosAnuales() > media) {
                    System.out.println("-> " + sedes.getNombre() + " (" + sedes.getIngresosAnuales() + "€)");
                }
            }
        }
    }

    public static boolean buscarSede(ArrayList<Ciudades> lista, String buscada) {
        int i = 0;
        boolean encontrada = false;

        while (i < lista.size() && !encontrada) {
            Iterator<Sedes> it = lista.get(i).getSedes().iterator();

            while (it.hasNext() && !encontrada) {
                if (it.next().getNombre().equalsIgnoreCase(buscada)) {
                    encontrada = true;
                }
            }
            i++;
        }
        return encontrada;
    }

    public static void buscarSedeMenu(ArrayList<Ciudades> lista) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nombre de la sede a localizar: ");
        String nombreSede = entrada.nextLine();

        if (buscarSede(lista, nombreSede)) {
            System.out.println("RESULTADO: la sede existe");
        } else {
            System.out.println("RESULTADO: sede no encontrada");
        }
    }

    public static void añadirSedeACiudad(ArrayList<Ciudades> lista) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿En qué ciudad quieres añadir la sede?: ");
        String ciudadUsu = entrada.nextLine();

        int i = 0;
        Ciudades encontrada = null;

        while (i < lista.size() && encontrada == null) {
            if (lista.get(i).getNombre().equalsIgnoreCase(ciudadUsu)) {
                encontrada = lista.get(i);
            }
            i++;
        }

        if (encontrada != null) {
            System.out.println("Nombre de la nueva sede: ");
            String nombreSede = entrada.nextLine();

            System.out.println("Ingresos: ");
            double ingresos = entrada.nextDouble();
            entrada.nextLine();

            encontrada.getSedes().add(new Sedes(nombreSede, ingresos));
            System.out.println("Sede añadida con éxito");
        } else {
            System.out.println("Error: Esa ciudad no está registrada");
        }
    }

    public static void mostrarIngMayorAMenor(ArrayList<Ciudades> lista) {
        TreeSet<Sedes> rankingGlobal = new TreeSet<>();

        for (Ciudades ciudades : lista) {
            rankingGlobal.addAll(ciudades.getSedes());
        }

        System.out.println("---RANKING MUNDIAL DE INGRESOS---");
        for (Sedes sedes : rankingGlobal) {
            System.out.println(sedes.getIngresosAnuales() + "€ -> " + sedes.getNombre());
        }
    }

    public static void mostrarMenu() {
        System.out.println("---------------------------------------------------");
        System.out.println("-----------------GESTION MULTINACIONAL-------------");
        System.out.println("----------------1. Añadir ciudad-------------------");
        System.out.println("----------------2. Mostrar ciudades y sedes--------");
        System.out.println("----------------3. Sedes sobre la media------------");
        System.out.println("----------------4. Buscar sede---------------------");
        System.out.println("----------------5. Añadir sede---------------------");
        System.out.println("-------6. Mostrar sedes mayor a menor ingresos-----");
        System.out.println("----------------7. SALIR DEL MENU------------------");
        System.out.println("---------------------------------------------------");
    }

}
