import java.util.Scanner;

public class java3{

    public static void main(String[] args){

        String nombre;
        String apellido;
        String nombrePadre;
        String nombreMadre;

        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = ingreso.nextLine();
        System.out.println("Escriba su apellido");
        apellido = ingreso.nextLine();
        System.out.println("ingrese nombre de su padre");
        nombrePadre = ingreso.nextLine();
        System.out.println(" Ingrses nombre de su madre");
        nombreMadre= ingreso.nextLine();
        System.out.println("Yo "+nombre+ " "+apellido+" , soy hijo de:  "+nombrePadre+" y "+nombreMadre);
        
    }
}
