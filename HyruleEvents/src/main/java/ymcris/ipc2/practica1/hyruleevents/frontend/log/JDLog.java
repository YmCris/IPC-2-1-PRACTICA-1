package ymcris.ipc2.practica1.hyruleevents.frontend.log;

import ymcris.ipc2.practica1.hyruleevents.frontend.JFMenuPrincipal;

/**
 *
 * @author YmCris
 */
public class JDLog extends javax.swing.JDialog {

    public JDLog(java.awt.Frame parent) {
        super(parent);
        initComponents();
        this.setModal(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Registro de instrucciones");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLog = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        lblP1 = new javax.swing.JLabel();
        CBP1 = new javax.swing.JCheckBox();
        CBP2 = new javax.swing.JCheckBox();
        CBP3 = new javax.swing.JCheckBox();
        CBP4 = new javax.swing.JCheckBox();
        CBP5 = new javax.swing.JCheckBox();
        CBP6 = new javax.swing.JCheckBox();
        CBP7 = new javax.swing.JCheckBox();
        CBP8 = new javax.swing.JCheckBox();
        btnMenu = new javax.swing.JButton();
        CBP9 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        lblP2 = new javax.swing.JLabel();
        lblP3 = new javax.swing.JLabel();
        lblP4 = new javax.swing.JLabel();
        lblP5 = new javax.swing.JLabel();
        lblP6 = new javax.swing.JLabel();
        lblP7 = new javax.swing.JLabel();
        lblP8 = new javax.swing.JLabel();
        lblP9 = new javax.swing.JLabel();
        lblNombreArchivo = new javax.swing.JLabel();
        lblRutaArchivo = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlLog.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Procesando el archivo:");

        jProgressBar1.setBackground(new java.awt.Color(153, 153, 153));

        lblP1.setForeground(new java.awt.Color(255, 255, 255));
        lblP1.setText("Proceso 1:");

        CBP1.setBackground(new java.awt.Color(0, 51, 51));
        CBP1.setForeground(new java.awt.Color(255, 255, 255));
        CBP1.setText("Procesado correctamente");
        CBP1.setEnabled(false);
        CBP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBP1ActionPerformed(evt);
            }
        });

        CBP2.setBackground(new java.awt.Color(0, 51, 51));
        CBP2.setForeground(new java.awt.Color(255, 255, 255));
        CBP2.setText("Procesado correctamente");
        CBP2.setEnabled(false);

        CBP3.setBackground(new java.awt.Color(0, 51, 51));
        CBP3.setForeground(new java.awt.Color(255, 255, 255));
        CBP3.setText("Procesado correctamente");
        CBP3.setEnabled(false);
        CBP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBP3ActionPerformed(evt);
            }
        });

        CBP4.setBackground(new java.awt.Color(0, 51, 51));
        CBP4.setForeground(new java.awt.Color(255, 255, 255));
        CBP4.setText("Procesado correctamente");
        CBP4.setEnabled(false);

        CBP5.setBackground(new java.awt.Color(0, 51, 51));
        CBP5.setForeground(new java.awt.Color(255, 255, 255));
        CBP5.setText("Procesado correctamente");
        CBP5.setEnabled(false);

        CBP6.setBackground(new java.awt.Color(0, 51, 51));
        CBP6.setForeground(new java.awt.Color(255, 255, 255));
        CBP6.setText("Procesado correctamente");
        CBP6.setEnabled(false);

        CBP7.setBackground(new java.awt.Color(0, 51, 51));
        CBP7.setForeground(new java.awt.Color(255, 255, 255));
        CBP7.setText("Procesado correctamente");
        CBP7.setEnabled(false);

        CBP8.setBackground(new java.awt.Color(0, 51, 51));
        CBP8.setForeground(new java.awt.Color(255, 255, 255));
        CBP8.setText("Procesado correctamente");
        CBP8.setEnabled(false);

        btnMenu.setBackground(new java.awt.Color(102, 102, 102));
        btnMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("Regresar al menú principal");
        btnMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMenu.setOpaque(false);
        btnMenu.setBorderPainted(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        CBP9.setBackground(new java.awt.Color(0, 51, 51));
        CBP9.setForeground(new java.awt.Color(255, 255, 255));
        CBP9.setText("Procesado correctamente");
        CBP9.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("En la ruta:");

        lblP2.setForeground(new java.awt.Color(255, 255, 255));
        lblP2.setText("Proceso 1:");

        lblP3.setForeground(new java.awt.Color(255, 255, 255));
        lblP3.setText("Proceso 1:");

        lblP4.setForeground(new java.awt.Color(255, 255, 255));
        lblP4.setText("Proceso 1:");

        lblP5.setForeground(new java.awt.Color(255, 255, 255));
        lblP5.setText("Proceso 1:");

        lblP6.setForeground(new java.awt.Color(255, 255, 255));
        lblP6.setText("Proceso 1:");

        lblP7.setForeground(new java.awt.Color(255, 255, 255));
        lblP7.setText("Proceso 1:");

        lblP8.setForeground(new java.awt.Color(255, 255, 255));
        lblP8.setText("Proceso 1:");

        lblP9.setForeground(new java.awt.Color(255, 255, 255));
        lblP9.setText("Proceso 1:");

        lblNombreArchivo.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArchivo.setText("Proceso 1:");

        lblRutaArchivo.setForeground(new java.awt.Color(255, 255, 255));
        lblRutaArchivo.setText("Proceso 1:");

        lblResultado.setForeground(new java.awt.Color(255, 255, 255));
        lblResultado.setText("La carga del archivo fue exitosa");

        javax.swing.GroupLayout pnlLogLayout = new javax.swing.GroupLayout(pnlLog);
        pnlLog.setLayout(pnlLogLayout);
        pnlLogLayout.setHorizontalGroup(
            pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(pnlLogLayout.createSequentialGroup()
                .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLogLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(btnMenu))
                    .addGroup(pnlLogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lblRutaArchivo))
                    .addGroup(pnlLogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombreArchivo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogLayout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogLayout.createSequentialGroup()
                        .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblP9)
                            .addComponent(lblP3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblP4)
                            .addComponent(lblP5)
                            .addComponent(lblP6)
                            .addComponent(lblP7)
                            .addComponent(lblP8)
                            .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblP1)
                                .addComponent(lblP2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                        .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBP3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBP8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBP7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBP6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBP5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBP4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBP2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBP1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBP9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(104, 104, 104))))
            .addGroup(pnlLogLayout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(lblResultado)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlLogLayout.setVerticalGroup(
            pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNombreArchivo))
                .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLogLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblRutaArchivo)))
                    .addGroup(pnlLogLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLogLayout.createSequentialGroup()
                                .addComponent(CBP1)
                                .addGap(18, 18, 18)
                                .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CBP2)
                                    .addComponent(lblP2))
                                .addGap(18, 18, 18)
                                .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CBP3)
                                    .addComponent(lblP3)))
                            .addComponent(lblP1))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBP4)
                            .addComponent(lblP4))
                        .addGap(18, 18, 18)
                        .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBP5)
                            .addComponent(lblP5))
                        .addGap(18, 18, 18)
                        .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBP6)
                            .addComponent(lblP6))
                        .addGap(18, 18, 18)
                        .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBP7)
                            .addComponent(lblP7))
                        .addGap(18, 18, 18)
                        .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBP8)
                            .addComponent(lblP8))
                        .addGap(20, 20, 20)
                        .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBP9)
                            .addComponent(lblP9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(lblResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenu)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBP3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBP3ActionPerformed

    private void CBP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBP1ActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        this.dispose();
        new JFMenuPrincipal().setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CBP1;
    private javax.swing.JCheckBox CBP2;
    private javax.swing.JCheckBox CBP3;
    private javax.swing.JCheckBox CBP4;
    private javax.swing.JCheckBox CBP5;
    private javax.swing.JCheckBox CBP6;
    private javax.swing.JCheckBox CBP7;
    private javax.swing.JCheckBox CBP8;
    private javax.swing.JCheckBox CBP9;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNombreArchivo;
    private javax.swing.JLabel lblP1;
    private javax.swing.JLabel lblP2;
    private javax.swing.JLabel lblP3;
    private javax.swing.JLabel lblP4;
    private javax.swing.JLabel lblP5;
    private javax.swing.JLabel lblP6;
    private javax.swing.JLabel lblP7;
    private javax.swing.JLabel lblP8;
    private javax.swing.JLabel lblP9;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblRutaArchivo;
    private javax.swing.JPanel pnlLog;
    // End of variables declaration//GEN-END:variables
}
