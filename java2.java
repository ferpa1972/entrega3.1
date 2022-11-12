import java.util.Scanner;

public class java2{


    public static void main(String[] args){

        String nombre;
        String apellido;
        String edad;
        String estatura;

        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = ingreso.nextLine();
        System.out.println("Escriba su apellido");
        apellido = ingreso.nextLine();
        System.out.println("ingrese su edad");
        edad = ingreso.nextLine();
        System.out.println(" Ingrses su estatura");
        estatura= ingreso.nextLine();
        System.out.println("Hola "+nombre+ " "+apellido+" , tiene "+edad+" años y mide "+estatura);
        
    }
}