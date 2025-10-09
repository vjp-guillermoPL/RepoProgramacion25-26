/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07diasemana;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio07DiaSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int diasemana;
        boolean laborable = true;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe en número el dia de la semana");
        diasemana = entrada.nextInt();
        
        switch (diasemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            laborable=true;
            break;
            case 6:
            case 7:
            laborable=false;
            }
        
        if (laborable == true) {
            System.out.println("Hoy se trabaja");
        } else {
            System.out.println("Hoy no se trabaja");
        }
    }
    
}
