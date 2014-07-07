/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosprogramacion;

import javax.swing.JOptionPane;

/**
 *
 * @author josedavidvelez
 */
public class Ejercicio05 {
    public static String Ejercicio05(int m){
    String cadena="";

        
        int[] arreglo=new int[m];
        int c=0;
        for (int i = 0; i < arreglo.length; i++) {
            
            int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));

            arreglo[i]=numero;
        }
      
        for (int i = 0; i < arreglo.length; i++) {
            
cadena=cadena+" ,"+arreglo[i];
        }
         JOptionPane.showMessageDialog(null, "Arreglo Desordenado\n"+cadena);
         int i, j, aux;
         for(i=0;i<arreglo.length-1;i++)
              for(j=0;j<arreglo.length-i-1;j++)
                   if(arreglo[j+1]<arreglo[j]){
                      aux=arreglo[j+1];
                      arreglo[j+1]=arreglo[j];
                      arreglo[j]=aux;
                   } 
       
         cadena="";
         for ( i = 0; i < arreglo.length; i++) {
            
             cadena=cadena+" ,"+arreglo[i];
        }
         
          JOptionPane.showMessageDialog(null,"Arreglo Ordenado\n"+ cadena);
        
         cadena="";
         int a1;
         for ( i = 0; i < arreglo.length; i++){
             if (i==0) {
             
             cadena=cadena+" ,"+arreglo[i];
             }
             else
             {
                 a1=i-1;
                 aux=arreglo[i];
             if (aux==arreglo[a1]) {
                                  

             }else{
                
                 cadena=cadena+" ,"+arreglo[i];
                 
             }
             
             }
             
              
            
}    
         return cadena;

    }
}
