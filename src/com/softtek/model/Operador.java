package com.softtek.model;

public class Operador extends Empleado {
    private int piezas;
    private double incentivo;

    public Operador() { }

    public Operador(String nombre, double sueldo, int piezas, double incentivo) {
        super(nombre, sueldo);
        this.piezas = piezas;
        this.incentivo = incentivo;
    }

    @Override
    public double calcularNomina() {
        double sueldoPiezas = super.calcularNomina()+(piezas*incentivo);
        return (sueldoPiezas*Empleado.PORCENTAJE)+sueldoPiezas;
    }
}
