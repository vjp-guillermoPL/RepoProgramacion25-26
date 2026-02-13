/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02char1x1;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio02Char1X1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);                               //Creo el Scanner
        
        System.out.println("Introduzca una cadena de caracteres");              //Pido la cadena por pantalla
        String cadena = entrada.nextLine();
        
        System.out.println("La cadena dividida caracter por caracter es:");     //Muestro la cadena usando un bucle
        for(int i = 0; i < cadena.length(); i++){
            System.out.println(cadena.charAt(i));
        }
    }
    
}
