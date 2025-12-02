/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05mamifero;

/**
 *
 * @author alumno
 */
public class Ejercicio05Mamifero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Murcielago murcielago1 = new Murcielago(15, "Bruce", "Masculino", "Negro", 7);      //Creo los objetos
        Ornitorrinco ornitorrinco1 = new Ornitorrinco(2, "Perry", "Masculino", "Verde", 5);
        
        murcielago1.obtenerMensajeVolador();        //Uso los métodos de cada objeto
        murcielago1.bajarAlturaVuelo();
        murcielago1.mostrarAlturaVuelo();
        murcielago1.aumentarAlturaVuelo();
        murcielago1.mostrarAlturaVuelo();
        
        ornitorrinco1.obtenerMensajeOviparo();
        ornitorrinco1.incubarHuevo();
        ornitorrinco1.mostrarNumHuevos();
        ornitorrinco1.ponerHuevo();
        ornitorrinco1.mostrarNumHuevos();
        
    }
    
}
