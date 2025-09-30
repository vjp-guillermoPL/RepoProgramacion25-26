/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiempo;

/**
 *
 * @author alumno
 */
public class Tiempo {
    final static int SEGUNDOSH = 3600;
    final static int SEGUNDOSM = 60;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo = 10000;
        int horas = tiempo / 3600;
        int minutos = (tiempo% SEGUNDOSH) / SEGUNDOSM;
        int segundos = tiempo % SEGUNDOSM;
        
        
        System.out.println("10.000 segundos hacen un total de: "+ horas +" horas, "+ minutos +" minutos y "+ segundos +" segundos");
    }
    
}
