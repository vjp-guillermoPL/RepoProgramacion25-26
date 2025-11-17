/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenmenuespacial;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Metodos {
    
    /**
     * Metodo que pide un número al usuario comprobando que no se introduce un dato no válido
     * @return el número que le dió el usuario
     */
    public static int pedirNumero() {
        int num = -1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número");
        do {
            try {
            num = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Caracter no válido");
            entrada.next();
            System.out.println("Introduce un número");
        }
        } while (num == -1);
        
        
        return num;
    }
    
    /**
     * Método que busca el primer número mayor que 1 que divida el número que pasó el usuario
     * @param num 
     */
    public static void analizarSennalRecibida(int num) {
        int i = 2;
        while (num % i != 0) {            
            i ++;
        }
        System.out.println("El primer patrón detectable dentro de la señal es: "+ i);
    }
    
    /**
     * Método que ordena los tres números que pasó el usuario de menor a mayor
     */
    public static void ajustarPotenciaMotores(){
        int num1, num2, num3;
        int auxiliar;
        
        num1 = pedirNumero();
        num2 = pedirNumero();
        num3 = pedirNumero();
        
        do {
            if (num1 < num2){
                auxiliar = num2;
                num2 = num1;
                num1 = auxiliar;
            }
            if (num2 < num3) {
                auxiliar = num3;
                num3 = num2;
                num2 = auxiliar;
            }
        } while (num1 < num2 || num2 < num3);
        System.out.println("Los números de menor a mayor son: "+ num3 +", "+ num2 +", "+ num1);
    }
    
    /**
     * Método que calcula el volumen en base al número que introduzca el usuario
     * @param num
     * @return volumen calculado
     */
    public static double calcularVolumenPlaneta(int num) {
        double pi = Math.PI;
        double resultado = 4/3 * pi * (num*num*num);
        return resultado;
    }
    
}
