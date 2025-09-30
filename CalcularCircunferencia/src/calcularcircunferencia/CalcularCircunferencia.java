/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularcircunferencia;

/**
 *
 * @author alumno
 */
public class CalcularCircunferencia {
        final static float PI = 3.14f;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float radio = 3.55f;
        float longitud;
        longitud = (2*PI) * radio;
        System.out.println("La longitud de una circunferemcia cuyo radio es "+ radio + " es "+ longitud);
    }
    
}
