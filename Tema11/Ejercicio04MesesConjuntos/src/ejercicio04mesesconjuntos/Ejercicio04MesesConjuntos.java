/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04mesesconjuntos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Ejercicio04MesesConjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombreMeses = {                            //Creo el vector para introducir los nombres
            "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        
        Set<String> sMeses = new HashSet<>();               //Creo los conjuntos
        Set<String> lhsMeses2 = new LinkedHashSet<>();
        
        for (int i = 0; i < nombreMeses.length; i++) {      //Meto los nombres de los meses en cada conjunto
            sMeses.add(nombreMeses[i]);
            lhsMeses2.add(nombreMeses[i]);
        }
        
        System.out.println(sMeses);                         //HashSet los guarda en un orden concreto el cual no sé
        System.out.println(lhsMeses2);                      //LinkedHashSet los guarda en el orden de inserción
    }

}
