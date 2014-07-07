/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosprogramacion;

/**
 *
 * @author Jose David Velez Y Josue Narea
 */
public class Ejercicio04 {
     public static String Ejercicio4(String S1, String S2) {
        String a, result = "";
        S2 = S2.toLowerCase();
        a = S2.toUpperCase();
        int longitud1 = S1.length();
        int longitud2 = S2.length();
        char[] frase1 = S1.toCharArray();
        char[] frase2 = S2.toCharArray();
        char[] frase3 = a.toCharArray();
        for (int i = 0; i < longitud2; i++) {
            for (int j = 0; j < longitud1; j++) {
                if (frase1[j] == frase2[i] || frase1[j] == frase3[i]) {
                    frase1[j] = ' ';
                }
            }
        }

        for (int i = 0; i < longitud1; i++) {
            if (frase1[i] != ' ') {
                result = result + Character.toString(frase1[i]);

            }
        }
        return result;
    }
}
