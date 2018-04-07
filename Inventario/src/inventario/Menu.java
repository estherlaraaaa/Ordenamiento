package inventario;


import static java.time.Clock.system;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {
    //private static Menu menu;
    private final Lista productos; 

    public Menu() {
        productos=new Lista(); 
    }

   /* public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }*/

    public void opciones() {
        System.out.println("----- Menu -----");
        System.out.println("1. Agregar producto");
        System.out.println("2. Eliminar producto");
        System.out.println("3. Modificar producto");
        System.out.println("4. Cargar producto");
        System.out.println("5. Descargar producto");
        System.out.println("6. Descartar producto");
        System.out.println("7. Salir");
        
        Scanner input= new Scanner (System.in);
        int opcion;
        
        System.out.println("Que desea hacer: ");
        opcion= input.nextInt();
        
    }

    public void mostrar() {
        int opcion = 0;
        Scanner leer = new Scanner(System.in);
        Lista producto= new Lista();
        Lista cantidad= new Lista();
        Lista costo= new Lista();
        Lista proveedor= new Lista();
        Lista telefono= new Lista();

      
        while (opcion != 7) {
            opciones();
            try {
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        producto.add();
                        cantidad.add();
                        costo.add();
                        proveedor.add();
                        telefono.add();
                        break;
                    case 2:
                        producto.eliminar();
                        cantidad.eliminar();
                        costo.eliminar();
                        proveedor.eliminar();
                        telefono.eliminar();
                        break;
                    case 3:
                        producto.modificar();
                        cantidad.modificar();
                        costo.modificar();
                        proveedor.modificar();
                        telefono.modificar();
                        break;
                    case 4:
                        producto.cargar();
                        cantidad.cargar();
                        costo.cargar();
                        proveedor.cargar();
                        telefono.cargar();
                        break;                       
                    case 5:
                        producto.descargar();
                        cantidad.descargar();
                        costo.descargar();
                        proveedor.descargar();
                        telefono.descargar();
                        break;
                    case 6:
                        producto.descartar();
                        cantidad.descartar();
                        costo.descartar();
                        proveedor.descartar();
                        telefono.descartar();
                        break;   
                    case 7:
                        System.out.println("Salir");
                        break;
                        
                    default:
                        System.out.println("Por favor ingrese una opcion valida");
                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número");
                leer.nextLine();
            }
        }
    }
}
