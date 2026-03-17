/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05mesesmapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author alumno
 */
public class Ejercicio05MesesMapas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombreMeses = {                                    //Creo el vector para introducir los nombres
            "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        
        Map<Integer, String> mMeses = new HashMap<>();              //Creo los mapas
        Map<Integer, String> lhmMeses = new LinkedHashMap<>();
        
        for (int i = nombreMeses.length-1; i >= 0; i--) {           //Introduzco los valores y las claves en los mapas
            mMeses.put((i + 1), nombreMeses[i]);
            lhmMeses.put((i + 1), nombreMeses[i]);
        }
        
        System.out.println(mMeses);                                 //HashMap muestra el mapa en orden de la clave (desde el 1 hasta el 12)
        System.out.println(lhmMeses);                               //LinkedHashMap muestra el mapa en orden de introducción
        
    }
    
}
