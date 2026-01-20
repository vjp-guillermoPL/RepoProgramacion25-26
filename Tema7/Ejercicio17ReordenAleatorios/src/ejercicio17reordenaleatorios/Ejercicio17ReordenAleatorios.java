/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17reordenaleatorios;

/**
 *
 * @author alumno
 */
public class Ejercicio17ReordenAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] reorden = new int[10];           //Creo el array

        rellenarArray(reorden);                 //Llamo al método que genera los números y los mete en el array
        mostrarArray(reorden);                  //Llamo al método que muestra el array
        ordenArray(reorden);                    //Llamo al método que ordena el array
        mostrarArray(reorden);                  //Vuelvo a llamar al método que muestra el array
    }

    /**
     * Genero 10 números aleatorios entre el 0 y el 9 y los meto al array
     *
     * @param reorden
     */
    public static void rellenarArray(int reorden[]) {
        for (int i = 0; i < reorden.length; i++) {
            reorden[i] = (int) (Math.random() * 10);
        }
    }

    /**
     * Método que reordena el array de mayor a menor
     *
     * @param reorden
     */
    public static void ordenArray(int reorden[]) {
        int aux;

        for (int i = 0; i < reorden.length - 1; i++) {
            for (int j = 0; j < reorden.length - 1 - i; j++) {
                if (reorden[j] < reorden[j + 1]) {
                    aux = reorden[j];
                    reorden[j] = reorden[j + 1];
                    reorden[j + 1] = aux;
                }
            }

        }
    }

    /**
     * Muestra los valores del array
     *
     * @param reorden
     */
    public static void mostrarArray(int reorden[]) {
        for (int i = 0; i < reorden.length; i++) {
            System.out.println("El contenido del array número " + i + " es: " + reorden[i]);
        }
    }

}
