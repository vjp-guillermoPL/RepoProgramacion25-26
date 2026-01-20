/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10reemplazarrepetidos;

/**
 *
 * @author alumno
 */
public class Ejercicio10ReemplazarRepetidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int reemplazo[] = new int[10];                         //Creo el array

        rellenarArray(reemplazo);
        mostrarArray(reemplazo);
        reemplazarRepetidos(reemplazo);
        mostrarArray(reemplazo);
    }

    /**
     * Genero 10 números aleatorios entre el 1 y el 8 y los meto al array
     *
     * @param reemplazo
     */
    public static void rellenarArray(int reemplazo[]) {
        for (int i = 0; i < reemplazo.length; i++) {
            reemplazo[i] = (int) (Math.random() * 8) + 1;
        }
    }

    /**
     * Muestra los valores del array
     *
     * @param reemplazo
     */
    public static void mostrarArray(int reemplazo[]) {
        for (int i = 0; i < reemplazo.length; i++) {
            System.out.println("El contenido del array número " + i + " es: " + reemplazo[i]);
        }
    }

    public static void reemplazarRepetidos(int reemplazo[]) {
        boolean repetidos = true;
        int prueba2 = 0;
        int prueba = reemplazo[prueba2];
        while (repetidos == true) {
            for (int i = 0; i < reemplazo.length; i++) {
                if (prueba == reemplazo[i] && reemplazo[1] != 0) {
                    reemplazo[i] = 0;
                }
                if (i == reemplazo.length - 1) {
                    prueba2++;
                    prueba = reemplazo[prueba2];
                }
            }
            repetidos = false;
        }

    }

}
