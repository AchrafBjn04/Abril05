package com.softtek.presentacion;

import com.softtek.model.Bateria;
import com.softtek.model.Flauta;
import com.softtek.model.Guitarra;
import com.softtek.model.InstrumentoMusical;

public class HerenciaEj04 {
    public static void main(String[] args) {
        InstrumentoMusical guido = new Guitarra("Thomann", "Niqueladas");
        InstrumentoMusical bataca = new Bateria("Roland", 3);
        InstrumentoMusical ham = new Flauta("Moeck", "madera");
        InstrumentoMusical[] instrumentos = {guido, bataca, ham};

        for (InstrumentoMusical instrumento: instrumentos) {
            System.out.println("Marca de intrumento: " + instrumento.getMarca() + " | Sonido: " + instrumento.emitirSonido());
        }
    }
}
