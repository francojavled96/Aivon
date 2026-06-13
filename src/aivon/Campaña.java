
package aivon;

import java.time.LocalDate;


public class Campaña {
    

    private int numero;

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private double monto;

    private boolean activa;

    public Campaña(int numero,
                   LocalDate fechaInicio,
                   LocalDate fechaFin,
                   double monto,
                   boolean activa) {

        this.numero = numero;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
        this.activa = activa;
    }

    public int getNumero() {
        return numero;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public double getMonto() {
        return monto;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public boolean estaActiva() {
        return activa;
    }

    @Override
    public String toString() {
        return "Campaña{" +
                "numero=" + numero +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", monto=" + monto +
                ", activa=" + activa +
                '}';
    }
    
    
}


    

