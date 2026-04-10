/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08sedes;

import java.util.TreeSet;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Ciudades {
    private String nombre;
    private Set<Sedes> sedes;
    
    public Ciudades(){
        this.nombre = "";
        this.sedes = new TreeSet<>();
    }

    public Ciudades(String nombre) {
        this.nombre = nombre;
        this.sedes = new TreeSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Sedes> getSedes() {
        return sedes;
    }

    public void setSedes(Set<Sedes> sedes) {
        this.sedes = sedes;
    }

    @Override
    public String toString() {
        return this.nombre +" tiene "+ this.sedes.toString();
    }
}
