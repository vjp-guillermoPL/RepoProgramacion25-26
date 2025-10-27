/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08metododividirbilletes;

/**
 *
 * @author alumno
 */
public class DividirBilletes {
    public static void dividirBilletes(int dinero){
        int billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;
        
        billetes50 = dinero/50;                             
        billetes20 = (dinero % 50) /20;
        billetes10 = (dinero % 20) / 10;
        billetes5 = (dinero % 10) / 5;
        monedas2 = (dinero % 5) / 2;
        monedas1 = (dinero % 2);
        
        System.out.println("Su dinero se descompone en: ");      
        if (billetes50 > 0) {
            System.out.println(billetes50+" billetes de 50");
        }
        
        if (billetes20 > 0) {
            System.out.println(billetes20+" billetes de 20");
        }
        
        if (billetes10 > 0) {
            System.out.println(billetes10+" billetes de 10");
        }
        
        if (billetes5 > 0) {
            System.out.println(billetes5+" billetes de 5");
        }
        
        if (monedas2 > 0) {
            System.out.println(monedas2+" monedas de 2");
        }
        
        if (monedas1 > 0) {
            System.out.println(monedas1+" monedas de 1");
        }
    }
}
