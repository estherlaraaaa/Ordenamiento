
package media;


public class Media {
    public int valores;
    
    public Media (int valores){
        this.valores= valores;   
    }
    public int getValores(){
        return valores;
    }
    public void setValores(int valores){
        this.valores= valores; 
    }
    

    public static void main(String[] args) {
        Media[] numeros= new Media[10];
        
        numeros[0]= new Media(25);
        numeros[1]= new Media(10);
        numeros[2]= new Media(45);
        numeros[3]= new Media(12);
        numeros[4]= new Media(2);
        numeros[5]= new Media(5);
        numeros[6]= new Media(20);
        numeros[7]= new Media(34);
        numeros[8]= new Media(12);
        numeros[9]= new Media(9);
        
        int suma=0;
        for (int i=0; i<numeros.length; i++){
            suma += numeros[i].getValores();
        }
        double promedio= (double) suma/numeros.length; 
        
        System.out.println("Media =" + promedio);    
    }    
}
