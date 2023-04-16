/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecicio7b;

/**
 *
 * @author jorge
 */
public class Furgoneta extends Vehiculo {

    // constructores
    public Furgoneta() {
    }

    public Furgoneta(String bastidor, String marca, String modelo, String color) {
        super(bastidor, marca, modelo, color);
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("2 - ").append(super.toString());
        return sb.toString();
    }
    
}
