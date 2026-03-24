/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07campannas;

/**
 *
 * @author alumno
 */
public class Donacion {
    private String donador;                             //Atributos
    private double donacion;
    
    public Donacion(){                                  //Constructores
        this.donador = "";
        this.donacion = 0;
    }

    public Donacion(String donador, double donacion) {
        this.donador = donador;
        this.donacion = donacion;
    }

    public String getDonador() {                        //Getters y setters
        return donador;
    }

    public void setDonador(String donador) {
        this.donador = donador;
    }

    public double getDonacion() {
        return donacion;
    }

    public void setDonacion(double donacion) {
        this.donacion = donacion;
    }

    @Override                                           //ToString
    public String toString() {
        return "El donador "+ this.donador +" donó "+ this.donacion;
    }
}
