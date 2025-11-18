/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntestema05.herencia;

/**
 *
 * @author alumno
 */
public class Main {
    public static void main(String[] args) {
        Personaje personaje = new Personaje();
        System.out.println(personaje);
        
        Jugador jugador = new Jugador(50, "Palo");
        System.out.println(jugador);
        
        Enemigo enemigo = new Enemigo(30, "Espada");
        System.out.println(enemigo);
        
        personaje.atacar();
        jugador.atacar();
        enemigo.atacar();
        
        jugador.recoger("moneda");
        enemigo.crearSoldados();
        
        System.out.println(jugador.getInventario());
        System.out.println(jugador.getVida());
        System.out.println(enemigo.getVida());
        System.out.println(personaje.getVida());
        
    }
}
