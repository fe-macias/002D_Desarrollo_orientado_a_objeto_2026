import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner lectorEntrada = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombreIngresado = lectorEntrada.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edadIngresada = lectorEntrada.nextInt();

        System.out.println("Hola " + nombreIngresado + ", tienes " + edadIngresada + " años.");

        lectorEntrada.close();
    }
}
