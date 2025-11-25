/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04animales;

/**
 *
 * @author alumno
 */
public abstract class Perros extends Canidos{
    
    public Perros(){
        super();
    }
    
    public Perros(String nombre, int edad, int peso){
        super(nombre, edad, peso);
    }
    
    @Override
    public void mostrarSonido(){
        System.out.println("Su sonido es el ladrido");
    }
    
    @Override
    public void mostrarHabitat(){
        System.out.println("Su hábitat es doméstico");
    }
    
    @Override
    public void mostrarAlimentacion(){
        System.out.println("Su alimentación es carnívora");
    }
    
    @Override
    public void mostrarNombreCientifico(){
        System.out.println("Su nombre científico es Canis lupus familiaris");
    }
    
}
