/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06donaciones;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Campanna {
    Set<String> donaciones = new HashSet<>();
    String nombreCampanna;

    public Campanna(String nombreCampanna) {
        this.nombreCampanna = nombreCampanna;
    }

    public Set<String> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(Set<String> donaciones) {
        this.donaciones = donaciones;
    }

    public String getNombreCampanna() {
        return nombreCampanna;
    }

    public void setNombreCampanna(String nombreCampanna) {
        this.nombreCampanna = nombreCampanna;
    }

    @Override
    public String toString() {
        return "Campanna{" + "donaciones=" + donaciones + ", nombreCampanna=" + nombreCampanna + '}';
    }
}
