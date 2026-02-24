/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectora6;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ProyectoRa6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figuras[][] vitrina = new Figuras[3][3];
        
        Scanner entrada = new Scanner(System.in);
        int num;
        
        do {
            mostrarMenu();
            
            num = entrada.nextInt();
            switch (num) {
                case 1:
                    Figuras.rellenarVitrina(vitrina);
                    break;
                case 2:
                    Figuras.mostrarColeccion(vitrina);
                    break;
                case 3:
                    Figuras.mostrarMasValioso(vitrina);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción introducida incorrecta");
            }
        } while (num != 4);
        
        
        
    }
    
    public static void mostrarMenu(){
        System.out.println("MENÚ");
        System.out.println("1. Rellenar la vitrina de figuras");
        System.out.println("2. Mostrar todas las figuras de una colección determinada");
        System.out.println("3. Mostrar la figura más valiosa");
        System.out.println("4. Salir");
        System.out.println("------------------------------------------------------------");
    }

}
