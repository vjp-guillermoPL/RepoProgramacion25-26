/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08sedes;

import java.util.LinkedHashSet;
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
        this.sedes = new LinkedHashSet<>();
    }

    public Ciudades(String nombre, Set<Sedes> sedes) {
        this.nombre = nombre;
        this.sedes = new LinkedHashSet<>();
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
