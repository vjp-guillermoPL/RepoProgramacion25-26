/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Calculadora {

    /**
     * Método que suma dos números pasados por parámetros
     *
     * @param num1
     * @param num2
     *
     * @return la suma de los dos números
     */
    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Método que resta dos números pasados por parámetros
     *
     * @param num1
     * @param num2
     *
     * @return la resta de los dos números
     */
    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Método que multiplica dos números pasados por parámetros
     *
     * @param num1
     * @param num2
     *
     * @return la multiplicación de los dos números
     */
    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Método que dividen dos números pasados por parámetros
     *
     * @param num1
     * @param num2
     *
     * @return la división de los dos números
     */
    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    /**
     * Método que hace la raiz cuadrada del número que pasamos por parametro
     *
     * @param num1
     *
     * @return la raiz cuadrada del número
     */
    public static double raizCuadrada(int num1) {
        return Math.sqrt(num1);
    }
    
    /**
     * Método que devuelve el cuadrado de un número
     * 
     * @param num1
     * @return el cuadrado del número
     */
    public static double cuadrado(double num1) {
        return Math.pow(num1, 2);
    }
    
    /**
     * Método que devuelve el cubo de un número
     * 
     * @param num1
     * @return el cubo del número
     */
    public static double cubo(double num1) {
        return Math.pow(num1, 3);
    }
    
    /**
     * Método que devuelve el logaritmo de un número
     * 
     * @param num1
     * @return el logaritmo de un número
     */
    public static double logaritmo(double num1) {
        return Math.log(num1);
    }
    
    
    public static int numMax(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static int numMin(int num1, int num2) {
        return Math.min(num1, num2);
    }

    public static double redondeoAlza(double num1) {
        return Math.ceil(num1);
    }

    public static double redondeoBaja(double num1) {
        return Math.floor(num1);
    }

}
