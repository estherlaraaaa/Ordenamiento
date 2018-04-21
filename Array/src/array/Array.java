
package array;

import java.util.Scanner;


public class Array {

    public static void main(String[] args) {
     
        Scanner usuario=new Scanner(System.in);
        
        int lista[]= new int [15];
        
        int i, tope;
        
        System.out.println("Ingrese el limite del arreglo");
        tope= usuario.nextInt();
        
        for (i=0; i<tope;i++){
            System.out.println("valor["+(i+1)+"]= ");
            lista[i]= usuario.nextInt();           
        }
        
        for(i=0;i<tope;i++){
            System.out.print(lista[i]+", ");
        }
        
    }
    
}
