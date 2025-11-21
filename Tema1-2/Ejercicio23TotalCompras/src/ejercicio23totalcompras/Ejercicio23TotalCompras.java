/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23totalcompras;

import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio23TotalCompras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        int precio;
        int total;
        int numeroproductos;
        
        System.out.println("Introduce el precio del producto");
        precio = entrada .nextInt();
        
        System.out.println("Introduce el numero de productos");
        numeroproductos = entrada2 .nextInt();
        total = precio * numeroproductos;
        
        System.out.println("So total a pagar es: "+ total +" euros");
    }
    
}
