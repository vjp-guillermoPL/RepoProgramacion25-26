/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19array100;

/**
 *
 * @author alumno
 */
public class Ejercicio19Array100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aleatorios[] = new int[100];

        rellenarArray(aleatorios);
        mostrarMayor(aleatorios);
        mostrarMenor(aleatorios);

        media(aleatorios);
    }

    /**
     * Método que rellena el array con números aleatorios de entre 10 y 80
     *
     * @param aleatorios
     */
    public static void rellenarArray(int aleatorios[]) {
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = (int) (Math.random() * 71) + 10;
        }
    }

    /**
     * Método que muestra el mayor número del array por pantalla
     *
     * @param aleatorios
     */
    public static void mostrarMayor(int aleatorios[]) {
        int mayor = aleatorios[0];
        for (int i = 0; i < aleatorios.length; i++) {
            if (aleatorios[i] > mayor) {
                mayor = aleatorios[i];
            }
        }
        System.out.println("El mayor número del array es: " + mayor);
    }

    /**
     * Método que muestra el menor número del array por pantalla
     *
     * @param aleatorios
     */
    public static void mostrarMenor(int aleatorios[]) {
        int menor = aleatorios[0];
        for (int i = 0; i < aleatorios.length; i++) {
            if (aleatorios[i] < menor) {
                menor = aleatorios[i];
            }
        }
        System.out.println("El mayor número del array es: " + menor);
    }

    public static void masRepetido(int aleatorios[]) {
        int repetido[] = new int[70];

        for (int i = 0; i < aleatorios.length; i++) {
            switch (aleatorios[i]) {
                case 10:
                    repetido[0]++;
                    break;
                case 11:
                    repetido[1]++;
                    break;
                case 12:
                    repetido[2]++;
                    break;
                case 13:
                    repetido[3]++;
                    break;
                case 14:
                    repetido[4]++;
                    break;
                case 15:
                    repetido[5]++;
                    break;
                case 16:
                    repetido[6]++;
                    break;
                case 17:
                    repetido[7]++;
                    break;
                case 18:
                    repetido[8]++;
                    break;
                case 19:
                    repetido[9]++;
                    break;
                case 20:
                    repetido[10]++;
                    break;
                case 21:
                    repetido[11]++;
                    break;
                case 22:
                    repetido[12]++;
                    break;
                case 23:
                    repetido[13]++;
                    break;
                case 24:
                    repetido[14]++;
                    break;
                case 25:
                    repetido[15]++;
                    break;
                case 26:
                    repetido[16]++;
                    break;
                case 27:
                    repetido[17]++;
                    break;
                case 28:
                    repetido[18]++;
                    break;
                case 29:
                    repetido[19]++;
                    break;
                case 30:
                    repetido[20]++;
                    break;
                case 31:
                    repetido[21]++;
                    break;
                case 32:
                    repetido[22]++;
                    break;
                case 33:
                    repetido[23]++;
                    break;
                case 34:
                    repetido[24]++;
                    break;
                case 35:
                    repetido[25]++;
                    break;
                case 36:
                    repetido[26]++;
                    break;
                case 37:
                    repetido[27]++;
                    break;
                case 38:
                    repetido[28]++;
                    break;
                case 39:
                    repetido[29]++;
                    break;
                case 40:
                    repetido[30]++;
                    break;
                case 41:
                    repetido[31]++;
                    break;
                case 42:
                    repetido[32]++;
                    break;
                case 43:
                    repetido[33]++;
                    break;
                case 44:
                    repetido[34]++;
                    break;
                case 45:
                    repetido[35]++;
                    break;
                case 46:
                    repetido[36]++;
                    break;
                case 47:
                    repetido[37]++;
                    break;
                case 48:
                    repetido[38]++;
                    break;
                case 49:
                    repetido[39]++;
                    break;
                case 50:
                    repetido[40]++;
                    break;
                case 51:
                    repetido[41]++;
                    break;
                case 52:
                    repetido[42]++;
                    break;
                case 53:
                    repetido[43]++;
                    break;
                case 54:
                    repetido[44]++;
                    break;
                case 55:
                    repetido[45]++;
                    break;
                case 56:
                    repetido[46]++;
                    break;
                case 57:
                    repetido[47]++;
                    break;
                case 58:
                    repetido[48]++;
                    break;
                case 59:
                    repetido[49]++;
                    break;
                case 60:
                    repetido[50]++;
                    break;
                case 61:
                    repetido[51]++;
                    break;
                case 62:
                    repetido[52]++;
                    break;
                case 63:
                    repetido[53]++;
                    break;
                case 64:
                    repetido[54]++;
                    break;
                case 65:
                    repetido[55]++;
                    break;
                case 66:
                    repetido[56]++;
                    break;
                case 67:
                    repetido[57]++;
                    break;
                case 68:
                    repetido[58]++;
                    break;
                case 69:
                    repetido[59]++;
                    break;
                case 70:
                    repetido[60]++;
                    break;
                case 71:
                    repetido[61]++;
                    break;
                case 72:
                    repetido[62]++;
                    break;
                case 73:
                    repetido[63]++;
                    break;
                case 74:
                    repetido[64]++;
                    break;
                case 75:
                    repetido[65]++;
                    break;
                case 76:
                    repetido[66]++;
                    break;
                case 77:
                    repetido[67]++;
                    break;
                case 78:
                    repetido[68]++;
                    break;
                case 79:
                    repetido[69]++;
                    break;
                case 80:
                    repetido[70]++;
                    break;
            }
        }
        
        int mayor = repetido[0];
        for (int i = 0; i < repetido.length; i++) {
            if (repetido[i] > mayor) {
                mayor = repetido[i];
            }
        }
        System.out.println("El número que más se repite es: ");
    }

    /**
     * Método que hace la media de todos los números del array
     *
     * @param aleatorios
     */
    public static void media(int aleatorios[]) {
        int media = 0;
        for (int i = 0; i < aleatorios.length; i++) {
            media += aleatorios[i];
        }
        media = media / aleatorios.length;

        System.out.println("La media del array es: " + media);
    }

}
