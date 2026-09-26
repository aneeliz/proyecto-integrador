package com.uped.proyecto.modelo;

import java.time.LocalDateTime;

public class Transaccion {
    private final String id;
    private final double monto;
    private final String cuentaOrigen;
    private final String cuentaDestino;
    private final String descripcion;
    private final LocalDateTime fechaHora;

    private Transaccion(Builder builder) {
        this.id = builder.id;
        this.monto = builder.monto;
        this.cuentaOrigen = builder.cuentaOrigen;
        this.cuentaDestino = builder.cuentaDestino;
        this.descripcion = builder.descripcion;
        this.fechaHora = builder.fechaHora;
    }

    public static class Builder {
        private String id;
        private double monto;
        private String cuentaOrigen = "CUENTA-DEFAULT";
        private String cuentaDestino = "CAJA-GENERAL";
        private String descripcion = "Sin descripción";
        private LocalDateTime fechaHora = LocalDateTime.now();

        public Builder(String id, double monto) {
            this.id = id;
            this.monto = monto;
        }

        public Builder cuentaOrigen(String cuenta) {
            this.cuentaOrigen = cuenta;
            return this;
        }

        public Builder cuentaDestino(String cuenta) {
            this.cuentaDestino = cuenta;
            return this;
        }

        public Builder descripcion(String desc) {
            this.descripcion = desc;
            return this;
        }

        public Transaccion build() {
            if (monto <= 0) {
                throw new IllegalArgumentException("El monto debe ser mayor a 0.");
            }
            return new Transaccion(this);
        }
    }

    @Override
    public String toString() {
        return "Transaccion{id='" + id + "', monto=" + monto + ", origen='" + cuentaOrigen
                + "', destino='" + cuentaDestino + "', descripcion='" + descripcion + "'}";
    }
}