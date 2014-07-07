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
public class Ejercicio13 {
    public static String Ejercicio13(int n){
     int menor=0; int posicion =0;
    String cadena = "";
       
        int[] arreglo1=new int[n];
        int[] arregloauxiliar=new int[n];
        for (int i = 0; i < n; i++) {
            arreglo1 [i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valores al vector"));
        }
         
         for (int i = 0; i < n; i++) {
             if (arreglo1[i] < 0) {
                arregloauxiliar[posicion]= arreglo1[i];
                posicion++;
             }
         }
         for (int i = 0; i < n; i++) {
            if (arreglo1[i] >= 0) {
                arregloauxiliar[posicion]= arreglo1[i];
                posicion++;
             }
        }
         for (int i :arregloauxiliar) {
             cadena=cadena +" "+ i;
        
    }
      return cadena;  
    } 
   
}
