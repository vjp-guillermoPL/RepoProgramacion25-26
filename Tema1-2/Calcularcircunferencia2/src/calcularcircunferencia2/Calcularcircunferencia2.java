/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularcircunferencia2;

/**
 *
 * @author alumno
 */
public class Calcularcircunferencia2 {
final static float PI = 3.14f;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float radio = 5.2f;
        float area;
        area = PI * (radio * radio);
        
        System.out.println("La area de una circunferemcia cuyo radio es "+ radio + " es "+ area);
    }
    
}
