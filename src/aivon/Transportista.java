
package aivon;


public class Transportista {
    
   
    private int numeroTransportista;
    private String nombreCompleto;
    private String whatsapp;

    private Vehiculo vehiculo;

    public Transportista(int numeroTransportista,
                         String nombreCompleto,
                         String whatsapp,
                         Vehiculo vehiculo) {

        this.numeroTransportista = numeroTransportista;
        this.nombreCompleto = nombreCompleto;
        this.whatsapp = whatsapp;
        this.vehiculo = vehiculo;
    }

    public void escanearPedido(Pedido pedido) {

        System.out.println(
                "Destino final: "
                + pedido.getDomicilio()
        );
    }
    
    
    public boolean estaDisponible() {
    return true; // si tenes estado/capacidad
}
    
    public boolean puedeEntregar(int cantidadPedidos) {
    return cantidadPedidos <= 10;
}
}
    

    

