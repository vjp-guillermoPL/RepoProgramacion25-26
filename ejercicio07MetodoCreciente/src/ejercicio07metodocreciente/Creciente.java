/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07metodocreciente;

/**
 *
 * @author alumno
 */
public class Creciente {
    
    /**
     * Método que ordena los números de menor a mayor
     * 
     * @param num1
     * @param num2
     * @param num3
     * @param num4 
     */
    public static void creciente(int num1, int num2, int num3, int num4){
        int auxiliar;
        for (int i = 0; i < 3; i++) {
            if (num1 > num2) {
                auxiliar = num1;
                num1 = num2;
                num2 = auxiliar;
            }
            if (num2 > num3) {
                auxiliar = num2;
                num2 = num3;
                num3 = auxiliar;
            }
            if (num3 > num4) {
                auxiliar = num3;
                num3 = num4;
                num4 = auxiliar;
            }
        }
        System.out.println("Los números en orden creciente son: "+ num1 +", "+ num2 +", "+ num3 +" y "+ num4);
    }
}
