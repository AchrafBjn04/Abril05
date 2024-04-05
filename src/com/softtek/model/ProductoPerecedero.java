package com.softtek.model;

import java.time.LocalDate;
import java.time.Period;

public class ProductoPerecedero extends Producto{
    private LocalDate fCaducidad;
    private LocalDate fFabricacion;

    public ProductoPerecedero() { }

    public ProductoPerecedero(String nombre, int cantidad, double pvp, LocalDate fCaducidad, LocalDate fFabricacion) {
        super(nombre, cantidad, pvp);
        this.fCaducidad = fCaducidad;
        this.fFabricacion = fFabricacion;
    }

    public long tiempoConsumicion(){
        long diferenciaEnDias = fFabricacion.until(fCaducidad).getDays();
        return diferenciaEnDias;
    }
}
