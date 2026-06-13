
package aivon;

import java.util.ArrayList;

public class Revendedor {

    private int codigo;
    private String nombre;
    private String telefono;

    private double saldoCuenta;

    private ArrayList<Pedido> pedidos;

    public Revendedor(int codigo,
                      String nombre,
                      String telefono,
                      double saldoCuenta) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.saldoCuenta = saldoCuenta;

        pedidos = new ArrayList<>();
    }

   
    // PEDIDOS
   

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public ArrayList<Pedido> listarPedidos() {
        return pedidos;
    }

   
    // DINERO
  

    public void depositarDinero(double monto) {
        saldoCuenta += monto;
    }

    public void retirarDinero(double monto) throws Exception {

        if (monto > saldoCuenta) {
            throw new Exception("Saldo insuficiente");
        }

        saldoCuenta -= monto;
    }

    public void transferirDinero(Revendedor destino,
                                 double monto) throws Exception {

        retirarDinero(monto);

        destino.depositarDinero(monto);
    }

    // ==========================
    // GETTERS
    // ==========================

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTelefono() {
        return telefono;
    }

    // ==========================
    // TEST G y H
    // ==========================

    public String convertirMoneda(String valor) {
        return valor;
    }

    // ==========================
    // TEST J
    // ==========================

    public void pagoDemorado(long milisegundos)
            throws InterruptedException {

        Thread.sleep(milisegundos);
    }

    @Override
    public String toString() {
        return "Revendedor{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", saldoCuenta=" + saldoCuenta +
                '}';
    }
}