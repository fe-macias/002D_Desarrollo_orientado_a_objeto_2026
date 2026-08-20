/*
Abstraccion , encapsulamiento , herencia y polimorfismo , estudiar herencia y polimorfismo

*/
public class Character {
    String name;
    int hit_points;
    int magic_points;
    boolean is_ally;
    private int age;

    public void validadEdad(int age){
        if(age < 0){
            System.out.println("SU NUMERO HA CAMBIADO A 0");
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    // muestra la edad
    public int mostrarEdad(){
        return age;
    }
    public String validarNombre(String name){
        name.toUpperCase();
        switch (name) {
            case "WEON":
                this.name = "**O*";
            case "MACACO":
                this.name = "****C*";
            case "NIGGA":
                this.name = "*****";
            case "PUTA":
                this.name = "**U**";
            
            default:
                break;
        }

        return this.name;
    }
    public void asignarVida(int hit_points){
        if(hit_points < 0){
            this.hit_points = 0;
        } else {
            this.hit_points = hit_points;
        }
    }
}
