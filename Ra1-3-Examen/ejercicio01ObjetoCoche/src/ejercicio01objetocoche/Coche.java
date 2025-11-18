/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01objetocoche;

/**
 *
 * @author alumno
 */
public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido;
    
    public Coche() {
        this.marca = "";
        this.modelo ="";
        this.color ="";
        this.velocidad = 0;
        this.motorEncendido = false;
    }
    
    public Coche(String marca, String modelo, String color, int velocidad, boolean motorEncendido){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
        this.motorEncendido = motorEncendido;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public int getVelocidad(){
        return this.velocidad;
    }
    
    public void serVelocidad(int velocidad){
        this.velocidad = velocidad;
    }
    
    public boolean getMotorEncendido(){
        return this.motorEncendido;
    }
    
    public void setMotorEncendido(boolean motorEncendido){
        this.motorEncendido = motorEncendido;
    }
    
    
    
    @Override
    public String toString(){
        return this.marca + this.modelo + this.color + this.velocidad + this.motorEncendido;
    }
}
