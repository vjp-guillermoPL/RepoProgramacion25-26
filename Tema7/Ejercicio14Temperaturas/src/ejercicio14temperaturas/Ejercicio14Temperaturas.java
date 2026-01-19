/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14temperaturas;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14Temperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temperaturas[][] = new int[4][7];                                 //Creo el array
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};     //Creo el array con los nombres de la semana
        
        int num;                                                                //Creo la variable
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número entre el 1 y el 5");

        do {                                                                    //Creo un menu en un bucle que se repetirá hasta que se introduzca el 5
            num = entrada.nextInt();                                            //Pido el número al usuario

            switch (num) {                                                      //Uso un condicional para realizar lo que elija el usuario
                case 1:
                    rellenarTemperaturas(temperaturas, diasSemana);
                    System.out.println("Array rellenado");
                    break;
                case 2:
                    mostrarArray(temperaturas, diasSemana);
                    break;
                case 3:
                    mostrarMedia(temperaturas);
                    break;
                case 4:
                    temperaturaMasAlta(temperaturas, diasSemana);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Introduce un número válido");
            }
            System.out.println("----------------------------------------------------------");
            System.out.println("Introduce un número entre el 1 y el 5");
        } while (num != 5);
    }

    /**
     * Método que rellena el array con números que introduzca el usuario
     *
     * @param temperaturas
     * @param diasSemana
     */
    public static void rellenarTemperaturas(int temperaturas[][], String diasSemana[]) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                System.out.println("Introduzca una temperatura para el " + diasSemana[j] + " de la semana " + (i + 1));
                temperaturas[i][j] = entrada.nextInt();
            }
        }
    }

    /**
     * Método que muestra todos los valores del array
     *
     * @param temperaturas
     * @param diasSemana
     */
    public static void mostrarArray(int temperaturas[][], String diasSemana[]) {
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                System.out.println("El " + diasSemana[j] + " de la semana " + (i + 1) + " hicieron " + temperaturas[i][j] + " grados");
            }
        }
    }

    /**
     * Método que hace la media de todos los valores del array
     *
     * @param temperaturas
     */
    public static void mostrarMedia(int temperaturas[][]) {
        int suma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                suma += temperaturas[i][j];
            }
        }
        suma = suma / (temperaturas.length * temperaturas[0].length);
        System.out.println("La temperatura media del mes es de: " + suma + " grados");
    }

    /**
     * Método que calcula el mayor número del array
     *
     * @param temperaturas
     * @param diasSemana
     */
    public static void temperaturaMasAlta(int temperaturas[][], String diasSemana[]) {
        int mayor = temperaturas[0][0];
        int cuenta1 = 1;
        int cuenta2 = 1;
        
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                if (mayor < temperaturas[i][j]) {
                    mayor = temperaturas[i][j];
                    cuenta1 = i;
                    cuenta2 = j;
                }
            }
        }
        System.out.println("El día o días más calurosos del mes fueron: ");
        System.out.println("El " + diasSemana[cuenta2] + " de la semana " + (cuenta1 + 1) + " hicieron " + temperaturas[cuenta1][cuenta2] + " grados");
    }

}
