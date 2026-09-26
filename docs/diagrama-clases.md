# Diagrama de Clases - Semana 4

```mermaid
classDiagram
class Pedido {
-int numero
-double total
-String estado
+getNumero() int
}

class Suscripcion {
-String usuario
-String plan
-LocalDate inicio
-int meses
+gratuita(String usuario)$ Suscripcion
+premium(String usuario)$ Suscripcion
+toString() String
}

class ConfiguracionReporte {
-String titulo
-boolean incluirGrafico
-String formato
+toString() String
}

class Carrito {
-List~String~ items
+agregar(String producto) void
+getItems() List~String~
}

class Empleado {
-String dui
-LocalDate fechaIngreso
-String cargo
+ascender(String nuevoCargo) void
+toString() String
}

class Punto {
-double x
-double y
+mover(double dx, double dy) Punto
+toString() String
}

class Vehiculo {
-String placa
-String marca
-int kilometraje
-validar(String placa, int kilometraje) void
+nuevo(String placa, String marca)$ Vehiculo
+recorrer(int km) void
+toString() String
}

class LibroBiblioteca {
-String titulo
-String autor
-int ejemplaresDisponibles
-validar(String titulo, int ejemplares) void
+unico(String titulo, String autor)$ LibroBiblioteca
+prestar() boolean
+toString() String
}

class Transaccion {
-String id
-double monto
-String cuentaOrigen
-String cuentaDestino
-String descripcion
-LocalDateTime fechaHora
+toString() String
}
