public class ProductoFisico extends Producto {
    private int costoEnvio;
    
    public ProductoFisico(String nombre , int stock , int precioBase , int costoEnvio){
        super(nombre , stock , precioBase);
        this.costoEnvio = costoEnvio;
    }
    @Override 
    public int calcularPrecioFinal(){
        return getPrecioBase() + costoEnvio;
    }
    @Override 
    public String mostrarInfo(){
        return "| Fisico | " + "| Nombre |" + getNombre() + "| Precio Base |" + getPrecioBase() + "| Envio |" + this.costoEnvio + "| Precio Final | " + calcularPrecioFinal() + "| Stock |" + getStock();
    }
}
