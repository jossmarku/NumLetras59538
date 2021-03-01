/*
 * Lenguajes de programación I
 * Facultad de Ingeniería
 * Universidad Autónoma de Campeche
 */
package numletras59538;

import java.util.Scanner;

/**
 *
 * @author JossmarOswaldoKuCupul
 */
public class NumLetras59538 {

    public static void main(String[] args) {
        
        // Declaración de las 3 variables que se utilizarán:
        int num = 0;                // Aquí se guardará el número digitado
        int decenas = 0;            // Aquí se guardarán las decenas del número digitado
        int unidades = 0;           // Aquí se guardarán las unidades del número digitado
        
        // Declaración del scanner para leer el número digitado
        Scanner miConsola = new Scanner(System.in);
        
        // Se le pide el número al usuario, debe estar entre 0 y 99
        System.out.println("Dime un número entero entre 0 y 99: ");
        num = miConsola.nextInt();
        
        // Se determinan las decenas y unidades del número digitado
        decenas = num / 10;
        unidades = num % 10;
        
        // Se declaran dos arreglos que en sus elementos contienen a las unidades y las decenas en letras
        String[] uni_Letras = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] dec_Letras = {"dieci", "veinti", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        
        // Se declaran dos arreglos que contienen los números de 1 y 2 decenas que presentan especificaciones ortográficas, tales como acentos o diferente escritura
        String[] una_Decena = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciséis"};
        String[] dos_Decenas = {"veinte", "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco", "veintiséis"};
        
        // Se comienza el proceso de convertir el número digitado a letras, respetando la ortografía indicada según la RAE (utilizando acentos, espacios y palabras correctamente)
        if (num < 0 || num > 99) {                                  // Este if detecta si el número digitado es negativo o mayor de 99, de tal forma que si eso sucede, imprime un mensaje de advertencia
            System.out.println("El número no es válido");
        } else {                                                    // A partir de este else comienza a identificarse el número digitado usando varios else if para determinar el número de decenas y unidades que tiene, para luego usar los arreglos correspondientes para la escritura adecuada
            if (decenas == 0) {
                System.out.println(uni_Letras[unidades]);
            } else {
                if (decenas == 1 & unidades <= 6) {
                    System.out.println(una_Decena[unidades]);
                } else if (decenas == 2 & unidades <= 6) {
                    System.out.println(dos_Decenas[unidades]);
                } else if (unidades == 0) {
                    System.out.println(dec_Letras[decenas - 1]);
                } else if (decenas == 1 || decenas == 2) {
                    System.out.println(dec_Letras[decenas - 1] + uni_Letras[unidades]);
                } else {
                    System.out.println(dec_Letras[decenas - 1] + " y " + uni_Letras[unidades]);
                }
            }
        }
    }
}