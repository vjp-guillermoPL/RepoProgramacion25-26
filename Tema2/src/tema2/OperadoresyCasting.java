/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2;

/**
 *
 * @author alumno
 */
public class OperadoresyCasting {
    public static void main(String[] args) {
        // 1.OPERADORES
        // 1.1 Aritmeticos
        // Suma: +
        // Resta: -
        // Multiplicación: *
        // División: /
        // Módulos: %
        int num1 =4;
        int num2 =2;
        // System.out.println(num1 + num2);
        
        //System.out.println(num1 % num2);
        
        // 1.2 Relacionales
        // > < == >= <= !=
        
        //System.out.println(num1 > num2);
        //System.out.println(num1 < num2);
        //System.out.println(num1 != num2);
        
        // 1.3 Lógicos 
        // OR: ||
        // AND: &&
        // XOR: ^
        // NOT: !
        boolean condicion1 = true;
        boolean condicion2 = false;
        
        //System.out.println(condicion1 || condicion2);
        //System.out.println(condicion1 && condicion2);
        //System.out.println(condicion1 ^ condicion2);
        //System.out.println(!condicion2);
        
        // 1.4 Unarios
        // - ++ --
        
        //System.out.println(-num1);
        num1++;
        //System.out.println(num1);
        num2--;
        //System.out.println(num2);
        
        // 1.5 Asignación
        // = += -= *= /= %=
        num2 += 2;
        num2 = num2 + 2;
        //System.out.println(num2);
        num1 %= 2;
        num1 = num1 % 2;
        //System.out.println(num1);
        
        // 2. CONVERSIONES DE TIPO (CASTING)
        short dato1 = 4;
        int dato2;
        dato2 = dato1;
        
        long dato3 =3;
        dato2 = (int)dato3;
        
        
    }
}
