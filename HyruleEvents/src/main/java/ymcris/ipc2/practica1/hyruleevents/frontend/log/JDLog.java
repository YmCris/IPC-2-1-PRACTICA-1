package ymcris.ipc2.practica1.hyruleevents.frontend.log;

import javax.swing.JOptionPane;
import ymcris.ipc2.practica1.hyruleevents.frontend.JFMenuPrincipal;
import ymcris.ipc2.practica1.hyruleevents.intermediary.ValidacionArchivo;
import ymcris.ipc2.practica1.hyruleevents.intermediary.ValidacionBaseDeDatos;

/**
 *
 * @author YmCris
 */
public class JDLog extends javax.swing.JDialog {
    
    private ValidacionArchivo validacion;
    private ValidacionBaseDeDatos validacionDB;
    private StringBuilder build = new StringBuilder();
    
    public JDLog(java.awt.Frame parent, ValidacionBaseDeDatos validacionDB) {
        super(parent);
        initComponents();
        this.setModal(true);
        this.validacionDB = validacionDB;
        this.validacion = validacionDB.getValidacionA();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Registro de instrucciones");
    }
    
    public void actualizar() {
        lblNombreArchivo.setText(validacion.getArchivoEntrada().getName());
        lblRutaArchivo.setText(validacion.getArchivoEntrada().getPath());
    }
    
    public void mostrarMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Método encargado de modificar un string build para ir agregando el
     * resultado de todos los registros
     *
     * @param instruccion Toda la instrucción introducida por el usuario
     * @param resultado "aceptada" o "rechazada"
     * @param motivo solo si fue rechazada, se debe escribir "porque ..."
     */
    public void añadirRegistro(String[] instruccion, String resultado, String motivo) {
        build.append("La instrucción: '");
        for (String parte : instruccion) {
            build.append(parte);
            build.append(" ");
        }
        build.append("' fue ");
        build.append(resultado);
        build.append(" ");
        build.append(motivo);
        build.append("\n");
    }
    
    public void añadirRegistroVisible() {
        txtStack.setText(build.toString());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLog = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        btnMenu = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        lblNombreArchivo = new javax.swing.JLabel();
        lblRutaArchivo = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtStack = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlLog.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Procesando el archivo:");

        jProgressBar1.setBackground(new java.awt.Color(153, 153, 153));

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

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("En la ruta:");

        lblNombreArchivo.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArchivo.setText("Proceso 1:");

        lblRutaArchivo.setForeground(new java.awt.Color(255, 255, 255));
        lblRutaArchivo.setText("Proceso 1:");

        lblResultado.setForeground(new java.awt.Color(255, 255, 255));
        lblResultado.setText("La carga del archivo fue exitosa");

        txtStack.setBackground(new java.awt.Color(0, 0, 0));
        txtStack.setColumns(20);
        txtStack.setForeground(new java.awt.Color(255, 255, 255));
        txtStack.setRows(5);
        txtStack.setEnabled(false);
        jScrollPane1.setViewportView(txtStack);

        javax.swing.GroupLayout pnlLogLayout = new javax.swing.GroupLayout(pnlLog);
        pnlLog.setLayout(pnlLogLayout);
        pnlLogLayout.setHorizontalGroup(
            pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogLayout.createSequentialGroup()
                .addGap(127, 166, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(pnlLogLayout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(lblResultado)
                .addGap(0, 0, Short.MAX_VALUE))
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
                        .addComponent(lblNombreArchivo))
                    .addGroup(pnlLogLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLogLayout.setVerticalGroup(
            pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNombreArchivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblRutaArchivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addGap(10, 10, 10)
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

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        this.dispose();
        new JFMenuPrincipal(validacion.getConnect()).setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNombreArchivo;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblRutaArchivo;
    private javax.swing.JPanel pnlLog;
    private javax.swing.JTextArea txtStack;
    // End of variables declaration//GEN-END:variables

    public ValidacionArchivo getValidacion() {
        return validacion;
    }
    
}
