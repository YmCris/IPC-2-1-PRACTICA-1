package ymcris.ipc2.practica1.hyruleevents.backend.db;

import java.sql.Date;
import java.sql.Time;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

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
    private Connection connection;

    // CONSTANTES --------------------------------------------------------------
    private static final String SQL_INSERTAR_EVENTO = "INSERT INTO evento(codigo_evento,fecha, tipo_evento, titulo_evento,ubicacion, cupo_disponible_evento, cupo_maximo_evento) VALUES(?,?,?,?,?,?,?)";
    private static final String SQL_INSERTAR_PARTICIPANTE = "INSERT INTO participante(nombre_completo, tipo_participante, institucion_de_procedencia, correo) VALUES(?,?,?,?)";
    private static final String SQL_INSERTAR_INSCRIPCION = "INSERT INTO inscripcion(correo_participante, codigo_evento, tipo_inscripcion, validada) VALUES(?,?,?,?)";
    private static final String SQL_INSERTAR_PAGO = "INSERT INTO pago(correo_participante, codigo_evento, metodo_pago, monto) VALUES(?,?,?,?)";
    private static final String SQL_INSERTAR_ACTIVIDAD = "INSERT INTO actividad(codigo_actividad, codigo_evento, tipo_actividad, titulo_actividad, correo_encargado, hora_inicio, hora_fin, cupo_disponible_actividad, cupo_maximo_actividad) VALUES(?,?,?,?,?,?,?,?,?)";
    private static final String SQL_INSERTAR_ASISTENCIA = "INSERT INTO asistencia(correo_participante, codigo_actividad) VALUES(?,?)";
    private static final String SQL_INSERTAR_CERTIFICADO = "INSERT INTO certificado(correo_participante, codigo_evento) VALUES(?,?)";

    // MÉTODO CONSTRUCTOR ------------------------------------------------------
    public DBInsert(Connection connection) {
        this.connection = connection;
    }

    // MÉTODOS CONCRETOS -------------------------------------------------------
    public void insertarEvento(String codigoEvento, Date fecha, String tipoEvento, String tituloEvento, String ubicacion, int cupoMaximo) {
        try (PreparedStatement stmt = connection.prepareStatement(SQL_INSERTAR_EVENTO)) {
            stmt.setString(1, codigoEvento);
            stmt.setDate(2, fecha);
            stmt.setString(3, tipoEvento);
            stmt.setString(4, tituloEvento);
            stmt.setString(5, ubicacion);
            stmt.setInt(6, cupoMaximo);
            stmt.setInt(7, cupoMaximo);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Hubo un error al intentar introducir los datos a la base de datos 'evento' porque " + ex.getMessage());
        }
    }

    public void insertarParticipante(String nombre, String tipoParticipante, String institucion, String correo) {
        try (PreparedStatement stmt = connection.prepareStatement(SQL_INSERTAR_PARTICIPANTE)) {
            stmt.setString(1, nombre);
            stmt.setString(2, tipoParticipante);
            stmt.setString(3, institucion);
            stmt.setString(4, correo);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Hubo un error al intentar introducir los datos a la base de datos 'participante' porque " + ex.getMessage());
        }
    }

    public void insertarPreInscripcion(String correoParticipante, String codigoEvento, String tipoInscripcion, boolean validada) {
        try (PreparedStatement stmt = connection.prepareStatement(SQL_INSERTAR_INSCRIPCION)) {
            stmt.setString(1, correoParticipante);
            stmt.setString(2, codigoEvento);
            stmt.setString(3, tipoInscripcion);
            stmt.setBoolean(4, validada);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Hubo un error al intentar introducir los datos a la base de datos 'inscripcion' porque " + ex.getMessage());
        }
    }

    public void insertarPago(String correoParticipante, String codigoEvento, String metodoPago, double monto) {
        try (PreparedStatement stmt = connection.prepareStatement(SQL_INSERTAR_PAGO)) {
            stmt.setString(1, correoParticipante);
            stmt.setString(2, codigoEvento);
            stmt.setString(3, metodoPago);
            stmt.setDouble(4, monto);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Hubo un error al intentar introducir los datos a la base de datos 'pago' porque " + ex.getMessage());
        }
    }

    public void insertarActividad(String codigoActividad, String codigoEvento, String tipoActividad, String tituloActividad, String correoEncargado, Time horaInicio, Time horaFin, int cupoMaximo) {
        try (PreparedStatement stmt = connection.prepareStatement(SQL_INSERTAR_ACTIVIDAD)) {
            stmt.setString(1, codigoActividad);
            stmt.setString(2, codigoEvento);
            stmt.setString(3, tipoActividad);
            stmt.setString(4, tituloActividad);
            stmt.setString(5, correoEncargado);
            stmt.setTime(6, horaInicio);
            stmt.setTime(7, horaFin);
            stmt.setInt(8, cupoMaximo);
            stmt.setInt(9, cupoMaximo);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Hubo un error al intentar introducir los datos a la base de datos 'actividad' porque " + ex.getMessage());
        }
    }

    public void insertarAsistencia(String correoParticipante, String codigoActividad) {
        try (PreparedStatement stmt = connection.prepareStatement(SQL_INSERTAR_ASISTENCIA)) {
            stmt.setString(1, correoParticipante);
            stmt.setString(2, codigoActividad);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Hubo un error al intentar introducir los datos a la base de datos 'asistencia' porque " + ex.getMessage());
        }
    }

    public void insertarCertificado(String correoParticipante, String codigoEvento) {
        try (PreparedStatement stmt = connection.prepareStatement(SQL_INSERTAR_CERTIFICADO)) {
            stmt.setString(1, correoParticipante);
            stmt.setString(2, codigoEvento);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Hubo un error al intentar introducir los datos a la base de datos 'certificado' porque " + ex.getMessage());
        }
    }

}
