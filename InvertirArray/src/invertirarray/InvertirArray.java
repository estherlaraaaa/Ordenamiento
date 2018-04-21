
package invertirarray;

import java.util.Scanner;

public class InvertirArray {


   
       
    public static void main(String[] args) {
        
        Scanner usuario=new Scanner(System.in);
        
        int lista[]= new int [15];
        
        int i, tope, topesito;
        
        System.out.println("Ingrese el tamaño del arreglo");
        tope= usuario.nextInt();
        
        for (i=0; i<tope;i++){
            System.out.println("valor["+(i+1)+"]= ");
            lista[i]= usuario.nextInt();           
        }
        
        System.out.println("\n Array normal: ");
        for(i=0;i<tope;i++){
            System.out.print(lista[i]+", ");
        }
        
        topesito = tope;
        for(i=0;i<=topesito/2;i++){
            int aux = lista[i];
            lista[i]=lista[topesito-1];
            lista[topesito-1]=aux;
            topesito--;
        }
        
        System.out.println("\n Array invertido: ");
        for (i=0;i<tope;i++){
            System.out.print(lista[i]+", ");
        }
    
}
    
}

