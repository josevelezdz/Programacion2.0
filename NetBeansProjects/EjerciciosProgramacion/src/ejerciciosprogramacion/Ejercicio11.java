package ejerciciosprogramacion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue Narea y Jose David Velez
 */
public class Ejercicio11 {
    public static int Ejercicio11(int x, int y) {
        // TODO code application logic here
         
        
        
        
        int valor;
        int matriz[][]=new int [x][y];
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                
                int entrada1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"+i+","+j));
                int entrada=entrada1;
                valor=entrada;
                matriz[i][j]=valor;
                
            }
            
        }
        int dimen = x * y , a = 0;
        
        int vectorcontndr[]=new int[dimen];
        for (int i = 0; i <x; i++) {
            for (int j = 0; j < y; j++) {
                vectorcontndr[a]=matriz[i][j];
                //System.out.println(vectorcontndr[a]);
                a++;
            }
        }
        ArrayList matriz1=new ArrayList();
        ArrayList cant=new ArrayList();
        Arrays.sort(vectorcontndr);
        matriz1.add(vectorcontndr);
        
        int cc=0;
        for (int i = 0; i < vectorcontndr.length; i++) {
            if(vectorcontndr[i]!=vectorcontndr[cc+1]){
               matriz1.add(vectorcontndr[cc+1]);  
            } 
        }
       
        int numTemp, cantRepite = 0, numRepite = -1; 
        
        for (int i=0; i < vectorcontndr.length-1; i++){
            numTemp = 1;
            for(int j = i+1 ; j< vectorcontndr.length; j++){
                if(vectorcontndr[i] == vectorcontndr[j])
                    numTemp ++;                
            }
            if(numTemp > cantRepite){
                cantRepite = numTemp;
                numRepite = vectorcontndr[i];
            }
        }
        JOptionPane.showMessageDialog(null,"El # que mas se repite es el: " + numRepite + 
                " Porque se repite " + cantRepite+" Veces en la matriz");  
        return numRepite;
        
}
}