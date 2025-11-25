/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04animales;

/**
 *
 * @author alumno
 */
public abstract class Felinos extends Animal{
    
    public Felinos(){
        super();
    }
    
    public Felinos(String nombre, int edad, int peso){
        super(nombre, edad, peso);
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
    
}
