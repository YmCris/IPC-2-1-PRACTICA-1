package ymcris.ipc2.practica1.hyruleevents.intermediary;

import ymcris.ipc2.practica1.hyruleevents.backend.db.DBConnection;
import ymcris.ipc2.practica1.hyruleevents.backend.formularios.Formulario;

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
    private Formulario formulario;
    private ValidacionBaseDeDatos validacionDB;

    // MÉTODO CONSTRUCTOR ------------------------------------------------------
    public ValidacionFormulario(DBConnection connect) {
        this.connect = connect;
        this.formulario = new Formulario();
    }

    // MÉTODOS CONCRETOS -------------------------------------------------------
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
    
    // SETTERS -----------------------------------------------------------------
    public void setValidacionDB(ValidacionBaseDeDatos validacionDB) {
        this.validacionDB = validacionDB;
    }

}
