package Persona.Viajero;
import java.util.Random;


/**
 *
 * @author alexa
 */
public class alexandrapastaz_tarea9_2_1 {
    public static void main(String[] args) {
        Random rm = new Random();

        int num1 = rm.nextInt(100);
        int num2 = rm.nextInt(100);
        System.out.println("Numero 1 generado: " + num1);
        System.out.println("Numero 2 generado: " + num2);
        int numMax = Math.max(num1, num2);
        System.out.println("El valor del mayor número es: "+ numMax);
        }
}
