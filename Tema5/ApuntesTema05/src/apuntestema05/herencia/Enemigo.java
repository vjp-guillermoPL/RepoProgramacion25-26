/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntestema05.herencia;

/**
 *
 * @author alumno
 */
public class Enemigo extends Personaje{
    //ATRIBUTOS
    private String arma;
    
    //CONSTRUCTORES
    public Enemigo() {
        super();
        this.arma = "";
    }
    
    public Enemigo(int vida, String arma){
        super(vida);
        this.arma = arma;
    }
    
    //GETTERS SETTERS
    public String getArma(){
        return this.arma;
    }
    
    public void setArma(String arma){
        this.arma = arma;
    }
    
    //MÉTODOS
    public void crearSoldados(){
        System.out.println("Creando soldados...");
    }
    
    //TO STRING
    @Override
    public String toString(){
        return "EL ENEMIGO tiene " + getVida() +"% de vida y arma "+ this.arma;
    }
    
}
