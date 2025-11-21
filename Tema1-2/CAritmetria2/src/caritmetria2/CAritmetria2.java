/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caritmetria2;

/**
 *
 * @author Guillermo
 * Operaciones Aritméticas
 * 
 */
public class CAritmetria2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato1, dato2; //Declaro la variable entera datol
        int dato3, resultado; //Declaro, a la vez, dos variables enteras: dato2 y resultado

        dato1 = 20; //Asigno el valor 20 a la variable datol
        dato2 = 10;
        dato3 = 30;
        
        //Suma
        resultado = dato1 + dato2 + dato3; //Guardo la suma de las dos variables en la variable resultado
        System.out.println(dato1 + "+" + dato2 + "+" + dato3 + "=" + resultado); /* El método printin escribe
        por pantalla tanto el valor de las variables asi como las cadenas que están entre comillas. Para unir los 5 elementos se ha utilizado el operador + */
        //Resta
        resultado = dato1 - dato2 -dato3;
        System.out.println(dato1+ "-" + dato2 + "-" + dato3 + "=" + resultado);
        //Producto
        resultado = dato1 * dato2 *dato3;
        System.out.println(dato1 + "*" + dato2 + "*" + dato3 + "=" + resultado);
        //Cociente
        resultado = dato1 / dato2 / dato3;
        System.out.println(dato1 + "/" + dato2 + "/" + dato3 + "=" + resultado);
    }
    
}
