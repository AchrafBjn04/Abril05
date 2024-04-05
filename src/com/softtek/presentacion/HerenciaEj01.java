package com.softtek.presentacion;

import com.softtek.model.ProductoPerecedero;

import java.time.LocalDate;

public class HerenciaEj01 {
    public static void main(String[] args) {
        LocalDate fFabricacion = LocalDate.now();
        LocalDate fCaducidad = LocalDate.of(2027, 06, 24);
        ProductoPerecedero pp = new ProductoPerecedero("Producto", 175, 1.35, fCaducidad, fFabricacion);

        System.out.println("Cantidad a pagar de " + pp.getNombre() + ": " + pp.cantidadAPagar() + "€");
        System.out.println("Tiempo de consumición de " + pp.getNombre() + ": " + pp.tiempoConsumicion());
    }
}
