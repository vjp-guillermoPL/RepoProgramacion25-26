/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01agenda;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Agenda> agenda = new ArrayList<>();
        
        menu(agenda);
    }
    
    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu(){
        System.out.println("Elija una de las siguientes opciones");
        System.out.println("1. Añadir contactos a la agenda");
        System.out.println("2. Visualizar la lista de contactos");
        System.out.println("3. Eliminar un contacto de la lista");
        System.out.println("4. Mostrar los contactos ordenados por edad");
        System.out.println("5. Salir");
        System.out.println("-----------------------------------------------");
    }
    
    /**
     * Método que pide un número al usuario
     * 
     * @return el número que da el usuario
     */
    public static int pedirNum(){
        Scanner entrada = new Scanner(System.in);
        
        return entrada.nextInt();
    }
    
    /**
     * Método que pide un nombre al usuario
     * 
     * @return el nombre que da el usuario
     */
    public static String pedirNombre(){
        Scanner entrada = new Scanner(System.in);
        
        return entrada.nextLine();
    }
    
    public static void menu(ArrayList<Agenda> agenda)throws InputMismatchException{
        int num;
        
        mostrarMenu();
        num = pedirNum();
        
        do {
            switch (num) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5: System.out.println("Saliendo...");
                    break;
                default: System.out.println("Introduzca un número entre el 1 y el 5");
            }
        } while (num!=5);
    }
    
    public static void meterContacto(ArrayList<Agenda> agenda){
        
    }
    
}
