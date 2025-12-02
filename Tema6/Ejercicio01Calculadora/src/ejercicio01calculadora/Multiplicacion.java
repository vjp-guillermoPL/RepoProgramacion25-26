/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01calculadora;

/**
 *
 * @author alumno
 */
public class Multiplicacion extends Calculadora{
    private int multiplicador;          //Creo el atributo
    
    public Multiplicacion(){            //Constructor por defecto
        super();
        this.multiplicador = 0;
    }
    
    public Multiplicacion(int multiplicador, int numero){       //Constructor parametrizado
        super(numero);
        this.multiplicador = multiplicador;
    }

    public int getMultiplicador() {             //Getters y setters
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }
    
    /**
     * Método que hace una multiplicación y la muestra por pantalla
     */
    @Override
    public void realizarOperacion(){
        System.out.println("La multiplicacion entre "+ super.getNumero() +" y "+ this.getMultiplicador()+" es: "+ (super.getNumero()*this.getMultiplicador()));
    }
}
