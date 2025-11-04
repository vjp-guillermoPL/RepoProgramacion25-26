/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10metodotablamultiplicar;

/**
 *
 * @author alumno
 */
public class TablaMultiplicar {
    public static void TablaMultiplicar(int num){
        int resultado;
        System.out.println("La tabla de multiplicar del "+ num +" es: ");
        for (int i = 0; i <= 10; i++) {
            resultado = num * i;
            System.out.println(num +" x "+ i +" = "+ resultado);
        }
    }
}
