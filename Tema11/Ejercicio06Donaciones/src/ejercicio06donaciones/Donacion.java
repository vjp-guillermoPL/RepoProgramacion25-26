/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06donaciones;

/**
 *
 * @author alumno
 */
public class Donacion {
    private String donador;
    private int donacion;
    
    public Donacion(){
        this.donador = "";
        this.donacion = 0;
    }

    public Donacion(String donador, int donacion) {
        this.donador = donador;
        this.donacion = donacion;
    }

    public String getDonador() {
        return donador;
    }

    public void setDonador(String donador) {
        this.donador = donador;
    }

    public int getDonacion() {
        return donacion;
    }

    public void setDonacion(int donacion) {
        this.donacion = donacion;
    }

    @Override
    public String toString() {
        return "El donador "+ this.donador +" donó "+ this.donacion;
    }
}
