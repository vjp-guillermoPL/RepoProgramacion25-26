/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09tulotero;

import java.time.LocalDate;

/**
 *
 * @author alumno
 */
public class Sorteo {

    private LocalDate fecha;                                //Atrivutos
    private int[] ganadores;

    public Sorteo(LocalDate fecha) {                        //Constructor
        this.fecha = fecha;
        this.ganadores = new int[4];
        for (int i = 0; i < ganadores.length; i++) {
            ganadores[i] = (int) (Math.random() * 100 + 1);
        }
    }

    public LocalDate getFecha() {                           //Getters y setters
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int[] getGanadores() {
        return ganadores;
    }

    public void setGanadores(int[] ganadores) {
        this.ganadores = ganadores;
    }

    @Override                                               //ToString
    public String toString() {  
        return String.format("Sorteo{fechaSorteo=%s, numerosGanadores=%s}",
                fecha, java.util.Arrays.toString(ganadores));
    }

}
