package com.uped.documentos.modelo;

public class MainDocumentos {
    public static void main(String[] args) {
        Exportable[] lote = {
                new Factura(1001, 125),
                new Producto("Teclado", 35),
                new ReporteVentas("Septiembre", 340)
        };

        System.out.println("--- Exportar ---");
        for (Exportable e : lote) {
            System.out.println(e.exportar());
        }

        System.out.println("--- Imprimir ---");
        for (Exportable e : lote) {
            if (e instanceof Imprimible) {
                Imprimible p = (Imprimible) e;
                p.imprimir();
            } else {
                System.out.println("(solo exportable) " + e.exportar());
            }
        }

        System.out.println("--- Exportador ---");
        Exportador.volcar(lote);
        Exportador.volcar(lote[1]);

        System.out.println("--- Interfaz ---");
        System.out.println(lote[0].exportarConFecha("2026-10-04"));
        System.out.println(Exportable.version());
        System.out.println("Maximo de campos: " + Exportable.MAX_CAMPOS);

        Auditable a = new FacturaAuditada(1002, 80, "ana");
        System.out.println(a.exportar() + " por " + a.usuario());
        System.out.println(a instanceof Exportable);
        System.out.println(a instanceof Imprimible);
        System.out.println(new Evento().etiqueta());
    }
}