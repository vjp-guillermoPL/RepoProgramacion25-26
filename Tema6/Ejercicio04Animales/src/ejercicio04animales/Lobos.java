/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04animales;

/**
 *
 * @author alumno
 */
public class Lobos extends Canidos{       //Creo la subclase de Canidos
    
    public Lobos(){                               //Creo el constructor por defecto
        super();
    }
    
    public Lobos(String nombre, int edad, int peso){          //Creo el constructor parametrizado
        super(nombre, edad, peso);
    }
    
    @Override                               //Creo los métodos sacados de la clase abstracta
    public String mostrarSonido(){
        return "Su sonido es el aullido";
    }
    
    @Override
    public String mostrarHabitat(){
        return "Su hábitat el bosque";
    }
    
    @Override
    public String mostrarAlimentacion(){
        return "Su alimentación es carnívora";
    }
    
    @Override
    public String mostrarNombreCientifico(){
        return "Su nombre científico es Canis lupus";
    }
    
    @Override                                       //Creo el toString
    public String toString(){
        return super.toString() +" "+ mostrarSonido() +" "+ mostrarHabitat() +" "+ mostrarAlimentacion() +" "+ mostrarNombreCientifico();
    }
}
