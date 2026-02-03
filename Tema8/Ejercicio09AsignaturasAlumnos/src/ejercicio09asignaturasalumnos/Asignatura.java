/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09asignaturasalumnos;

/**
 *
 * @author alumno
 */
public class Asignatura {
    private String nombre;                      //Atributos
    private float nota;

    public Asignatura() {                       //Constructores
        this.nombre = "";
        this.nota = 0.0f;
    }
    
    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.nota = 0.0f;
    }
    
    public Asignatura(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {                 //Getters y setters
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override                                   //ToString
    public String toString() {
        return nombre + ": " + nota;
    }
    
    
}
