package ymcris.ipc2.practica1.hyruleevents.intermediary;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.io.BufferedReader;
import ymcris.ipc2.practica1.hyruleevents.backend.archivos.Archivo;
import ymcris.ipc2.practica1.hyruleevents.backend.db.DBConnection;

/**
 * Clase ValidacionArchivo es la clase encargada de obtener la información del
 * frontend y realizar validaciones necesarias para crear comunicarselas al
 * frontend (si es que falla) o al backend (si todo ocurre como debe)
 *
 * @author YmCris
 * @since Aug 15, 2025
 */
public class ValidacionArchivo {

    // VARIABLES DE REFERENCIA -------------------------------------------------
    private Archivo archivo;
    private File archivoEntrada;
    private DBConnection connect;
    private Connection connection;
    private String rutaCarpetaSalida;
    private String rutaArchivoEntrada;
    private ValidacionBaseDeDatos validacionDB;

    // MÉTODO CONSTRUCTOR ------------------------------------------------------
    public ValidacionArchivo(DBConnection connect) {
        this.connect = connect;
        this.connection = connect.getConnection();
        this.archivo = new Archivo(connection, this, connect.getQuery(), connect.getInsert());
    }

    // MÉTODOS CONCRETOS -------------------------------------------------------
    // -------------------------- VERIFICACIONES -------------------------------
    /**
     * Método encargado de verificar si las rutas están en orden (exsiten)
     *
     * @param pathArchivo path archivo
     * @param pathCarpeta path carpeta
     * @return true si existen ambas
     */
    public boolean rutasEnOrden(String pathArchivo, String pathCarpeta) {
        return existeArchivoDeTexto(pathArchivo) && existeCarpeta(pathCarpeta);
    }

    /**
     * Método encargado para evitar que se use un archivo de texto sin vaio.
     *
     * @return true si esta vacio
     */
    public boolean estaVacio() {
        return contarLineasEnTexto() < 1;
    }

    /**
     * Método encargado de verificar si el archivo (cada instruccion tiene la
     * forma adecuada)
     *
     * @return true si el archivo tiene la forma adecuada.
     */
    public boolean formatoDelArchivoEsCorrecto() {
        String[] instrucciones = obtenerArregloDelContenidoDelArchivo();
        try {
            for (String instruccion : instrucciones) {
                darFormatoAUnaInstruccion(instruccion);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // ------------------------ LECTURA DE ARCHIVOS ----------------------------
    /**
     * Método encargado de contra las lineas que contiene el archivo de entrada.
     *
     * @return número de líneas que tiene el archivo de entrada.
     */
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

    /**
     * Método encargado de Leer todo el contenido de un archivo y devuelve un
     * arreglo en que cada posición es una línea.
     *
     * @return Arreglo donde cada posición es una línea del archivo (una
     * instrucción).
     */
    public String[] obtenerArregloDelContenidoDelArchivo() {
        int contador = 0;
        String[] contenido = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada))) {
            String temp;
            contenido = new String[contarLineasEnTexto()];
            while ((temp = reader.readLine()) != null) {
                contenido[contador++] = temp;
            }
        } catch (IOException e) {
            System.out.println("No se pudo leer el contenido del archivo " + archivoEntrada.getName() + " porque " + e.getMessage());
        }
        return contenido;
    }

    // ------------------------------- ARCHIVOS --------------------------------
    /**
     * Método encargado de inicializar el archivo de texto
     */
    public void obtenerArchivo() {
        archivoEntrada = new File(rutaArchivoEntrada);
    }

    /**
     * Método encargado de verificar si exsite la carpeta de salida.
     *
     * @param pathCarpeta - path carpeta.
     * @return true si existe.
     */
    public boolean existeCarpeta(String pathCarpeta) {
        return new File(pathCarpeta).exists();
    }

    /**
     * Método encargado de verificar si exsite el archivo de entrada.
     *
     * @param pathArchivo - path archivo.
     * @return true si existe.
     */
    public boolean existeArchivoDeTexto(String pathArchivo) {
        return new File(pathArchivo).exists();
    }

    /**
     * Método encargado de convertir una instrucción a un arreglo que contiene
     * cada parte de la instrucción
     *
     * @param instruccion Instrucción que se procesará, debe ir en el formato
     * correcto.
     * @return Arreglo con todas las partes de la instrucción.
     */
    public String[] darFormatoAUnaInstruccion(String instruccion) {
        int inicioDeLosParametros = instruccion.indexOf("(");
        int finDeLosParametros = instruccion.lastIndexOf(")");
        String nombreDeLaInstruccion = instruccion.substring(0, inicioDeLosParametros);
        String argumentosDeLaInstruccion = instruccion.substring(inicioDeLosParametros + 1, finDeLosParametros);
        java.util.List<String> lista = new java.util.ArrayList<>();
        StringBuilder temp = new StringBuilder();
        boolean estaDentroDeComillas = false;
        char[] argumentos = argumentosDeLaInstruccion.toCharArray();
        for (char argumento : argumentos) {
            if (argumento == '"') {
                estaDentroDeComillas = !estaDentroDeComillas; // true
            }
            if (argumento == ',' && !estaDentroDeComillas) { // false
                lista.add(temp.toString().replace("\"", "")); // quitar comillas
                temp.setLength(0);
            } else {
                temp.append(argumento);
            }
        }
        if (temp.length() > 0) {
            lista.add(temp.toString().replace("\"", ""));
        }
        String[] resultado = new String[lista.size() + 1];
        resultado[0] = nombreDeLaInstruccion;
        for (int i = 0; i < lista.size(); i++) {
            resultado[i + 1] = lista.get(i);
        }
        return resultado;
    }

    // ---------------------------- CONEXIONES ---------------------------------
    /**
     * Método encargado de hacer la conexión con el backend para almacenar la
     * información.
     */
    public void enviarInformacion() {
        if (formatoDelArchivoEsCorrecto()) {
            validacionDB.setInstruccionesArchivo(obtenerArregloDelContenidoDelArchivo());
            validacionDB.almacenarTodasLasInstruccionesDelArchivoEnLaBaseDeDatos();
        }
    }

    // GETTERS -----------------------------------------------------------------
    public File getArchivoEntrada() {
        return archivoEntrada;
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

    public DBConnection getConnect() {
        return connect;
    }

    public Archivo getArchivo() {
        return archivo;
    }

    // SETTERS -----------------------------------------------------------------
    public void setRutaCarpetaSalida(String rutaCarpetaSalida) {
        this.rutaCarpetaSalida = rutaCarpetaSalida;
    }

    public void setRutaArchivoEntrada(String rutaArchivoEntrada) {
        this.rutaArchivoEntrada = rutaArchivoEntrada;
    }

    public void setValidacionDB(ValidacionBaseDeDatos validacionDB) {
        this.validacionDB = validacionDB;
    }

}
