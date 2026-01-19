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
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Introduce un número válido");
            }
            System.out.println("----------------------------------------------------------");
            System.out.println("Introduce un número entre el 1 y el 6");
        } while (num != 5);
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
                clase[i][j] = entrada.nextInt();
            }
        }
    }
    
}
