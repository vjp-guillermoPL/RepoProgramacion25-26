/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07temperaturaarrayobjetos;

/**
 *
 * @author alumno
 */
public class Dia {
    private String nombreDia;               //Creo los atributos
    private int temperatura;
                                    //Constructor por defecto
    public Dia(){
        nombreDia = "";
        temperatura = 0;
    }
                                    //Constructor parametrizado
    public Dia(String nombreDia, int temperatura) {
        this.nombreDia = nombreDia;
        this.temperatura = temperatura;
    }
                                    //Getters y setters
    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
                                    //ToString
    @Override
    public String toString() {
        return "Dia{" + "nombreDia=" + nombreDia + ", temperatura=" + temperatura + '}';
    }
    
    
}
