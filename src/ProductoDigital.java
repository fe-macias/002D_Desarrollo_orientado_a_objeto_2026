public class ProductoDigital extends Producto {
    private int descuento;
    private String plataforma;
    public ProductoDigital(String nombre , int stock , int precioBase , int descuento , String plataforma){
        super(nombre, stock, precioBase);
        this.descuento = descuento;
        this.plataforma = plataforma;
    }
    @Override 
    public int calcularPrecioFinal(){
        return getPrecioBase() - (getPrecioBase() * descuento / 100);
    }
    @Override 
    public String mostrarInfo(){
        return "|Digital | " + "| Nombre |" + getNombre() + "| Plataforma | " + this.plataforma + "| Precio Base | " + getPrecioBase() + "| Descuento | " + this.descuento + "| Precio FInal" + calcularPrecioFinal() + "| Stock |" + getStock();
    }
}
