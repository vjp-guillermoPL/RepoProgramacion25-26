/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public abstract class Ciclista {

    private String nombre;                  //Creo los atributos
    private float energia;
    private boolean estaEscapado;
    private float kmMeta;
    private int numeroBidones;
    private float velocidad;
    private int nivelHidratacion;
    private static int numeroCiclistas;

    public Ciclista() {                     //Constructor por defecto
        this.nombre = "";
        this.energia = 50;
        this.estaEscapado = false;
        this.kmMeta = 120;
        this.numeroBidones = 2;
        this.velocidad = 0;
        this.nivelHidratacion = 50;
    }

    //Constructor parametrizado
    public Ciclista(String nombre, float energia, boolean estaEscapado, float kmMeta, int numeroBidones, float velocidad, int nivelHidratacion) {
        this.nombre = nombre;
        this.energia = 50;
        this.estaEscapado = estaEscapado;
        this.kmMeta = kmMeta;
        this.numeroBidones = 2;
        this.velocidad = velocidad;
        this.nivelHidratacion = 50;
    }

    //Getters y setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getEnergia() {
        return this.energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

    public boolean getEstaEscapado() {
        return this.estaEscapado;
    }

    public void setEstaEscapado(boolean estaEscapado) {
        this.estaEscapado = estaEscapado;
    }

    public float getKmMeta() {
        return this.kmMeta;
    }

    public void setKmMeta(float kmMeta) {
        this.kmMeta = kmMeta;
    }

    public int getNumeroBidones() {
        return this.numeroBidones;
    }

    public void setNumeroBidones(int numeroBidones) {
        this.numeroBidones = numeroBidones;
    }

    public float getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public int getNivelHidratacion() {
        return this.nivelHidratacion;
    }

    public void setNivelHidratacion(int nivelHidratacion) {
        this.nivelHidratacion = nivelHidratacion;
    }

    public static int getNumeroCiclistas() {
        return numeroCiclistas;
    }

    public static void setNumeroCiclistas(int numeroCiclistas) {
        Ciclista.numeroCiclistas = numeroCiclistas++;
    }
    
    /**
     * Método que aumenta el número de bidones en dos si está a más de 10km de la meta
     */
    public final void cogerBidones() {
        if (kmMeta > 10) {
            setNumeroBidones(numeroBidones +2);
        } else {
            System.out.println("No puedes coger bidones a menos de 10 km de meta");
        }
    }
    
    /**
     * Método que disminuye los bidones en uno
     */
    public final void tirarBidon() {
        setNumeroBidones(numeroBidones --);
    }
    
    /**
     * Método que incrementa en uno el número de ciclistas
     */
    public void aumentarNumeroCiclistas() {
        setNumeroCiclistas(numeroCiclistas ++);
    }
    
    /**
     * Método que muestra el número de ciclistas
     */
    public void verNumeroCiclistas() {
        System.out.println("Hay "+ getNumeroCiclistas() +" ciclistas");
    }
    
    //Métodos abstractos
    public abstract void comer();
    public abstract void beber();
    
    //toString
    @Override
    public String toString() {
        return this.nombre + " tiene " + this.energia + " energía, le quedan " + this.kmMeta
                + " Km para la meta, tiene " + this.numeroBidones + " bidones, va a " + this.velocidad
                + " km/h y su nivel de hidratación está en " + this.nivelHidratacion;
    }
}
