/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03autobuses;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alumno
 */
public class Autobus {
    private String matricula;                               //Atributos
    private HashMap<String, String> conductores;

    public Autobus() {                                      //Constructores
        this.matricula = "";
        this.conductores = new HashMap<>(); 
    }

    public Autobus(String matricula, HashMap<String, String> conductores) {
        this.matricula = matricula;
        this.conductores = new HashMap<>();
    }

    public String getMatricula() {                          //Getters y setters
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public HashMap<String, String> getConductores() {
        return conductores;
    }

    public void setConductores(HashMap<String, String> conductores) {
        this.conductores = conductores;
    }
    
    /**
     * Método que añade conductores
     * 
     * @param dni
     * @param nombre 
     */
    public void meterConductor(String dni, String nombre){
        this.conductores.put(dni, nombre);
    }
    
    /**
     * Método que comprueba el número de conductores
     * 
     * @return cantidad de conductores
     */
    public int numConductores() {
        return this.conductores.size();
    }
    

    @Override                                               //ToString
    public String toString() {
        return "El autobus con matrícula "+ this.matricula +
                " tiene asignados a los siguientes conductores: "+ this.conductores;
    }
}
