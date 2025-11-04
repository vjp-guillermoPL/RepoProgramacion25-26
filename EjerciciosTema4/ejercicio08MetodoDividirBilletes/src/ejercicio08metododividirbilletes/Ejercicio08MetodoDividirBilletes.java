/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08metododividirbilletes;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio08MetodoDividirBilletes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dinero;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce una cantidad de dinero");
        dinero = entrada .nextInt();
        
        DividirBilletes.dividirBilletes(dinero);
    }
    
}
