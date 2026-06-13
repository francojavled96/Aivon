
package aivon;


public class DetalleCaja {
    

    private Producto producto;
    private int cantidad;
    private double subtotal;

    public DetalleCaja(Producto producto, int cantidad) {

        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = producto.getPrecioVenta() * cantidad;
    }

    public double calcularSubtotal() {
        return producto.getPrecioVenta() * cantidad;
    }
    
    public double aplicarDescuento(double porcentaje) {
    return calcularSubtotal() * (1 - porcentaje / 100);
}
    public boolean esCompraGrande() {
    return calcularSubtotal() > 10000;
}
}

    

