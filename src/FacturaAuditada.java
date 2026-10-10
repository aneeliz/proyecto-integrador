package com.uped.documentos.modelo;

public class FacturaAuditada extends Factura implements Auditable {
    private String usuario;

    public FacturaAuditada(int numero, int total, String usuario) {
        super(numero, total);
        this.usuario = usuario;
    }

    @Override
    public String usuario() {
        return usuario;
    }
}