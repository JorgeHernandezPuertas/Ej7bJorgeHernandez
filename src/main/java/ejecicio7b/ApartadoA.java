/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecicio7b;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class ApartadoA {

    public static void main(String[] args) {

        // Creo la lista con los 30 vehiculos de prueba
        List<Vehiculo> lista = generarLista();

        // Escribo el fichero
        String fichero = "vehículos.txt";
        escribirFichero(lista, fichero);
    }

    // Método que crea una lista con 30 vehiculos
    private static List<Vehiculo> generarLista() {
        List<Vehiculo> lista = new ArrayList<>();
        lista.add(new Turismo("1", "Seat", "Panda", "Rojo", 24.54, true));
        lista.add(new Turismo("2", "Ford", "5g", "Blanco", 34.54, false));
        lista.add(new Turismo("3", "Otra", "x3", "Amarillo", 44.54, true));
        lista.add(new Turismo("4", "Seat", "alguna", "Azul", 64.54, false));
        lista.add(new Turismo("5", "Hyundai", "nosemarcas", "Rojo", 14.54, true));
        lista.add(new Turismo("6", "Toyota", "prueba", "Negro", 84.54, true));
        lista.add(new Turismo("7", "Otra2", "Panda", "Gris", 24.54, false));
        lista.add(new Turismo("8", "Volkswagen", "qkc", "Marron", 24.84, false));
        lista.add(new Turismo("9", "Volvo", "kl6", "Celeste", 24.24, true));
        lista.add(new Turismo("10", "Smart", "2000x", "Cyan", 28.54, true));
        lista.add(new Deportivo("11", "Seat", "Panda", "Rojo", 26.54, true));
        lista.add(new Deportivo("12", "Ford", "5g", "Blanco", 22.54, false));
        lista.add(new Deportivo("13", "Otra", "x3", "Amarillo", 51.54, true));
        lista.add(new Deportivo("14", "Seat", "alguna", "Azul", 32.54, true));
        lista.add(new Deportivo("15", "Hyundai", "nosemarcas", "Rojo", 76.54, true));
        lista.add(new Deportivo("16", "Toyota", "prueba", "Negro", 11.54, false));
        lista.add(new Deportivo("17", "Otra2", "Panda", "Gris", 9.54, true));
        lista.add(new Deportivo("18", "Volkswagen", "qkc", "Marron", 54.54, true));
        lista.add(new Deportivo("19", "Volvo", "kl6", "Celeste", 23.54, false));
        lista.add(new Deportivo("20", "Smart", "2000x", "Cyan", 21.54, true));
        lista.add(new Furgoneta("21", "Seat", "Panda", "Rojo", 12.54, false));
        lista.add(new Furgoneta("22", "Ford", "5g", "Blanco", 16.54, false));
        lista.add(new Furgoneta("23", "Otra", "x3", "Amarillo", 17.54, false));
        lista.add(new Furgoneta("24", "Seat", "alguna", "Azul", 31.54, true));
        lista.add(new Furgoneta("25", "Hyundai", "nosemarcas", "Rojo", 51.54, true));
        lista.add(new Furgoneta("26", "Toyota", "prueba", "Negro", 41.54, false));
        lista.add(new Furgoneta("27", "Otra2", "Panda", "Gris", 78.54, true));
        lista.add(new Furgoneta("28", "Volkswagen", "qkc", "Marron", 9.54, false));
        lista.add(new Furgoneta("29", "Volvo", "kl6", "Celeste", 2.54, false));
        lista.add(new Furgoneta("30", "Smart", "2000x", "Cyan", 5.54, true));

        return lista;
    }

    // Método para escribir el fichero vehiculos.txt a partir de la lista
    private static void escribirFichero(List<Vehiculo> lista, String fichero) {

        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(fichero))) {
            for (Vehiculo v : lista) {
                flujo.write(v.toString());
                flujo.newLine();
            }
            flujo.flush();
            System.out.println("Fichero generado con éxito.");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
