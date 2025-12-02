/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01calculadora;

/**
 *
 * @author alumno
 */
public class Ejercicio01Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Suma suma1 = new Suma(5, 7);            //Creo el objeto suma1 de Suma
        Multiplicacion multiplicacion1 = new Multiplicacion(7, 5);      //Creo el objeto multiplicacion1 de Multiplicacion
        Potencia potencia1 = new Potencia(3, 15);       //Creo el objeto potencia1 de Potencia
        
        suma1.realizarOperacion();          //Uso el método realizarOperacion() de cada objeto
        multiplicacion1.realizarOperacion();
        potencia1.realizarOperacion();
        
        
        //Polimorfismo
        Calculadora calculo;            //Creo el objeto con polimorfismo
        calculo = new Suma(3, 4);       
        calculo.realizarOperacion();    //Uso los métodos de cada una de las subclases de Calculadora
        calculo = new Multiplicacion(3, 4);
        calculo.realizarOperacion();
        calculo = new Potencia(3, 4);
        calculo.realizarOperacion();
        
    }
    
}
