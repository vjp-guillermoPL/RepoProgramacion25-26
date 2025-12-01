/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04animales;

/**
 *
 * @author alumno
 */
public class Ejercicio04Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gatos gato1 = new Gatos("Kira", 5, 20);
        Perros perro1 = new Perros("Nina", 4, 15);
        Leones leon1 = new Leones("Simba", 9, 35);
        Lobos lobo1 = new Lobos("Fenrir", 3, 29);
        
        System.out.println(gato1);
        System.out.println(perro1);
        System.out.println(leon1);
        System.out.println(lobo1);
    }
    
}
