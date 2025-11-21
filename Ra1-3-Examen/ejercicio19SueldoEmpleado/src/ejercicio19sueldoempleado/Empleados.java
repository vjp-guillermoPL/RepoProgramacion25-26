/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19sueldoempleado;

/**
 *
 * @author alumno
 */
public class Empleados {
    private String nombre;              //Creo los atributos
    private int horasTrabajadas;
    private int tarifaPorHora;
    
    public Empleados(){                 //Creo los contructores por defecto y parametrizado
        this.nombre = "";
        this.horasTrabajadas = 0;
        this.tarifaPorHora = 0;
    }
    
    public Empleados(String nombre, int horasTrabajadas, int tarifaPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }
    
    public String getNombre(){      //Creo los getters y setters
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getHorasTrabajadas() {
        return this.horasTrabajadas;
    }
    
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public int getTarifaPorHora() {
        return this.tarifaPorHora;
    }
    
    public void setTarifaPorHora(int tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
    
    @Override                       //Creo el toString
    public String toString() {
        return nombre + " trabajó "+ horasTrabajadas +" horas, cobra "+ tarifaPorHora +
        " euros la hora" ;
    }
}
