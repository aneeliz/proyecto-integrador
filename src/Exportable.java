package com.uped.documentos.modelo;

public interface Exportable {
    int MAX_CAMPOS = 10;

    String exportar();

    default String exportarConFecha(String fecha) {
        return fecha + "|" + exportar();
    }

    static String version() {
        return "Exportable v1";
    }
}

