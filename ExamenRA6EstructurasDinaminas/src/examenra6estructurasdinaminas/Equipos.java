/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenra6estructurasdinaminas;

/**
 *
 * @author alumno
 */
public class Equipos implements Comparable<Integer>{
    private int codigo;                                         //Atributos
    private String nombre;
    private int numTrofeos;
    
    public Equipos(){                                           //Constructores
        this.codigo = 0;
        this.nombre = "";
        this.numTrofeos = 0;
    }

    public Equipos(int codigo, String nombre, int numTrofeos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numTrofeos = numTrofeos;
    }

    public int getCodigo() {                                    //Getters y setters
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumTrofeos() {
        return numTrofeos;
    }

    public void setNumTrofeos(int numTrofeos) {
        this.numTrofeos = numTrofeos;
    }

    @Override                                                   //ToString
    public String toString() {
        return "El equipo con código "+ this.codigo +" se llama "+ this.nombre +" y tiene "+ this.numTrofeos +" trofeos";
    }

    @Override                                                   //CompareTo
    public int compareTo(Integer o) {
        return this.numTrofeos - o;
    }
}
