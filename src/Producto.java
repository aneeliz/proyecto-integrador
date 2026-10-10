package com.uped.documentos.modelo;

public class Producto implements Exportable {
    private String nombre;
    private int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String exportar() {
        return "PRODUCTO;" + nombre + ";" + precio;
    }
}
