/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coladecorreos;

import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class ColaDeCorreos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final char LETRA_INICIO = 'A';      //Creo las constantes y variables
        final char LETRA_FIN = 'F';
        int numE = 1;
        int numR = 1;
        int opcion = 0;

        do {                                //Creo un bucle para que se repita el menú mientras no elijas salir
            try {                           //Capturo las posibles excepciones para no pusar el programa si se introduce una letra
                Metodos.mostrarMenu();      //Llamo al método para mostrar el menú

                opcion = Metodos.pedirOpcion();     //Llamo al método para pedir una opción y la guardo en la variable
                switch (opcion) {                   //Creo un condicional para que se pueda elegir la opción adecuada
                    case 1:
                        Metodos.generarLetraAleatoria(LETRA_INICIO, LETRA_FIN);
                        Metodos.generarNumeroEsperaEnvio(numE);
                        numE = Metodos.incrementarNumeroEnvio(numE);
                        break;
                    case 2:
                        Metodos.generarLetraAleatoria(LETRA_INICIO, LETRA_FIN);
                        Metodos.generarNumeroEsperaRecogida(numR);
                        numR = Metodos.incrementarNumeroRecogida(numR);
                        break;
                    case 3:
                        System.out.println("Programa finalizado");
                        break;
                    default:
                        System.out.println("Introduzca un número entre en 1 y el 3");
                }
            } catch (InputMismatchException e) {        //Capturo las excepciones
                System.out.println("Has introducido un dato invalido");
            }
        } while (opcion != 3);

    }

}
