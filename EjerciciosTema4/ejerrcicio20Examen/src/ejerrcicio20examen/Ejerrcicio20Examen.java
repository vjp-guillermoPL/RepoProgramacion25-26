/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerrcicio20examen;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejerrcicio20Examen {
    public final static String RESPUESTA1 = "Madrid";
    public final static String RESPUESTA2 = "Colón";
    
    public final static String PREGUNTA1 = " ¿Cuál es la capital de España?";
    public final static String PREGUNTA2 = "¿Quién descubrió América?";
    
    public final static int PUNTUACION = 5 ;
    
    /**
     * Método que le pide al usuario la respuesta a la pregunta
     * 
     * @return la respuesta del usuario
     */
    public static String pedirRespuesta(){
        Scanner entrada = new Scanner(System.in);
        
        return entrada.nextLine();
    }
    
    /**
     * Método que compara la respuesta del usuario con la respuesta correcta
     * 
     * @param respuestaUsuario
     * @param respuestaCorrecta
     * @return true si la respuesta es correcta y false si no
     */
    public static boolean comprobarRespuesta(String respuestaUsuario, String respuestaCorrecta) {
        boolean correcta;
        if (respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)) {
            correcta = true;
        } else {
            correcta = false;
        }
        return correcta;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int puntuacionFinal = 0;
        String respuesta;
        
        //Primera pregunta
        System.out.println("EXAMEN DE CULTURA GENERAL");
        System.out.println(PREGUNTA1);
        respuesta = pedirRespuesta();
        
        if (comprobarRespuesta(respuesta,RESPUESTA1)) {
            System.out.println("Muy bien, respuesta correcta");
            puntuacionFinal += PUNTUACION;
        } else {
            System.out.println("No es correcto. La respuesta correcta es: "+ RESPUESTA1);
        }
        
        //Segunda pregunta
        System.out.println(PREGUNTA2);
        respuesta = pedirRespuesta();
        
        if (comprobarRespuesta(respuesta,RESPUESTA2)) {
            System.out.println("Muy bien, respuesta correcta");
            puntuacionFinal += PUNTUACION;
        } else {
            System.out.println("No es correcto. La respuesta correcta es: "+ RESPUESTA2);
        }
        
        System.out.println("NOTA DEL EXAMEN: "+ puntuacionFinal);
    }
    
}
