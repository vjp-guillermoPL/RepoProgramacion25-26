/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios13y14alumnosarrayobjetos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicios13Y14AlumnosArrayObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;                                                //Creo la variable
        Alumno estudiante[] = new Alumno[5];                    //Creo el array
        
        Scanner entrada = new Scanner(System.in);
        
        do {                                                    //Menú que se repite hasta que el usuario elija salir
            System.out.println("Elija una opción entre 1 y 6");
            num = entrada.nextInt();
            switch (num) {
                case 1:
                    rellenarAlumno(estudiante);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("La opción elegida no es válida");
            }
            System.out.println("--------------------------------------------------");
        } while (num != 6);
    }
    
    /**
     * Método que pide un dato de tipo String
     * @return el dato pedido al usuario
     */
    public static String pedirString(){
        Scanner entrada = new Scanner(System.in);
        String dato = entrada.next();
        
        return dato;
    }
    
    /**
     * Método que pide un número
     * @return el dato pedido al usuario
     */
    public static int pedirNum(){
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        
        return num;
    }
    
    public static void rellenarAlumno(Alumno estudiante[]){
        int num = pedirNum();
        System.out.println("Introduzca la posición que quiera rellenar del 0 al 4");
        if (estudiante[num] == null) {
            estudiante[num] = new Alumno(pedirString(),pedirNum(),pedirNum());
        }
    }
    
}
