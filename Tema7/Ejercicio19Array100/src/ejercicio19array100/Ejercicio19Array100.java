/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19array100;

/**
 *
 * @author alumno
 */
public class Ejercicio19Array100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aleatorios[] = new int[100];

        rellenarArray(aleatorios);
        mostrarMayor(aleatorios);
        mostrarMenor(aleatorios);
        masRepetido(aleatorios);
        media(aleatorios);
    }

    /**
     * Método que rellena el array con números aleatorios de entre 10 y 80
     *
     * @param aleatorios
     */
    public static void rellenarArray(int aleatorios[]) {
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = (int) (Math.random() * 71) + 10;
        }
    }

    /**
     * Método que muestra el mayor número del array por pantalla
     *
     * @param aleatorios
     */
    public static void mostrarMayor(int aleatorios[]) {
        int mayor = aleatorios[0];
        for (int i = 0; i < aleatorios.length; i++) {
            if (aleatorios[i] > mayor) {
                mayor = aleatorios[i];
            }
        }
        System.out.println("El mayor número del array es: " + mayor);
    }

    /**
     * Método que muestra el menor número del array por pantalla
     *
     * @param aleatorios
     */
    public static void mostrarMenor(int aleatorios[]) {
        int menor = aleatorios[0];
        for (int i = 0; i < aleatorios.length; i++) {
            if (aleatorios[i] < menor) {
                menor = aleatorios[i];
            }
        }
        System.out.println("El menor número del array es: " + menor);
    }

    public static void masRepetido(int aleatorios[]) {
        int repetido[] = new int[80];

        for(int i = 0; i < aleatorios.length; i++){
            repetido[i]++;
        }
        
        int maxRepeticiones = 0;
        int masRepetido = 0;
        
        for (int i = 10; i < 80; i++) {
            if (repetido[i] > maxRepeticiones) {
                maxRepeticiones = repetido[i];
                masRepetido = i;
            }
        }
        System.out.println("El número que más se repite es: "+ masRepetido);
    }

    /**
     * Método que hace la media de todos los números del array
     *
     * @param aleatorios
     */
    public static void media(int aleatorios[]) {
        int media = 0;
        for (int i = 0; i < aleatorios.length; i++) {
            media += aleatorios[i];
        }
        media = media / aleatorios.length;

        System.out.println("La media del array es: " + media);
    }

}
