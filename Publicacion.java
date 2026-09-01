public class Publicacion {
    private String id;
    private String autor;
    private String fechaCreacion;
    int likes;
    protected boolean estaActivo;
    public Publicacion(String id , String autor){
        System.out.println("Cosas");
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        if(autor == null || autor.isBlank()){
            System.out.println("Autor no puede estar en blanco o no puede tener espacios");
            this.autor = null;
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
        if (likes < 0 ){
            this.likes = 0;
        } else {
            this.likes = likes;
        }
    }
    public boolean isEstaActivo() {
        return estaActivo;
    }
    public void setEstaActivo(boolean estaActivo) {
        this.estaActivo = estaActivo;
    }
}
