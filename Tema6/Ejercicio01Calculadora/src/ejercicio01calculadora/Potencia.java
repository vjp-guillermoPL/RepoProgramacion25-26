/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01calculadora;

/**
 *
 * @author alumno
 */
public class Potencia extends Calculadora{
    private int exponente;              //Creo el atributo
    
    public Potencia(){                  //Constructor por defecto
        super();
        this.exponente = 0;
    }
    
    public Potencia(int exponente, int numero){     //Constructor parametrizado
        super(numero);
        this.exponente = exponente;
    }

    public int getExponente() {             //Getters y setters
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }
    
    /**
     * Método que hace una Potencia y la muestra por pantalla
     */
    @Override
    public void realizarOperacion(){
        System.out.println("La potencia entre "+ super.getNumero() +" y "+ this.getExponente()+" es: "+ (Math.pow(super.getNumero(), this.getExponente())));
        
    }
}
