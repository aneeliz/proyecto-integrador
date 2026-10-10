package com.uped.documentos.modelo;

public interface Auditoria {
    default String etiqueta() {
        return "AUD";
    }
}
