package com.uped.documentos.modelo;

public class Exportador {
    public static void volcar(Exportable e) {
        System.out.println(">" + e.exportar());
    }

    public static void volcar(Exportable[] lote) {
        System.out.println("Lote de " + lote.length + " documentos");
        for (Exportable e : lote) {
            volcar(e);
        }
    }
}

