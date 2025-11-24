/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23vehiculos;

/**
 *
 * @author alumno
 */
public class Taxi extends Vehiculo{
    private int numeroLicencia;
    
    public Taxi(){
        super();
        this.numeroLicencia = 0;
    }
    
    public Taxi(String matricula, String modelo, int potenciaCV, int numeroLicencia){
        super(matricula, modelo, potenciaCV);
        this.numeroLicencia = numeroLicencia;
    }
    
    public int getNumeroLicencia(){
        return this.numeroLicencia;
    }
    
    public void setNumeroLicencia(int numeroLicencia){
        this.numeroLicencia = numeroLicencia;
    }
    
    
    
}
