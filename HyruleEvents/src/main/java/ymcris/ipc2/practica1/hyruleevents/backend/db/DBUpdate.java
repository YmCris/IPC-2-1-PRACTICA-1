package ymcris.ipc2.practica1.hyruleevents.backend.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 * Clase DBUpdate es la clase encargada de comunicarse con la base de datos para
 * actualizar información ya existente en la DB.
 *
 * @author YmCris
 * @since Aug 17, 2025
 */
public class DBUpdate {

    // VARIABLES DE REFERENCIA -------------------------------------------------
    private DBQuery query;
    private Connection connection;

    // CONSTANTES --------------------------------------------------------------
    private static final String SQL_EDITAR_CUPO_EVENTO = "UPDATE evento SET cupo_disponible_evento = cupo_disponible_evento -1 WHERE codigo_evento = ? AND cupo_disponible_evento > 0";
    private static final String SQL_EDITAR_CUPO_ACTIVIDAD = "UPDATE actividad SET cupo_disponible_actividad = cupo_disponible_actividad -1 WHERE codigo_actividad = ? AND cupo_disponible_actividad > 0";
    private static final String SQL_EDITAR_VALIDACION_INSCRIPCION = "UPDATE inscripcion SET validada = ? WHERE correo_participante = ? AND codigo_evento = ?";

    // MÉTODO CONSTRUCTOR ------------------------------------------------------
    public DBUpdate(Connection connection, DBQuery query) {
        this.query=query;
        this.connection = connection;
    }

    // MÉTODOS CONCRETOS -------------------------------------------------------
    public void actualizarCupoEvento(String codigoEvento) {
        try (PreparedStatement stmt = connection.prepareStatement(SQL_EDITAR_CUPO_EVENTO)) {
            stmt.setString(1, codigoEvento);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al disminuir el cupo disponible del evento " + e.getMessage());
        }
    }

    public void actualizarCupoActividad(String codigoActividad) {
        try (PreparedStatement stmt = connection.prepareStatement(SQL_EDITAR_CUPO_ACTIVIDAD)) {
            stmt.setString(1, codigoActividad);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al disminuir el cupo disponible de la actividad " + e.getMessage());
        }
    }

    public void validarInscripcion(String correo, String codigoEvento) {
        if (query.tienePagoRegistrado(correo, codigoEvento)) {
            try (PreparedStatement stmt = connection.prepareStatement(SQL_EDITAR_VALIDACION_INSCRIPCION)) {
                stmt.setBoolean(1, true);
                stmt.setString(2, correo);
                stmt.setString(3, codigoEvento);
                stmt.executeUpdate();
            } catch (Exception e) {
                System.out.println("Error al realizar la validación en el evento " + codigoEvento + " con el correo " + correo);
            }
        }
    }
}
