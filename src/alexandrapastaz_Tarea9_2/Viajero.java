/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alexandrapastaz_Tarea9_2;
import java.util.Scanner;
public class Viajero {
    //atributos privados
    private String dni;
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    private String direccion;
    private static int numObjetos = 0;
    
    //Constructores con parametros
    public Viajero(String dni, String nombre, String apellidos,String nacionalidad, String direccion){      
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        this.numObjetos++;
    
    }
    //Constructores sin parametros
    public Viajero() {
        this.dni = "";
        this.nombre = "";
        this.apellidos = "";
        this.nacionalidad = "";
        this.direccion = "";
        this.numObjetos++;
    }

    //GETTERS
    public String getDni() {return dni;}
    public String getNombre() {return nombre;}
    public String getApellidos() {return apellidos;}
    public String getNacionalidad() {return nacionalidad;}
    public String getDireccion() {return direccion;}
    public static int getNumObjetos() {return numObjetos;}
    //SETTERS
    public void setDni(String dni) {this.dni = dni;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    public void setNacionalidad(String nacionalidad) {this.nacionalidad = nacionalidad;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    
    
    //Metodo getInfo con formato "normal" o "pausado" para devolver informacion.
    public void getInfo(String formato){
        if(formato.equalsIgnoreCase("normal")){
            System.out.println("DNI: " + dni);
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellidos: " + apellidos);
            System.out.println("Nacionalidad: " + nacionalidad);
            System.out.println("Direccion: " + direccion);
        }else if (formato.equalsIgnoreCase("pausado")){
            Scanner sc = new Scanner(System.in);
            System.out.println("DNI: " + dni);
            sc.nextLine();
            System.out.println("Nombre: " + nombre);
            sc.nextLine();
            System.out.println("Apellidos: " + apellidos);
            sc.nextLine();
            System.out.println("Nacionalidad: " + nacionalidad);
            sc.nextLine();
            System.out.println("Direccion: " + direccion);
            sc.nextLine();
        }else {
            System.out.println("Formato no reconocido. Use 'normal o 'pausado'.");
        }
    
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Viajero v1 = new Viajero("12345678A","Ana","Lago sol","Española","Calle Mayor 10");
        Viajero v = new Viajero();
        System.out.println("Dame DNI:");v.setDni(sc.nextLine());
        System.out.println("Dame NOMBRE:");v.setNombre(sc.nextLine());
        System.out.println("Dame APELLIDOS:");v.setApellidos(sc.nextLine());
        System.out.println("Dame NACIONALIDAD:");v.setNacionalidad(sc.nextLine());
        System.out.println("Dame DIRECCION:");v.setDireccion(sc.nextLine());
        
        System.out.println("****Num objetos creados\t" + Viajero.getNumObjetos());
        System.out.println("    \nMOSTRAR DATOS DE VIAJEROS");
        System.out.println("QUIERES VERLO EN FORMATO: \n 1.PAUSADO(pulsar INTRO)\n 2.NORMAL");
         
        switch(sc.nextInt()){
            case 1: v1.getInfo("pausado");
                    v.getInfo("pausado");break;
            case 2: v1.getInfo("normal");
                    v.getInfo("normal");break;
            default: System.out.println("No es posible visualizar la opcion.");
        }
    }
    
}
