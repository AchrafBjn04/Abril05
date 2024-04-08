package com.softtek.model;

public abstract class Figura {
    protected int x;
    protected int y;

    public Figura() { }

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea();

    public String mostrarPosicion(){
        return "(" + x + ", " + y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
