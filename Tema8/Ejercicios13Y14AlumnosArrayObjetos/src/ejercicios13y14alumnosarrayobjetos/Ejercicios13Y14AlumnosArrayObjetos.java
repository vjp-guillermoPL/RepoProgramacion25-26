/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios13y14alumnosarrayobjetos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicios13Y14AlumnosArrayObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;                                                //Creo la variable
        Alumno estudiante[] = new Alumno[5];                    //Creo el array

        Scanner entrada = new Scanner(System.in);

        do {                                                    //Menú que se repite hasta que el usuario elija salir
            System.out.println("Elija una opción entre 1 y 6");
            num = pedirNum(entrada);
            switch (num) {
                case 1:
                    rellenarAlumno(estudiante, entrada);
                    break;
                case 2:
                    verAlumnos(estudiante);
                    break;
                case 3:
                    mostrarMediaFiltrada(estudiante, entrada);
                    break;
                case 4:
                    numeroSuspensos(estudiante, entrada);
                    break;
                case 5:
                    buscarAlumnos(estudiante, entrada);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("La opción elegida no es válida");
            }
            System.out.println("--------------------------------------------------");
        } while (num != 6);
    }

    /**
     * Método que pide un dato de tipo String
     *
     * @param entrada
     * @return el dato pedido al usuario
     */
    public static String pedirString(Scanner entrada) {
        String dato = entrada.next();

        return dato;
    }

    /**
     * Método que pide un número
     *
     * @param entrada
     * @return el dato pedido al usuario
     */
    public static int pedirNum(Scanner entrada) {
        int num = entrada.nextInt();

        return num;
    }

    /**
     * Método que rellena el alumno que elija el usuario en caso de que no esté
     * ya relleno
     *
     * @param estudiante
     * @param entrada
     */
    public static void rellenarAlumno(Alumno estudiante[], Scanner entrada) {
        System.out.println("Introduzca la posición que quiera rellenar del 0 al 4");
        int num;

        do {
            num = pedirNum(entrada);
            if (num < 0 || num >= estudiante.length || estudiante[num] != null) {
                System.out.println("Error, introduzca otro número");
            }
        } while (num < 0 || num >= estudiante.length || estudiante[num] != null);

        System.out.println("Introduzca los datos del alumno en este orden: Nombre, edad, nota media");
        estudiante[num] = new Alumno(pedirString(entrada), pedirNum(entrada), pedirNum(entrada));
    }

    /**
     * Método que muestra todos los datos de los estudiantes que estén rellenos
     *
     * @param estudiante
     */
    public static void verAlumnos(Alumno estudiante[]) {
        for (int i = 0; i < estudiante.length; i++) {
            if (estudiante[i] != null) {
                System.out.println(estudiante[i].toString());
            }
        }
    }

    /**
     * Método que pide al usuario una nota media y muestra todos los alumnos con
     * una media igual o mayor a esa
     *
     * @param estudiante
     * @param entrada
     */
    public static void mostrarMediaFiltrada(Alumno estudiante[], Scanner entrada) {
        System.out.println("Introduzca la media por la que quiere filtrar");
        int num = pedirNum(entrada);

        System.out.println("Los alumnos con una media mayor o igual a " + num + " son :");
        for (int i = 0; i < estudiante.length; i++) {
            if (estudiante[i] != null && num <= estudiante[i].getNotaMedia()) {
                System.out.println(estudiante[i].toString());
            }
        }
    }
    
    /**
     * Método que cuenta el número de estudiantes suspensos y los muestra por pantalla
     * @param estudiante
     * @param entrada 
     */
    public static void numeroSuspensos(Alumno estudiante[], Scanner entrada){
        int numSuspensos = 0;
        
        for (int i = 0; i < estudiante.length; i++){
            if (estudiante[i] != null && estudiante[i].getNotaMedia() <= 5) {
                numSuspensos ++;
            }
        }
        System.out.println("Hay "+ numSuspensos +" alumnos con una nota media suspensa, los cuales son: ");
        
        for (int i = 0; i < estudiante.length; i++){
            if (estudiante[i] != null && estudiante[i].getNotaMedia() <= 5) {
                System.out.println(estudiante[i].toString());
            }
        }
    }
    
    /**
     * Método que busca al estudiante por el nombre que introduzca el ususario
     * @param estudiante
     * @param entrada 
     */
    public static void buscarAlumnos(Alumno estudiante[], Scanner entrada){
        System.out.println("Introduzca el nombre del alumno al que quiera buscar");
        String nombre = pedirString(entrada);
        
        for (int i = 0; i < estudiante.length; i++){
            if (estudiante[i] != null && estudiante[i].getAlumno() == nombre) {
                System.out.println(estudiante[i].toString());
            }else {
                System.out.println("El estudiante que buscas no está matriculado o su nombre está mal escrito");
            }
        }
    }

}
