/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01calculadora;

/**
 *
 * @author alumno
 */
public class Suma extends Calculadora{
    private int sumando;            //Creo el atributo
    
    public Suma(){              //Contructor por defecto
        super();
        this.sumando = 0;
    }
    
    public Suma(int sumando, int numero){           //Constructor parametrizado
        super(numero);
        this.sumando = sumando;
    }

    public int getSumando() {           //Getters y setters
        return sumando;
    }

    public void setSumando(int sumando) {
        this.sumando = sumando;
    }
    
    /**
     * Método que hace una suma y la muestra por pantalla
     */
    @Override
    public void realizarOperacion(){
        System.out.println("La suma entre "+ super.getNumero() +" y "+ this.getSumando() +" es: "+ (super.getNumero()+this.getSumando()));
    }
    
}
