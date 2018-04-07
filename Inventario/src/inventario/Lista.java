package inventario;


import inventario.Inventario;
import java.util.ArrayList;
import java.util.Scanner;


public class Lista {

    /**
     *
     */
    private final ArrayList<Inventario> productos;
    
    public Lista() {
        productos = new ArrayList<>();
}
    
    public void add(){
        Inventario producto= new Inventario();
        /*productos.add(producto);
        Inventario cantidad= new Inventario();
        productos.add(cantidad);
        Inventario costo= new Inventario();
        productos.add(costo);
        Inventario proveedor= new Inventario();
        productos.add(proveedor);
        Inventario telefono= new Inventario();
        productos.add(telefono);*/
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del producto");
        System.out.print(": ");
        producto.setProducto(leer.nextLine());
        
        System.out.println("Ingrese la cantidad de productos");
        System.out.print(": ");
        producto.setCantidad(leer.nextInt());
        
        System.out.println("Ingrese el costo del producto");
        System.out.print(": ");
        producto.setCosto(leer.nextDouble());
        
        System.out.println("Ingrese el proveedor del producto");
        System.out.print(": ");
        producto.setProveedor(leer.next());
        
        System.out.println("Ingrese el telefono del producto");
        System.out.print(": ");
        producto.setTelefono(leer.next());
        
        productos.add(producto); 
    
    }
    
public void mostrar() {
    System.out.println("AYUDAAAAA");
    
        for ( Inventario p : productos) {
            System.out.println(p.toString());
        }
    }

    void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    void cargar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void descargar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void descartar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
        
    }

    void cargar() {
        
    }

    void descargar() {
       
    }

    void descartar() {
        
    }
    
    
}

