package ymcris.ipc2.practica1.hyruleevents.backend.archivos;

import java.io.File;
import java.sql.Connection;
import ymcris.ipc2.practica1.hyruleevents.intermediary.ValidacionArchivo;

/**
 * Clase Archivo
 *
 * @author YmCris
 * @since Aug 15, 2025
 */
public class Archivo {

    // VARIABLES DE REFERENCIA -------------------------------------------------
    private File file;
    private Connection connection;
    private ValidacionArchivo validacion;

    // VARIABLES PRIMITIVAS ----------------------------------------------------
    private boolean todoEstaEnOrden;

    // INSTANCIAS --------------------------------------------------------------
    // MÉTODO CONSTRUCTOR ------------------------------------------------------
    public Archivo(Connection connection, ValidacionArchivo validacion) {
        this.todoEstaEnOrden = true;
        this.connection = connection;
        this.validacion = validacion;
    }

    // MÉTODOS CONCRETOS -------------------------------------------------------
    // GETTERS -----------------------------------------------------------------
    public boolean todoEstaEnOrden() {
        return todoEstaEnOrden;
    }

    // SETTERS -----------------------------------------------------------------
    public void setFile(File file) {
        this.file = file;
    }

}
