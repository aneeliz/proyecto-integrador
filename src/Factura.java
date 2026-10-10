package com.uped.documentos.modelo;

public class Factura implements Exportable, Imprimible {
    private int numero;
    private int total;

    public Factura(int numero, int total) {
        this.numero = numero;
        this.total = total;
    }

    @Override
    public String exportar() {
        return "FACTURA;" + numero + ";" + total;
    }

    @Override
    public void imprimir() {
        System.out.println("== FACTURA No. " + numero + " ==");
        System.out.println("Total: $" + total);
    }
}
