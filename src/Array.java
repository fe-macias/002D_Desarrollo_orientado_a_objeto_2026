import java.util.Scanner;
import java.util.ArrayList;
public class Array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Llamada al método para que se ejecute el menú
        mostarMenu();
    }

    static void mostarMenu(){
        boolean mostarMenu = true;
        while(mostarMenu){
            System.out.println("***Inicio de programa***");
            System.out.println("1. Probando array");
            System.out.println("2. Probando arraylist");
            System.out.println("3. Salir");
            System.out.println();
            
            String opcion_menu = sc.nextLine();
            switch (opcion_menu) {
                case "1":
                    mostrandoArray();
                    break;
                case "2":
                    probandoArraylist();
                    break;
                case "3":
                    System.out.println("Salir");
                    mostarMenu = false; // Permite romper el bucle while y terminar la ejecución
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

    static void mostrandoArray(){
        Integer[] numeros = new Integer[5];
        numeros[0] = 23;
        numeros[1] = 5;
        String[] alumnos = {"Fernando" , "Camilo" , "Sebastian"};
        System.out.println("La nota de " + alumnos[0] + " es " + numeros[0]);
        
        for (int contador = 0; contador < numeros.length - 1; contador++) {
            System.out.println("hola " + alumnos[0]);
        }
    }
    static void probandoArraylist(){
        System.out.println("******Probando arraylist*******");
        ArrayList<String> alumnos = new ArrayList<>();
        alumnos.add("Fernando Macias");
        alumnos.add("Rogelio");
        alumnos.add("Cristian");
        alumnos.add("Nicole");
        System.out.println(alumnos.get(2));  
        for (String por_cada_alumno : alumnos) {
            System.out.println(por_cada_alumno);
            
        }     
    }
}