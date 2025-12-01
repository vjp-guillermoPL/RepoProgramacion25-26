/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04animales;

/**
 *
 * @author alumno
 */
public abstract class Animal {
    private String nombre;              //Creo los atrivutos
    private int edad;
    private int peso;
    
    public Animal(){                    //Creo el constructor por defecto
        this.nombre = "";
        this.edad = 0;
        this.peso = 0;
    }
    
    public Animal(String nombre, int edad, int peso){       //Creo el contructor parametrizado
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
    public String getNombre(){                              //Creo los getters y setters
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getPeso(){
        return this.peso;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public abstract String mostrarSonido();             //Creo los métodos abstractos
    public abstract String mostrarHabitat();
    public abstract String mostrarAlimentacion();
    public abstract String mostrarNombreCientifico();
    
    @Override                                           //Creo el toString
    public String toString(){
        return this.nombre +" tiene "+ this.edad +" años y pesa "+ this.peso +" kg";
    }
}
