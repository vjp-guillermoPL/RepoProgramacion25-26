/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntestema06;

/**
 *
 * @author alumno
 */
public abstract class Superheroe {
    //Atributos
    private String nombre;
    
    //Constructores
    public Superheroe(){
        this.nombre = "";
    }
    
    public Superheroe(String nombre){
        this.nombre = nombre;
    }
    
    //Métodos
    
    public abstract void entrenar();
    
    public final void presentarse(){
        System.out.println("");
    }
    
    
}
