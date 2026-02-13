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
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("introduzca una frase");
        String frase = entrada.nextLine();
        
        for(int i = 0; i < frase.length(); i++){
            frase.substring(frase.indexOf(" "),frase.indexOf(" ", 2));
            frase.split(" ");
        }
    }
    
}
