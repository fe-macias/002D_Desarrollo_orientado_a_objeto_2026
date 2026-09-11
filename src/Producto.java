public abstract class Producto  {
    private String nombre;
    private int precioBase;
    private int stock;

    public Producto(String nombre , int stock , int precioBase){
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.stock = stock;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getPrecioBase() {
        return precioBase;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public abstract int calcularPrecioFinal();
    public String mostrarInfo(){
        return "Nombre: " + this.nombre + " | Precio base: " + this.precioBase + " | Precio final: " + calcularPrecioFinal() + " | Stock: " + this.stock;
    }
}
