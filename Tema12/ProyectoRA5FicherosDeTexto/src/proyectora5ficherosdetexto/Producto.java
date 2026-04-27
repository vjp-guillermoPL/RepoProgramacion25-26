/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectora5ficherosdetexto;

/**
 *
 * @author alumno
 */
public class Producto {
    private String nombre;
    private int cantidad;
    private double precio;
    
    public Producto (){
        this.nombre = "";
        this.cantidad = 0;
        this.precio = 0;
    }

    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto: "+ this.nombre +" Cantidad: "+ this.cantidad +" Precio "+ this.precio;
    }
    
    
}
