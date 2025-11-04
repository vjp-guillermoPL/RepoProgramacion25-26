/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14multiplos3;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class pedirNum {
    
    /**
     * Método que pide un número al usuario
     * @return 
     */
    public static int pedirNum() {
        Scanner entrada = new Scanner(System.in);
        
        return entrada.nextInt();
    }
    
    /**
     * Método que comprueba si el número es mayor que 0
     * @param num
     * @return número mayor que 
     */
    public static int mayor0(int num){
        do {
            if (num < 1) {
                System.out.println("El numero introducido no puede ser menor de 1");
                pedirNum();
            }
        } while (num < 1);
        return num;
    }
    
    /**
     * Método que muestra por pantalla los números múltiplos que hay entre 1 y su número
     * @param num 
     */
    public static void resultado(int num){
        System.out.println("Los numeros que hay entre 1 y " + num + " son: "); 
        for (int i = 2; (i % 3)== 0; i++) {
            System.out.println(i);
        }
    }
}
