/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04animales;

/**
 *
 * @author alumno
 */
public abstract class Felinos extends Animal{       //Creo la subclase de Animal
    
    public Felinos(){                               //Creo el constructor por defecto
        super();
    }
    
    public Felinos(String nombre, int edad, int peso){          //Creo el constructor parametrizado
        super(nombre, edad, peso);
    }
    
    @Override                                       //Creo el toString
    public String toString(){
        return super.toString();
    }
    
}
