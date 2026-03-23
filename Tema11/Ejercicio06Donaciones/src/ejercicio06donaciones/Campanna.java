/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06donaciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Campanna {

    Set<Donacion> donaciones;                                     //Atributos
    String nombreCampanna;

    public Campanna() {                                          //Constructores
        this.donaciones = new LinkedHashSet<>();
        this.nombreCampanna = "";
    }

    public Campanna(String nombreCampanna) {
        this.donaciones = new LinkedHashSet<>();
        this.nombreCampanna = nombreCampanna;
    }

    public Set<Donacion> getDonaciones() {                      //Getters y setters
        return donaciones;
    }

    public void setDonaciones(Set<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    public String getNombreCampanna() {
        return nombreCampanna;
    }

    public void setNombreCampanna(String nombreCampanna) {
        this.nombreCampanna = nombreCampanna;
    }

    public void agregarDonacion(Donacion d){
        if(donaciones.add(d)){
            System.out.println("Donación añadida correctamente.");
        } else {
            System.out.println("Error: Esa donación ya existe (duplicada).");
        }
    }
    
    public double getTotalRecaudado(){
        double total = 0;
        for(Donacion d : donaciones){
            total += d.getDonacion();
        }
        return total;
    }
    
    public List<Donacion> buscarPorDonante(String nombre){
        List<Donacion> lista = new ArrayList<>();
        for(Donacion d : donaciones){
            // Ignoramos mayúsculas/minúsculas en la búsqueda
            if(d.getDonador().equalsIgnoreCase(nombre)){
                lista.add(d);
            }
        }
        return lista;
    }
    
    // Devuelve una lista ordenada de MAYOR a MENOR cantidad
    public List<Donacion> getOrdenadasMayorAMenor(){
        List<Donacion> lista = new ArrayList<>(donaciones);
        // Usamos Collections.sort (NO burbuja) como pide el ejercicio
        Collections.sort(lista, new Comparator<Donacion>(){
            @Override
            public int compare(Donacion d1, Donacion d2) {
                // Restamos d2 - d1 para que sea descendente
                return Double.compare(d2.getDonacion(), d1.getDonacion());
            }
        });
        return lista;
    }

    @Override                                                   //ToString
    public String toString() {
        return "En la campaña " + nombreCampanna + donaciones.toString();
    }
}
