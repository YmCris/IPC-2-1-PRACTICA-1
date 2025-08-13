package ymcris.ipc2.practica1.hyruleevents;

import ymcris.ipc2.practica1.hyruleevents.dbconnection.DBConnection;

/**
 * Hyrule's Events es un programa en el cual se realizan gestiones de eventos,
 * participantes, pagos, actividades, inscripciones, certificados, etc. Dentro
 * del mundo de Hyrule, utilizando MySQL y git, para mayor comprensión leer el
 * manual de usuario y el manual técnico en:
 * https://drive.google.com/drive/folders/1tsk5m-t7nTrDFFwxrlXMI7ypqy2xtC5v?usp=sharing
 *
 * @author YmCris
 * @see DBConnection
 * @since Aug 12, 2025
 */
public class HyruleEvents {

    /**
     * Método main es el encargado de iniciar el programa
     *
     * @param args Argumentos de acceso directo
     */
    public static void main(String[] args) {
        DBConnection dBConection = new DBConnection();
        dBConection.connect();
        dBConection.crearTablasIniciales();
        dBConection.crearTablasSecundarias();
    }
}
