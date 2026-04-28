/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio21serializacion;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Asignaturas implements Serializable{
    private String nombre;                          //Atributos
    private int nota;
    
    public Asignaturas() {                          //Constructores
        this.nombre = "";
        this.nota = 0;
    }
    
    public Asignaturas(String nombre) {
        this.nombre = nombre;
        this.nota = 0;
    }

    public String getNombre() {                     //Getters y setters
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    /**
     * Método que mete la nota a la asignatura
     */
    public void meterNota(){
        boolean valido = false;
        int VarNota;
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.println("Introduce un número entero entre 0 y 10");
            VarNota = entrada.nextInt();
            if (VarNota <= 10 && VarNota >= 0) {
                valido = true;
            } else {
                System.out.println("Nota introducida inválida");
            }
        } while (!valido);
    }

    @Override                                       //ToString
    public String toString() {
        return "Asignaturas{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
}
