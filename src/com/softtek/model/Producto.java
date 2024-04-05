package com.softtek.model;

import java.text.DecimalFormat;

public class Producto {
    private String nombre;
    private int cantidad;
    private double pvp;

    public Producto() { }

    public Producto(String nombre, int cantidad, double pvp) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.pvp = pvp;
    }

    public double cantidadAPagar(){
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        String cantidadFormateada = formato.format(cantidad * pvp).replace(',', '.');
        return Double.parseDouble(cantidadFormateada);
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPvp() {
        return pvp;
    }
}
