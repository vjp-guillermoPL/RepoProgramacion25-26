/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Sprinter extends Ciclista implements Pedaleable{
    //Creo los atributos
    private float aceleracion;
    
    public Sprinter() {                     //Constructor por defecto
        super();
        this.aceleracion = 0;
    }

    //Constructor parametrizado
    public Sprinter(float aceleracion, String nombre, float energia, boolean estaEscapado, float kmMeta, int numeroBidones, float velocidad, int nivelHidratacion) {
        super(nombre, energia, estaEscapado, kmMeta, numeroBidones, velocidad, nivelHidratacion);
        this.aceleracion = aceleracion;
    }

    //Getters y setters
    public float getAceleracion() {
        return this.aceleracion;
    }

    public void setAceleracion(float aceleracion) {
        this.aceleracion = aceleracion;
    }
    
    /**
     * Método que aumenta en 25 la energía si está a más de 25km de la meta
     */
    @Override
    public void comer() {
        if (super.getKmMeta() > 10) {
            super.setEnergia(getEnergia() + 25);
            System.out.println("El sprinter "+ super.getNombre() +
                    " acaba de tomar un gel. Su energía ahora es de "+ super.getEnergia());
        } else {
            System.out.println("No puedes comer a menos de 25 km de meta");
        }
    }
    
    /**
     * Método que, si no tiene bidones, los coge, tira uno y aumenta su nivel de hidratación en 5
     */
    @Override
    public void beber() {
        if (super.getNumeroBidones() == 0) {
            super.cogerBidones();
        }
        super.setNivelHidratacion(getNivelHidratacion() + 5);
        super.tirarBidon();
        System.out.println("El sprinter "+ super.getNombre() +
                    " se ha hidratado. Su nivel de hidratación ahora es de "+ super.getNivelHidratacion());
    }
    
    /**
     * Método que, si está a menos de 1km de la meta y tiene mínimo 50
     * de energía, pierde 50 de energía y su velocidad se incrementa en una cantidad igual a su aceleración
     */
    @Override
    public void sprintar() {
        if (super.getKmMeta() < 1 && super.getEnergia() >= 50) {
            super.setVelocidad(getVelocidad() + getAceleracion());
            super.setEnergia(getEnergia() - 50);
            System.out.println("El sprinter "+ super.getNombre() +" está esprintando a "+ super.getVelocidad() +" km/h");
        } else {
            System.out.println("Aún no puedes esprintar");
        }
    }
    
    /**
     * Método que, si no está escapado, su hidratación se disminuye un 10% y pasa a estar escapado
     */
    @Override
    public void atacar() {
        if (super.getEstaEscapado() == false) {
            super.setEstaEscapado(true);
            super.setNivelHidratacion(getNivelHidratacion() - (getNivelHidratacion() * 10 /100));
            System.out.println("El sprinter "+ super.getNombre() +" está atacando");
        }
    }
    
    /**
     * Método que recupera la energía en 5 por cada km de recuperación
     * @param kmRecuperacion
     * @return la energía total del sprinter
     */
    @Override
    public float recuperar(float kmRecuperacion) {
        if (super.getKmMeta() > 5) {
            super.setEnergia(getEnergia() + (5*kmRecuperacion));
            System.out.println(super.getNombre() +" está recuperando");
        } else {
            System.out.println("No puede recuperar");
        }
        return super.getEnergia();
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() +". Tambien tiene "+ this.aceleracion;
    }
}
