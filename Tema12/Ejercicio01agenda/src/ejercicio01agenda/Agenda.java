/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01agenda;

/**
 *
 * @author alumno
 */
public class Agenda {
    private String nombre;                                      //Atributos
    private int edad;
    private int numeroMovil;
    
    public Agenda(){                                            //Constructores
        this.nombre = "";
        this.edad = 0;
        this.numeroMovil = 0;
    }

    public Agenda(String nombre, int edad, int numeroMovil) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroMovil = numeroMovil;
    }

    public String getNombre() {                                 //Getters y setters
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroMovil() {
        return numeroMovil;
    }

    public void setNumeroMovil(int numeroMovil) {
        this.numeroMovil = numeroMovil;
    }

    @Override                                                       //ToString
    public String toString() {
        return this.nombre +" tiene "+ this.edad +" años y su número telefónico es: "+ this.numeroMovil;
    }
}
