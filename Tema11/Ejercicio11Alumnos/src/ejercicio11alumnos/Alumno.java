/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11alumnos;

/**
 *
 * @author alumno
 */
public class Alumno implements Comparable<Alumno>{
   
    private String dni;                                 //Atributos
    private int numExpediente;
    private float notaMedia;
    

    public Alumno() {                                   //Constructores
        this.dni = "";
        this.numExpediente = 0;
        this.notaMedia = 0f;
    }
    
    public Alumno(String dni, int numExpediente, float notaMedia) {
        this.dni = dni;
        this.numExpediente = numExpediente;
        this.notaMedia = notaMedia;
    }

    public String getDni() {                            //Getters y setters
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(int numExpediente) {
        this.numExpediente = numExpediente;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override                                           //ToString
    public String toString() {
        return "Alumno | " + " DNI: " + dni + " | Número Expediente: " 
                + numExpediente + " | Nota Media: " + notaMedia;
    }
    
    @Override                                           //CompareTo
    public int compareTo(Alumno otro){
        return this.numExpediente - otro.numExpediente;
    }
}
