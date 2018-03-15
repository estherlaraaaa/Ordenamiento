/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datospersonales;

/**
 *
 * @author User
 */
public class DatosPersonales {
    
    String nombre;
    String apellido;
    String nacionalidad;
    String sexo;
    String estado_civil;
    String ocupacion;
    String tipo_de_sangre; 
    int fecha_de_nacimiento;
    String lugar_de_nacimiento; 
    int edad;
    int dui;
    int carne;
    
    public DatosPersonales(String nombre,String apellido, String nacionalidad, String sexo, String estado_civil, String ocupacion, String tipo_de_sangre, int fecha_de_nacimiento,String lugar_de_nacimiento, int edad, int carne, int dui ){
        this.nombre= nombre;
        this.apellido= apellido;
        this.nacionalidad= nacionalidad;
        this.sexo= sexo;
        this.estado_civil= estado_civil;
        this.ocupacion= ocupacion; 
        this.tipo_de_sangre= tipo_de_sangre; 
        this.fecha_de_nacimiento= fecha_de_nacimiento;
        this.lugar_de_nacimiento= lugar_de_nacimiento; 
        this.edad= edad;
        this.dui= dui;
        this.carne= carne; 
    }
    
    public void imprimir(){
        System.out.println("Datos personales" + "\n"); 
        System.out.println("Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Nacionalidad: " + nacionalidad + "\n" + "Sexo: " + sexo + "\n" + "Estado civil: " + estado_civil + "\n" + "Ocupación: " + ocupacion + "\n" + "Tipo de sangre: " + tipo_de_sangre + "\n" + "Fecha de nacimiento: " + fecha_de_nacimiento + "\n" + "Lugar de nacimiento: " + lugar_de_nacimiento + "\n" + "Edad: " + edad + "\n" + "Número de carne: " + carne + "\n" + "Número de dui: " + dui + "\n");
    }
    
    public static void main(String[] args) {
        DatosPersonales nombre; 
        nombre = new DatosPersonales ("Esther María", "Lara García", "Salvadoreña", "Femenino", "Soltera", "Estudiante", "A-", 280798, "San Salvador, El Salvador", 19, 49717, 22545);
        
        nombre.imprimir();
    }
    
}
