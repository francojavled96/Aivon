/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aivon;

/**
 *
 * @author franc
 */
public class Producto {
    

    private int codigo;
    private String nombre;
    private String uso;
    private double tamanioCm3;
    private double precioVenta;
    private double precioCosto;

    public Producto(int codigo, String nombre, String uso,
                    double tamanioCm3, double precioVenta, double precioCosto) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.uso = uso;
        this.tamanioCm3 = tamanioCm3;
        this.precioVenta = precioVenta;
        this.precioCosto = precioCosto;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUso() {
        return uso;
    }

    public double getTamanioCm3() {
        return tamanioCm3;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }
    
    

    public double calcularGanancia() {
        return precioVenta - precioCosto;
    }
}

    

