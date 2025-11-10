/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apuntestema05;
/**
 *
 * @author alumno
 */
public class ApuntesTema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Instancio un objeto del tipo que he creado 
        // 1.1. Con constructor parametrizado y establecemos valores son setters 
        Coche miCoche = new Coche();
        System.out.println(miCoche.toString());
        
        
        miCoche.setEspejos(5);
        System.out.println(miCoche.toString());
        
        System.out.println(miCoche.getEspejos());
        
        miCoche.acelerar();
        
        // 1.2. Con constructor parametrizado, inicializando los atributos
        //Con los valores pasados por parametro
        Coche tuCoche = new Coche("Michelin", "Bajo", 3);
        System.out.println(tuCoche.toString());
        
        // Esto hace lo mismo que la linea anterior, porque detecta el toString() automáticamente
        System.out.println(tuCoche);
        
        System.out.println(tuCoche.getRuedas());
        
        
        // MODIFICADORES DE ACCESO
        Bicicleta bicicleta = new Bicicleta();
        System.out.println(bicicleta.ruedas);
        System.out.println(bicicleta.getEstaPedaleando());
        //bicicleta.acelerar();
        
        Bicicleta bicicleta2 = new Bicicleta();
        System.out.println(bicicleta2);
        System.out.println("¿Cuántas bicis hemos creado?");
        System.out.println(bicicleta.getNumBicicleta());
        
        // PASO DE PARÁMETROS POR VALOR O POR REFERENCIA
        int num1 = 4;
        System.out.println(suma(num1));
        
        Bicicleta bici = new Bicicleta();
        empezarAPedalear(bici);
    }
    
    public static int suma(int num1){
        int num2 = 3;
        return num1 + num2;
    }
    
    public static void empezarAPedalear(Bicicleta bici) {
        bici.setEstaPedaleando(true);
    }
    
}
