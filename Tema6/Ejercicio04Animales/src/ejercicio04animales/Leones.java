/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04animales;

/**
 *
 * @author alumno
 */
public class Leones extends Felinos{       //Creo la subclase de Felinos
    
    public Leones(){                               //Creo el constructor por defecto
        super();
    }
    
    public Leones(String nombre, int edad, int peso){          //Creo el constructor parametrizado
        super(nombre, edad, peso);
    }
    
    @Override                               //Creo los métodos sacados de la clase abstracta
    public String mostrarSonido(){
        return "Su sonido es el rugido";
    }
    
    @Override
    public String mostrarHabitat(){
        return "Su hábitat es la sabana";
    }
    
    @Override
    public String mostrarAlimentacion(){
        return "Su alimentación es carnívora";
    }
    
    @Override
    public String mostrarNombreCientifico(){
        return "Su nombre científico es Panthera leo";
    }
    
    @Override                                       //Creo el toString
    public String toString(){
        return super.toString() +" "+ mostrarSonido() +" "+ mostrarHabitat() +" "+ mostrarAlimentacion() +" "+ mostrarNombreCientifico();
    }
}
