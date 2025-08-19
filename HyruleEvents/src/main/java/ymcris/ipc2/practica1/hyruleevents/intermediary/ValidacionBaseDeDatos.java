package ymcris.ipc2.practica1.hyruleevents.intermediary;

import ymcris.ipc2.practica1.hyruleevents.backend.db.DBQuery;
import ymcris.ipc2.practica1.hyruleevents.frontend.log.JDLog;
import ymcris.ipc2.practica1.hyruleevents.backend.db.DBInsert;
import ymcris.ipc2.practica1.hyruleevents.backend.db.DBUpdate;
import ymcris.ipc2.practica1.hyruleevents.backend.db.DBConnection;
import ymcris.ipc2.practica1.hyruleevents.backend.formularios.DBInsertion;

/**
 * Clase ValidacionBaseDeDatos es la clase encargada de realizar validaciones ya
 * con una instrucción para identificar de qué tipo es, sus llaves foráneas,
 * primarias, etc.
 *
 * @author YmCris
 * @since Aug 18, 2025
 */
public class ValidacionBaseDeDatos {

    // VARIABLES DE REFERENCIA -------------------------------------------------
    private JDLog log;
    private DBQuery query;
    private DBUpdate update;
    private DBInsert insert;
    private DBInsertion insertar;
    private String[] instruccionesArchivo;
    private String[] instrucionFormulario;
    private ValidacionArchivo validacionA;
    private ValidacionFormulario validacionF;

    // MÉTODO CONSTRUCTOR ------------------------------------------------------
    public ValidacionBaseDeDatos(DBConnection connect, ValidacionArchivo validacionA, ValidacionFormulario validacionF) {
        this.validacionA = validacionA;
        this.validacionF = validacionF;
        this.query = connect.getQuery();
        this.update = connect.getUpdate();
        this.insert = connect.getInsert();
        this.insertar = new DBInsertion(update, insert);
    }

    // MÉTODOS CONCRETOS -------------------------------------------------------
    /**
     * Método encargado de insertar todas las instrucciones del archivo para ser
     * separadas segun su tipo de instrucción y almacenarlas en la base de
     * datos.
     */
    public void almacenarTodasLasInstruccionesDelArchivoEnLaBaseDeDatos() {
        for (String instruccion : instruccionesArchivo) {
            String[] instruccionConFormato = validacionA.darFormatoAUnaInstruccion(instruccion);
            tipoDeInstruccion(instruccionConFormato);
        }
    }

    public void almacenarInstruccionDelFormularioEnLaBaseDeDatos() {
        tipoDeInstruccion(instrucionFormulario);
    }

    /**
     * Método encargado de obtener el tipo de instrucción del archivo y así
     * poder ejecutar su método de verificación (que servirá para validaciones).
     *
     * @param instruccion - Instrucción con el formato correcto.
     */
    private void tipoDeInstruccion(String[] instruccion) {
        switch (instruccion[0].toUpperCase()) {
            case "REGISTRO_EVENTO" -> {
                prepararRegistroEvento(instruccion);
            }
            case "REGISTRO_PARTICIPANTE" -> {
                prepararRegistroParticipante(instruccion);
            }
            case "INSCRIPCION" -> {
                prepararRegistroInscripcion(instruccion);
            }
            case "PAGO" -> {
                prepararRegistroPago(instruccion);
            }
            case "VALIDAR_INSCRIPCION" -> {
                prepararRegistroValidarInscripcion(instruccion);
            }
            case "REGISTRO_ACTIVIDAD" -> {
                prepararRegistroActividad(instruccion);
            }
            case "ASISTENCIA" -> {
                prepararRegistroAsistencia(instruccion);
            }
            case "CERTIFICADO" -> {
                prepararRegistroCertificado(instruccion);
            }
            case "REPORTE_PARTICIPANTES" -> {
                prepararRegistroReporteParticipantes(instruccion);
            }
            case "REPORTE_ACTIVIDADES" -> {
                prepararRegistroReporteActividades(instruccion);
            }
            case "REPORTE_EVENTOS" -> {
                prepararRegistroReporteEventos(instruccion);
            }
            default -> {
                System.out.println("Imbécil, no escribiste la babosada como era");
            }
        }
    }

    // Restricciones de los pagos, pre inscripción, etc.
    private void prepararRegistroEvento(String[] instruccion) {
        String pkCodigoEvento = instruccion[1];
        if (query.existeEvento(pkCodigoEvento)) {
            log.añadirRegistro(instruccion, "rechazada", "porque ya existe un evento con ese código");
        } else {
            log.añadirRegistro(instruccion, "aceptada", "");
            insertar.insertarRegistroEvento(instruccion);
        }
        log.añadirRegistroVisible();
    }

    private void prepararRegistroParticipante(String[] instruccion) {
        String pkCorreo = instruccion[4];
        if (query.existeParticipante(pkCorreo)) {
            log.añadirRegistro(instruccion, "rechazada", "porque ya existe un participante con ese correo");
        } else {
            log.añadirRegistro(instruccion, "aceptada", "");
            insertar.insertarRegistroParticipante(instruccion);
        }
        log.añadirRegistroVisible();
    }

    private void prepararRegistroInscripcion(String[] instruccion) {
        String fkCorreoParticipante = instruccion[1];
        String fkCodigoEvento = instruccion[2];
        if (query.existeParticipante(fkCorreoParticipante) && query.existeEvento(fkCodigoEvento)) {
            if (!query.hayCupoDisponibleEvento(fkCodigoEvento) || query.tienePreInscripcionRegistrada(fkCorreoParticipante, fkCodigoEvento)) {
                log.añadirRegistro(instruccion, "rechazada", "porque ya no hay cupos disponibles para este evento o ya tiene una inscripción");
            } else {
                log.añadirRegistro(instruccion, "aceptada", "");
                insertar.insertarRegistroInscripcion(instruccion);
            }
        } else {
            log.añadirRegistro(instruccion, "RECHAZADA", "PORQUE NO EXISTE EL PARTICIPANTE O EL EVENTO");
        }
        log.añadirRegistroVisible();
    }

    private void prepararRegistroPago(String[] instruccion) {
        String fkCorreoParticipante = instruccion[1];
        String fkCodigoEvento = instruccion[2];
        if (query.existeParticipante(fkCorreoParticipante) && query.existeEvento(fkCodigoEvento)) {
            if (!query.tienePreInscripcionRegistrada(fkCorreoParticipante, fkCodigoEvento) || query.tienePagoRegistrado(fkCorreoParticipante, fkCodigoEvento)) {
                log.añadirRegistro(instruccion, "rechazada", "porque el participante no tiene realizada una inscripción a este evento o ya la realizó");
            } else {
                log.añadirRegistro(instruccion, "aceptada", "");
                insertar.insertarRegistroPago(instruccion);
            }
        } else {
            log.añadirRegistro(instruccion, "RECHAZADA", "PORQUE NO EXISTE EL PARTICIPANTE O EL EVENTO");
        }
        log.añadirRegistroVisible();
    }

    private void prepararRegistroValidarInscripcion(String[] instruccion) {
        String fkCorreoParticipante = instruccion[1];
        String fkCodigoEvento = instruccion[2];
        if (query.existeParticipante(fkCorreoParticipante) && query.existeEvento(fkCodigoEvento)) {
            if (!query.tieneValidacionInscripcionRegistrada(fkCorreoParticipante, fkCodigoEvento)) {
                if (!query.tienePagoRegistrado(fkCorreoParticipante, fkCodigoEvento)) {
                    log.añadirRegistro(instruccion, "rechazada", "porque no hay un pago registrado para este evento");
                } else {
                    log.añadirRegistro(instruccion, "aceptada", "");
                    insertar.insertarRegistroValidarInscripcion(instruccion);
                }
            } else {
                log.añadirRegistro(instruccion, "RECHAZADA", "porque ya se ha validado");
            }
        } else {
            log.añadirRegistro(instruccion, "RECHAZADA", "PORQUE NO EXISTE EL PARTICIPANTE O EL EVENTO");
        }
        log.añadirRegistroVisible();
    }

    private void prepararRegistroActividad(String[] instruccion) {
        String pkCodigoActividad = instruccion[1];
        String fkCodigoEvento = instruccion[2];
        String fkCorreoParticipante = instruccion[5];
        if (query.existeEvento(fkCodigoEvento) && query.existeParticipante(fkCorreoParticipante) && !query.participanteEsAsistente(fkCorreoParticipante)) {
            if (query.existeActividad(pkCodigoActividad)) {
                log.añadirRegistro(instruccion, "rechazada", "porque ya existe una actividad con ese código");
            } else {
                log.añadirRegistro(instruccion, "aceptada", "");
                insertar.insertarRegistroActividad(instruccion);
            }
        } else {
            log.añadirRegistro(instruccion, "RECHAZADA", "porque el participante o el evento no existen o el participante es un asistente");
        }
        log.añadirRegistroVisible();
    }

    private void prepararRegistroAsistencia(String[] instruccion) {
        String fkCorreoParticipante = instruccion[1];
        String fkCodigoActividad = instruccion[2];
        if (query.existeParticipante(fkCorreoParticipante) && query.existeActividad(fkCodigoActividad)) {
            if (query.tieneAsistenciaRegistrada(fkCorreoParticipante, fkCodigoActividad)) {
                log.añadirRegistro(instruccion, "rechazada", "porque el participante ya tiene asistencia registrada");
            } else {
                log.añadirRegistro(instruccion, "aceptada", "");
                insertar.insertarRegistroAsistencia(instruccion);
            }
        } else {
            log.añadirRegistro(instruccion, "RECHAZADA", "Porque no existe el participante o la actividad");
        }
        log.añadirRegistroVisible();
    }

    private void prepararRegistroCertificado(String[] instruccion) {
        String fkCorreoParticipante = instruccion[1];
        String fkCodigoEvento = instruccion[2];
        if (query.existeParticipante(fkCorreoParticipante) && query.existeEvento(fkCodigoEvento)) {
            if (query.tieneAsistenciaRegistrada(fkCorreoParticipante, fkCodigoEvento) || true) {
                log.añadirRegistro(instruccion, "aceptada", "");
                insertar.insertarRegistroCertificado(instruccion);
            } else {
                log.añadirRegistro(instruccion, "RECHAZADO", "El participante no tiene una asistencia registrada");
            }
        } else {
            log.añadirRegistro(instruccion, "RECHAZADO", "No existe el participante o el evento");
        }
        log.añadirRegistroVisible();
    }

    private void prepararRegistroReporteParticipantes(String[] instruccion) {

    }

    private void prepararRegistroReporteActividades(String[] instruccion) {

    }

    private void prepararRegistroReporteEventos(String[] instruccion) {

    }

    public ValidacionArchivo getValidacionA() {
        return validacionA;
    }

    public ValidacionFormulario getValidacionF() {
        return validacionF;
    }

    public void enviarInformacionABackend() {

    }

    public void setInstruccionesArchivo(String[] instruccionesArchivo) {
        this.instruccionesArchivo = instruccionesArchivo;
    }

    public void setLog(JDLog log) {
        this.log = log;
    }

    public void setInstrucionFormulario(String[] instrucionFormulario) {
        this.instrucionFormulario = instrucionFormulario;
    }

    public DBQuery getQuery() {
        return query;
    }

    public DBUpdate getUpdate() {
        return update;
    }

    public DBInsert getInsert() {
        return insert;
    }

}
