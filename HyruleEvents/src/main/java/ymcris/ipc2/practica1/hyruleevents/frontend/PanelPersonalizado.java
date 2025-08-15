package ymcris.ipc2.practica1.hyruleevents.frontend;

import java.net.URL;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

/**
 * Clase PanelPersonalizado es la clase encargada de crear el panel
 * personalizado (ponerle una imagen a un panel)
 *
 * @author YmCris
 * @since Aug 13, 2025
 */
public class PanelPersonalizado extends JLabel {

    // VARIABLES DE REFERENCIA -------------------------------------------------
    private String nombreRutaImagen;

    // VARIABLES PRIMITIVAS ----------------------------------------------------
    private int alto;
    private int ancho;

    // MÉTODO CONSTRUCTOR ------------------------------------------------------
    public PanelPersonalizado(JPanel panel, String nombreRutaImagen) {
        this.ancho = panel.getWidth();
        this.alto = panel.getHeight();
        this.setSize(ancho, alto);
        this.nombreRutaImagen = nombreRutaImagen;
    }

    // MÉTODOS CONCRETOS -------------------------------------------------------
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        URL rutaImagen = getClass().getResource(nombreRutaImagen);
        ImageIcon imagen = new ImageIcon(rutaImagen);
        g.drawImage(imagen.getImage(), 0, 0, ancho, alto, null);
    }

}
