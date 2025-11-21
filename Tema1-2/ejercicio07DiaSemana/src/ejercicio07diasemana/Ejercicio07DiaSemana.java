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
        int diasemana;                          //Declaro las variables
        boolean laborable = true;
        Scanner entrada = new Scanner(System.in);       //Creo el Scanner
        
        System.out.println("Escribe en número el dia de la semana");        //Pido por pantalla al usuario el número del dia
        diasemana = entrada.nextInt();
        
        switch (diasemana) {            //En caso de que sea del uno al 5 (De lunes a viernes) se trabaja, en caso contrario, no se trabaja 
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
