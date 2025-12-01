/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04animales;

/**
 *
 * @author alumno
 */
public class Gatos extends Felinos{       //Creo la subclase de Felinos
    
    public Gatos(){                               //Creo el constructor por defecto
        super();
    }
    
    public Gatos(String nombre, int edad, int peso){          //Creo el constructor parametrizado
        super(nombre, edad, peso);
    }
    
    @Override                               //Creo los métodos sacados de la clase abstracta
    public String mostrarSonido(){
        return "Su sonido es el maullido";
    }
    
    @Override
    public String mostrarHabitat(){
        return "Su hábitat es doméstico";
    }
    
    @Override
    public String mostrarAlimentacion(){
        return "Se alimenta de ratones";
    }
    
    @Override
    public String mostrarNombreCientifico(){
        return "Su nombre científico es Felis silvestris catus";
    }
    
    @Override                                       //Creo el toString
    public String toString(){
        return super.toString() +" "+ mostrarSonido() +" "+ mostrarHabitat() +" "+ mostrarAlimentacion() +" "+ mostrarNombreCientifico();
    }
}
