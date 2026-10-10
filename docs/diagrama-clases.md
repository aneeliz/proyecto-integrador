# Diagrama de Clases - Semana 11 (Interfaces y Polimorfismo)

```mermaid
classDiagram
class Exportable {
<<interface>>
+MAX_CAMPOS$ int
+exportar()* String
+exportarConFecha(fecha) String
+version()$ String
}

class Imprimible {
<<interface>>
+imprimir()* void
}

class Auditable {
<<interface>>
+usuario()* String
}

class Producto {
-String nombre
-int precio
+exportar() String
}

class Factura {
-int numero
-int total
+exportar() String
+imprimir() void
}

class ReporteVentas {
-String mes
-int unidades
+exportar() String
+imprimir() void
}

class FacturaAuditada {
-String usuario
+usuario() String
}

Exportable <|.. Producto : implements
Exportable <|.. Factura : implements
Imprimible <|.. Factura : implements
Exportable <|.. ReporteVentas : implements
Imprimible <|.. ReporteVentas : implements

Exportable <|-- Auditable : extends
Factura <|-- FacturaAuditada : extends
Auditable <|.. FacturaAuditada : implements
