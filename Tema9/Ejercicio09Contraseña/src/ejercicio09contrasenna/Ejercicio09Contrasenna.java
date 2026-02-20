/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09contrasenna;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio09Contrasenna {
                                                /**
                                                 * La contraseña no puede tener menos de seis caracteres.
                                                 * Al menos dos de esos caracteres deben ser dígitos.
                                                 * El nombre del usuario no puede formar parte de la contraseña
                                                 */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuario;                                         //Creo las variables
        String contrasenna;
        boolean valido = false;

        Scanner entrada = new Scanner(System.in);               //Creo el Scanner
        Scanner entrada2 = new Scanner(System.in);

        System.out.println("Introduzca su nombre de usuario");      //Pido el nombre de usuario
        usuario = entrada.nextLine();

        do {                                                    //Hago un bucle hasta que la contraseña sea válida
            System.out.println("Introduzca su contraseña");    
            contrasenna = entrada2.nextLine();                  //Pido la contraseña al usuario
            
            String digitos = contrasenna.replaceAll("\\D", ""); //Uso una expresión regular que me permite quitar todo lo que no sea un dígito
            
            if (contrasenna.length() < 6 ||                     //Compruebo que la contraseña sea de la longitud adecuada
                    contrasenna.toLowerCase().contains(usuario.toLowerCase()) ||        //Compruebo que la contraseña no contenga el nombre de usuario
                    digitos.length() < 2) {                     //Compruebo que haya mínimo 2 dígitos
                
                System.out.println("Contraseña inválida");     //Si la contraseña incumple los requisitos, te lo dice y lo repite
            }else {
                System.out.println("Usuario y contraseña válidos");        //Si la contrseña es válida te lo dice y sale del bucle
                valido = true;
            }
        } while (valido == false);

    }

}
