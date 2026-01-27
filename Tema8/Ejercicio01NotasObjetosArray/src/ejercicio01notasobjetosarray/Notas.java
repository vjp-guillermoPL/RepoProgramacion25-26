/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01notasobjetosarray;

/**
 *
 * @author alumno
 */
public class Notas {
    private String asignatura;              //Creo los atributos
    private float nota;
                                    //Constructor por defecto
    public Notas(){
    asignatura = "";
    nota = 0;
    }
                                    //Constructor parametrizado
    public Notas(String asignatura, float nota) {
        this.asignatura = asignatura;
        this.nota = nota;
    }
                                    //Getters y setters
    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
                                    //ToString
    @Override
    public String toString() {
        return "Notas{" + "asignatura=" + asignatura + ", nota=" + nota + '}';
    }
    
    
}
