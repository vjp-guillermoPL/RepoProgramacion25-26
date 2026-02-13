/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05arraydiassemana;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio05ArrayDiasSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String diasSemana[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};     //Creo el array
        int i = 0;
        boolean encontrado = false;

        Scanner entrada = new Scanner(System.in);                               //Creo el Scanner

        System.out.println("Introduzca una cadena de caracteres");              //Pido el día por pantalla
        String dia = entrada.nextLine();

        while (!encontrado && i < diasSemana.length) {                          //Busco el dia y muestro por pantalla el número de la semana
            if (diasSemana[i].equalsIgnoreCase(dia)) {
                System.out.println("Es el dia número " + (i + 1) + " de la semana");
                encontrado = true;
            }
            i++;
        }

        if (!encontrado) {                                                      //Si no se encuentra el día, sale eso
            System.out.println("Nombre mal escrito");
        }

    }

}
