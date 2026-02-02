/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07temperaturaarrayobjetos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio07TemperaturaArrayObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dia tempDia[] = new Dia[30];                        //Creo el array
        int num;                                        //Creo la variable
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < tempDia.length; i++) {          //Instancio los objetos para poder usarlos
            tempDia[i] = new Dia();
        }

        do {
            System.out.println("Elija una opción entre 1 y 5");
            num = entrada.nextInt();
            switch (num) {
                case 1:
                    rellenarTemp(tempDia);
                    break;
                case 2:
                    mostrarTemp(tempDia);
                    break;
                case 3:
                    mostrarMedia(tempDia);
                    break;
                case 4:
                    temperaturaMasAlta(tempDia);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("La opción elegida no es válida");
            }
            System.out.println("--------------------------------------------------");
        } while (num != 5);

    }

    /**
     * Método que rellena aleatoriamente las temperaturas con números entre 0 y
     * 39 y añade el día
     *
     * @param tempDia
     */
    public static void rellenarTemp(Dia tempDia[]) {
        String[] nombreDia = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int diaInicio = (int) (Math.random() * 7);

        for (int i = 0; i < tempDia.length; i++) {
            tempDia[i].setTemperatura((int) (Math.random() * 40));
            tempDia[i].setNombreDia(nombreDia[diaInicio]);
            if (diaInicio < nombreDia.length - 1) {
                diaInicio++;
            } else {
                diaInicio = 0;
            }

        }
    }

    /**
     * Método que muestra la temperatura de cada día
     *
     * @param tempDia
     */
    public static void mostrarTemp(Dia tempDia[]) {
        for (int i = 0; i < tempDia.length; i++) {
            System.out.println(tempDia[i].getNombreDia() + " dia " + (i + 1) + ": " + tempDia[i].getTemperatura() + " grados");
        }
    }

    /**
     * Método que calcula la temperatura media y la muestra por pantalla
     *
     * @param tempDia
     */
    public static void mostrarMedia(Dia tempDia[]) {
        int media = 0;
        for (int i = 0; i < tempDia.length; i++) {
            media += tempDia[i].getTemperatura();
        }
        media = media / tempDia.length;

        System.out.println("La temperatura media es de " + media + " grados");
    }

    /**
     * Método que calcula el día o días más caluroso del mes y lo muestra por pantalla
     *
     * @param tempDia
     */
    public static void temperaturaMasAlta(Dia tempDia[]) {
        int mayor = tempDia[0].getTemperatura();
        int cuenta1 = 1;
        int cuenta2 = 1;

        for (int i = 0; i < tempDia.length; i++) {
            if (mayor < tempDia[i].getTemperatura()) {
                mayor = tempDia[i].getTemperatura();
                cuenta1 = i;
            }
            if (mayor == tempDia[i].getTemperatura()) {
                cuenta2 = i;
            }
        }
        System.out.println("El día o días más calurosos son:");
        System.out.println("");System.out.println(tempDia[cuenta1].getNombreDia() + " dia " + (cuenta1 + 1) + ": " + tempDia[cuenta1].getTemperatura() + " grados");
        if (cuenta2 > 1) {
            System.out.println("");System.out.println(tempDia[cuenta2].getNombreDia() + " dia " + (cuenta2 + 1) + ": " + tempDia[cuenta2].getTemperatura() + " grados");
        }
    }

}
