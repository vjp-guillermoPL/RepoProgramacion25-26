/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenra6;

/**
 *
 * @author alumno
 */
public class Coche {

    private String nombreTitular;                   //Creo los atributos
    private String matricula;

    public Coche() {                                //Constructores por defecto y parametrizado
        this.nombreTitular = "";
        this.matricula = "";
    }

    public Coche(String nombreTitular, String matricula) {
        this.nombreTitular = nombreTitular;
        this.matricula = matricula;
    }

    public String getNombreTitular() {              //Getters y setters
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override                                       //ToString
    public String toString() {
        return "El coche con matrícula " + matricula + " pertenece a " + nombreTitular;
    }

}
