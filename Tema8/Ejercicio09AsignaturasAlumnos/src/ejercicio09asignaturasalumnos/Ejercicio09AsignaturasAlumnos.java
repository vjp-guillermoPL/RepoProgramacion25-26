/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09asignaturasalumnos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio09AsignaturasAlumnos {

    /**
     * Método que rellena todos los datos de cada alumno
     * @param alumnos 
     */
    public static void rellenar(Alumno[] alumnos){
        String[] nombreAlumnos = {"Pepe","Juan","Marta"};
        for(int i = 0; i < alumnos.length; i++){
            alumnos[i] = new Alumno(nombreAlumnos[i]);
            alumnos[i].rellenarNotas();
        }
    }
    
    /**
     * Método que muestra todos los datos de cada alumno
     * @param alumnos 
     */
    public static void mostrar(Alumno[] alumnos){
        for(Alumno alumno : alumnos){
            System.out.println(alumno);
        }
    }
    
    /**
     * Método que muestra al mejor alumno en base a su media
     * @param alumnos 
     */
    public static void mejorAlumno(Alumno[] alumnos){
        Alumno mejorAlumno = new Alumno();
        float mejorMedia = 0;
        
        for(int i = 0; i < alumnos.length; i++){
            if(alumnos[i].calcularMedia() > mejorMedia){
                mejorMedia = alumnos[i].calcularMedia();
                mejorAlumno = alumnos[i];
            }
        }
        
        System.out.println("El mejor alumno es "+ mejorAlumno +" con una media de "+ mejorMedia);
    }
    
    /**
     * Método que muestra al peor alumno en base a su media
     * @param alumnos 
     */
    public static void peorAlumno(Alumno[] alumnos){
        Alumno peorAlumno = new Alumno();
        float peorMedia = 0;
        
        for(int i = 0; i < alumnos.length; i++){
            if(alumnos[i].calcularMedia() < peorMedia){
                peorMedia = alumnos[i].calcularMedia();
                peorAlumno = alumnos[i];
            }
        }
        
        System.out.println("El mejor alumno es "+ peorAlumno +" con una media de "+ peorMedia);
    }
    
    /**
     * Método que muestra la asignatura más dificil en base a su número de suspensos
     * @param alumnos 
     */
    public static void asignaturaMasDificil(Alumno[] alumnos){
        for(int j = 0; j < alumnos[0].getNotas().length; j++){
            System.out.println(alumnos[0].getNotas()[j].getNombre());
            for(int i = 0; i < alumnos.length; i++){
                if () {
                    
                }
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        int num;                                                //Creo la variable
        Alumno[] alumnos = new Alumno[3];                       //Creo el array
        
        Scanner entrada = new Scanner(System.in);
        
        do {                                                    //Menú que se repite hasta que el usuario elija salir
            System.out.println("Elija una opción entre 1 y 6");
            num = entrada.nextInt();
            switch (num) {
                case 1:
                    rellenar(alumnos);
                    break;
                case 2:
                    mostrar(alumnos);
                    break;
                case 3:
                    mejorAlumno(alumnos);
                    break;
                case 4:
                    peorAlumno(alumnos);
                    break;
                case 5:
                    asignaturaMasDificil(alumnos);
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
    
}
