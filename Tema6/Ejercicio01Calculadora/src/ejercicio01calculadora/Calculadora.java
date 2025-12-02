/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01calculadora;

/**
 *
 * @author alumno
 */
public abstract class Calculadora {
    private int numero;             //Creo el atributo
    
    public Calculadora(){           //Constructor por defecto
        this.numero = 0;
    }
    
    public Calculadora(int numero){     //Constructor parametrizado
        this.numero = numero;
    }

    public int getNumero() {            //Getters y setters
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public abstract void realizarOperacion();       //Método abstracto

    @Override                                       //toString
    public String toString() {
        return ""+ this.numero; 
    }

}
