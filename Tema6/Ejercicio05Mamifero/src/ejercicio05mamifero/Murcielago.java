/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05mamifero;

/**
 *
 * @author alumno
 */
public class Murcielago extends Mamifero implements Volador{
    private int alturaVuelo;               //Creo el atributo
    
    public Murcielago(){                  //Constructor por defecto
        super();
        this.alturaVuelo = 0;
    }

    public Murcielago(int alturaVuelo, String nombre, String sexo, String color, int edad) {         //Constructor parametrizado
        super(nombre, sexo, color, edad);
        this.alturaVuelo = alturaVuelo;
    }

    public int getAlturaVuelo() {          //Getters y setters
        return alturaVuelo;
    }

    public void setAlturaVuelo(int alturaVuelo) {
        this.alturaVuelo = alturaVuelo;
    }
    
    /**
     * Método que muestra por pantalla que tipo de animal es
     */
    @Override
    public void obtenerMensajeVolador(){
        System.out.println("El murcielago es un animal volador");
    }
    
    /**
     * Método que aumenta en 5 la altura de vuelo
     */
    @Override
    public void aumentarAlturaVuelo(){
        this.setAlturaVuelo(this.getAlturaVuelo()+5);
    }
    
    /**
     * Método que disminuye en 5 la altura de vuelo
     */
    @Override
    public void bajarAlturaVuelo(){
        this.setAlturaVuelo(this.getAlturaVuelo()-5);
    }
    
    /**
     * Método que muestra la altura de vuelo
     */
    @Override
    public void mostrarAlturaVuelo(){
        System.out.println("La altura actual es de: "+ this.getAlturaVuelo() +" metros");
    }
    
    @Override                           //toString
    public String toString(){
        return super.toString() +" vuela a "+ this.getAlturaVuelo() +" metros";
    }
    
}
