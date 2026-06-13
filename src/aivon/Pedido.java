
package aivon;

import java.time.LocalDate;
import java.util.ArrayList;


public class Pedido {
    
    //porque las cajas existen. Pero el enunciado dice: Del pedido se guarda cantidad de cajas Por lo tanto debes tener ambas cosas:

    private int numero;
    private LocalDate fechaIngreso;
    private LocalDate fechaEntrega;
    private LocalDate fechaPago;

    private String domicilio;
    private String qr;

    private double importe;

    private boolean pagado;

    private int cantidadCajas;

    private Campaña campaña;

    private ArrayList<Caja> cajas;

    public Pedido(int numero,
                  LocalDate fechaIngreso,
                  String domicilio,
                  String qr,
                  Campaña campaña) {

        this.numero = numero;
        this.fechaIngreso = fechaIngreso;
        this.domicilio = domicilio;
        this.qr = qr;
        this.campaña = campaña;

        cajas = new ArrayList<>();
    }

    public String getDomicilio() {
        return domicilio;
    }
 
    
    
    public void agregarCaja(Caja caja) {

        cajas.add(caja);
        cantidadCajas = cajas.size();
    }

    public double calcularImporte() {

        double total = 0;

        for (Caja caja : cajas) {
            total += caja.calcularTotalCaja();
        }

        importe = total;

        return total;
    }

    public boolean hayPedido(Campaña c) {

        return campaña.equals(c);
    }
}
   

    

