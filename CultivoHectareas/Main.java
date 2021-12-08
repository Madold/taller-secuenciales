package CultivoHectareas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        float dato;
        Scanner input = new Scanner(System.in);
        Ganancia obj = new Ganancia();

        //Para quitar la notacion cientifica de Java
        DecimalFormat df = new DecimalFormat("#");
        //Establece el numero maximo de digitos
        df.setMaximumFractionDigits(10);

        System.out.print("Bienvenido, ingrese el numero de hectareas: ");
        dato = Float.parseFloat(input.nextLine());
        obj.setNumHectareas(dato);

        System.out.print("Ingrese el costo del bulto de semilla: ");
        dato = Float.parseFloat(input.nextLine());
        obj.setCostoBultoSemilla(dato);

        System.out.print("Ingrese el costo del bulto de urea: ");
        dato = Float.parseFloat(input.nextLine());
        obj.setCostoBultoUrea(dato);

        System.out.print("Ingrese el costo del galon de fungicida: ");
        dato = Float.parseFloat(input.nextLine());
        obj.setCostoGalonFungicida(dato);

        System.out.print("Ingrese el costo de la tonelada de maiz: ");
        dato = Float.parseFloat(input.nextLine());
        obj.setPrecioToneladaMaiz(dato);

        System.out.println("Sus ganancias serían: " + df.format(obj.calcGanancias()));
    }
}
