/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01arraypares;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01ArrayPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] pares = new int [10];                //Declaro el Array
        pedirNum(pares);                            //Llamo al método que pide los números
        mostrarPar(pares);                          //Llamo al método que muestra los números pares del array por pantalla
    }
    
    /**
     * Método que pide por pantalla tantos números como el tamaño del array y los guarda en él
     * @param pares 
     */
    public static void pedirNum(int pares[]){
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < pares.length; i++) {
            System.out.println("Introduzca un número entero");
            pares[i] = entrada.nextInt();
        }
    }
    
    /**
     * Método que recorre todo el array para mostrar por pantalla los números que sean pares
     * @param pares 
     */
    public static void mostrarPar(int pares[]){
        for (int i = 0; i < pares.length; i++) {
                if (pares[i] % 2 == 0){
                    System.out.println("El contenido del array número "+ i +" es: "+ pares[i]);
                }
            }
        
    }
    
}
