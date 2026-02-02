/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11y12arrayobjetosmuebles;

/**
 *
 * @author alumno
 */
public class Mueble {
    private int precio;
    private String descripcion;
    
    public Mueble(){
        this.precio = 0;
        this.descripcion = "";
    }

    public Mueble(int precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Mueble{" + "precio=" + precio + ", descripcion=" + descripcion + '}';
    }
    
    
}
