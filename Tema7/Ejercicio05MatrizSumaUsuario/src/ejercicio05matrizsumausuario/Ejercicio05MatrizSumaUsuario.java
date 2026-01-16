/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05matrizsumausuario;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio05MatrizSumaUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumas [][] = new int [4][2];                    //Creo el array
        
        rellenarArray(sumas);
        mostrarArray(sumas);
        mostrarMayor(sumas);
        mostrarMenor(sumas);
        sumarArray(sumas);
    }
    
    /**
     * Método que rellena el array con números que introduzca el usuario
     * @param sumas 
     */
    public static void rellenarArray(int sumas[][]) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < sumas.length ; i++) {
            for (int j = 0; j < sumas[i].length ; j++) {
                System.out.println("Introduce un valor para la posición ["+ i + j +"]");
                sumas[i][j] = entrada.nextInt();
            }
        }
    }
    
    /**
     * Método que muestra todos los valores del array
     * @param sumas 
     */
    public static void mostrarArray(int sumas[][]) {
        for (int i = 0; i < sumas.length ; i++) {
            for (int j = 0; j < sumas[i].length ; j++) {
                System.out.println("La posición ["+ i + j +"] es : "+ sumas[i][j]);
            }
        }
    }
    
    /**
     * Método que muestra el mayor número del array
     * @param sumas 
     */
    public static void mostrarMayor(int sumas[][]) {
        int mayor = sumas[0][0];
        for (int i = 0; i < sumas.length ; i++) {
            for (int j = 0; j < sumas[i].length ; j++) {
                if (mayor<sumas[i][j]) {
                    mayor = sumas[i][j]; 
                }
            }
        }
        System.out.println("El mayor número es: "+ mayor);
    }
    
    /**
     * Método que muestra el menor número del array
     * @param sumas 
     */
    public static void mostrarMenor(int sumas[][]) {
        int menor = sumas[0][0];
        for (int i = 0; i < sumas.length ; i++) {
            for (int j = 0; j < sumas[i].length ; j++) {
                if (menor>sumas[i][j]) {
                    menor = sumas[i][j]; 
                }
            }
        }
        System.out.println("El menor número es: "+ menor);
    }
    
    /**
     * Método que suma todos los números de array y los muestra
     * @param sumas 
     */
    public static void sumarArray(int sumas[][]){
        int aux = 0;
        for (int i = 0; i < sumas.length ; i++) {
            for (int j = 0; j < sumas[i].length ; j++) {
                aux += sumas[i][j];
            }
        }
        System.out.println("La suma de todos los números del array es: "+ aux);
    }
    
}
