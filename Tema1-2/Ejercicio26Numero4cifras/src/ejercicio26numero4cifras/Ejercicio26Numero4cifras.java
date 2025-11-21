/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26numero4cifras;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio26Numero4cifras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);       //Creo el Scanner
        int num4c;                                      //Declaro las variables
        int cifra1,cifra2,cifra3,cifra4;
        
        System.out.println("Introduce un numero de cuatro cifras");     //Pido al usuario un número de cuatro cifras
        num4c = entrada .nextInt();
        
        cifra1 = num4c/1000;                            //Divido el número en cada una de sus cifras y las imprimo por pantalla
        cifra2 = (num4c/100) % 10;
        cifra3 = (num4c/10) % 10;
        cifra4 = num4c % 10;
        
        System.out.println("La primera cifra es: "+ cifra1 +" la segunda cifra es: "+ cifra2 +" la tercera cifra es: "+ cifra3 +" y la cuarta cifra es: "+ cifra4);
    }
    
}
