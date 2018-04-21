
package ordenamiento;

import java.util.Scanner;

public class Ordenamiento {

  
        public static void main(String[] args) {
            
        Scanner usuario =new Scanner(System.in);
      
        int lista[]= new int[30];
      
        int tope,i,j,aux;
      
        System.out.println("Ingrese el tamaño de la lista ");
        tope=usuario.nextInt();
      
        for(i=0;i<tope;i++){
            System.out.print("Numero["+(i+1)+"]= ");
            lista[i]=usuario.nextInt();
        }
      
        for(i=0;i<tope;i++){
            for(j=i+1;j<tope;j++){
                if(lista[i]>lista[j]){
                    aux=lista[i];
                    lista[i]=lista[j];
                    lista[j]=aux;
                }
            }
        }

        System.out.print("Array= {");
        for(i=0;i<tope;i++){
            System.out.print(lista[i]+",");
        }
        System.out.print("}");
      
    } 
}
    

