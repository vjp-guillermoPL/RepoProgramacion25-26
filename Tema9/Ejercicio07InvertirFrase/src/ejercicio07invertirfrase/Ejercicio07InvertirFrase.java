/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07invertirfrase;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio07InvertirFrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);               //Creo el Scanner

        System.out.println("introduzca una frase");             //Pido la frase al usuario
        String frase = entrada.nextLine();
        
        String[] corte = frase.split(" ");                      //Divido la frase por los espacios y los guardo en un array

        for (int i = corte.length - 1; i >= 0; i--) {           //Recorro el array al revés mostrando la frase palabra por palabra al revés
            System.out.print(corte[i] + " ");
        }
    }

}
