/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08sedes;

/**
 *
 * @author alumno
 */
public class Sedes implements Comparable<Sedes>{
    private String nombre;                                      //Atributos
    private double ingresosAnuales;
    
    public Sedes(){                                             //Constructores
        this.nombre = "";
        this.ingresosAnuales = 0;
    }

    public Sedes(String nombre, double ingresosAnuales) {
        this.nombre = nombre;
        this.ingresosAnuales = ingresosAnuales;
    }

    public String getNombre() {                                 //Getters y setters
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(double ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }
    
    @Override                                                  //compareTo
    public int compareTo(Sedes otra){
        if (this.ingresosAnuales < otra.ingresosAnuales) 
            return 1;    
        if (this.ingresosAnuales > otra.ingresosAnuales) 
            return -1;
        return this.nombre.compareTo(otra.nombre); // Si empetan en €, decide el nombre
    }

    @Override                                                   //ToString
    public String toString() {
        return "La sede con nombre "+ this.nombre +" tiene unos ingresos anuales de "+ this.ingresosAnuales +" euros";
    }
}
