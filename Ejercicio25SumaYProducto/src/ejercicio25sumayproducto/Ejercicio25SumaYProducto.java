/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25sumayproducto;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio25SumaYProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        int num1,num2,num3;
        int suma;
        int producto;
        
        System.out.println("Introduzca el primer numero");
        num1 = entrada .nextInt();
        
        System.out.println("Introduzca el segundo numero");
        num2 = entrada2 .nextInt();
        
        System.out.println("Introduzca el tercer numero");
        num3 = entrada3 .nextInt();
        
        suma = num1+num2+num3;
        producto =num1*num2*num3;
        
        System.out.println("La suma de los numeros introducidos es: "+ suma +" el producto de los numeros es: "+ producto);
    }
    
}
