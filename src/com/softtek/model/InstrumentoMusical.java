package com.softtek.model;

public abstract class InstrumentoMusical {
    private String marca;

    public InstrumentoMusical() { }

    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }

    public abstract String emitirSonido();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
