public class Publicacion {
    private String id;
    private String autor;
    private String fechaCreacion;
    int likes;
    protected boolean estaActivo;
    // Protected que solo las clases hijos puedan acceder a ellas
    //cuando un metodo se llama igual que la clase se llama se llama constructor
    public Publicacion(String id , String autor){
        this.id = id;
        this.autor = id;
        this.likes = 0;
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String autor) {
        if(autor.length() > 20){
            System.err.println("Autor no puede estar en blanco o no puede tener espacios");
            this.autor = null;
        }else if (autor.isEmpty()) {
            System.err.println("Error");
        }else{
            this.autor = autor;
        }
    }
    public String getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes += 1;
    }
    public boolean isEstaActivo() {
        return estaActivo;
    }
    public void setEstaActivo(boolean estaActivo) {
        this.estaActivo = estaActivo;
    }
}
