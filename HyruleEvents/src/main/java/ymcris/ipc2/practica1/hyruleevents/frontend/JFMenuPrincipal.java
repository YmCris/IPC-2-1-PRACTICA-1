package ymcris.ipc2.practica1.hyruleevents.frontend;

import java.sql.Connection;
import ymcris.ipc2.practica1.hyruleevents.frontend.archivos.JDCargarArchivo;
import javax.swing.JOptionPane;
import ymcris.ipc2.practica1.hyruleevents.backend.db.DBConnection;
import ymcris.ipc2.practica1.hyruleevents.frontend.formularios.JFFormulario;
import ymcris.ipc2.practica1.hyruleevents.intermediary.ValidacionArchivo;
import ymcris.ipc2.practica1.hyruleevents.intermediary.ValidacionBaseDeDatos;
import ymcris.ipc2.practica1.hyruleevents.intermediary.ValidacionFormulario;

/**
 * JFMenuPrincipal es el frame encargado de mostrar el menú principal
 *
 * @author YmCris
 * @since Aug 13, 2025
 */
public class JFMenuPrincipal extends javax.swing.JFrame {

    public static final String RUTA_IMAGEN_CASTILLO = "/fondoMenu.png";
    private DBConnection connect;
    private ValidacionArchivo validacionA;
    private ValidacionFormulario validacionF;
    private ValidacionBaseDeDatos validacionDB;

    public JFMenuPrincipal(DBConnection connect) {
        initComponents();
        this.connect = connect;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Hyrule's Events");
        PanelPersonalizado panel = new PanelPersonalizado(pnlFondoMenu, RUTA_IMAGEN_CASTILLO);
        pnlFondoMenu.add(panel).repaint();
        this.validacionF = new ValidacionFormulario(connect);
        this.validacionA = new ValidacionArchivo(connect);
        this.validacionDB = new ValidacionBaseDeDatos(connect, validacionA, validacionF);
        validacionA.setValidacionDB(validacionDB);
        validacionF.setValidacionDB(validacionDB);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondoMenu = new javax.swing.JPanel();
        lblTitulo2 = new javax.swing.JLabel();
        lblTitulo3 = new javax.swing.JLabel();
        btnArchivo = new javax.swing.JButton();
        btnFormulario = new javax.swing.JButton();
        btnMusica = new javax.swing.JButton();
        btnInformación = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo2.setBackground(java.awt.SystemColor.activeCaptionText);
        lblTitulo2.setFont(new java.awt.Font("Snap ITC", 1, 100)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo2.setText("EVENTS");
        lblTitulo2.setToolTipText("");
        lblTitulo2.setMaximumSize(new java.awt.Dimension(300, 300));
        lblTitulo2.setMinimumSize(new java.awt.Dimension(300, 300));
        lblTitulo2.setName(""); // NOI18N
        lblTitulo2.setPreferredSize(new java.awt.Dimension(300, 300));

        lblTitulo3.setBackground(java.awt.SystemColor.activeCaptionText);
        lblTitulo3.setFont(new java.awt.Font("Snap ITC", 1, 100)); // NOI18N
        lblTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo3.setText("HYRULE'S");
        lblTitulo3.setToolTipText("");
        lblTitulo3.setMaximumSize(new java.awt.Dimension(300, 300));
        lblTitulo3.setMinimumSize(new java.awt.Dimension(300, 300));
        lblTitulo3.setName(""); // NOI18N
        lblTitulo3.setPreferredSize(new java.awt.Dimension(300, 300));

        btnArchivo.setBackground(new java.awt.Color(51, 51, 51));
        btnArchivo.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        btnArchivo.setForeground(new java.awt.Color(255, 255, 255));
        btnArchivo.setText("Cargar Archivo");
        btnArchivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnArchivo.setOpaque(false);
        btnArchivo.setBorderPainted(false);
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        btnFormulario.setBackground(new java.awt.Color(51, 51, 51));
        btnFormulario.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        btnFormulario.setForeground(new java.awt.Color(255, 255, 255));
        btnFormulario.setText("Utilizar Formulario");
        btnFormulario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFormulario.setOpaque(false);
        btnFormulario.setBorderPainted(false);
        btnFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormularioActionPerformed(evt);
            }
        });

        btnMusica.setBackground(new java.awt.Color(51, 51, 51));
        btnMusica.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMusica.setForeground(new java.awt.Color(255, 255, 255));
        btnMusica.setText("M");
        btnMusica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicaActionPerformed(evt);
            }
        });

        btnInformación.setBackground(new java.awt.Color(51, 51, 51));
        btnInformación.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInformación.setForeground(new java.awt.Color(255, 255, 255));
        btnInformación.setText("!");
        btnInformación.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInformación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformaciónActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFondoMenuLayout = new javax.swing.GroupLayout(pnlFondoMenu);
        pnlFondoMenu.setLayout(pnlFondoMenuLayout);
        pnlFondoMenuLayout.setHorizontalGroup(
            pnlFondoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoMenuLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(pnlFondoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoMenuLayout.createSequentialGroup()
                        .addComponent(btnMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInformación, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoMenuLayout.createSequentialGroup()
                        .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addComponent(btnFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoMenuLayout.createSequentialGroup()
                        .addGroup(pnlFondoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(286, 286, 286))))
        );
        pnlFondoMenuLayout.setVerticalGroup(
            pnlFondoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFondoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInformación, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addComponent(lblTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149)
                .addGroup(pnlFondoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(245, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        this.dispose();
        new JDCargarArchivo(validacionA, validacionDB).setVisible(true);
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void btnFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormularioActionPerformed
        this.dispose();
        new JFFormulario(validacionF, validacionDB).setVisible(true);
    }//GEN-LAST:event_btnFormularioActionPerformed

    private void btnMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicaActionPerformed

    }//GEN-LAST:event_btnMusicaActionPerformed

    private void btnInformaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformaciónActionPerformed
        JOptionPane.showMessageDialog(null, "\n\n\nCrea, produce, diseña y gestiona eventos en el reino de Hyrule\n\n                                    Bienvenido a:\n                                  Hyrule's Events\n\n\n                               by Triforce Software", "Hyrule's Events", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnInformaciónActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnFormulario;
    private javax.swing.JButton btnInformación;
    private javax.swing.JButton btnMusica;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JPanel pnlFondoMenu;
    // End of variables declaration//GEN-END:variables
}
