/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Utilidades {
    //Método que pide un número al usuario
    public static int pedirNumero(){
    Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        return entrada.nextInt();
    }
}
