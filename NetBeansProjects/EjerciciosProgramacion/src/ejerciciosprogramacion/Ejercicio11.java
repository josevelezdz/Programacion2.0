import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author YO :D XD
 */
public class Ejercicio11 {
    
 
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada=new Scanner(System.in);
        
        
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor en X"));
          int  x = numero;
        int numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor en Y"));
          int  y = numero1;
        
        int valor;
        int matriz[][]=new int [x][y];
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                
                System.out.println("Ingrese valor en la Posicion: "+i+j);
                valor=entrada.nextInt();
                matriz[i][j]=valor;
                
            }
            
        }
        int dimen=x*y,a=0;
        
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
        System.out.println("El # que mas se repite es el: " + numRepite + 
                " Porque se repite " + cantRepite+" Veces en la matriz");  
        
}
}