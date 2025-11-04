/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06metodonotaalumno;

/**
 *
 * @author alumno
 */
public class notaAlumno {
    public static void notaAlumno(int nota){
        switch(nota){                                       
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Está suspenso");
                break;
            case 5:
            case 6:
                System.out.println("Su nota es bien");              
                break;
            case 7:
            case 8:
                System.out.println("Su nota es notable");           
                break;
            case 9:
            case 10:
                System.out.println("Su nota es sobresaliente");    
                break;
            default:
                System.out.println("Su nota no está entre 0 y 10");
        }
    }
}
