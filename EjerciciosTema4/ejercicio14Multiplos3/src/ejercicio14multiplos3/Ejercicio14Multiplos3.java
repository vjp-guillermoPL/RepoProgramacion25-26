/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14multiplos3;

/**
 *
 * @author alumno
 */
public class Ejercicio14Multiplos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, numFin;                        //Creo las variables
        num = pedirNum.pedirNum();              //Llamo al método que pide un número y lo guardo en la variable
        numFin = pedirNum.mayor0(num);          //Llamo al método que comprueba si el número es mayor que cero y lo guardo en la variable
        pedirNum.resultado(numFin);             //Llamo al método que da el resultado final
    }
    
}
