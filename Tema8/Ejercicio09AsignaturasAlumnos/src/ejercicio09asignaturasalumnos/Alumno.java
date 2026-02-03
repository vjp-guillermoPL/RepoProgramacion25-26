/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09asignaturasalumnos;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Alumno {
    private String nombre;                          //Atributos
    private Asignatura[] notas;
    private final String[] NOMBRE_ASIGNATURAS = {"Lengua", "Mates", "Historia", "Física"};
    
    public Alumno() {                               //Constructores
        this.nombre = "";
        this.notas = new Asignatura[4];
        
        for(int i = 0; i < notas.length; i++) {
            notas[i] = new Asignatura(NOMBRE_ASIGNATURAS[i]);
        }                
    }
    
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new Asignatura[4];
        
        for(int i = 0; i < notas.length; i++) {
            notas[i] = new Asignatura(NOMBRE_ASIGNATURAS[i]);
        }
    }

    public Alumno(String nombre, Asignatura[] notas) {
        this.nombre = nombre;
        this.notas = notas;
        
        for(int i = 0; i < notas.length; i++) {
            notas[i] = new Asignatura(NOMBRE_ASIGNATURAS[i]);
        }
    }

    public String getNombre() {                     //Getters y setters
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getNotas() {
        return notas;
    }

    public void setNotas(Asignatura[] notas) {
        this.notas = notas;
    }
    
    /**
     * Método que pide la nota
     * @return la nota
     */
    public int pedirNota(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nota: ");
        return entrada.nextInt();
    }
    
    /**
     * Método que rellena las notas
     */
    public void rellenarNotas(){
        for(int i = 0; i < notas.length; i++){
            notas[i].setNota(pedirNota());
        }
    }
    
    /**
     * Método que muestra las notas
     */
    public void mostrar(){
        for(Asignatura a : notas){
            System.out.println(a);
        }
    }
    
    /**
     * Método que calcula la nota media
     * @return la media
     */
    public float calcularMedia(){
        float media = 0;
        for(Asignatura asignatura : notas){
            media += asignatura.getNota();
        }
        
        return media / notas.length;
    }

    @Override                                       //ToString
    public String toString() {
        return nombre + "\n" + Arrays.toString(notas);
    }
    
    
}
