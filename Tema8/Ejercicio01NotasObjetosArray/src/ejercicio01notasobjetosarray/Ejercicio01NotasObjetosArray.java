/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01notasobjetosarray;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01NotasObjetosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notas alumno[] = new Notas[6];                  //Creo el array
        float media;                                    //Creo la variable

        for (int i = 0; i < alumno.length; i++) {       //Instancio los objetos para poder usarlos
            alumno[i] = new Notas();
        }

        alumno[0].setAsignatura("Programación");        //Pongo a cada asignatura el nombre adecuado
        alumno[1].setAsignatura("Lenguaje de Marcas");
        alumno[2].setAsignatura("Base de datos");
        alumno[3].setAsignatura("Entornos de Desarrollo");
        alumno[4].setAsignatura("Sistemas informáticos");
        alumno[5].setAsignatura("Inglés");

        pedirNota(alumno);                              //Llamo al método que pide las notas
        mostrarNotas(alumno);                           //Llamo al método que muestre las notas
        media = calcularMedia(alumno);                  //Llamo el método que calcula la media y la guardo en la variable
        
        System.out.println("La nota media es: "+ media);        //Muestro por pantalla la nota media
    }

    /**
     * Método que pide la nota de cada asignatura y la mete al array
     *
     * @param alumno
     */
    public static void pedirNota(Notas alumno[]) {
        Scanner entrada = new Scanner(System.in);
        float num;
        for (int i = 0; i < alumno.length; i++) {
            System.out.println("Introduce tu nota de " + alumno[i].getAsignatura());
            num = entrada.nextInt();
            alumno[i].setNota(num);
        }
    }

    /**
     * Método que muestra las notas de cada asignatura
     *
     * @param alumno
     */
    public static void mostrarNotas(Notas alumno[]) {
        for (int i = 0; i < alumno.length; i++) {
            System.out.println("La nota de " + alumno[i].getAsignatura() + " es: " + alumno[i].getNota());
        }
    }
    
    /**
     * Método que calcula la nota media y la devuelve
     * @param alumno
     * @return la nota media
     */
    public static float calcularMedia(Notas alumno[]){
        float media = 0;
        for (int i = 0; i < alumno.length; i++){
            media += alumno[i].getNota();
        }
        media = media/alumno.length;
        return media;
    }

}
