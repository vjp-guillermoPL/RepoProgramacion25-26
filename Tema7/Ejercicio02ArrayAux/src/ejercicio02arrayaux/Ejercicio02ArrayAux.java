/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02arrayaux;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio02ArrayAux {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] cambio = new int [7];
        pedirNum(cambio);                       //Declaro el Array
        mostrarArray(cambio);                   //Llamo al método que muestra el array
        intercambio(cambio);                    //Llamo al método que intercambia los números
        mostrarArray(cambio);                   //Llamo al método que muestra el array
    }
    
    /**
     * Método que pide por pantalla tantos números como el tamaño del array y los guarda en él
     * @param cambio 
     */
    public static void pedirNum(int cambio[]){
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < cambio.length; i++) {
            System.out.println("Introduzca un número entero");
            cambio[i] = entrada.nextInt();
        }
    }
    
    /**
     * Método que recorre todo el array para mostrar por pantalla los números que sean pares
     * @param cambio 
     */
    public static void mostrarArray(int cambio[]){
        for (int i = 0; i < cambio.length; i++) {
            System.out.println("El contenido del array número "+ i +" es: "+ cambio[i]);
            }
    }
    
    /**
     * Cambio los números 2 y 4 del array con una variable auxiliar
     * @param cambio 
     */
    public static void intercambio(int cambio[]){
        int aux;
        aux = cambio[2];
        cambio[2] = cambio[4];
        cambio[4] = aux;
        System.out.println("Números cambiados");
    }
    
}
