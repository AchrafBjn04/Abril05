package com.softtek.model;

public class Empleado {
    private String nombre;
    private double sueldo;
    public static final double PORCENTAJE = 0.75;

    public Empleado() { }

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public double calcularNomina(){
        return sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }
}
