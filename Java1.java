import java.util.Scanner;

public class Java1{
    public static void main(String[] args){

        String nombre;
        String apellido;

        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = ingreso.nextLine();
        System.out.println("Escriba su apellido");
        apellido = ingreso.nextLine();
        System.out.println("Hola "+nombre+ " "+apellido);
    }
}