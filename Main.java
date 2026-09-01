public class Main {
    
    public static void main(String[] args) {
        // Alumno 1 no recibe datos de la clase
        Alumno alu1 = new Alumno();
        // Alumno 2 recibe datos de la clase Alumno
        Alumno alu2 = new Alumno(5 ,"Fernando" , "Macias");
        // traer un getter llamando al metodo getter de mi clase Alumno
        System.out.println("la id de alumno 2 es :" + alu2.getId());
        System.out.println("El nombre del alumno es :" + alu2.getNombre());
        System.out.println("El apellido del alumno es :" + alu2.getApellido());

        //Seteo alu1 con el metodo set , le paso el parametro que quiero y el que corresponda a cada caso si es String , int , float , double
        alu1.setId(2);
        alu1.setNombre("Hola");
        alu1.setApellido("Mundo");

        // Despues lo mando a mostrar en consola con System.out

        System.out.println("la id de alumno 1 es :" + alu1.getId());
        System.out.println("El nombre del alumno es :" + alu1.getNombre());
        System.out.println("El nombre del alumno es :" + alu1.getApellido());


    }
}
