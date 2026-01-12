/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08reordenarray;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio08ReordenArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] reorden = new int [5];           //Creo el array
        int num;                                //Creo la variable
        
        num=pedirNum();                         //Llamo al método que pide un número y lo guardo en la variable
        ordenArray(reorden, num);               //Llamo al método que ordena el array
        mostrarArray(reorden);                  //Llamo al método que muestra el array
    }
    
    /**
     * Pido el número de cinco cifras al usuario
     * @return el número que da el ususario
     */
    public static int pedirNum() {
        int recibido;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un número de 5 cifras");
        recibido = entrada.nextInt();
        
        return recibido;
    }
    
    /**
     * Usa un bucle for para separar el número en cifras e ir metiendolo al array en orden inverso
     * @param reorden
     * @param num 
     */
    public static void ordenArray(int reorden[], int num) {
        for (int i = 0; i < reorden.length ; i++) {
            reorden[i] = num % 10;
            num = num/10;
        }
    }
    
    /**
     * Muestra los valores del array
     * @param reorden 
     */
    public static void mostrarArray(int reorden[]){
        for (int i = 0; i < reorden.length; i++) {
            System.out.println("El contenido del array número "+ i +" es: "+ reorden[i]);
            }
    }
    
}
