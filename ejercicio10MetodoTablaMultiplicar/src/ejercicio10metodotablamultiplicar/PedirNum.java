/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10metodotablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PedirNum {
     public static int pedirNum(){
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        return num = entrada.nextInt();
    }
}
