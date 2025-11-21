/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contarcartera;

/**
 *
 * @author alumno
 */
public class ContarCartera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dinero = 130;
        int billetes50 = dinero/50;
        int billetes10 = (dinero % 50) / 10;
        
        System.out.println(dinero +" euros hacen un total de: "+ billetes50 +" billetes de 50 euros y "+ billetes10 +" billetes de 10 euros");
    }
    
}
