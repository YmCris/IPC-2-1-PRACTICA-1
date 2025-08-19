package ymcris.ipc2.practica1.hyruleevents.backend.formularios;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import ymcris.ipc2.practica1.hyruleevents.backend.db.DBUpdate;
import ymcris.ipc2.practica1.hyruleevents.backend.db.DBInsert;

/**
 * Clase DBInsertion es la clase encargada de recibir información de la clase
 * validación formulario para poder comunicarse luego con la base de datos.
 *
 * @author YmCris
 * @since Aug 18, 2025
 */
public class DBInsertion {

    // VARIABLES DE REFERENCIA -------------------------------------------------
    private DBUpdate update;
    private DBInsert insert;

    // MÉTODO CONSTRUCTOR ------------------------------------------------------
    public DBInsertion(DBUpdate update, DBInsert insert) {
        this.update = update;
        this.insert = insert;
    }

    private Date cambiarFormatoDate(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(fecha, formatter);
        return Date.valueOf(localDate);
    }

    // MÉTODOS CONCRETOS -------------------------------------------------------
    public void insertarRegistroEvento(String[] instruccion) {
        insert.insertarEvento(instruccion[1], cambiarFormatoDate(instruccion[2]), instruccion[3], instruccion[4], instruccion[5], Integer.parseInt(instruccion[6]), Double.parseDouble(instruccion[7]));
    }

    public void insertarRegistroParticipante(String[] instruccion) {
        insert.insertarParticipante(instruccion[1], instruccion[2], instruccion[3], instruccion[4]);
    }

    public void insertarRegistroInscripcion(String[] instruccion) {
        insert.insertarPreInscripcion(instruccion[1], instruccion[2], instruccion[3], false);
    }

    public void insertarRegistroPago(String[] instruccion) {
        insert.insertarPago(instruccion[1], instruccion[2], instruccion[3], Double.parseDouble(instruccion[4]));
    }

    public void insertarRegistroValidarInscripcion(String[] instruccion) {
        update.validarInscripcion(instruccion[1], instruccion[2]);
        update.actualizarCupoEvento(instruccion[2]);
    }

    public void insertarRegistroActividad(String[] instruccion) {
        insert.insertarActividad(instruccion[1], instruccion[2], instruccion[3], instruccion[4], instruccion[5], Time.valueOf(instruccion[6] + ":00"), Time.valueOf(instruccion[7] + ":00"), Integer.parseInt(instruccion[8]));
    }

    public void insertarRegistroAsistencia(String[] instruccion) {
        insert.insertarAsistencia(instruccion[1], instruccion[2]);
    }

    public void insertarRegistroCertificado(String[] instruccion) {
        insert.insertarCertificado(instruccion[1], instruccion[2]);
    }

    private void prepararRegistroReporteParticipantes(String[] instruccion) {

    }

    private void prepararRegistroReporteActividades(String[] instruccion) {

    }

    private void prepararRegistroReporteEventos(String[] instruccion) {

    }
}
