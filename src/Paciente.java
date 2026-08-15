public class Paciente {
    String nombre;
    int edad;
    String diagnostico;

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Diagnostico: " + diagnostico);
    }
}