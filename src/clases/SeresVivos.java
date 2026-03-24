/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author alexa
 */

//TAREA 9.3 ------>> EJERCICIO 1
class Ser_vivo{
    String nombre_cientifico="";
    String nombre_comun="";
    
    public void alimentacion(){
        System.out.println("Este ser vivo se alienta de...");
    }
    //constructor
    public Ser_vivo(String nombre_cientifico, String nombre_comun) {
        this.nombre_cientifico = nombre_cientifico;
        this.nombre_comun = nombre_comun;    
    }
    
    //Getter
    public String getNombre_cientifico() {return nombre_cientifico;}
    public String getNombre_comun() {return nombre_comun;}
    //Setter
    public void setNombre_cientifico(String nombre_cientifico) {this.nombre_cientifico = nombre_cientifico;}
    public void setNombre_comun(String nombre_comun) {this.nombre_comun = nombre_comun;}         
}

class Animal extends Ser_vivo{
    Double peso;
    Double altura;

    @Override
    public void alimentacion() {
        System.out.println("El animal " + nombre_comun + " (" + nombre_cientifico + ") se alimenta de carne o plantas.");
    }

    //Constructor
    public Animal(String nombre_cientifico, String nombre_comun,Double peso, Double altura) {
        super(nombre_cientifico, nombre_comun);
        this.peso = peso;
        this.altura = altura;
    }
    //Getter
    public Double getPeso() {return peso;}
    public Double getAltura() {return altura;}
    //Setter
    public void setPeso(Double peso) {this.peso = peso;}
    public void setAltura(Double altura) {this.altura = altura;}   
}

class Vegetal extends Ser_vivo{
    Double altura;
    
    @Override
    public void alimentacion() {
        System.out.println("La planta " + nombre_comun + " se alimenta mediante fotosintesis.");
    }
    
    //Constructor
    public Vegetal(String nombre_cientifico, String nombre_comun,Double altura) {
        super(nombre_cientifico, nombre_comun);
        this.altura = altura;
    }
    //Getter y Setter
    public Double getAltura() {return altura;}
    public void setAltura(Double altura) {this.altura = altura;}
}

public class SeresVivos { //clases principal para ejecutar
    public static void main (String[] args){
        Animal gato = new Animal("Felis catus", "Gato", 4.5, 0.25);
        gato.alimentacion();
        
        Vegetal girasol = new Vegetal("Helianthus annuus", "Girasol", 0.2);
        girasol.alimentacion();
    }
}