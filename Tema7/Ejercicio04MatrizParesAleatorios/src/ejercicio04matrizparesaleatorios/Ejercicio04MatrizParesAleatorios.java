/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04matrizparesaleatorios;

/**
 *
 * @author alumno
 */
public class Ejercicio04MatrizParesAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pares [][] = new int [4][3];                    //Creo el array
        
        rellenarArray(pares);                               //Llamo al método que rellena el array
        mostrarPares(pares);
    }
    
    /**
     * Método que rellena el array con números entre 100 y 200
     * @param pares 
     */
    public static void rellenarArray(int pares[][]) {
        for (int i = 0; i < pares.length ; i++) {
            for (int j = 0; j < pares[i].length ; j++) {
                pares[i][j] = (int)(Math.random()*100 + 1) + 100;
            }
        }
    }
    
    /**
     * Método que muestra los números pares del array
     * @param pares 
     */
    public static void mostrarPares(int pares[][]) {
        for (int i = 0; i < pares.length ; i++) {
            for (int j = 0; j < pares[i].length ; j++) {
                if (pares[i][j] % 2 == 0) {
                    System.out.println("La posición ["+ i + j +"] es : "+ pares[i][j]);
                }
            }
        }
    }
    
}
