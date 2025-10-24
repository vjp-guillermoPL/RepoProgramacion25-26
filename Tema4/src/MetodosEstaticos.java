/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Utilidades.Utilidades;
/**
 *
 * @author alumno
 */
public class MetodosEstaticos {

    //Método que imprime un saludo -> tipo void
    public static void saludo() {
        System.out.println("Hola mundo con Java");
    }

    //Método que imprime un mensaje con un dato que recibe por parámetro -> tipo void
    public static void saludoConParametro(int num) {
        System.out.println("Hola mundo " + num);
    }

    //Método que muestra la suma de dos números que recibe por parámetro -> tipo void
    public static void suma(int num1, int num2) {
        System.out.println("La suma de "+ num1 +" + "+ num2 +" = "+ (num1+num2));
    }

    //Método que devuelve la suma de dos números que recibe por parámetro -> tipo int
    public static int sumaQueDevuelveElResultado(int num1, int num2){
        return num1 + num2;
    }
    
    //Método que devuelve true si la contraseña que pasamos por parámetro es correcta -> tipo boolean
    
    public static void main(String[] args) {
        int num1;
        int num2;
        double resultado;

        //Llamamos a los métodos para que se ejecuten al lanzar el programa.
        //saludo();
        //saludoConParametro(6);
        //suma(num1, num2);
        //sumaQueDevuelveElResultado(num1, num2);
        //System.out.println(sumaQueDevuelveElResultado(num1, num2));
        
        
        //Llamamos a métodos estáticos de otra clase
        //System.out.println(Calculadora.suma(num1, num2));
        //System.out.println(Calculadora.resta(num1, num2));

        //Llamamos a un método estático de una clase de otro paquete (Debemos importar el paquete)
        //Utilidades.pedirNumero();
        
        //Creamos una calculadora
        //1. Pedimos dos números
        num1 = Utilidades.pedirNumero();
        num2 = Utilidades.pedirNumero();
        
        System.out.println(num1 +" - "+ num2);
        
        //2. Llamamos a los métodos, guardamos el resultado en una variable  y mostramos dicha variable
        try {
        resultado = Calculadora.suma(num1, num2);
        System.out.println(num1 +" + "+ num2 +" = "+ resultado);
        
        resultado = Calculadora.resta(num1, num2);
        System.out.println(num1 +" - "+ num2 +" = "+ resultado);
        
        resultado = Calculadora.multiplicacion(num1, num2);
        System.out.println(num1 +" * "+ num2 +" = "+ resultado);
        
        resultado = Calculadora.division(num1, num2);
        System.out.println(num1 +" / "+ num2 +" = "+ resultado);
        
        resultado = Calculadora.raizCuadrada(num1);
        System.out.println("Raiz cuadrada de "+ num1 +" = "+ resultado);
        } catch (ArithmeticException e) {
            System.out.println("Ha sucedido una excepción aritmetica");
        } 
    }
}
