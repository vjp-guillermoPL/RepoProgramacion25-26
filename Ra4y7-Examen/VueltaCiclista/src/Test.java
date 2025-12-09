/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Test {
    public static void main(String[] args) {
        //Creo los objetos escalador1 y sprinter1
        Escalador escalador1 = new Escalador(15, 10, "Jorge", 50, false, 120, 2, 20, 50);
        Sprinter sprinter1 = new Sprinter(20, "Mario", 50, false, 120, 2, 20, 50);
        
        Ciclista.setNumeroCiclistas(2);
        
        System.out.println(Ciclista.getNumeroCiclistas() +" número de ciclistas");
        
        //Uso el polimorfismo para almacenar los objetos creados previamente en una variable de tipo Ciclista
        System.out.println("");
        System.out.println("Escalador-Ciclista");
        System.out.println("");
        
        Ciclista ciclista1;
        ciclista1 = escalador1;
        System.out.println(ciclista1);          //Muestro el ciclista
        ciclista1.comer();                      //Uso el método comer
        ciclista1.beber();                      //Uso el método beber
        System.out.println(ciclista1);          //Vuelvo a mostrar al ciclista
        
        System.out.println("");
        System.out.println("Sprinter-Ciclista");
        System.out.println("");
        
        ciclista1 = sprinter1;
        System.out.println(ciclista1);          //Muestro el ciclista
        ciclista1.comer();                      //Uso el método comer
        ciclista1.beber();                      //Uso el método beber
        System.out.println(ciclista1);          //Vuelvo a mostrar al ciclista
    
        //Uso el polimorfismo para almacenar los objetos creados previamente en una variable de tipo Pedaleable
        System.out.println("");
        System.out.println("Escalador-Pedaleable");
        System.out.println("");
        
        Pedaleable ciclista2;
        ciclista2 = escalador1;
        System.out.println(ciclista2);          //Muestro el ciclista
        ciclista2.atacar();                     //Uso el método atacar
        ciclista2.recuperar(5);                 //Uso el método recuperar
        ciclista2.sprintar();                   //Uso el método sprintar
        System.out.println(ciclista2);          //Vuelvo a mostrar al ciclista
        
        System.out.println("");
        System.out.println("Sprinter-Pedaleable");
        System.out.println("");
        
        ciclista2 = sprinter1;
        System.out.println(ciclista2);          //Muestro el ciclista
        ciclista2.atacar();                     //Uso el método atacar
        ciclista2.recuperar(5);                 //Uso el método recuperar
        ciclista2.sprintar();                   //Uso el método sprintar
        System.out.println(ciclista2);          //Vuelvo a mostrar al ciclista
    }
}
