package com.uped.proyecto.modelo;

public class Vehiculo {
    private final String placa;
    private String marca;
    private int kilometraje;

    public Vehiculo(String placa, String marca, int kilometraje) {
        validar(placa, kilometraje);
        this.placa = placa;
        this.marca = marca;
        this.kilometraje = kilometraje;
    }

    public Vehiculo(String placa, String marca) {
        this(placa, marca, 0);
    }

    private void validar(String placa, int kilometraje) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("La placa no puede estar vacía.");
        }
        if (kilometraje < 0) {
            throw new IllegalArgumentException("El kilometraje no puede ser negativo: " + kilometraje);
        }
    }

    public static Vehiculo nuevo(String placa, String marca) {
        return new Vehiculo(placa, marca);
    }

    public void recorrer(int km) {
        if (km <= 0) {
            System.out.println("Los kilómetros a recorrer deben ser mayores a 0.");
            return;
        }
        this.kilometraje += km;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    @Override
    public String toString() {
        return "Vehiculo{placa='" + placa + "', marca='" + marca + "', kilometraje=" + kilometraje + "}";
    }
}