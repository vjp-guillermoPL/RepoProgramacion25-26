/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16impares20hasta160;

/**
 *
 * @author alumno
 */
public class Ejercicio16Impares20Hasta160 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;              //Declaro las variables
        int contador = i;
        
        System.out.println("Los números impares entre 20 y 160 son: ");         
        do {
            if (i > 20 && i % 2 != 0) {                                         //Creo un bucle que, mientras el número esté entre 20 y 160, imprima por pantalla todos los números impares
                System.out.println(i);
                contador++;                                                            //Si el número está por encima de 20 y es impar, suma uno
            }
            i++;                                                                //Suma uno por cada buelta que dé
            
            } while (i < 160);
        System.out.println("Sacó un total de "+ contador +" números");
    }
    
}
