/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectora6;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Figuras {

    private String nombre;              //Atributos
    private int valor;
    private String coleccion;
    //Constructores

    public Figuras() {
        this.nombre = "";
        this.valor = 0;
        this.coleccion = "";
    }

    public Figuras(String nombre, int valor, String coleccion) {
        this.nombre = nombre;
        this.valor = valor;
        this.coleccion = coleccion;
    }
    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }
    //Métodos

    /**
     * Método que rellena la matriz con todos lo datos que de el usuario
     *
     * @param vitrina
     */
    public static void rellenarVitrina(Figuras[][] vitrina) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaNum = new Scanner(System.in);

        for (int i = 0; i < vitrina.length; i++) {
            for (int j = 0; j < vitrina[i].length; j++) {
                System.out.println("Introduzca un nombre, valor y colección a la que pertenece para la figura del estante "
                        + (i + 1) + " compartimento " + (j + 1));
                vitrina[i][j] = new Figuras(entrada.nextLine(), entradaNum.nextInt(), entrada.nextLine());
            }
        }
    }

    /**
     * Método que muestra todas las figuras de la colección que pida el usuario
     * Si no hay ninguna, lo avisa por pantalla
     *
     * @param vitrina
     */
    public static void mostrarColeccion(Figuras[][] vitrina) {
        Scanner entrada = new Scanner(System.in);
        boolean coleccionExiste = false;

        System.out.println("Introduzca la colección que desea ver");
        String busqueda = entrada.nextLine();

        System.out.println("Las figuras de la colección " + busqueda + " son:");

        for (int i = 0; i < vitrina.length; i++) {
            for (int j = 0; j < vitrina[i].length; j++) {
                if (vitrina[i][j].getColeccion().equalsIgnoreCase(busqueda)) {
                    System.out.println(vitrina[i][j].toString());

                    coleccionExiste = true;
                }
            }
        }
        if (!coleccionExiste) {
            System.out.println("No se encontró ninguna figura de la colección buscada");
        }
    }

    /**
     * Método que busca la figura de mayor valor y muestra por pantalla su
     * ubicación en la vitrina y todos sus datos
     *
     * @param vitrina
     */
    public static void mostrarMasValioso(Figuras[][] vitrina) {
        int mayorValor = vitrina[0][0].getValor();
        int estante = 0;
        int compartimento = 0;

        for (int i = 0; i < vitrina.length; i++) {
            for (int j = 0; j < vitrina[i].length; j++) {
                if (mayorValor < vitrina[i][j].getValor()) {
                    mayorValor = vitrina[i][j].getValor();
                    estante = i;
                    compartimento = j;
                }
            }
        }
        System.out.println("La figura con mayor valor es:");
        System.out.println(vitrina[estante][compartimento].toString());
        System.out.println("La cual se ubica en el estante " + (estante + 1) + " y en el compartimento " + (compartimento + 1));
    }

    //ToString
    @Override
    public String toString() {
        return nombre + " de la colección " + coleccion + " vale " + valor;
    }

}
