
package aivon;

import java.util.ArrayList;

public class Caja {
    
 

    private int numeroCaja;
    private ArrayList<DetalleCaja> detalles;

    public Caja(int numeroCaja) {

        this.numeroCaja = numeroCaja;
        detalles = new ArrayList<>();
    }

    public void agregarDetalle(DetalleCaja detalle) {
        detalles.add(detalle);
    }

    public double calcularTotalCaja() {

        double total = 0;

        for (DetalleCaja d : detalles) {
            total += d.calcularSubtotal();
        }

        return total;
    
}

    
}
