package com.softtek.model;

public class Bateria extends InstrumentoMusical {
    private int noPlatillos;

    public Bateria() { }

    public Bateria(String marca, int noPlatillos) {
        super(marca);
        this.noPlatillos = noPlatillos;
    }

    @Override
    public String emitirSonido() {
        return "*Sonido de batería*";
    }

    public int getNoPlatillos() {
        return noPlatillos;
    }

    public void setNoPlatillos(int noPlatillos) {
        this.noPlatillos = noPlatillos;
    }
}
