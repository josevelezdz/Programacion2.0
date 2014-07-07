/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosprogramacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose David Velez Y Josue Narea
 */
public class Ejercicio10 {
    public static int Ejercicio10(int x, int y) {
        int S=0;
       
         
        for (int i = x; i <= y; i++) {
            S=0; 
            for (int j = 1  ; j < i; j++) {
                if ((i % j)==0) {
                    S =S+j;
                }
                if ((i==y)&&((i%j)!=0)) {
                    S=0; 
                }
            }
            if (S==i) {
                JOptionPane.showMessageDialog(null, "El número perfecto menor entre "+ x+" y "+y+ " es = " +S);
                i=y;
            }
        }
            if(S==0) {
                JOptionPane.showMessageDialog(null, "no existen números perfectos ente "+ x+" y "+y);
            }
        return S;
    } 
}


