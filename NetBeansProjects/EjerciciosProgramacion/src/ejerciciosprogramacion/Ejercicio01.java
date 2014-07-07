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
public class Ejercicio01 {
    public static int Ejercicio1(int x, int y) {
        int[] vector = new int[498];
        int i, par = 8, impar = 7, suma = 0;
        if (((x <= 0) || (y <= 0)) || ((x > 255))) {
            return (-1);
        }
        for (i = 0; i < vector.length; i++) {
            if (i % 2 == 0) {

                vector[i] = par;
                par = vector[i] - 2;
            } else {

                vector[i] = impar++;
            }
        }
        for (i = 0; i < vector.length; i++) {
            suma = vector[x] + vector[y];

        }
        return suma;
    }
}
