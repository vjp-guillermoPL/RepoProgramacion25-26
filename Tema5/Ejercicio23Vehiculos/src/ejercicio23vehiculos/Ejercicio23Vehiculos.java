/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23vehiculos;

/**
 *
 * @author alumno
 */
public class Ejercicio23Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Taxi taxiParametrizado = new Taxi("123AAA", "Polo", 90, 23456789);
        System.out.println(taxiParametrizado);
        
        Taxi taxiPorDefecto = new Taxi();
        System.out.println(taxiPorDefecto);
        
    }
    
}
