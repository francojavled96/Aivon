/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aivon;

import java.util.ArrayList;


public class Vehiculo {
    
    private String patente;
    private String modelo;
    private String ubicacionGPS;

    private ArrayList<Pedido> pedidos;

    public Vehiculo(String patente,
                    String modelo,
                    String ubicacionGPS) {

        this.patente = patente;
        this.modelo = modelo;
        this.ubicacionGPS = ubicacionGPS;

        pedidos = new ArrayList<>();
    }

    public void cargarPedido(Pedido pedido) {

        pedidos.add(pedido);
    }

    public void descargarPedido(Pedido pedido) {

        pedidos.remove(pedido);
    }

    public String seguirVehiculo() {

        return ubicacionGPS;
    }
}
   

    

