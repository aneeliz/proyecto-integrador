package com.uped.documentos.modelo;

public class ReporteVentas implements Exportable, Imprimible {
    private String mes;
    private int unidades;

    public ReporteVentas(String mes, int unidades) {
        this.mes = mes;
        this.unidades = unidades;
    }

    @Override
    public String exportar() {
        return "REPORTE;" + mes + ";" + unidades;
    }

    @Override
    public void imprimir() {
        System.out.println("== REPORTE DE VENTAS ==");
        System.out.println("Mes: " + mes);
        System.out.println("Unidades vendidas: " + unidades);
    }
}

