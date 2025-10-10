/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06notaalumno;

import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio06NotaAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int nota;                                            //Declaro la variable
       Scanner entrada = new Scanner(System.in);            //Creo el Scanner
       
        System.out.println("Escribe la nota de un alumno");     //Pido por pantalla al usuario la nota
        nota = entrada.nextInt();
        
        switch(nota){                                       //En caso de que la nota esté entre 0 y 4 es suspenso
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Está suspenso");
                break;
            case 5:
            case 6:
                System.out.println("Su nota es bien");              //En caso de que la nota esté entre 5 y 6 es bien
                break;
            case 7:
            case 8:
                System.out.println("Su nota es notable");           //En caso de que la nota esté entre 7 y 8 es notable
                break;
            case 9:
            case 10:
                System.out.println("Su nota es sobresaliente");     //En caso de que la nota esté entre 9 y 10 es sobresaliente
                break;
            default:
                System.out.println("Su nota no está entre 0 y 10");         // si el número dado no está entre 0 y 10, es incorrecto
        }
    }
    
}
