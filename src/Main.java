import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showmenu();
    }
    static void showmenu(){
        Scanner entrada_input = new Scanner(System.in);
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
                    Character player_character = new Character();
                    String player_character.name = entrada_input.nextLine();
                    break;
                case "2":
                    System.out.println("Ver personaje");
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
