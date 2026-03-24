/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08sedes;

/**
 *
 * @author alumno
 */
public class Sedes {
    private String nombre;                                      //Atributos
    private int ingresosAnuales;
    
    public Sedes(){                                             //Constructores
        this.nombre = "";
        this.ingresosAnuales = 0;
    }

    public Sedes(String nombre, int ingresosAnuales) {
        this.nombre = nombre;
        this.ingresosAnuales = ingresosAnuales;
    }

    public String getNombre() {                                 //Getters y setters
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(int ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    @Override                                                   //ToString
    public String toString() {
        return "La sede con nombre "+ this.nombre +" tiene unos ingresos anuales de "+ this.ingresosAnuales +" euros";
    }
}
