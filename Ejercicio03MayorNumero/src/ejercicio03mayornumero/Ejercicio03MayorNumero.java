/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03mayornumero;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio03MayorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;                           //declaro las variables
        Scanner entrada = new Scanner(System.in);       //Creo el Scanner
        
        System.out.println("Introduzca un número");     //Pido por pantalla al usuario los tres números
        num1 = entrada.nextInt();
        
        System.out.println("Introduzca un número");
        num2 = entrada.nextInt();
        
        System.out.println("Introduzca un número");
        num3 = entrada.nextInt();
        
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El número mayor es: "+ num1);       //Si el número mayor es el primero, lo impromo por pantalla
        } else if(num2 >= num1 && num2 >= num3){
            System.out.println("El número mayor es: "+ num2);       //Si el número mayor es el segundo, lo impromo por pantalla
        } else {
            System.out.println("El número mayor es: "+ num3);       ////Si el número mayor es el tercero, lo impromo por pantalla
        }
        
    }
    
}
