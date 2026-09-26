package com.uped.proyecto.modelo;

public abstract class Persona {
    protected String nombre;
    protected String dui;

    public Persona(String nombre, String dui) {
    this.nombre = nombre;
    this.dui = dui;
    }

    public Persona(String nombre) {
    this(nombre, "PENDIENTE");
    }

    public String presentarse() {
    return nombre + " (DUI: " + dui + ")";
    }

    public String getNombre() {
    return nombre;
    }

    public String getDui() {
        return dui;
    }

    public abstract double calcularBeneficioAnual();
}