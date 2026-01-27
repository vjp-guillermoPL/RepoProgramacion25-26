/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06sueldoempleadoobjetoarray;

/**
 *
 * @author alumno
 */
public class Empleado {
    private String nombre;                  //Creo los atributos
    private int horasTrabajadas;
    private int tarifaPorHora;
                                            //Constructor por defecto
    public Empleado(){  
        nombre = "";
        horasTrabajadas = 0;
        tarifaPorHora = 0;
    }
                                            //Constructor parametrizado
    public Empleado(String nombre, int horasTrabajadas, int tarifaPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }
                                            //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(int tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
                                        //ToString
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", horasTrabajadas=" + horasTrabajadas + ", tarifaPorHora=" + tarifaPorHora + '}';
    }
    
    
}
