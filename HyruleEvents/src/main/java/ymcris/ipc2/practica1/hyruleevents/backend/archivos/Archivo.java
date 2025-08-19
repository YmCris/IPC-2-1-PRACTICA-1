package ymcris.ipc2.practica1.hyruleevents.backend.archivos;

import java.sql.Connection;
import ymcris.ipc2.practica1.hyruleevents.backend.db.DBQuery;
import ymcris.ipc2.practica1.hyruleevents.backend.db.DBInsert;
import ymcris.ipc2.practica1.hyruleevents.intermediary.ValidacionArchivo;

/**
 * Clase Archivo
 *
 * @author YmCris
 * @since Aug 15, 2025
 */
public class Archivo {

    // VARIABLES DE REFERENCIA -------------------------------------------------
    private DBQuery query;
    private DBInsert insert;
    private Connection connection;
    private ValidacionArchivo validacion;

    // VARIABLES PRIMITIVAS ----------------------------------------------------
    private boolean todoEstaEnOrden;

    // INSTANCIAS --------------------------------------------------------------
    // MÉTODO CONSTRUCTOR ------------------------------------------------------
    public Archivo(Connection connection, ValidacionArchivo validacion, DBQuery query, DBInsert insert) {
        this.query = query;
        this.insert = insert;
        this.todoEstaEnOrden = true;
        this.connection = connection;
        this.validacion = validacion;
    }

    // MÉTODOS CONCRETOS -------------------------------------------------------
    // ESTOS MÉTODOS INTRODUCEN LA INFORMACIÓN FINAAAL A LA BASE DE DATOS
    
}
