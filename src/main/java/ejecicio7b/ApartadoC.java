/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecicio7b;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class ApartadoC {

    public static void main(String[] args) {

        // Creo una lista de vehículos a partir del fichero vehiculos
        String ficheroVehiculos = "vehículos.txt";
        List<Vehiculo> lista = leerFichero(ficheroVehiculos);

        // Creo los tres archivos de texto
        escribirFicheroDeportivos(lista);
        escribirFicheroFurgonetas(lista);
        escribirFicheroTurismos(lista);
        
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
                v = new Turismo(tokens[1], tokens[2], tokens[3], tokens[4], 
                        Double.parseDouble(tokens[5]), Boolean.parseBoolean(tokens[6]));
            }
            case "1" -> {
                v = new Deportivo(tokens[1], tokens[2], tokens[3], tokens[4], 
                        Double.parseDouble(tokens[5]), Boolean.parseBoolean(tokens[6]));
            }
            case "2" -> {
                v = new Furgoneta(tokens[1], tokens[2], tokens[3], tokens[4], 
                        Double.parseDouble(tokens[5]), Boolean.parseBoolean(tokens[6]));
            }
        }
        return v;
    }

    // Método para escribir el fichero turismos.txt a partir de la lista
    private static void escribirFicheroTurismos(List<Vehiculo> lista) {
        String fichero = "turismos.txt";
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(fichero))) {
            for (Vehiculo v : lista) {
                if (v instanceof Turismo) {
                    flujo.write(v.toString());
                    flujo.newLine();
                }
            }
            flujo.flush();
            System.out.println("Fichero generado con éxito.");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    // Método para escribir el fichero deportivos.txt a partir de la lista
    private static void escribirFicheroDeportivos(List<Vehiculo> lista) {
        String fichero = "deportivos.txt";
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(fichero))) {
            for (Vehiculo v : lista) {
                if (v instanceof Deportivo) {
                    flujo.write(v.toString());
                    flujo.newLine();
                }
            }
            flujo.flush();
            System.out.println("Fichero generado con éxito.");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    // Método para escribir el fichero furgonetas.txt a partir de la lista
    private static void escribirFicheroFurgonetas(List<Vehiculo> lista) {
        String fichero = "furgonetas.txt";
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(fichero))) {
            for (Vehiculo v : lista) {
                if (v instanceof Furgoneta) {
                    flujo.write(v.toString());
                    flujo.newLine();
                }
            }
            flujo.flush();
            System.out.println("Fichero generado con éxito.");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
