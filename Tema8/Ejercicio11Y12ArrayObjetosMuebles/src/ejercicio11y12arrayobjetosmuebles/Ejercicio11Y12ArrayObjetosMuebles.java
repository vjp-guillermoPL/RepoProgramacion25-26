/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11y12arrayobjetosmuebles;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio11Y12ArrayObjetosMuebles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;                                                //Creo la variable
        Mueble mobiliario[] = new Mueble[4];                    //Creo el array
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < mobiliario.length; i++) {           //Instancio los objetos para poder usarlos
            mobiliario[i] = new Mueble();
        }
        
        do {                                                    //Menú que se repite hasta que el usuario elija salir
            System.out.println("Elija una opción entre 1 y 4");
            num = entrada.nextInt();
            switch (num) {
                case 1:
                    rellenarMuebles(mobiliario);
                    break;
                case 2:
                    mostrarMuebles(mobiliario);
                    break;
                case 3:
                    filtrarMuebles(mobiliario);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("La opción elegida no es válida");
            }
            System.out.println("--------------------------------------------------");
        } while (num != 4);
    }
    
    /**
     * Método que pide los datos al usuario para rellenar cada objeto del array
     * @param mobiliario 
     */
    public static void rellenarMuebles(Mueble mobiliario[]){
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < mobiliario.length; i++){
            System.out.println("Introduzca la descripció del mueble");
            String descripcion = entrada.next();
            mobiliario[i].setDescripcion(descripcion);
            
            System.out.println("Introduzca el precio del mueble con descripción: "+ mobiliario[i].getDescripcion());
            int precio = entrada.nextInt();
            mobiliario[i].setPrecio(precio);
        }
    }
    
    /**
     * Método que muestra todos los objetos del array
     * @param mobiliario 
     */
    public static void mostrarMuebles(Mueble mobiliario[]){
        for (int i = 0; i < mobiliario.length; i++){
            System.out.println("El mueble con descripción: ("+ mobiliario[i].getDescripcion() +") cuesta "+
                    mobiliario[i].getPrecio() +" euros");
        }
    }
    
    /**
     * Método que le pide al usuario un precio por el cual filtrar y muestra todos los objetos con ese precio o menos
     * @param mobiliario 
     */
    public static void filtrarMuebles(Mueble mobiliario[]){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el precio por el que quiere filtrar");
        int num = entrada.nextInt();
        for (int i = 0; i < mobiliario.length; i++){
            if (mobiliario[i].getPrecio() <= num) {
                System.out.println("El mueble con descripción: ("+ mobiliario[i].getDescripcion() +") cuesta "+
                    mobiliario[i].getPrecio() +" euros");
            }
        }
    }
    
}
