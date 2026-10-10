package com.uped.documentos.modelo;

public interface Registro {
    default String etiqueta() {
        return "REG";
    }
}
