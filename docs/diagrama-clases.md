# Diagrama de Clases - Semana 7 (Herencia Multinivel)

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

class Gerente {
-int tamanoEquipo
+getTamanoEquipo() int
+calcularBeneficioAnual() double
+toString() String
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

class DocenteInvestigador {
-int numeroPublicaciones
+getNumeroPublicaciones() int
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

Empleado <|-- Gerente
Docente <|-- DocenteInvestigador


# Diagrama de Clases - Semana 8 (Diseño de Clases Abstractas - Módulo Transporte)

```mermaid
classDiagram
class Vehiculo {
<<abstract>>
#String placa
#double kilometrosRecorridos
+calcularCostoPeaje()* double
+mostrarFicha() void
}

class Automovil {
-double TARIFA_KM
+calcularCostoPeaje() double
}

class Motocicleta {
-double TARIFA_KM
+calcularCostoPeaje() double
}

class CamionDeCarga {
-double TARIFA_KM
-double RECARGO_FIJO
+calcularCostoPeaje() double
}

Vehiculo <|-- Automovil
Vehiculo <|-- Motocicleta
Vehiculo <|-- CamionDeCarga
