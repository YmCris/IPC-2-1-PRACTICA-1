package ymcris.ipc2.practica1.hyruleevents.backend.db;

import java.sql.Date;
import java.sql.Time;

/**
 * Clase DBInsert es la clase encargada de introducir información a la base de
 * datos, es decir que será usada por el backend del archivo y formulario, sin
 * embargo aquí ya no deberán lleagar datos erroneos.
 *
 *
 * @author YmCris
 * @since Aug 16, 2025
 */
public class DBInsert {

    // VARIABLES DE REFERENCIA -------------------------------------------------
    // VARIABLES PRIMITIVAS ----------------------------------------------------
    // INSTANCIAS --------------------------------------------------------------
    // MÉTODO CONSTRUCTOR ------------------------------------------------------
    // MÉTODOS CONCRETOS -------------------------------------------------------
    public void insertarEvento(String codigoEvento, Date fecha, String tipoEvento,
            String tituloEvento, String ubicacion, int cupoMaximo) {
        System.out.println("Hola");
    }

    public void insertarParticipante(String nombre, String tipoParticipante, String institucion, String correo) {
        System.out.println("Hola");
    }

    public void insertarInscripcion(String correoParticipante, String codigoEvento, String tipoInscripcion, boolean validada) {
        System.out.println("Hola");
    }

    public void insertarPago(String correoParticipante, String codigoEvento, String metodoPago, double monto) {
        System.out.println("Hola");
    }

    public void insertarActivididad(String codigoActividad, String codigoEvento, String tipoActividad, String tituloActividad, String correoEncargado, Time horaInicio, Time horaFin, int cupoMaximo) {
        System.out.println("Hola");
    }

    public void insertarAsistencia(String correoParticipante, String codigoActividad) {
        System.out.println("Hola");
    }

    public void insertarCertificado(String correoParticipante, String codigoEvento) {
        System.out.println("Hola");
    }

    // GETTERS -----------------------------------------------------------------
    // SETTERS -----------------------------------------------------------------
}
