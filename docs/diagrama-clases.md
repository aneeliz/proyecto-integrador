# Diagrama de Clases - Semana 9 (Polimorfismo - Módulo Música)

```mermaid
classDiagram
class Instrumento {
<<abstract>>
#String tipo
+tocar()* void
+identificar()$ String
+mostrarTipo() void
}

class Guitarra {
#String tipo
+tocar() void
+identificar()$ String
}

class Piano {
+tocar() void
}

class Bateria {
+tocar() void
}

Instrumento <|-- Guitarra
Instrumento <|-- Piano
Instrumento <|-- Bateria
