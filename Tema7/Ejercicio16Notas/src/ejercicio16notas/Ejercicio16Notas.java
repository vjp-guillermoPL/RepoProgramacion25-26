/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16notas;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio16Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int clase[][] = new int[6][4];                                          //Creo el array
        String alumno[] = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};   //Creo el array con los nombres
        String asignatura[] = {"Lengua", "Mates", "Historia", "Física"};        //Creo el array con las asignaturas

        int num;                                                                //Creo la variable
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número entre el 1 y el 6");

        do {                                                                    //Creo un menu en un bucle que se repetirá hasta que se introduzca el 6
            num = entrada.nextInt();                                            //Pido el número al usuario

            switch (num) {                                                      //Uso un condicional para realizar lo que elija el usuario
                case 1:
                    rellenarNotas(clase, alumno, asignatura);
                    break;
                case 2:
                    mostrarArray(clase, alumno, asignatura);
                    break;
                case 3:
                    mejorAlumno(clase, alumno);
                    break;
                case 4:
                    masSuspensos(clase, alumno);
                    break;
                case 5:
                    peorAsignatura(clase, asignatura);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Introduce un número válido");
            }
            System.out.println("----------------------------------------------------------");
            System.out.println("Introduce un número entre el 1 y el 6");
        } while (num != 6);
    }

    /**
     * Método que rellena el array con números que introduzca el usuario
     *
     * @param clase
     * @param alumno
     * @param asignatura
     */
    public static void rellenarNotas(int clase[][], String alumno[], String asignatura[]) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < clase.length; i++) {
            for (int j = 0; j < clase[i].length; j++) {
                System.out.println("Introduzca una nota para el " + alumno[i] + " en la asignatura " + asignatura[j]);
                //clase[i][j] = entrada.nextInt();
                clase[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
    }

    /**
     * Método que muestra todos los valores del array
     *
     * @param clase
     * @param alumno
     * @param asignatura
     */
    public static void mostrarArray(int clase[][], String alumno[], String asignatura[]) {
        for (int i = 0; i < clase.length; i++) {
            for (int j = 0; j < clase[i].length; j++) {
                System.out.println("El alumno " + alumno[i] + " en la asignatura " + asignatura[j] + " tiene de nota un " + clase[i][j]);
            }
        }
    }

    /**
     * Método que hace la media de cada alumno, guarda la mejor y la muestra por
     * pantalla
     *
     * @param clase
     * @param alumno
     *
     */
    public static void mejorAlumno(int clase[][], String alumno[]) {
        int suma = 0;
        int mejorMedia = 0;
        int mejorAlumno = 0;
        for (int i = 0; i < clase.length; i++) {
            for (int j = 0; j < clase[i].length; j++) {
                suma += clase[i][j];
                if (j == clase[0].length - 1) {
                    suma = suma / clase[0].length;

                    if (mejorMedia < suma) {
                        mejorMedia = suma;
                        mejorAlumno = i;
                    }
                    suma = 0;
                }
            }
        }
        System.out.println("El mejor alumno es " + alumno[mejorAlumno] + " con una media de " + mejorMedia);
    }

    /**
     * Método que comprueba cual es el alumno con más suspensos
     * @param clase
     * @param alumno 
     */
    public static void masSuspensos(int clase[][], String alumno[]) {
        int suspenso = 0;
        int peorAlumno = 0;
        int numSuspensos = 0;
        for (int i = 0; i < clase.length; i++) {
            for (int j = 0; j < clase[i].length; j++) {
                if (clase[i][j] < 5) {
                    suspenso ++;
                }
                
                if (j == clase[0].length - 1){
                    peorAlumno = i;
                    numSuspensos = suspenso;
                    
                    suspenso = 0;
                }
            }
        }
        System.out.println("El peor alumno es "+ alumno[peorAlumno] +" con "+ numSuspensos +" suspensos");
    }
    
    /**
     * Método que comprueba cual es la asignatura con la nota media más baja
     * @param clase
     * @param asignatura 
     */
    public static void peorAsignatura(int clase[][], String asignatura[]) {
        int suma = 0;
        int peorAsignatura = 0;
        int peorMedia = 10;
        for (int i = 0; i < clase.length; i++) {
            for (int j = 0; j < clase[i].length; j++) {
                suma += clase[i][j];
                if (j == clase[0].length - 1) {
                    suma = suma / clase[0].length;

                    if (peorMedia > suma) {
                        peorMedia = suma;
                        peorAsignatura = i;
                    }
                    suma = 0;
                }
            }
        }
        System.out.println("La asignatura más dificil es "+ asignatura[peorAsignatura] +" con un "+ peorMedia +" de media");
    }

}
