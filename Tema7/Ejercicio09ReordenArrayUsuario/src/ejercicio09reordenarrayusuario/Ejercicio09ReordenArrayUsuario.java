/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09reordenarrayusuario;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio09ReordenArrayUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;                            //Creo la variable
        
        num = pedirNum();                   //Llamo a el método que pide el número y lo guardo en la variable
        int largo=contarNum(num);           //Llamo a el método que mide el largo y lo guardo en la variable
        int [] reorden = new int [largo];   //Creo el array con el largo que midió el método
        
        ordenArray(reorden, num);           //Llamo al método que ordena el array
        mostrarArray(reorden);              //Llamo al método que muestra el array
    }
    
    /**
     * Pido el número al usuario
     * @return el número que da el ususario
     */
    public static int pedirNum() {
        int recibido;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un número");
        recibido = entrada.nextInt();
        
        return recibido;
    }
    
    /**
     * Método que mide el largo del número introducido
     * @param num
     * @return el largo del número introducido
     */
    public static int contarNum(int num){
        int largo;
        largo = String.valueOf(num).length();
        
        return largo;
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
