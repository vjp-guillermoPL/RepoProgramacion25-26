/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios13y14alumnosarrayobjetos;

/**
 *
 * @author alumno
 */
public class Alumno {
    private String alumno;
    private int edad;
    private int notaMedia;
    
    public Alumno(){
        this.alumno = "";
        this.edad = 0;
        this.notaMedia = 0;
    }

    public Alumno(String alumno, int edad, int notaMedia) {
        this.alumno = alumno;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(int notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "Alumno{" + "alumno=" + alumno + ", edad=" + edad + ", notaMedia=" + notaMedia + '}';
    }
}
