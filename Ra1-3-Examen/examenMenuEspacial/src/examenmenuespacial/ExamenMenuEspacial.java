/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenmenuespacial;

/**
 *
 * @author alumno
 */
public class ExamenMenuEspacial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;                             //Creo las variables
        int num;
        double volumen;
        do {                                    //creo un bucle para mostrar el menú hasta que se decida salir
            System.out.println("MENU NAVE ESPACIAL");       //Muestro el menú
            System.out.println("Elige una opción: ");
            System.out.println("1. Analizar señal recibida del espacio");
            System.out.println("2. Ajustar las potencias de sus motores antes del lanzamiento");
            System.out.println("3. Calcular el volumen de un planeta");
            System.out.println("4. Salir");
            opcion = Metodos.pedirNumero();     //Llamo al método para pedir la opción
            switch(opcion){                     //Realizo la acción que elija el usuario llamando al metodo correspondiente
                case 1: num = Metodos.pedirNumero();
                        Metodos.analizarSennalRecibida(num);
                        break;
                case 2: Metodos.ajustarPotenciaMotores();
                        break;
                case 3: num = Metodos.pedirNumero();
                        volumen = Metodos.calcularVolumenPlaneta(num);
                        System.out.println("El volumen del planeta es: "+ volumen);
                        break;
                case 4: System.out.println("Saliendo del programa");
                        break;
                default: System.out.println("Introduce una opción correcta");
            }
        } while (opcion != 4);
    }
}
