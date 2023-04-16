/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecicio7b;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author jorge
 */
public class ApartadoB {

    public static void main(String[] args) {

        // leo el fichero
        String fichero = "vehículos.txt";
        List<Vehiculo> lista = leerFichero(fichero);
        
        // ordeno e imprimo la lista creada a partir del fichero
        ordenarPorMarca(lista);
        lista.forEach(v -> System.out.println(v));
        
    }

    // Método para leer los vehículos de un fichero
    private static List<Vehiculo> leerFichero(String fichero) {
        List<Vehiculo> lista = new ArrayList<>();
        String linea;
        try ( Scanner datosFichero = new Scanner(new FileReader(fichero))) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                lista.add(filtrarLinea(linea));
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }

        return lista;
    }

    // Método para filtrar la línea leida
    private static Vehiculo filtrarLinea(String linea) {
        String[] tokens = linea.split("( - )|(:)");
        Vehiculo v = null;

        // Dependiendo del primer valor decido que tipo de vehiculo crear
        switch (tokens[0]) {
            case "0" -> {
                v = new Turismo(tokens[1], tokens[2], tokens[3], tokens[4]);
            }
            case "1" -> {
                v = new Deportivo(tokens[1], tokens[2], tokens[3], tokens[4]);
            }
            case "2" -> {
                v = new Furgoneta(tokens[1], tokens[2], tokens[3], tokens[4]);
            }
        }

        return v;

    }
    
    // Método que ordena la lista de vehículos por marca
    private static void ordenarPorMarca(List<Vehiculo> lista){
        Comparator<Vehiculo> criterio = 
                ((v1, v2) -> v1.getMarca().compareToIgnoreCase(v2.getMarca()));
        lista.sort(criterio);
    }

}
