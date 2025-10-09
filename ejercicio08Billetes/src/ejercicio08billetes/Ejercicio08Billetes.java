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
        int billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;
        
        System.out.println("Introduce una cantidad de dinero");
        dinero = entrada .nextInt();
        
        billetes50 = dinero/50;
        billetes20 = (dinero % 50) /20;
        billetes10 = (dinero % 20) / 10;
        billetes5 = (dinero % 10) / 5;
        monedas2 = (dinero % 5) / 2;
        monedas1 = (dinero % 2);
        
        if (billetes50 >0 && billetes20 >0 && billetes10 >0 && billetes5 >0 && monedas2 >0 && monedas1 >0) {
            System.out.println(dinero +" se descompone en "+ billetes50 +" billetes de 50, "+ billetes20 +" billetes de 20, "+ billetes10 +" billetes de 10, "+ billetes5 +" billetes de 5, "+ monedas2 +" monedas de 2 euros y "+ monedas1 +" monedas de 1 euro");
        }else if (billetes50 >0 && billetes20 >0 && billetes10 >0 && billetes5 >0 && monedas2 >0 && monedas1 <0){
            System.out.println(dinero +" se descompone en "+ billetes50 +" billetes de 50, "+ billetes20 +" billetes de 20, "+ billetes10 +" billetes de 10, "+ billetes5 +" billetes de 5, "+ monedas2 +" monedas de 2 euros");
        }
    }
    
}
