/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24notas;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio24Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        Scanner entrada4 = new Scanner(System.in);
        Scanner entrada5= new Scanner(System.in);
        Scanner entrada6 = new Scanner(System.in);
        
        int nota1, nota2, nota3, nota4, nota5, nota6;
        float media;
        
        System.out.println("Introduce la nota de Programación");
        nota1 = entrada .nextInt();
        
        System.out.println("Introduce la nota de Marcas");
        nota2 = entrada2 .nextInt();
        
        System.out.println("Introduce la nota de Base de Datos");
        nota3 = entrada3 .nextInt();
        
        System.out.println("Introduce la nota de Entornos de Desarrollo");
        nota4 = entrada4 .nextInt();
        
        System.out.println("Introduce la nota de Sistemas Informaticos");
        nota5 = entrada5 .nextInt();
        
        System.out.println("Introduce la nota de FOL");
        nota6 = entrada6 .nextInt();
        
        media = (nota1+nota2+nota3+nota4+nota5+nota6)/6;
        System.out.println("Su nota media del curso es: "+ media);
        
    }
    
}
