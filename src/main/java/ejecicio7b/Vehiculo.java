/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecicio7b;

import java.util.Objects;

/**
 *
 * @author jorge
 */
public class Vehiculo {
    
    // atributos
    private String bastidor;
    private String marca;
    private String modelo;
    private String color;

    // constructores
    public Vehiculo() {
    }

    public Vehiculo(String bastidor, String marca, String modelo, String color) {
        this.bastidor = bastidor;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    // getters y setters
    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(bastidor).append(":");
        sb.append(marca).append(":");
        sb.append(modelo).append(":");
        sb.append(color);
        return sb.toString();
    }

    // equals y hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.bastidor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        return Objects.equals(this.bastidor, other.bastidor);
    }
    
    
    
    
}
