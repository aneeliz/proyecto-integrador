package com.uped.musica.modelo;

public class Guitarra extends Instrumento {
    protected String tipo = "cuerda";

    @Override
    public void tocar() {
        System.out.println("Rasgueo de cuerdas");
    }

    public static String identificar() {
        return "Guitarra";
    }
}