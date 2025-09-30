/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27cuadradoycubo;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio27CuadradoYCubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int cuadrado, cubo;
        
        System.out.println("introduzca un numero");
        num = entrada .nextInt();
        
        cuadrado = num*num;
        cubo = num*num*num;
        System.out.println("El cuadrado de su numero es: "+ cuadrado +" y el cubo es: "+ cubo);
    }
    
}
