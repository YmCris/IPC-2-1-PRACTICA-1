package ymcris.ipc2.practica1.hyruleevents.intermediary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;

/**
 * Clase ValidacionArchivo
 *
 * @author YmCris
 * @since Aug 15, 2025
 */
public class ValidacionArchivo {

    // VARIABLES DE REFERENCIA -------------------------------------------------
    private File archivoSalida;
    private File archivoEntrada;
    private Connection connection;
    private String rutaCarpetaSalida;
    private String rutaArchivoEntrada;

    // VARIABLES PRIMITIVAS ----------------------------------------------------
    // INSTANCIAS --------------------------------------------------------------
    // MÉTODO CONSTRUCTOR ------------------------------------------------------
    public ValidacionArchivo(Connection connection) {
        this.connection = connection;
    }

    // MÉTODOS CONCRETOS -------------------------------------------------------
    // ------------------------- MÉTODOS DE VALIDACIÓN -------------------------
    public boolean todoEnOrden() {
        return contarLineasEnTexto() != 0;
    }

    public boolean estaVacio() {
        return contarLineasEnTexto() == 0;
    }

    public static boolean esDecimal(String linea) {
        try {
            Double.valueOf(linea);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // ----------------------------- LEER ARCHIVO ------------------------------
    private int contarLineasEnTexto() {
        int contador = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada))) {
            while (reader.readLine() != null) {
                contador++;
            }
        } catch (IOException ex) {
            System.out.println("Hubo un error al leer la línea");
        }
        return contador;
    }

    public String[] contenidoTexto() {
        int contador = 0;
        String[] contenido;
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada))) {
            String temp;
            contenido = new String[contarLineasEnTexto()];
            while ((temp = reader.readLine()) != null) {
                contenido[contador++] = temp;
            }
            for (String string : contenido) {
                System.out.println(string);
            }
        } catch (IOException e) {
            System.out.println("No se pudo leer el contenido del archivo " + archivoEntrada.getName() + " porque " + e.getMessage());
        }
        return null;
    }

    // ------------------------------- ARCHIVOS --------------------------------
    public void obtenerArchivo() {
        archivoEntrada = new File(rutaArchivoEntrada);
    }

    // GETTERS -----------------------------------------------------------------
    public File getArchivoEntrada() {
        return archivoEntrada;
    }

    public File getArchivoSalida() {
        return archivoSalida;
    }

    public String getRutaArchivoEntrada() {
        return rutaArchivoEntrada;
    }

    public String getRutaCarpetaSalida() {
        return rutaCarpetaSalida;
    }

    public Connection getConnection() {
        return connection;
    }

    // SETTERS -----------------------------------------------------------------
    public void setRutaCarpetaSalida(String rutaCarpetaSalida) {
        this.rutaCarpetaSalida = rutaCarpetaSalida;
    }

    public void setRutaArchivoEntrada(String rutaArchivoEntrada) {
        this.rutaArchivoEntrada = rutaArchivoEntrada;
    }

}
