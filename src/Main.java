public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        paciente1.nombre = "Juan Perez";
        paciente1.edad = 45;
        paciente1.diagnostico = "Hipertension";

        paciente1.mostrarInformacion();
    }
}