package com.uped.transporte.modelo;

public abstract class Vehiculo {
    protected String placa;
    protected double kilometrosRecorridos;

    public Vehiculo(String placa, double kilometrosRecorridos) {
    this.placa = placa;
    this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public abstract double calcularCostoPeaje();

    public final void mostrarFicha() {
    System.out.println("Placa: " + placa + " | Km recorridos: " + kilometrosRecorridos);
    }
}