import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showmenu();
    }
    static void showmenu(){
        Scanner entrada_input = new Scanner(System.in);
        Character player_character = new Character();
        boolean flag_menu = true;
        System.out.println("****WELCOME TO THE SEVEN KINGDOMS****");
        while (flag_menu) {
            System.out.println("1. Create character");
            System.out.println("2. Visualize character");
            System.out.println("3. Exit");

            System.out.println("Choose an option");

            String user_option = entrada_input.nextLine();
            switch (user_option) {
                case "1":
                    System.out.println("Creating character");
                    // Nombre del personae
                    System.out.println("Enter the name :");
                    player_character.validarNombre(entrada_input.nextLine());
                    // health character
                    System.out.println("Ingrese los puntos de vida:");
                    player_character.hit_points = Integer.parseInt(entrada_input.nextLine());
                    //  points magic
                    System.out.println("Ingrese los puntos magicos : :");
                    player_character.magic_points = Integer.parseInt(entrada_input.nextLine());
                    // Asignar la edad
                    System.out.println("Ingrese la edad:");
                    player_character.validadEdad(Integer.parseInt(entrada_input.nextLine()));
                    break;
                case "2":
                    System.out.println("Ver personaje");
                    System.out.println("Nombre :" + player_character.name);
                    System.out.println("HP :" + player_character.hit_points);
                    System.out.println("MP :" + player_character.magic_points);
                    System.out.print("AGE:" + player_character.mostrarEdad());
                    break;
                case "3":
                    System.out.println("Gracias por jugar");
                    flag_menu = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
}
