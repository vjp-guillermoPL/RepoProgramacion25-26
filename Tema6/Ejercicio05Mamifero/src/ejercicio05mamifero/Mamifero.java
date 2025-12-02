/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05mamifero;

/**
 *
 * @author alumno
 */
public class Mamifero {
    private String nombre;          //Creo los atributos
    private String sexo;
    private String color;
    private int edad;
    
    public Mamifero(){          //Constructor por defecto
        this.nombre = "";
        this.sexo = "";
        this.color = "";
        this.edad = 0;
    }
    
    public Mamifero(String nombre, String sexo, String color, int edad){        //Constructor parametrizado
        this.nombre = nombre;
        this.sexo = sexo;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {             //Getters y setters
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override                       //toString
    public String toString() {
        return this.getNombre() +" es "+ this.getSexo() +", "+ this.getColor() +" y su edad es de "+ this.getEdad(); 
    }
    
}
