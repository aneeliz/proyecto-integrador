# Diagrama de Clases - Semana 10 (Polimorfismo: Sobrecarga y Sobrescritura)

```mermaid
classDiagram
class Notificacion {
<<abstract>>
#String destinatario
#String mensaje
+enviar()* void
+enviar(int veces) void
+getDestinatario() String
}

class NotificacionEmail {
+enviar() void
}

class NotificacionSMS {
+enviar() void
}

class NotificacionPush {
-int prioridad
+enviar() void
}

class GestorNotificaciones {
+notificar(Notificacion n) void
+notificar(Notificacion n, int intentos) void
+notificar(Notificacion n, boolean urgente) void
+notificar(String destinatario, String mensaje) void
}

Notificacion <|-- NotificacionEmail
Notificacion <|-- NotificacionSMS
Notificacion <|-- NotificacionPush
GestorNotificaciones ..> Notificacion : gestiona
