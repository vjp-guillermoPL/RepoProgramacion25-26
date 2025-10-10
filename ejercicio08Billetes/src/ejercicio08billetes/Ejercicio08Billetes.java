/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08billetes;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio08Billetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dinero;
        int billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;      //Declaro las variables
        
        System.out.println("Introduce una cantidad de dinero");                     //Pido por pantalla al usuario el número de dinero que hay
        dinero = entrada .nextInt();
        
        billetes50 = dinero/50;                             //Voy desglosando el dinero total entre los distintos billetes
        billetes20 = (dinero % 50) /20;
        billetes10 = (dinero % 20) / 10;
        billetes5 = (dinero % 10) / 5;
        monedas2 = (dinero % 5) / 2;
        monedas1 = (dinero % 2);
        
        System.out.println("Su dinero se descompone en: ");         //Digo por pantalla solo los números que sean mayores que 0
        if (billetes50 > 0) {
            System.out.println(billetes50+" billetes de 50");
        }
        
        if (billetes20 > 0) {
            System.out.println(billetes20+" billetes de 20");
        }
        
        if (billetes10 > 0) {
            System.out.println(billetes10+" billetes de 10");
        }
        
        if (billetes5 > 0) {
            System.out.println(billetes5+" billetes de 5");
        }
        
        if (monedas2 > 0) {
            System.out.println(monedas2+" monedas de 2");
        }
        
        if (monedas1 > 0) {
            System.out.println(monedas1+" monedas de 1");
        }

    }
}
