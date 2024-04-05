package com.softtek.model;

public class Gerente extends Empleado {
    private double bono;

    public Gerente() { }

    public Gerente(String nombre, double sueldo, double bono) {
        super(nombre, sueldo);
        this.bono = bono;
    }

    @Override
    public double calcularNomina() {
        double sueldoBono = super.calcularNomina()+bono;
        return (sueldoBono*Empleado.PORCENTAJE)+sueldoBono;
    }
}
