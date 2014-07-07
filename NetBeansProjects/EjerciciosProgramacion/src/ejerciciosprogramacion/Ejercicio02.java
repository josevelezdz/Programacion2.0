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
public class Ejercicio02 {
     public static int Ejercicio2(int x, int y) {

        int i, factorial = 1;
        if (((x <= 0) || (y <= 0)) || ((x > 255))) {
            return (-1);
        }
        for (i = 1; i <= y; i++) {
            factorial = factorial * i;

        }
        return x * factorial;
    }
}
