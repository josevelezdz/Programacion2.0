/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosprogramacion;

/**
 *
 * @author josedavidvelez
 */
public class Ejercicio03 {
    public static float Ejercicio3(int x, int y) {
        float res;
        if (((x <= 0) || (y <= 0)) || ((x > 255) || (y > 255))) {
            return (-1);
        }
        res = (float) x / y;
        return res;
    }
}
