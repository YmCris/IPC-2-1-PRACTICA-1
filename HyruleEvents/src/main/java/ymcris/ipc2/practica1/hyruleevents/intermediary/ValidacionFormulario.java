package ymcris.ipc2.practica1.hyruleevents.intermediary;

import ymcris.ipc2.practica1.hyruleevents.backend.db.DBConnection;
import ymcris.ipc2.practica1.hyruleevents.backend.formularios.DBInsertion;

/**
 * Clase ValidacionFormulario es la clase encargada de verificar que los datos
 * obtenidos en los formularios sean congruentes
 *
 * @author YmCris
 * @since Aug 16, 2025
 */
public class ValidacionFormulario {

    // VARIABLES DE REFERENCIA -------------------------------------------------
    private String[] contenido;
    private DBConnection connect;
    private DBInsertion insertion;
    private ValidacionBaseDeDatos validacionDB;

    // MÉTODO CONSTRUCTOR ------------------------------------------------------
    public ValidacionFormulario(DBConnection connect) {
        this.connect = connect;
    }

    // MÉTODOS CONCRETOS -------------------------------------------------------
    public void inicializarAtributos() {
        this.insertion = new DBInsertion(validacionDB.getUpdate(), validacionDB.getInsert());
    }

    /**
     * Método encargado de obtener el contenido de UNA INSTRUCCIÓN con su debido
     * formato
     *
     * @param contenidoFormulario Arreglo de todos los datos necesarios
     */
    public void obtenerContenido(String[] contenidoFormulario) {
        contenido = contenidoFormulario;
    }

    // ----------------------------- CONEXIÓN ----------------------------------
    /**
     * Método encargado de transmitir la información a la otra clase encargada
     * de la lógica de validación
     */
    public void transmitirInformacionValidacionDB() {
        validacionDB.setInstrucionFormulario(contenido);
    }

    // GETTERS -----------------------------------------------------------------
    public DBConnection getConnect() {
        return connect;
    }

    public String[] getContenido() {
        return contenido;
    }

    public DBInsertion getInsertion() {
        return insertion;
    }

    // SETTERS -----------------------------------------------------------------
    public void setValidacionDB(ValidacionBaseDeDatos validacionDB) {
        this.validacionDB = validacionDB;
    }

}
