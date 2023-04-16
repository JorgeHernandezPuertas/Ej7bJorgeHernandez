/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecicio7b;

/**
 *
 * @author jorge
 */
public class Deportivos extends Vehiculo {

    // constructores
    public Deportivos() {
    }

    public Deportivos(String bastidor, String marca, String modelo, String color) {
        super(bastidor, marca, modelo, color);
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("1 - ").append(super.toString());
        return sb.toString();
    }
    
    
    
}
