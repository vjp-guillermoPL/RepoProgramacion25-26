/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05mamifero;

/**
 *
 * @author alumno
 */
public class Ornitorrinco extends Mamifero implements Oviparo{
    private int numeroHuevos;               //Creo el atributo
    
    public Ornitorrinco(){                  //Constructor por defecto
        super();
        this.numeroHuevos = 0;
    }

    public Ornitorrinco(int numeroHuevos, String nombre, String sexo, String color, int edad) {         //Constructor parametrizado
        super(nombre, sexo, color, edad);
        this.numeroHuevos = numeroHuevos;
    }

    public int getNumeroHuevos() {          //Getters y setters
        return numeroHuevos;
    }

    public void setNumeroHuevos(int numeroHuevos) {
        this.numeroHuevos = numeroHuevos;
    }
    
    /**
     * Método que muestra por pantalla que tipo de animal es
     */
    @Override
    public void obtenerMensajeOviparo(){
        System.out.println("El ornitorrinco es un mamífero ovíparo");
    }
    
    /**
     * Método que aumenta en uno el número de huevos
     */
    @Override
    public void ponerHuevo(){
        this.setNumeroHuevos(this.getNumeroHuevos()+1);
    }
    
    /**
     * Método que disminuye en uno el número de huevos
     */
    @Override
    public void incubarHuevo(){
        this.setNumeroHuevos(this.getNumeroHuevos()-1);
    }
    
    /**
     * Método que muestra en número de huevos
     */
    @Override
    public void mostrarNumHuevos(){
        System.out.println("El número actual de huevos es de: "+ this.getNumeroHuevos());
    }
    
    @Override                           //toString
    public String toString(){
        return super.toString() +" pone "+ this.getNumeroHuevos() +" huevos";
    }
    
}
