/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06sueldoempleadoobjetoarray;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06SueldoEmpleadoObjetoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;                                            //Creo la variable
        num = numEmpleados();                               //Llamo al método que pregunta el número de empleados y lo guardo en la variable
        
        Empleado empleado[] = new Empleado[num];            //Creo el array de la longitud que especificó el usuario
        
        for (int i = 0; i < empleado.length; i++) {         //Instancio los objetos para poder usarlos
            empleado[i] = new Empleado();
        }
        
        crearEmpleados(empleado);
        mostrarEmpleados(empleado);
    }
    
    /**
     * Método que pregunta el número de empleados y los devuelve
     * @return el número de empleados
     */
    public static int numEmpleados() {
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el número de empleados que quiera guardar");
        num = entrada.nextInt();
        
        return num;
    }
    
    /**
     * Método que pide al usuario los datos de cada empleado y lo guarda
     * @param empleado 
     */
    public static void crearEmpleados(Empleado empleado[]) {
        String nombre;
        int num;
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < empleado.length; i++){
            System.out.println("Introduzca el nombre del empleado");
            nombre = entrada.next();
            empleado[i].setNombre(nombre);
            
            System.out.println("Introduzca el número de horas trabajadas");
            num = entrada.nextInt();
            empleado[i].setHorasTrabajadas(num);
            
            System.out.println("Introduzca la tarifa por hora");
            num = entrada.nextInt();
            empleado[i].setTarifaPorHora(num);
        }
    }
    
    /**
     * Método que muestra por pantalla todos los datos de cada empleado
     * @param empleado 
     */
    public static void mostrarEmpleados(Empleado empleado[]) {
        for (int i = 0; i < empleado.length; i++){
            System.out.println(empleado[i].getNombre() +" trabajó "+ empleado[i].getHorasTrabajadas() +
                    " horas, cobra "+ empleado[i].getTarifaPorHora() +" euros la hora por lo que su sueldo es de "
                    + calcularSueldo(empleado, i) +" euros");
        }
    }
    
    /**
     * Método que calcula el sueldo
     * @param empleado
     * @param i
     * @return el sueldo
     */
    public static double calcularSueldo(Empleado empleado[], int i) {
        double num;
        
        if (empleado[i].getHorasTrabajadas() < 40) {
            num = empleado[i].getHorasTrabajadas() * empleado[i].getTarifaPorHora();
        } else {
            num = (40 * empleado[i].getTarifaPorHora())+
                    (empleado[i].getHorasTrabajadas()-40)*(1.5*empleado[i].getTarifaPorHora());
        }
        
        return num;
    }
    
}
