public class Instagram {
    public static void main(String[] args) {
        System.out.println("***Iniciando sistema***");
        crearPublicacion();
    }
    static void crearPublicacion(){
        Publicacion publicacion_fernando = new Publicacion("1" , "fernando");
        Publicacion publicacion_feña = new Publicacion("2" , "feña");
        Publicacion publicacion_nose = new Publicacion("3" , "nose");
        System.out.println(publicacion_fernando.getAutor());
        System.out.println(publicacion_feña.getAutor());
        System.out.println(publicacion_nose.getAutor()); 
        System.out.println("Los likes de" + publicacion_fernando.getLikes());
        System.out.println("Los likes de" + publicacion_feña.getLikes());
        System.out.println("Los likes de" + publicacion_nose.getLikes());
    }
}
