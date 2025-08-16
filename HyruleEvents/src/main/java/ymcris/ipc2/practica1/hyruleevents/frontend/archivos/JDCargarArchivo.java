package ymcris.ipc2.practica1.hyruleevents.frontend.archivos;

import javax.swing.JOptionPane;
import ymcris.ipc2.practica1.hyruleevents.frontend.JFMenuPrincipal;
import ymcris.ipc2.practica1.hyruleevents.frontend.log.JDLog;
import ymcris.ipc2.practica1.hyruleevents.intermediary.ValidacionArchivo;

/**
 *
 * @author YmCris
 */
public class JDCargarArchivo extends javax.swing.JFrame {

    private ValidacionArchivo validacionA;

    public JDCargarArchivo(ValidacionArchivo validacionA) {
        initComponents();
        this.validacionA = validacionA;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Hyrule's Events");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        JIFArchivoDeEntrada = new javax.swing.JInternalFrame();
        FCArchivoEntrada = new javax.swing.JFileChooser();
        JIFArchivoDeSalida = new javax.swing.JInternalFrame();
        FCArchivoSalida = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtArchivoEntrada = new javax.swing.JTextField();
        txtArchivoSalida = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnRegresar1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        spnVelocidad = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(0, 51, 51));
        jDesktopPane1.setForeground(new java.awt.Color(0, 51, 51));

        JIFArchivoDeEntrada.setVisible(true);
        JIFArchivoDeEntrada.setTitle("Archivo de entrada");

        FCArchivoEntrada.setBackground(new java.awt.Color(0, 0, 0));
        FCArchivoEntrada.setForeground(new java.awt.Color(0, 0, 0));
        FCArchivoEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCArchivoEntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JIFArchivoDeEntradaLayout = new javax.swing.GroupLayout(JIFArchivoDeEntrada.getContentPane());
        JIFArchivoDeEntrada.getContentPane().setLayout(JIFArchivoDeEntradaLayout);
        JIFArchivoDeEntradaLayout.setHorizontalGroup(
            JIFArchivoDeEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JIFArchivoDeEntradaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(FCArchivoEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JIFArchivoDeEntradaLayout.setVerticalGroup(
            JIFArchivoDeEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JIFArchivoDeEntradaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(FCArchivoEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );

        JIFArchivoDeSalida.setName("Archivo de salida"); // NOI18N
        JIFArchivoDeSalida.setTitle("Carpeta para archivo de salida");
        JIFArchivoDeSalida.setVisible(true);

        FCArchivoSalida.setBackground(new java.awt.Color(0, 0, 0));
        FCArchivoSalida.setForeground(new java.awt.Color(0, 0, 0));
        FCArchivoSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCArchivoSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JIFArchivoDeSalidaLayout = new javax.swing.GroupLayout(JIFArchivoDeSalida.getContentPane());
        JIFArchivoDeSalida.getContentPane().setLayout(JIFArchivoDeSalidaLayout);
        JIFArchivoDeSalidaLayout.setHorizontalGroup(
            JIFArchivoDeSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FCArchivoSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JIFArchivoDeSalidaLayout.setVerticalGroup(
            JIFArchivoDeSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FCArchivoSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RUTA DEL ARCHIVO DE ENTRADA:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RUTA DE LA CARPETA PARA EL ARCHIVO DE SALIDA:");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar al menú principal");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnRegresar1.setText("Escribir Ruta");
        btnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar1ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VELOCIDAD DE PROCESAMIENTO DE INSTRUCCIONES (milisegundos)");

        spnVelocidad.setModel(new javax.swing.SpinnerNumberModel(500, 500, 10000, 500));

        jDesktopPane1.setLayer(JIFArchivoDeEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JIFArchivoDeSalida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtArchivoEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtArchivoSalida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnAceptar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnRegresar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnRegresar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(spnVelocidad, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegresar1))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(spnVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JIFArchivoDeEntrada)
                                    .addComponent(txtArchivoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(47, 47, 47)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JIFArchivoDeSalida)
                                    .addComponent(jLabel2)
                                    .addComponent(txtArchivoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(703, 703, 703)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnRegresar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JIFArchivoDeSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JIFArchivoDeEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArchivoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArchivoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FCArchivoEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCArchivoEntradaActionPerformed
        String nombreArchivo = FCArchivoEntrada.getSelectedFile().getName();
        String rutaArchivo = FCArchivoEntrada.getSelectedFile().getAbsolutePath();
        if (nombreArchivo.substring(nombreArchivo.length() - 4).equals(".txt")) {
            txtArchivoEntrada.setText(rutaArchivo);
            txtArchivoEntrada.setEnabled(false);
            System.out.println("Hace algo");
        } else {
            JOptionPane.showMessageDialog(null, "BURRO, el archivo debe ser un txt", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_FCArchivoEntradaActionPerformed

    private void btnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar1ActionPerformed
        txtArchivoEntrada.setEnabled(true);
        txtArchivoSalida.setEnabled(true);
    }//GEN-LAST:event_btnRegresar1ActionPerformed

    private void FCArchivoSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCArchivoSalidaActionPerformed
        String nombreCarpeta = FCArchivoSalida.getCurrentDirectory().getName();
        String rutaArchivo = FCArchivoSalida.getCurrentDirectory().getAbsolutePath();
        if (nombreCarpeta != null) {
            txtArchivoSalida.setText(rutaArchivo);
            txtArchivoSalida.setEnabled(false);
            System.out.println("Hace algo");
        } else {
            JOptionPane.showMessageDialog(null, "BURRO, la ruta está mal", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_FCArchivoSalidaActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (txtArchivoEntrada.getText().isEmpty() || txtArchivoSalida.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "BURRO, debes seleccionar la ruta de ambos", "ERROR", JOptionPane.WARNING_MESSAGE);
        } else {
            validacionA.setRutaArchivoEntrada(txtArchivoEntrada.getText());
            validacionA.setRutaCarpetaSalida(txtArchivoSalida.getText());
            validacionA.obtenerArchivo();
            if (validacionA.todoEnOrden()) {
                this.dispose();
                validacionA.contenidoTexto();
                new JDLog(this, validacionA).setVisible(true);
            }else {
                JOptionPane.showMessageDialog(null, "Burro, el archivo no debe estar vacio", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        new JFMenuPrincipal(validacionA.getConnection()).setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser FCArchivoEntrada;
    private javax.swing.JFileChooser FCArchivoSalida;
    private javax.swing.JInternalFrame JIFArchivoDeEntrada;
    private javax.swing.JInternalFrame JIFArchivoDeSalida;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRegresar1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner spnVelocidad;
    private javax.swing.JTextField txtArchivoEntrada;
    private javax.swing.JTextField txtArchivoSalida;
    // End of variables declaration//GEN-END:variables
}
