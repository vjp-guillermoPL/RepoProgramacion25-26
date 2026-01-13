/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15arraymesesventas;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio15ArrayMesesVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ventas [] = new int [12];                                           //Creo el array
        int num;                                                                //Creo la variable
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un número entre el 1 y el 7");
        
        do {                                                                    //Creo un menu en un bucle que se repetirá hasta que se introduzca el 7
            num = entrada.nextInt();                                            //Pido el número al usuario
            
            switch (num) {                                                      //Uso un condicional para realizar lo que elija el usuario
                case 1:
                    rellenarVentas(ventas);
                    System.out.println("Rellenando array...");
                    break;
                case 2:
                    mostrarArray(ventas);
                    break;
                case 3:
                    mostrarArrayReves(ventas);
                    break;
                case 4:
                    mostrarSumaTotal(ventas);
                    break;
                case 5:
                    mostrarArrayPares(ventas);
                    break;
                case 6:
                    mesMasVentas(ventas);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default: System.out.println("Introduce un número válido");
            }
            System.out.println("----------------------------------------------------------");
            System.out.println("Introduce un número entre el 1 y el 7");
        } while (num != 7);
    }
    
    /**
     * Método que rellena el array con números aleatorios entre el 10 y el 100
     * @param ventas 
     */
    public static void rellenarVentas(int ventas[]) {
        for (int i = 0; i < ventas.length ; i++) {
            ventas[i] = (int)(Math.random()*90 + 1) + 10;
        }
    }
    
    /**
     * Método que muestra todo el array
     * @param ventas 
     */
    public static void mostrarArray(int ventas[]) {
        for (int i = 0; i < ventas.length ; i++) {
            System.out.println("Las ventas del mes número "+ i +" son de: "+ ventas[i]);
        }
    }
    
    /**
     * Método que muestra todo el array al reves
     * @param ventas 
     */
    public static void mostrarArrayReves(int ventas[]) {
        for (int i = ventas.length-1; i >= 0 ; i--) {
            System.out.println("Las ventas del mes número "+ i +" son de: "+ ventas[i]);
        }
    }
    
    /**
     * Método que suma todos los valores del array
     * @param ventas 
     */
    public static void mostrarSumaTotal(int ventas[]) {
        int suma = 0;
        for (int i = 0; i < ventas.length ; i++) {
            suma += ventas[i];
        }
        System.out.println("Las ventas totales del año son de: "+ suma);
    }
    
    /**
     * Método que muestra las ventas de los meses pares
     * @param ventas 
     */
    public static void mostrarArrayPares(int ventas[]) {
        for (int i = 0; i < ventas.length ; i++) {
            if (i % 2 != 0) {
                System.out.println("Las ventas del mes número "+ i +" son de: "+ ventas[i]);
            }
        }
    }
    
    /**
     * Método que calcula el mayor número del array, lo asocia con un mes y lo muestra por pantalla
     * @param ventas 
     */
    public static void mesMasVentas(int ventas[]) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int mayor = ventas[0];
        int cuenta = 1;
        for (int i = 1; i < ventas.length ; i++) {
            if (mayor>ventas[i]) {
                mayor = ventas[i];
                cuenta = i;
            }
        }
        System.out.println("El mes con más ventas es: "+ meses[cuenta]);
    }
    
}
