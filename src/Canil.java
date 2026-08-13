public class Canil {
    public static void main(String[] args) {
        System.out.println("Bienvenido al canil");
        System.out.println("***HASTA LUEGO***");

        Perro perro_casa = new Perro();
        perro_casa.nombre = "Sally";
        perro_casa.edad = 6;
        perro_casa.peso = 12.5;
        perro_casa.tiene_vacuna = true;
        if (perro_casa.edad > 2){
            System.out.println("Tu perro pesa mas de dos años");
        } else {
            System.out.println("Tu perro pesa menos de dos años");
        } if (perro_casa.peso > 10){
            System.out.println("Tu perro tiene sobrepeso");
        } else {
            System.out.println("Tu perro esta desnutrido");
        } if (perro_casa.tiene_vacuna == true) {
            System.out.println("Su perro puede ingresar al canil , tiene sus vacunas al dia");
        } else {
            System.out.println("Su perro no esta vacunado , no puede ingresar al canil");
        }
    }
}