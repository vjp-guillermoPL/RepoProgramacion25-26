/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19sueldoempleado;

/**
 *
 * @author alumno
 */
public class Test {
    /**
     * Método que determina el sueldo bruto del empleado y lo muestra por pantalla
     */
    public static void sueldoBruto(){
            double sueldo;
            
            Empleados empleado1 = new Empleados("Pepe", 42, 20);
            Empleados empleado2 = new Empleados("Juan", 37, 15);
            Empleados empleado3 = new Empleados("Alberto", 47, 25);
            
            if (empleado1.getHorasTrabajadas() < 40) {
                sueldo = (empleado1.getHorasTrabajadas() * empleado1.getTarifaPorHora());
            } else {
                sueldo = (empleado1.getHorasTrabajadas() * empleado1.getTarifaPorHora()) + ((empleado1.getHorasTrabajadas() - 40) * empleado1.getTarifaPorHora() * 0.5);
            }
            System.out.println(empleado1.toString()+ " por lo que le corresponde un sueldo de "+ sueldo +" euros");
        }
}
