import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Producto> inventario =  new ArrayList<>();
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            mostrarMenuPrincipal();
            System.out.print("Seleccione una opcion :");
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    // Registrar
                    break;
                case "2":
                    // Listar
                    break;
                case "3":
                    // Buscar
                    break;
                case "4":
                    // Vender
                    break;
                case "5":
                    // Resumen
                    break;
                case "6":
                    // Y las mas obvia salir 
                    System.out.println("Hasta luego");
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }
    public static void mostrarMenuPrincipal(){
        System.out.println("====tienda de videojuegos====");
        System.out.println("1 . Registrar producto");
        System.out.println("2 .  Listar inventario");
        System.out.println("3 . Buscar producto por nombre");
        System.out.println("4 . Vender producto");
        System.out.println("5 . Resumen de inventario");
        System.out.println("6 . Salir");
    }
    public static void registrarProducto(){
        System.out.println("1 . Producto Fisico");
        System.out.println("2 . Producto Digital");
        System.out.println("Seleccione el tipo de formato : ");
        String tipo = sc.nextLine();   
        if (tipo.equals("1")) {
            
        } else if (tipo.equals("2")){

        }else{
            System.err.println("Opcion invalida , vuelva a intentarlo");
        }

    }
}
