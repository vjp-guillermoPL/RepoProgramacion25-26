/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09metodomenornummetodopedirnum;

/**
 *
 * @author alumno
 */
public class Ejercicio09MetodoMenorNumMetodoPedirNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        
        num1 = Utilidades.pedirNum();
        num2 = Utilidades.pedirNum();
        num3 = Utilidades.pedirNum();
        
        MenorNum.menorNum(num1, num2, num3);
    }
    
}
