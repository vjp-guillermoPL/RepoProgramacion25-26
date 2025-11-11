/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coladecorreos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Metodos {

    /**
     * Método que muestra el menú
     */
    public static void mostrarMenu() {
        System.out.println("MENÚ CORREOS");
        System.out.println("Opción 1: Enviar");
        System.out.println("Opción 2: Recoger");
        System.out.println("Opción 3: Salir");
    }

    /**
     * Método que pide al usuario una opción
     *
     * @return la opción dada por el usuario
     */
    public static int pedirOpcion() {
        int opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elija una de las opciones");
        opcion = entrada.nextInt();

        return opcion;
    }

    /**
     * Método que genera una letra aleatoria entre 'A' y 'F'
     * @param LETRA_INICIO
     * @param LETRA_FIN 
     */
    public static void generarLetraAleatoria(char LETRA_INICIO, char LETRA_FIN) {
        double codigo = (Math.random() * (LETRA_FIN - LETRA_INICIO +1)) + LETRA_INICIO;
        String letra = "" + (char) codigo;
        System.out.println("La mesa en la que será atendido es: " + letra);
    }

    /**
     * Método que incrementa en uno el número de envios
     *
     * @param numE
     * @return número de envios más 1
     */
    public static int incrementarNumeroEnvio(int numE) {
        return numE + 1;
    }

    /**
     * Método que incrementa en uno el número de recogidas
     *
     * @param numR
     * @return número de recogidas más 1
     */
    public static int incrementarNumeroRecogida(int numR) {
        return numR + 1;
    }

    /**
     * Método que genera un número de espera para hacer un envio basado en el
     * número de envios realizados
     *
     * @param numE
     */
    public static void generarNumeroEsperaEnvio(int numE) {
        System.out.println("Su número para realizar un envio es E-" + numE);

    }

    /**
     * Método que genera un número de espera para hacer una recogida basado en
     * el número de recogidas realizadas
     *
     * @param numR
     */
    public static void generarNumeroEsperaRecogida(int numR) {
        System.out.println("Su número para realizar una recogida es R-" + numR);

    }

}
