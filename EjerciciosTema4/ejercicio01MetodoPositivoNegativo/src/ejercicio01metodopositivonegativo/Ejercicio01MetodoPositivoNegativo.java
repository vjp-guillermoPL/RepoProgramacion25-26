/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01metodopositivonegativo;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01MetodoPositivoNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        num1 = entrada.nextInt();
        
        positivoNegativo.positivoNegativo(num1);
    }
    
}
