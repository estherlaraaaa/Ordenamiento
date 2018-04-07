package inventario;

import inventario.Menu;
import java.util.Scanner; 


//package inventario;

/**
 *
 * @author User
 */
public class Inventario {

    String producto;
    int cantidad;
    double costo;
    String proveedor;
    String telefono;
    
     Inventario() {
        
    }
    public Inventario( String producto, int cantidad, double costo, String proveedor, String telefono){
        this.producto= producto; 
        this.cantidad= (int) cantidad;
        this.costo=  costo; 
        this.proveedor= proveedor;
        this.telefono= telefono; 
    }
    
     public String getProducto(){
        return producto;
    }
    public void setProducto(String producto){
        this.producto = producto;
    }
    public String getProveedor(){
        return proveedor;
    }
    public void setProveedor(String proveedor){
        this.proveedor = proveedor;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public double getCosto(){
        return costo;
    }
    public void setCosto(double costo){
        this.costo = costo;
    }

    public String getTelefono(){
     return telefono;   
    }
    public void  setTelefono(String telefono){
        this.telefono = telefono;
    }

    
    public void imprimir(){
        System.out.println("-------INVENTARIO--------"+"\n"); 
        System.out.println("---Productos, cantidad, costo, proveedor y telefono---"+"\n");
        System.out.println("Producto: " + producto + "\n" + "Cantidad: " + cantidad + "\n" + "Costo: " + costo + "\n" + "Proveedor: "+ proveedor + "\n" + "Telefono: " + telefono + "\n");
        
    }
    
    
    public static void main(String[] args) {
        
    
        
        Inventario producto1, producto2, producto3, producto4, producto5;
        producto1= new Inventario ("Servilletas", 15, 3, "Papel higienico Scott", "22556644" ); 
        producto2= new Inventario ("Jabon", 20,  2.50, "Protex", "33665544"); 
        producto3= new Inventario ("Pilas", 50,  3.60, "Duracell", "66554499");
        producto4= new Inventario ("Azucar", 20,  5.0, "flor del cañal", "99886655");
        producto5= new Inventario ("Frijoles", 45,  4.50, "Don frijol", "44223366");
        
        producto1.imprimir();
        producto2.imprimir();
        producto3.imprimir();
        producto4.imprimir();
        producto5.imprimir();
        

        Menu menu = new Menu();
       
        

      
        menu.mostrar();
        
        
    }

   
    }


  
    
        
        
    