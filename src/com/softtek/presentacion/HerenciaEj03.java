package com.softtek.presentacion;

import com.softtek.model.Cuadrado;
import com.softtek.model.Figura;
import com.softtek.model.Triangulo;

public class HerenciaEj03 {
    public static void main(String[] args) {
        Cuadrado cPeque = new Cuadrado();
        cPeque.setX(0);
        cPeque.setY(4);
        cPeque.setLado(5);

        Figura cMediano = new Cuadrado(5, 10, 8);

        Triangulo tPeque = new Triangulo();
        tPeque.setX(0);
        tPeque.setY(9);
        tPeque.setBase(10);
        tPeque.setAltura(10);

        Figura tMediano = new Triangulo(6, 12, 13, 13);

        Figura[] figuras = {cPeque, cMediano, tPeque, tMediano};

        for (Figura figura : figuras) {
            System.out.println("Area-> " + figura.calcularArea());
        }
    }
}
