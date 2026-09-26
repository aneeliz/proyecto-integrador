# Diagrama de Clases - Semana 6 (Clases Abstractas)

```mermaid
classDiagram
class Persona {
<<abstract>>
#String nombre
#String dui
+presentarse() String
+getNombre() String
+getDui() String
+calcularBeneficioAnual()* double
}

class Cliente {
-String telefono
-double comprasAnuales
+getTelefono() String
+getComprasAnuales() double
+calcularBeneficioAnual() double
}

class Empleado {
-double salario
+actualizarNombre(String nuevoNombre) void
+getSalario() double
+calcularBeneficioAnual() double
}

class Estudiante {
-String carnet
-String carrera
-double promedio
+matricular(String materia) void
+calcularBeneficioAnual() double
+toString() String
}

class Docente {
-String especialidad
-int aniosExperiencia
+impartirClase(String materia) void
+calcularBeneficioAnual() double
+toString() String
}

class Voluntario {
-double horasServicio
+calcularBeneficioAnual() double
+toString() String
}

class Proveedor {
-double montoFacturado
+calcularBeneficioAnual() double
+toString() String
}

class Visitante {
+calcularBeneficioAnual() double
+toString() String
}

Persona <|-- Cliente
Persona <|-- Empleado
Persona <|-- Estudiante
Persona <|-- Docente
Persona <|-- Voluntario
Persona <|-- Proveedor
Persona <|-- Visitante
