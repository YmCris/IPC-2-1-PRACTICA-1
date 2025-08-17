package ymcris.ipc2.practica1.hyruleevents.backend.db;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 * Clase DBQuery es la clase encargada de realizar consultas para obtener
 * información de la base de datos.
 *
 * @author YmCris
 * @since Aug 17, 2025
 */
public class DBQuery {

    // VARIABLES DE REFERENCIA -------------------------------------------------
    private Connection connection;

    // CONSTANTES --------------------------------------------------------------
    private static final String SQL_OBTENER_EXISTENCIA_EVENTO = "SELECT 1 FROM evento WHERE codigo_evento = ?";
    private static final String SQL_OBTENER_EXISTENCIA_PARTICIPANTE = "SELECT 1 FROM participante WHERE correo = ?";
    private static final String SQL_OBTENER_EXISTENCIA_ACTIVIDAD = "SELECT 1 FROM actividad WHERE codigo_actividad = ?";
    private static final String SQL_OBTENER_CUPO_EVENTO = "SELECT cupo_disponible_evento FROM evento WHERE codigo_evento = ?";
    private static final String SQL_OBTENER_PAGO_REALIZADO = "SELECT 1 FROM pago WHERE correo_participante = ? AND codigo_evento = ?";
    private static final String SQL_OBTENER_CUPO_ACTIVIDAD = "SELECT cupo_disponible_actividad FROM actividad WHERE codigo_actividad = ?";
    private static final String SQL_OBTENER_ASISTENCIA = "SELECT 1 FROM asistencia WHERE correo_participante = ? AND codigo_actividad = ?";
    private static final String SQL_OBTENER_TIPO_DE_PARTICIPANTE = "SELECT 1 FROM participante WHERE correo_participante = ? AND tipo_participante = ?";

    // MÉTODO CONSTRUCTOR ------------------------------------------------------
    public DBQuery(Connection connection) {
        this.connection = connection;
    }

    // MÉTODOS CONCRETOS -------------------------------------------------------
    private int verificarExistenciaDeTuplaConUnParametroEntero(String sql, String nombreColumna, String param1) {
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, param1);
            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt(nombreColumna);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el cupo disponible " + e.getMessage());
        }
        return -1;
    }

    private boolean verificarExistenciaDeTuplaConUnParametro(String sql, String param1) {
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, param1);
            try (ResultSet resultSet = stmt.executeQuery()) {
                return resultSet.next();
            }
        } catch (SQLException e) {
            System.out.println("Ha ocurrido una exception del tipo " + e.getClass().getName() + " al realizar una validación de existencia porque " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }

    private boolean verificarExistenciaDeTuplaConDosParametros(String sql, String param1, String param2) {
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, param1);
            stmt.setString(2, param2);
            try (ResultSet resultSet = stmt.executeQuery()) {
                return resultSet.next();
            }
        } catch (SQLException e) {
            System.out.println("Ha ocurrido una exception del tipo " + e.getClass().getName() + " al realizar una validación de existencia porque " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }

    public int obtenerCupoDisponibleEvento(String codigoEvento) {
        return verificarExistenciaDeTuplaConUnParametroEntero(SQL_OBTENER_CUPO_EVENTO, "cupo_disponible_evento", codigoEvento);
    }

    public int obtenerCupoDisponibleActividad(String codigoActividad) {
        return verificarExistenciaDeTuplaConUnParametroEntero(SQL_OBTENER_CUPO_ACTIVIDAD, "cupo_disponible_actividad", codigoActividad);
    }

    public boolean tienePagoRegistrado(String correo, String codigoEvento) {
        return verificarExistenciaDeTuplaConDosParametros(SQL_OBTENER_PAGO_REALIZADO, correo, codigoEvento);
    }

    public boolean tieneAsistenciaRegistrada(String correo, String codigoActividad) {
        return verificarExistenciaDeTuplaConDosParametros(SQL_OBTENER_ASISTENCIA, correo, codigoActividad);
    }

    public boolean existeEvento(String codigoEvento) {
        return verificarExistenciaDeTuplaConUnParametro(SQL_OBTENER_EXISTENCIA_EVENTO, codigoEvento);
    }

    public boolean existeParticipante(String correo) {
        return verificarExistenciaDeTuplaConUnParametro(SQL_OBTENER_EXISTENCIA_PARTICIPANTE, correo);
    }

    public boolean existeActividad(String codigoActividad) {
        return verificarExistenciaDeTuplaConUnParametro(SQL_OBTENER_EXISTENCIA_ACTIVIDAD, codigoActividad);
    }

    public boolean participanteEsAsistente(String correo_participante) {
        return verificarExistenciaDeTuplaConDosParametros(SQL_OBTENER_TIPO_DE_PARTICIPANTE, correo_participante, "ASISTENTE");
    }

    public boolean hayCupoDisponibleEvento(String codigoEvento) {
        return obtenerCupoDisponibleEvento(codigoEvento) > 0;
    }

    public boolean hayCupoDisponibleActividad(String codigoActividad) {
        return obtenerCupoDisponibleActividad(codigoActividad) > 0;
    }

}
