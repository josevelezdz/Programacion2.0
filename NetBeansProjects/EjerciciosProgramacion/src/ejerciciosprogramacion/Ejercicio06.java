/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosprogramacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose David Velez Y Josue Narea
 */
public class Ejercicio06 {
   public static String orden_inverso(String frase)throws IOException {

    BufferedReader a=new BufferedReader(new InputStreamReader(System.in));

       String cadenaaux = "";
      String []Caracter=frase.split(" ");
      JOptionPane.showMessageDialog(null, frase);

      for(int i=Caracter.length-1;i>=0;i--){
        cadenaaux=cadenaaux+" "+ Caracter[i];
          
          
          
      }
      JOptionPane.showMessageDialog(null,cadenaaux);
       return frase;
      

    }
    }

