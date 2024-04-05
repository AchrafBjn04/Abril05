package com.softtek.presentacion;

import com.softtek.model.Gerente;
import com.softtek.model.Operador;
import com.softtek.model.Vendedor;

public class HerenciaEj02 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gerente", 1500, 500);
        Vendedor vendedor = new Vendedor("Vendedor", 1300, 50, 0.20);
        Operador operador = new Operador("Operador", 1200, 125, 0.32);

        System.out.println("Nómina del " + gerente.getNombre() + ": " + gerente.calcularNomina() + "€");
        System.out.println("Nómina del " + vendedor.getNombre() + ": " + vendedor.calcularNomina() + "€");
        System.out.println("Nómina del " + operador.getNombre() + ": " + operador.calcularNomina() + "€");
    }
}
