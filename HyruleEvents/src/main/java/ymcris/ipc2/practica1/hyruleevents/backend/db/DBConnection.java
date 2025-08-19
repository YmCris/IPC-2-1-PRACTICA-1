package ymcris.ipc2.practica1.hyruleevents.backend.db;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 * Clase DBConnection es la clase encargada de realizar la conexión con MySQL en
 * java (junto con las dependencias en el POM) y crear las tablas que
 * representarán la base de datos la cual se utilizará para almacenar
 * información.
 *
 * @author YmCris
 * @since Aug 12, 2025
 */
public class DBConnection {

    // VARIABLES DE REFERENCIA -------------------------------------------------
    private DBQuery query;
    private DBInsert insert;
    private DBUpdate update;
    private Connection connection;

    // CONSTANTES --------------------------------------------------------------
    private static final String IP = "localhost";
    private static final int PUERTO = 3306;
    private static final String SCHEMA = "hyrule";
    private static final String USER_NAME = "pruebas";
    private static final String PASSWORD = "12345";
    public static final String URL = "jdbc:mysql://" + IP + ":" + PUERTO + "/" + SCHEMA;
    public static final String URL_FATAL = "jdbc:mysql://" + IP + ":" + PUERTO + "/" + SCHEMA + "?allowMultiQueries=true";

    // MÉTODOS CONCRETOS -------------------------------------------------------
    /**
     * Método encargado re realizar la conexión en la base de datos con java
     * através de JDBC con el driver manager, así inicializando conection que
     * será de utilidad para todo el programa.
     */
    public void connect() {
        System.out.println("URL de conexión: " + URL);
        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            System.out.println("Esquema: " + connection.getSchema());
            System.out.println("Catalogo: " + connection.getCatalog());
            query = new DBQuery(connection);
            insert = new DBInsert(connection, query);
            update = new DBUpdate(connection, query);
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error del tipo " + e.getClass().getName() + " al realizar la conexión a la base de datos porque: " + e.getMessage() + "\n");
            System.out.println("SQLState: " + e.getSQLState() + " Error code: " + e.getErrorCode() + "\n");
            e.printStackTrace();
        }
    }

    /**
     * Método encargado de crear tablas iniciales 'Participante', 'Evento',
     * 'Actividad' 'Pago'
     */
    public void crearTablasIniciales() {
        String sqlEvento = "CREATE TABLE evento ("
                + "codigo_evento VARCHAR(7) NOT NULL,"
                + "fecha DATE NOT NULL,"
                + "tipo_evento VARCHAR(10) NOT NULL,"
                + "titulo_evento VARCHAR(45) NOT NULL,"
                + "ubicacion VARCHAR(149) NOT NULL,"
                + "cupo_disponible_evento INT NOT NULL,"
                + "cupo_maximo_evento INT NOT NULL,"
                + "costo_evento DOUBLE NOT NULL,"
                + "CONSTRAINT pk_codigo_evento PRIMARY KEY (codigo_evento)"
                + ")";
        String sqlParticipante = "CREATE TABLE participante ("
                + "nombre_completo VARCHAR(44) NOT NULL,"
                + "tipo_participante VARCHAR(15) NOT NULL,"
                + "institucion_de_procedencia VARCHAR(149) NOT NULL,"
                + "correo VARCHAR(45) NOT NULL,"
                + "CONSTRAINT pk_correo PRIMARY KEY (correo)"
                + ")";
        String sqlInscripcion = "CREATE TABLE inscripcion ("
                + "correo_participante VARCHAR(45) NOT NULL,"
                + "codigo_evento VARCHAR(7) NOT NULL,"
                + "tipo_inscripcion VARCHAR(15) NOT NULL,"
                + "validada BOOLEAN NOT NULL,"
                + "CONSTRAINT fk_correo_participante_inscripcion FOREIGN KEY(correo_participante) REFERENCES participante(correo),"
                + "CONSTRAINT fk_codigo_evento_inscripcion FOREIGN KEY(codigo_evento) REFERENCES evento(codigo_evento)"
                + ")";
        String sqlPago = "CREATE TABLE pago ("
                + "correo_participante VARCHAR(45) NOT NULL,"
                + "codigo_evento VARCHAR(7) NOT NULL,"
                + "metodo_pago VARCHAR(15) NOT NULL,"
                + "monto DECIMAL(10,2) NOT NULL,"
                + "CONSTRAINT fk_correo_participante_pago FOREIGN KEY(correo_participante) REFERENCES participante(correo),"
                + "CONSTRAINT fk_codigo_evento_pago FOREIGN KEY(codigo_evento) REFERENCES evento(codigo_evento)"
                + ")";
        try (Statement stateTablaEvento = connection.createStatement(); Statement stateTablaParticipante = connection.createStatement(); Statement stateTablaInscripcion = connection.createStatement(); Statement stateTablaPago = connection.createStatement()) {
            if (!existeTabla("evento")) {
                stateTablaEvento.executeUpdate(sqlEvento);
            }
            if (!existeTabla("participante")) {
                stateTablaParticipante.executeUpdate(sqlParticipante);
            }
            if (!existeTabla("inscripcion")) {
                stateTablaInscripcion.executeUpdate(sqlInscripcion);
            }
            if (!existeTabla("pago")) {
                stateTablaPago.executeUpdate(sqlPago);
            }
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error del tipo " + e.getClass().getName() + " al crear las tablas (1) en la DB porque: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState() + " Error code: " + e.getErrorCode() + "\n");
            e.printStackTrace();
        }
    }

    public void crearTablasSecundarias() {
        String sqlActividad = "CREATE TABLE actividad ("
                + "codigo_actividad VARCHAR(7) NOT NULL,"
                + "codigo_evento VARCHAR(7) NOT NULL,"
                + "tipo_actividad VARCHAR(50) NOT NULL,"
                + "titulo_actividad VARCHAR(199) NOT NULL,"
                + "correo_encargado VARCHAR(45) NOT NULL,"
                + "hora_inicio TIME NOT NULL,"
                + "hora_fin TIME NOT NULL,"
                + "cupo_disponible_actividad INT NOT NULL,"
                + "cupo_maximo_actividad INT NOT NULL,"
                + "CONSTRAINT pk_codigo_actividad PRIMARY KEY (codigo_actividad),"
                + "CONSTRAINT fk_correo_participante_actividad FOREIGN KEY (correo_encargado) REFERENCES participante(correo),"
                + "CONSTRAINT fk_codigo_evento_actividad FOREIGN KEY (codigo_evento) REFERENCES evento(codigo_evento)"
                + ")";
        String sqlAsistencia = "CREATE TABLE asistencia ("
                + "correo_participante VARCHAR(45) NOT NULL,"
                + "codigo_actividad VARCHAR(7) NOT NULL,"
                + "CONSTRAINT fk_correo_participante_asistencia FOREIGN KEY(correo_participante) REFERENCES participante(correo),"
                + "CONSTRAINT fk_codigo_actividad_asistencia FOREIGN KEY(codigo_actividad) REFERENCES actividad(codigo_actividad)"
                + ")";
        String sqlCertificado = "CREATE TABLE certificado ("
                + "correo_participante VARCHAR(45) NOT NULL,"
                + "codigo_evento VARCHAR(7) NOT NULL,"
                + "CONSTRAINT fk_correo_participante_certificado FOREIGN KEY(correo_participante) REFERENCES participante(correo),"
                + "CONSTRAINT fk_codigo_evento_certificado FOREIGN KEY(codigo_evento) REFERENCES evento(codigo_evento)"
                + ")";
        try (Statement stateTablaActividad = connection.createStatement(); Statement stateTablaAsistencia = connection.createStatement(); Statement stateTablaCertificado = connection.createStatement()) {
            if (!existeTabla("actividad")) {
                stateTablaActividad.executeUpdate(sqlActividad);
            }
            if (!existeTabla("asistencia")) {
                stateTablaAsistencia.executeUpdate(sqlAsistencia);
            }
            if (!existeTabla("certificado")) {
                stateTablaCertificado.executeUpdate(sqlCertificado);
            }
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error del tipo " + e.getClass().getName() + " al crear las tablas (2) en la DB porque: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState() + " Error code: " + e.getErrorCode() + "\n");
            e.printStackTrace();
        }
    }

    /**
     * Método encargado de verificar si existe una tabla en la DB
     *
     * @param nombreTabla nombre de la tabla a verificar
     * @return true si existe
     */
    public boolean existeTabla(String nombreTabla) {
        try (ResultSet rs = connection.getMetaData().getTables(null, null, nombreTabla, null);) {
            return rs.next();
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error al intentar averiguar si existe la tabla " + nombreTabla);
            return false;
        }
    }

    // GETTERS -----------------------------------------------------------------
    public DBInsert getInsert() {
        return insert;
    }

    public Connection getConnection() {
        return connection;
    }

    public DBUpdate getUpdate() {
        return update;
    }

    public DBQuery getQuery() {
        return query;
    }

}
