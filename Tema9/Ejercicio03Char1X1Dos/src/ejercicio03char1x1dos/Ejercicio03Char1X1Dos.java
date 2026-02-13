/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03char1x1dos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio03Char1X1Dos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);                               //Creo el Scanner
        char cadenaArray[];                                                     //Creo el array

        System.out.println("Introduzca una cadena de caracteres");              //Pido la cadena por pantalla
        String cadena = entrada.nextLine();
        
        cadenaArray = cadena.toCharArray();                                     //Convierto la cadea a array

        System.out.println("La cadena dividida caracter por caracter es:");     //Muestro la cadena usando un bucle
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadenaArray[i]);
        }
    }

}
