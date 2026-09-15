import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Producto> inventario = new ArrayList<>();

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            mostrarMenuPrincipal();
            System.out.print("Seleccione una opcion :");
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    // Registrar
                    registrarProducto();
                    break;
                case "2":
                    // Listar
                    listarInventario();
                    break;
                case "3":
                    // Buscar
                    buscarProducto();
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

    public static void mostrarMenuPrincipal() {
        System.out.println("====tienda de videojuegos====");
        System.out.println("1 . Registrar producto");
        System.out.println("2 .  Listar inventario");
        System.out.println("3 . Buscar producto por nombre");
        System.out.println("4 . Vender producto");
        System.out.println("5 . Resumen de inventario");
        System.out.println("6 . Salir");
    }

    public static void registrarProducto() {
        System.out.println("1 . Producto Fisico");
        System.out.println("2 . Producto Digital");
        System.out.println("Seleccione el tipo de formato : ");
        String tipo = sc.nextLine();
        if (tipo.equals("1")) {
            System.out.println("Ingrese el nombre del producto");
            String nombreProducto = sc.nextLine();
            System.out.println("Precio base del producto");
            int precioBase = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese el costo de envio del producto");
            int costoEnvio = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese el stock del producto");
            int stock = Integer.parseInt(sc.nextLine());
            Producto producto = new ProductoFisico(nombreProducto, stock, precioBase, costoEnvio);
            inventario.add(producto);

        } else if (tipo.equals("2")) {
            System.out.println("Ingrese el nombre del producto digital");
            String nombreProductoDigital = sc.nextLine();
            System.out.println("Precio base del producto");
            int precioBase = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese el descuento del producto");
            int descuento = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese la plataforma del producto");
            String plataforma = sc.nextLine();
            System.out.println("Ingrese el stock del producto");
            int stock = Integer.parseInt(sc.nextLine());
            Producto productodigital = new ProductoDigital(nombreProductoDigital, stock, precioBase, descuento,plataforma);
            inventario.add(productodigital);
        } else {
            System.err.println("Opcion invalida , vuelva a intentarlo");
        }
    }

    public static void listarInventario() {
        for (Producto p : inventario) {
            System.out.println(p.mostrarInfo());
        }
    }

    public static void buscarProducto() {
        System.out.println("Nombre del juego ");
        String nombreProducto = sc.nextLine();
        for (Producto producto : inventario) {
            if (producto.getNombre().contains(nombreProducto)) {
                System.out.println(producto.mostrarInfo());
            } 
        }
    }

    public static void venderProducto() {
        System.out.println("Vendiendo producto");
        String juegoVender = sc.nextLine();
        for (Producto producto : inventario) {
            
        }
    }
}
