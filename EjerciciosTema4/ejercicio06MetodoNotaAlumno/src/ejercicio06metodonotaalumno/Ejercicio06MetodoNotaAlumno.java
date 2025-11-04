/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06metodonotaalumno;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06MetodoNotaAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe su nota del 0 al 10: ");
        nota = entrada.nextInt();
        
        notaAlumno.notaAlumno(nota);
    }
    
}
