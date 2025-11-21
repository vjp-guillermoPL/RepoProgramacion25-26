/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12paresdowhile;

/**
 *
 * @author alumno
 */
public class Ejercicio12ParesDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 11;
        System.out.println("Los números pares entre 11 y 133 son: ");
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i < 133);
    }
    
}
