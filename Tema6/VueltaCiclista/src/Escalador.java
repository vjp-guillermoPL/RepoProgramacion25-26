/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Escalador extends Ciclista implements Pedaleable{
    //Creo los atributos
    private float potencia;
    private float fuerza;
    
    public Escalador() {                     //Constructor por defecto
        super();
        this.potencia = 0;
        this.fuerza = 0;
    }
    
    //Constructor parametrizado
    public Escalador(float potencia, float fuerza, String nombre, float energia, boolean estaEscapado, float kmMeta, int numeroBidones, float velocidad, int nivelHidratacion) {
        super(nombre, energia, estaEscapado, kmMeta, numeroBidones, velocidad, nivelHidratacion);
        this.potencia = potencia;
        this.fuerza = fuerza;
    }

    //Getters y setters
    public float getPotencia() {
        return this.potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public float getFuerza() {
        return this.fuerza;
    }

    public void setFuerza(float fuerza) {
        this.fuerza = fuerza;
    }
    
    /**
     * Método que aumenta en 30 la energía si está a más de 20km de la meta
     */
    @Override
    public void comer() {
        if (super.getKmMeta() > 20) {
            super.setEnergia(getEnergia() + 30);
            System.out.println("El escalador "+ super.getNombre() +
                    " acaba de tomar un gel. Su energía ahora es de "+ super.getEnergia());
        } else {
            System.out.println("No puedes comer a menos de 20 km de meta");
        }
    }
    
    /**
     * Método que, si no tiene bidones, los coge, tira dos y aumenta su nivel de hidratación en 10
     */
    @Override
    public void beber() {
        if (super.getNumeroBidones() == 0) {
            super.cogerBidones();
        }
        super.setNivelHidratacion(getNivelHidratacion() + 10);
        super.tirarBidon();
        super.tirarBidon();
        System.out.println("El escalador "+ super.getNombre() +
                    " se ha hidratado. Su nivel de hidratación ahora es de "+ super.getNivelHidratacion());
    }
    
    /**
     * Método que, si está a menos de 0.3km de la meta y tiene mínimo 20
     * de energía, pierde 20 de energía y su velocidad se vuelve igual a la potancia entre su fuerza
     */
    @Override
    public void sprintar() {
        if (super.getKmMeta() < 0.3 && super.getEnergia() >= 20) {
            super.setVelocidad(potencia/fuerza);
            super.setEnergia(getEnergia() - 20);
            System.out.println("El escalador "+ super.getNombre() +" está esprintando a "+ super.getVelocidad() +" km/h");
        } else {
            System.out.println("Aún no puedes esprintar");
        }
    }
    
    /**
     * Método que, si no está escapado, su hidratación se disminuye un 20% y pasa a estar escapado
     */
    @Override
    public void atacar() {
        if (super.getEstaEscapado() == false) {
            super.setEstaEscapado(true);
            super.setNivelHidratacion(getNivelHidratacion() - (getNivelHidratacion() * 20 /100));
            System.out.println("El escalador "+ super.getNombre() +" está atacando");
        }
    }
    
    /**
     * Método que recupera la energía en 5 por cada km de recuperación
     * @param kmRecuperacion
     * @return la energía total del escalador
     */
    @Override
    public float recuperar(float kmRecuperacion) {
        if (super.getKmMeta() > 15) {
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
        return super.toString() +". Tambien tiene "+ this.potencia +" de potencia y "+ this.fuerza +" de fuerza";
    }
    
}
