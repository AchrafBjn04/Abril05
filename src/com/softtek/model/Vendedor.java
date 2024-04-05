package com.softtek.model;

public class Vendedor extends Empleado {
    private double ventas;
    private double comision;

    public Vendedor() { }

    public Vendedor(String nombre, double sueldo, double ventas, double comision) {
        super(nombre, sueldo);
        this.ventas = ventas;
        this.comision = comision;
    }

    @Override
    public double calcularNomina() {
        double sueldoVentas = super.calcularNomina() + (ventas*comision);
        return (sueldoVentas*Empleado.PORCENTAJE)+sueldoVentas;
    }
}
