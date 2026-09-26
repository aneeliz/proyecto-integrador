# Diagrama de Clases - Semana 5 (Jerarquía de Herencia)

```mermaid
classDiagram
class Persona {
#String nombre
#String dui
+presentarse() String
+getNombre() String
+getDui() String
}

class Cliente {
-String telefono
+getTelefono() String
}

class Empleado {
-double salario
+actualizarNombre(String nuevoNombre) void
+getSalario() double
}

class Visitante {
+toString() String
}

class Estudiante {
-String carnet
-String carrera
+matricular(String materia) void
+toString() String
}

class Docente {
-String especialidad
-int aniosExperiencia
+impartirClase(String materia) void
+toString() String
}

Persona <|-- Cliente
Persona <|-- Empleado
Persona <|-- Visitante
Persona <|-- Estudiante
Persona <|-- Docente
