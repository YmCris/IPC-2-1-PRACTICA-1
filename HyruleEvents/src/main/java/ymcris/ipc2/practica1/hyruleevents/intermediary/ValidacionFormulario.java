package ymcris.ipc2.practica1.hyruleevents.intermediary;

import java.sql.Connection;

/**
 * Clase ValidacionFormulario es la clase encargada de verificar que los datos
 * obtenidos en los formularios sean congruentes
 *
 * @author YmCris
 * @since Aug 16, 2025
 */
public class ValidacionFormulario {

    // VARIABLES DE REFERENCIA -------------------------------------------------
    private Connection connection;
    private String[] contenido;

    // VARIABLES PRIMITIVAS ----------------------------------------------------
    // INSTANCIAS --------------------------------------------------------------
    // MÉTODO CONSTRUCTOR ------------------------------------------------------
    public ValidacionFormulario(Connection connection) {
        this.connection = connection;
    }

    // MÉTODOS CONCRETOS -------------------------------------------------------
    public void obtenerContenido(String[] contenidoFormulario) {
        contenido = contenidoFormulario;
        for (String c : contenido) {
            System.out.println(c);
        }
    }

    // GETTERS -----------------------------------------------------------------
    public Connection getConnection() {
        return connection;
    }

    // SETTERS -----------------------------------------------------------------
}
