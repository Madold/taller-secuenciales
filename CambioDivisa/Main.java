package CambioDivisa;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora de divisas");
        
        convertidorDivisa Obj = new convertidorDivisa();
        Scanner Entrada = new Scanner(System.in);
        float dato;
        
        System.out.println("-De Euro a Peso");
        System.out.println("Digite la cantidad en Euro: ");
        dato = Float.parseFloat(Entrada.nextLine());
        Obj.setCantEuro(dato);
        System.out.println("Su conversion de Euro a Peso es de: " + Obj.EuroPeso() + " pesos");
        
        System.out.println("-De Peso a Dolar");
        System.out.println("Digite la cantidad en Pesos: ");
        dato = Float.parseFloat(Entrada.nextLine());
        Obj.setCantPeso(dato);
        System.out.println("Su conversion de Peso a Dolar es de: " + Obj.PesoDolar() + " USD");
        
        System.out.println("-De Peso a Yuan");
        System.out.println("Digite la cantidad en Pesos: ");
        dato = Float.parseFloat(Entrada.nextLine());
        Obj.setCantPeso(dato);
        System.out.println("Su conversion de Peso a Yuan es de: " + Obj.PesoYuan()+ " yuanes");
        
        System.out.println("-De Peso a Dolar Canadiense");
        System.out.println("Digite la cantidad en Pesos: ");
        dato = Float.parseFloat(Entrada.nextLine());
        Obj.setCantPeso(dato);
        System.out.println("Su conversion de Peso a Dolar Canadiense es de: " + Obj.PesoDolarCan() + " Dolar Canadiense");
        
        System.out.println("-De Dolar a Euros");
        System.out.println("Digite la cantidad en Dolares: ");
        dato = Float.parseFloat(Entrada.nextLine());
        Obj.setCantDolar(dato);
        System.out.println("Su conversion de Dolar a Euros es de: " + Obj.DolarEuro() + " Euros");
        
        System.out.println("Gracias por utilizar nuestros servicios");
        System.out.println("Created by Marco Portacio & Andres Suarez");
    }
}
