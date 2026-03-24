/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07campannas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
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

    /**
     * Método para añadir una nueva donación a la campaña
     * 
     * @param d 
     */
    public void agregarDonacion(Donacion d){
        if(donaciones.add(d)){
            System.out.println("Donación añadida correctamente.");
        } else {
            System.out.println("Error: Esa donación ya existe.");
        }
    }
    
    /**
     * Método para mostrar el dinero total recaudado
     * 
     * @return el número total recaudado
     */
    public double totalRecaudado(){
        double total = 0;
        for(Donacion d : donaciones){
            total += d.getDonacion();
        }
        return total;
    }
    
    /**
     * Método para buscar donaciones por nombre de donante
     * 
     * @param nombre
     * @return donaciones de la persona a buscar
     */
    public List<Donacion> buscarPorDonante(String nombre){
        List<Donacion> lista = new ArrayList<>();
        for(Donacion d : donaciones){
            if(d.getDonador().equalsIgnoreCase(nombre)){
                lista.add(d);
            }
        }
        return lista;
    }
    
    /**
     * Método para mostrar donaciones ordenadas de mayor a menor
     * 
     * @return las donaciones ordenadas de mayor a menor
     */
    public List<Donacion> ordenadasMayorAMenor(){
        List<Donacion> lista = new ArrayList<>(donaciones);
        Collections.sort(lista, new Comparator<Donacion>(){
            @Override
            public int compare(Donacion d1, Donacion d2) {
                return Double.compare(d2.getDonacion(), d1.getDonacion());
            }
        });
        return lista;
    }
    
    @Override                                   //Sobreescribo los métodos equals y hashCode para buscar las campañas por nombre
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Campanna campanna = (Campanna) o;
        return Objects.equals(nombreCampanna, campanna.nombreCampanna);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreCampanna);
    }

    @Override                                                   //ToString
    public String toString() {
        return "En la campaña " + nombreCampanna + donaciones.toString();
    }
}
