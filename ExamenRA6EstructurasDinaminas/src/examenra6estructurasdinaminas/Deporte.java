/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenra6estructurasdinaminas;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Deporte {
    private String nombre;                                      //Atributos
    private HashSet equipos;
    
    public Deporte(){                                           //Constructores
        this.nombre = "";
        this.equipos = new HashSet<Equipos>();
    }

    public Deporte(String nombre, Set equipos) {
        this.nombre = nombre;
        this.equipos = new HashSet<Equipos>();
    }

    public String getNombre() {                                 //Getters y setters
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet getEquipos() {
        return equipos;
    }

    public void setEquipos(HashSet equipos) {
        this.equipos = equipos;
    }

    @Override                                                   //ToString
    public String toString() {
        return "Los equipos que juegan "+ this.nombre +" son: " +this.equipos.toString();
    }
}
