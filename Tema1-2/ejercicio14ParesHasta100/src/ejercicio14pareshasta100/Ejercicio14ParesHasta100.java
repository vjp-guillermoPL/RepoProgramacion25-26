/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14pareshasta100;

/**
 *
 * @author alumno
 */
public class Ejercicio14ParesHasta100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        int contador = i;
        
        System.out.println("Los 100 primero números pares son: ");
        do {
            if (i % 2 == 0) {
                System.out.println(i);
                contador++;
            }
            i++;
            
            } while (contador < 100);
        System.out.println("Sacó un total de "+ contador +" números");

    }
    
}
