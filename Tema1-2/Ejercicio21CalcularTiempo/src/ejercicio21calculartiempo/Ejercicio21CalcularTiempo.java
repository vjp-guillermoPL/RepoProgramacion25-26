/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21calculartiempo;

import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio21CalcularTiempo {
    final static int SEGUNDOSD = 86400;
    final static int SEGUNDOSH = 3600;
    final static int SEGUNDOSM = 60;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tiempo;
        
        System.out.println("Introduce el tiempo que quieras en segundos");
        tiempo = entrada .nextInt();
        
        int dias = tiempo / SEGUNDOSD;
        int horas = (tiempo % SEGUNDOSD) / SEGUNDOSH;
        int minutos = (tiempo% SEGUNDOSH) / SEGUNDOSM;
        int segundos = tiempo % SEGUNDOSM;
        
        System.out.println(tiempo +" segundos haceun un total de: "+ dias +" dias, "+ horas +" horas, "+ minutos +" minutos y "+ segundos +" segundos");

    }
    
}
