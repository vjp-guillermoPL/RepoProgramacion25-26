/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Utilidades {

    //Método que pide un número al usuario
    public static int pedirNumero() {
        int num = -1;
        do {
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Escribe un número: ");
            num = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Introduciste un dato erroneo");
        }
        } while (num != -1);
        return num;
    }
}
