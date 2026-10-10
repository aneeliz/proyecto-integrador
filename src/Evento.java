package com.uped.documentos.modelo;

public class Evento implements Registro, Auditoria {
    @Override
    public String etiqueta() {
        return Registro.super.etiqueta() + "+" + Auditoria.super.etiqueta();
    }
}
