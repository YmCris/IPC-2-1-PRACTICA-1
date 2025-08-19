package ymcris.ipc2.practica1.hyruleevents.frontend.formularios;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import ymcris.ipc2.practica1.hyruleevents.frontend.JFMenuPrincipal;
import ymcris.ipc2.practica1.hyruleevents.frontend.log.JDLog;
import ymcris.ipc2.practica1.hyruleevents.intermediary.ValidacionBaseDeDatos;
import ymcris.ipc2.practica1.hyruleevents.intermediary.ValidacionFormulario;

/**
 *
 * @author YmCris
 * @see ValidacionFormulario
 */
public class JFFormulario extends javax.swing.JFrame {

    private JDLog log;
    private ValidacionFormulario validacionF;
    private ValidacionBaseDeDatos validacionDB;

    public JFFormulario(ValidacionFormulario validacionF, ValidacionBaseDeDatos validacionDB) {
        initComponents();
        this.validacionF = validacionF;
        this.log = new JDLog(this, validacionDB);
        this.setResizable(false);
        this.setTitle("Formularios");
        this.validacionDB = validacionDB;
        this.setLocationRelativeTo(null);
        validacionDB.setLog(log);
    }

    private void iniciarLog() {
        validacionDB.setInstrucionFormulario(validacionF.getContenido());
        validacionDB.almacenarInstruccionDelFormularioEnLaBaseDeDatos();
        log.añadirRegistroVisible();
        log.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pnlOpciones = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        btnMenu1 = new javax.swing.JButton();
        btnMenu12 = new javax.swing.JButton();
        btnMenu13 = new javax.swing.JButton();
        btnMenu14 = new javax.swing.JButton();
        JTPFormularios = new javax.swing.JTabbedPane();
        pnlFormulario1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoEvento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spnFecha = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        cBTiposDeEventos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtTituloEvento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtUbicacionEvento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        spnCupo = new javax.swing.JSpinner();
        btnRegistrarEvento = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        spnMontoEvento = new javax.swing.JSpinner();
        pnlFormulario2 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        txtNombreCompleto = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        cBTipoDeParticipante = new javax.swing.JComboBox<>();
        jLabel88 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnRegistrarParticipante = new javax.swing.JButton();
        txtInstitucion = new javax.swing.JTextField();
        pnlFormulario3 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        txtCorreoParticipanteInscripcion = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        cbTipoDeInscripcion = new javax.swing.JComboBox<>();
        btnRealizarInscipcion = new javax.swing.JButton();
        txtCodigoEventoInscripcion = new javax.swing.JTextField();
        pnlFormulario4 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        txtCorreoDelParticipantePago = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        cbMetodoDePago = new javax.swing.JComboBox<>();
        jLabel72 = new javax.swing.JLabel();
        spnMonto = new javax.swing.JSpinner();
        btnRealizarPago = new javax.swing.JButton();
        txtCodigoEventoPago = new javax.swing.JTextField();
        pnlFormulario5 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtCorreoParticipanteValidarInscripción = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        txtCodigoEventoValidarInscripcion = new javax.swing.JTextField();
        btnValidarInscripcion = new javax.swing.JButton();
        pnlFormulario6 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        txtCodigoEventoActividad = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        cbTipoDeActividad = new javax.swing.JComboBox<>();
        jLabel79 = new javax.swing.JLabel();
        txtTituloActividad = new javax.swing.JTextField();
        txtCorreoPonente = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        spnCupoActividad = new javax.swing.JSpinner();
        btnRegistrarActividad = new javax.swing.JButton();
        txtCodigoActividad = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        txtHoraInicio = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        txtHoraFin = new javax.swing.JTextField();
        pnlFormulario7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCorreoAsistencia = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCodigoActividadAsistencia = new javax.swing.JTextField();
        btnRegistrarAsistencia = new javax.swing.JButton();
        pnlFormulario8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtCorreoCertificado = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        txtCodigoEventoCertificado = new javax.swing.JTextField();
        btnSolicitarCertificado = new javax.swing.JButton();
        pnlFormulario10 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtCodigoEventoReporteParticipantes = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        cbTipoDeParticipanteReporteParticipantes = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        txtInstitucionDeProcedenciaReporteParticipantes = new javax.swing.JTextField();
        btnReporteParticipantes = new javax.swing.JButton();
        pnlFormulario9 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtCodigoEventoReporteActividades = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        cbTipoDeActividadReporteDeActividades = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        txtCorreoPonenteReporteActividades = new javax.swing.JTextField();
        btnReporteActividades = new javax.swing.JButton();
        pnlFormulario11 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        spnFechaInicialReporteEventos = new javax.swing.JSpinner();
        jLabel42 = new javax.swing.JLabel();
        cbTipoEventosReporteEventos = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        spnValorInicialReporteEventos = new javax.swing.JSpinner();
        btnReporteDeEventos = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        spnFechaFinalReporteEventos = new javax.swing.JSpinner();
        jLabel53 = new javax.swing.JLabel();
        spnValorFinalReporteEventos = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        pnlOpciones.setBackground(new java.awt.Color(51, 51, 51));

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

        btnMenu1.setBackground(new java.awt.Color(102, 102, 102));
        btnMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMenu1.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu1.setText("Ayuda");
        btnMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMenu1.setOpaque(false);
        btnMenu1.setBorderPainted(false);
        btnMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu1ActionPerformed(evt);
            }
        });

        btnMenu12.setBackground(new java.awt.Color(102, 102, 102));
        btnMenu12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMenu12.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu12.setText("Participantes existentes");
        btnMenu12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMenu12.setOpaque(false);
        btnMenu12.setBorderPainted(false);
        btnMenu12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu12ActionPerformed(evt);
            }
        });

        btnMenu13.setBackground(new java.awt.Color(102, 102, 102));
        btnMenu13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMenu13.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu13.setText("Eventos existentes");
        btnMenu13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMenu13.setOpaque(false);
        btnMenu13.setBorderPainted(false);

        btnMenu14.setBackground(new java.awt.Color(102, 102, 102));
        btnMenu14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMenu14.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu14.setText("Actividades existentes");
        btnMenu14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMenu14.setOpaque(false);
        btnMenu14.setBorderPainted(false);

        javax.swing.GroupLayout pnlOpcionesLayout = new javax.swing.GroupLayout(pnlOpciones);
        pnlOpciones.setLayout(pnlOpcionesLayout);
        pnlOpcionesLayout.setHorizontalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenu14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMenu13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMenu12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMenu1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMenu)
                .addGap(15, 15, 15))
        );
        pnlOpcionesLayout.setVerticalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenu)
                    .addComponent(btnMenu1)
                    .addComponent(btnMenu12)
                    .addComponent(btnMenu13)
                    .addComponent(btnMenu14)))
        );

        JTPFormularios.setBackground(new java.awt.Color(51, 51, 51));
        JTPFormularios.setForeground(new java.awt.Color(255, 255, 255));

        pnlFormulario1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código del evento");

        txtCodigoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEventoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRAR EVENTOS");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LAS PALABRAS DEBEN IR ENTRE COMILLAS Y A EXCEPCIÓN DE LOS NÚMEROS");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha del evento");

        spnFecha.setModel(new javax.swing.SpinnerDateModel());
        spnFecha.setToolTipText("");
        spnFecha.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo evento");

        cBTiposDeEventos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHARLA", "CONGRESO", "TALLER", "DEBATE" }));
        cBTiposDeEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBTiposDeEventosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Título del evento");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ubicación");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cupo máximo");

        spnCupo.setModel(new javax.swing.SpinnerNumberModel(5, 5, null, 1));

        btnRegistrarEvento.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrarEvento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarEvento.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarEvento.setText("Registrar Evento");
        btnRegistrarEvento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarEvento.setOpaque(false);
        btnRegistrarEvento.setBorderPainted(false);
        btnRegistrarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEventoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ejemplo: \"EVT-001\",  150");

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Monto");

        spnMontoEvento.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout pnlFormulario1Layout = new javax.swing.GroupLayout(pnlFormulario1);
        pnlFormulario1.setLayout(pnlFormulario1Layout);
        pnlFormulario1Layout.setHorizontalGroup(
            pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(370, 370, 370))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(356, 356, 356))))
            .addGroup(pnlFormulario1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlFormulario1Layout.createSequentialGroup()
                        .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(83, 83, 83)
                        .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                            .addComponent(cBTiposDeEventos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlFormulario1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTituloEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario1Layout.createSequentialGroup()
                        .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUbicacionEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                            .addComponent(spnCupo)
                            .addGroup(pnlFormulario1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnRegistrarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(spnMontoEvento)))
                    .addGroup(pnlFormulario1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(74, 74, 74)
                        .addComponent(txtCodigoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        pnlFormulario1Layout.setVerticalGroup(
            pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(75, 75, 75)
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spnFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cBTiposDeEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormulario1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTituloEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUbicacionEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(spnCupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnMontoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(25, 25, 25)
                .addComponent(btnRegistrarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        JTPFormularios.addTab("Registrar Eventos", pnlFormulario1);

        pnlFormulario2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel82.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("REGISTRAR PARTICIPANTE");

        jLabel83.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("LAS PALABRAS DEBEN IR ENTRE COMILLAS Y A EXCEPCIÓN DE LOS NÚMEROS");

        jLabel84.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("Ejemplo: \"Ramon\" \"ramoneldragon@gmail.com\"");

        jLabel85.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("Nombre completo");

        txtNombreCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCompletoActionPerformed(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("Tipo de participante");

        jLabel87.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setText("Institución de procedencia");

        cBTipoDeParticipante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESTUDIANTE", "PROFESIONAL", "INVITADO" }));

        jLabel88.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText("Correo electrónico");

        btnRegistrarParticipante.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrarParticipante.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarParticipante.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarParticipante.setText("Registrar Participante");
        btnRegistrarParticipante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarParticipante.setOpaque(false);
        btnRegistrarParticipante.setBorderPainted(false);
        btnRegistrarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarParticipanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormulario2Layout = new javax.swing.GroupLayout(pnlFormulario2);
        pnlFormulario2.setLayout(pnlFormulario2Layout);
        pnlFormulario2Layout.setHorizontalGroup(
            pnlFormulario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario2Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(pnlFormulario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormulario2Layout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormulario2Layout.createSequentialGroup()
                        .addComponent(jLabel88)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormulario2Layout.createSequentialGroup()
                        .addComponent(jLabel86)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cBTipoDeParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormulario2Layout.createSequentialGroup()
                        .addComponent(jLabel87)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(157, 157, 157))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFormulario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario2Layout.createSequentialGroup()
                        .addGroup(pnlFormulario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormulario2Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jLabel82))
                            .addComponent(jLabel83, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario2Layout.createSequentialGroup()
                                .addComponent(jLabel84)
                                .addGap(103, 103, 103)))
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario2Layout.createSequentialGroup()
                        .addComponent(btnRegistrarParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(351, 351, 351))))
        );
        pnlFormulario2Layout.setVerticalGroup(
            pnlFormulario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel82)
                .addGap(35, 35, 35)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel84)
                .addGap(84, 84, 84)
                .addGroup(pnlFormulario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(pnlFormulario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(cBTipoDeParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormulario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(txtInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlFormulario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addComponent(btnRegistrarParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        JTPFormularios.addTab("Registrar Participante", pnlFormulario2);

        pnlFormulario3.setBackground(new java.awt.Color(0, 51, 51));

        jLabel73.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("REALIZAR INSCRIPCIÓN");

        jLabel74.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("LAS PALABRAS DEBEN IR ENTRE COMILLAS Y A EXCEPCIÓN DE LOS NÚMEROS");

        jLabel75.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("Ejemplo: \"EVT-001\" \"hola.mundo@gmail.com\"");

        jLabel76.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Correo del participante");

        txtCorreoParticipanteInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoParticipanteInscripcionActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Código del evento");

        jLabel78.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("Tipo de inscripción");

        cbTipoDeInscripcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ASISTENTE", "CONFERENCISTA", "TALLERISTA", "OTRO" }));

        btnRealizarInscipcion.setBackground(new java.awt.Color(102, 102, 102));
        btnRealizarInscipcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRealizarInscipcion.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarInscipcion.setText("Realizar Inscripción");
        btnRealizarInscipcion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRealizarInscipcion.setOpaque(false);
        btnRealizarInscipcion.setBorderPainted(false);
        btnRealizarInscipcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarInscipcionActionPerformed(evt);
            }
        });

        txtCodigoEventoInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEventoInscripcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormulario3Layout = new javax.swing.GroupLayout(pnlFormulario3);
        pnlFormulario3.setLayout(pnlFormulario3Layout);
        pnlFormulario3Layout.setHorizontalGroup(
            pnlFormulario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario3Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(pnlFormulario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormulario3Layout.createSequentialGroup()
                        .addGroup(pnlFormulario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77)
                            .addComponent(jLabel78))
                        .addGap(83, 83, 83)
                        .addGroup(pnlFormulario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTipoDeInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoEventoInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlFormulario3Layout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addGap(54, 54, 54)
                        .addComponent(txtCorreoParticipanteInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormulario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario3Layout.createSequentialGroup()
                            .addComponent(jLabel75)
                            .addGap(95, 95, 95))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario3Layout.createSequentialGroup()
                            .addComponent(jLabel73)
                            .addGap(188, 188, 188))))
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRealizarInscipcion, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(367, 367, 367))
        );
        pnlFormulario3Layout.setVerticalGroup(
            pnlFormulario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario3Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel73)
                .addGap(35, 35, 35)
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel75)
                .addGap(93, 93, 93)
                .addGroup(pnlFormulario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoParticipanteInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76))
                .addGap(20, 20, 20)
                .addGroup(pnlFormulario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(txtCodigoEventoInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlFormulario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbTipoDeInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormulario3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel78)))
                .addGap(131, 131, 131)
                .addComponent(btnRealizarInscipcion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        JTPFormularios.addTab("Realizar Inscripción", pnlFormulario3);

        pnlFormulario4.setBackground(new java.awt.Color(0, 51, 51));

        jLabel64.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("REALIZAR PAGO");

        jLabel65.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("LAS PALABRAS DEBEN IR ENTRE COMILLAS Y A EXCEPCIÓN DE LOS NÚMEROS");

        jLabel66.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Ejemplo: \"EVT-001\" 150");

        jLabel67.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Correo del participante");

        txtCorreoDelParticipantePago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoDelParticipantePagoActionPerformed(evt);
            }
        });

        jLabel68.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Código del evento");

        jLabel69.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Método de pago");

        cbMetodoDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EFECTIVO", "TRANSFERENCIA", "TARJETA" }));

        jLabel72.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Monto");

        spnMonto.setModel(new javax.swing.SpinnerNumberModel(100, 100, null, 10));

        btnRealizarPago.setBackground(new java.awt.Color(102, 102, 102));
        btnRealizarPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRealizarPago.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarPago.setText("Realizar Pago");
        btnRealizarPago.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRealizarPago.setOpaque(false);
        btnRealizarPago.setBorderPainted(false);
        btnRealizarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPagoActionPerformed(evt);
            }
        });

        txtCodigoEventoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEventoPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormulario4Layout = new javax.swing.GroupLayout(pnlFormulario4);
        pnlFormulario4.setLayout(pnlFormulario4Layout);
        pnlFormulario4Layout.setHorizontalGroup(
            pnlFormulario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario4Layout.createSequentialGroup()
                .addGroup(pnlFormulario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormulario4Layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addGroup(pnlFormulario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRealizarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlFormulario4Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel66))))
                    .addGroup(pnlFormulario4Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(pnlFormulario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlFormulario4Layout.createSequentialGroup()
                                .addGroup(pnlFormulario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel68)
                                    .addComponent(jLabel69))
                                .addGap(83, 83, 83)
                                .addGroup(pnlFormulario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbMetodoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigoEventoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlFormulario4Layout.createSequentialGroup()
                                .addComponent(jLabel67)
                                .addGap(49, 49, 49)
                                .addComponent(txtCorreoDelParticipantePago, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFormulario4Layout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spnMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFormulario4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel65))))
                    .addGroup(pnlFormulario4Layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(jLabel64)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        pnlFormulario4Layout.setVerticalGroup(
            pnlFormulario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario4Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel64)
                .addGap(42, 42, 42)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel66)
                .addGap(60, 60, 60)
                .addGroup(pnlFormulario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoDelParticipantePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67))
                .addGap(20, 20, 20)
                .addGroup(pnlFormulario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(txtCodigoEventoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlFormulario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbMetodoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormulario4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel69)))
                .addGap(18, 18, 18)
                .addGroup(pnlFormulario4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(spnMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addComponent(btnRealizarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        JTPFormularios.addTab("Realizar Pago", pnlFormulario4);

        pnlFormulario5.setBackground(new java.awt.Color(0, 51, 51));

        jLabel55.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("VALIDAR INSCRIPCIÓN");

        jLabel56.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("LAS PALABRAS DEBEN IR ENTRE COMILLAS Y A EXCEPCIÓN DE LOS NÚMEROS");

        jLabel57.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Ejemplo: \"EVT-001\" \"holamundo@hotmail.com\"");

        jLabel58.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Correo del participante");

        txtCorreoParticipanteValidarInscripción.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoParticipanteValidarInscripciónActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Código del evento");

        btnValidarInscripcion.setBackground(new java.awt.Color(102, 102, 102));
        btnValidarInscripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnValidarInscripcion.setForeground(new java.awt.Color(255, 255, 255));
        btnValidarInscripcion.setText("Validar Inscripción");
        btnValidarInscripcion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnValidarInscripcion.setOpaque(false);
        btnValidarInscripcion.setBorderPainted(false);
        btnValidarInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarInscripcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormulario5Layout = new javax.swing.GroupLayout(pnlFormulario5);
        pnlFormulario5.setLayout(pnlFormulario5Layout);
        pnlFormulario5Layout.setHorizontalGroup(
            pnlFormulario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario5Layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addGroup(pnlFormulario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario5Layout.createSequentialGroup()
                        .addGroup(pnlFormulario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormulario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario5Layout.createSequentialGroup()
                                    .addComponent(jLabel62)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCodigoEventoValidarInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlFormulario5Layout.createSequentialGroup()
                                    .addComponent(jLabel58)
                                    .addGap(74, 74, 74)
                                    .addComponent(txtCorreoParticipanteValidarInscripción, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlFormulario5Layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(jLabel55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario5Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(pnlFormulario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario5Layout.createSequentialGroup()
                                        .addComponent(jLabel56)
                                        .addGap(55, 55, 55))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario5Layout.createSequentialGroup()
                                        .addComponent(jLabel57)
                                        .addGap(159, 159, 159)))))
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario5Layout.createSequentialGroup()
                        .addComponent(btnValidarInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(366, 366, 366))))
        );
        pnlFormulario5Layout.setVerticalGroup(
            pnlFormulario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario5Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel55)
                .addGap(35, 35, 35)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel57)
                .addGap(94, 94, 94)
                .addGroup(pnlFormulario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoParticipanteValidarInscripción, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addGap(18, 18, 18)
                .addGroup(pnlFormulario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoEventoValidarInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62))
                .addGap(128, 128, 128)
                .addComponent(btnValidarInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        JTPFormularios.addTab("Validar Inscipción", pnlFormulario5);

        pnlFormulario6.setBackground(new java.awt.Color(0, 51, 51));

        jLabel59.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("REGISTRAR ACTIVIDAD");

        jLabel60.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("LAS PALABRAS DEBEN IR ENTRE COMILLAS Y A EXCEPCIÓN DE LOS NÚMEROS");

        jLabel61.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Ejemplo: \"ACT-005\" \"EVT-001\" 150 \"10:30\"");

        jLabel63.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Código del evento");

        txtCodigoEventoActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEventoActividadActionPerformed(evt);
            }
        });

        jLabel70.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Hora Inicio");

        jLabel71.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Tipo de actividad");

        cbTipoDeActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHARLA", "TALLER", "DEBATE", "OTRA" }));

        jLabel79.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Título de la actividad");

        jLabel80.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("Correo del ponente");

        jLabel81.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("Cupo máximo");

        spnCupoActividad.setModel(new javax.swing.SpinnerNumberModel(5, 5, null, 1));

        btnRegistrarActividad.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrarActividad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarActividad.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarActividad.setText("Registrar Actividad");
        btnRegistrarActividad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarActividad.setOpaque(false);
        btnRegistrarActividad.setBorderPainted(false);
        btnRegistrarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActividadActionPerformed(evt);
            }
        });

        txtCodigoActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActividadActionPerformed(evt);
            }
        });

        jLabel89.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("Código de la actividad");

        txtHoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraInicioActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("Hora fin");

        txtHoraFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraFinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormulario6Layout = new javax.swing.GroupLayout(pnlFormulario6);
        pnlFormulario6.setLayout(pnlFormulario6Layout);
        pnlFormulario6Layout.setHorizontalGroup(
            pnlFormulario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario6Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(pnlFormulario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel90)
                    .addGroup(pnlFormulario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario6Layout.createSequentialGroup()
                            .addGroup(pnlFormulario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel81)
                                .addComponent(jLabel80))
                            .addGroup(pnlFormulario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnlFormulario6Layout.createSequentialGroup()
                                    .addGap(110, 110, 110)
                                    .addComponent(btnRegistrarActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(208, 208, 208))
                                .addGroup(pnlFormulario6Layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addComponent(spnCupoActividad))))
                        .addGroup(pnlFormulario6Layout.createSequentialGroup()
                            .addGroup(pnlFormulario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel63)
                                .addComponent(jLabel89))
                            .addGap(45, 45, 45)
                            .addGroup(pnlFormulario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCodigoActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCodigoEventoActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlFormulario6Layout.createSequentialGroup()
                            .addGroup(pnlFormulario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel71)
                                .addComponent(jLabel79)
                                .addComponent(jLabel70))
                            .addGap(53, 53, 53)
                            .addGroup(pnlFormulario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTituloActividad)
                                .addComponent(cbTipoDeActividad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCorreoPonente)
                                .addComponent(txtHoraInicio)
                                .addComponent(txtHoraFin, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGap(118, 118, 118))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFormulario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario6Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario6Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addGap(355, 355, 355))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario6Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addGap(297, 297, 297))))
        );
        pnlFormulario6Layout.setVerticalGroup(
            pnlFormulario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel59)
                .addGap(51, 51, 51)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel61)
                .addGap(31, 31, 31)
                .addGroup(pnlFormulario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFormulario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoEventoActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63))
                .addGap(18, 18, 18)
                .addGroup(pnlFormulario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(cbTipoDeActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlFormulario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(txtTituloActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormulario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoPonente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFormulario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormulario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(txtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pnlFormulario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel81)
                    .addComponent(spnCupoActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(btnRegistrarActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        JTPFormularios.addTab("Registrar Actividad", pnlFormulario6);

        pnlFormulario7.setBackground(new java.awt.Color(0, 51, 51));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("REGISTRAR ASISTENCIA");

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("LAS PALABRAS DEBEN IR ENTRE COMILLAS Y A EXCEPCIÓN DE LOS NÚMEROS");

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ejemplo: \"cris123@gmail.com\" \"ACT-008\"");

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Correo del participante");

        txtCorreoAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoAsistenciaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Código de la actividad");

        btnRegistrarAsistencia.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrarAsistencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarAsistencia.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAsistencia.setText("Registrar Asistencia");
        btnRegistrarAsistencia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarAsistencia.setOpaque(false);
        btnRegistrarAsistencia.setBorderPainted(false);
        btnRegistrarAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAsistenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormulario7Layout = new javax.swing.GroupLayout(pnlFormulario7);
        pnlFormulario7.setLayout(pnlFormulario7Layout);
        pnlFormulario7Layout.setHorizontalGroup(
            pnlFormulario7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario7Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(pnlFormulario7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormulario7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario7Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCodigoActividadAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlFormulario7Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(74, 74, 74)
                            .addComponent(txtCorreoAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlFormulario7Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pnlFormulario7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario7Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario7Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(180, 180, 180)))))
                .addGap(115, 115, 115))
            .addGroup(pnlFormulario7Layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(btnRegistrarAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormulario7Layout.setVerticalGroup(
            pnlFormulario7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario7Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel10)
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(100, 100, 100)
                .addGroup(pnlFormulario7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(43, 43, 43)
                .addGroup(pnlFormulario7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoActividadAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(103, 103, 103)
                .addComponent(btnRegistrarAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        JTPFormularios.addTab("Registrar Asistencia", pnlFormulario7);

        pnlFormulario8.setBackground(new java.awt.Color(0, 51, 51));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SOLICITAR CERTIFICADO");

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("LAS PALABRAS DEBEN IR ENTRE COMILLAS Y A EXCEPCIÓN DE LOS NÚMEROS");

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ejemplo: \"cris123@gmail.com\" \"ACT-008\"");

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Correo del participante");

        txtCorreoCertificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoCertificadoActionPerformed(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("Código del evento");

        btnSolicitarCertificado.setBackground(new java.awt.Color(102, 102, 102));
        btnSolicitarCertificado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSolicitarCertificado.setForeground(new java.awt.Color(255, 255, 255));
        btnSolicitarCertificado.setText("Solicitar Certificado");
        btnSolicitarCertificado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSolicitarCertificado.setOpaque(false);
        btnSolicitarCertificado.setBorderPainted(false);
        btnSolicitarCertificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarCertificadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormulario8Layout = new javax.swing.GroupLayout(pnlFormulario8);
        pnlFormulario8.setLayout(pnlFormulario8Layout);
        pnlFormulario8Layout.setHorizontalGroup(
            pnlFormulario8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario8Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(pnlFormulario8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario8Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario8Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario8Layout.createSequentialGroup()
                            .addComponent(jLabel91)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCodigoEventoCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlFormulario8Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addGap(74, 74, 74)
                            .addComponent(txtCorreoCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(115, 115, 115))
            .addGroup(pnlFormulario8Layout.createSequentialGroup()
                .addGroup(pnlFormulario8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormulario8Layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(btnSolicitarCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormulario8Layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormulario8Layout.setVerticalGroup(
            pnlFormulario8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario8Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel14)
                .addGap(35, 35, 35)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(100, 100, 100)
                .addGroup(pnlFormulario8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(43, 43, 43)
                .addGroup(pnlFormulario8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoEventoCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91))
                .addGap(103, 103, 103)
                .addComponent(btnSolicitarCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        JTPFormularios.addTab("Solicitar Certificado", pnlFormulario8);

        pnlFormulario10.setBackground(new java.awt.Color(0, 51, 51));

        jLabel28.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("REPORTE DE PARTICIPANTES");

        jLabel29.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("LAS PALABRAS DEBEN IR ENTRE COMILLAS Y A EXCEPCIÓN DE LOS NÚMEROS");

        jLabel30.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Ejemplo: \"EVT-005\" \"USAC\"");

        jLabel31.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Código del evento");

        txtCodigoEventoReporteParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEventoReporteParticipantesActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Tipo de participante");

        cbTipoDeParticipanteReporteParticipantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESTUDIANTE", "PROFESIONAL", "INVITADO" }));
        cbTipoDeParticipanteReporteParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoDeParticipanteReporteParticipantesActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Institución de procedencia");

        btnReporteParticipantes.setBackground(new java.awt.Color(102, 102, 102));
        btnReporteParticipantes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReporteParticipantes.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteParticipantes.setText("Generar Reporte de Participantes");
        btnReporteParticipantes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReporteParticipantes.setOpaque(false);
        btnReporteParticipantes.setBorderPainted(false);
        btnReporteParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteParticipantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormulario10Layout = new javax.swing.GroupLayout(pnlFormulario10);
        pnlFormulario10.setLayout(pnlFormulario10Layout);
        pnlFormulario10Layout.setHorizontalGroup(
            pnlFormulario10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario10Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(pnlFormulario10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlFormulario10Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(83, 83, 83)
                        .addComponent(cbTipoDeParticipanteReporteParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormulario10Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtInstitucionDeProcedenciaReporteParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormulario10Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(97, 97, 97)
                        .addComponent(txtCodigoEventoReporteParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFormulario10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario10Layout.createSequentialGroup()
                        .addGroup(pnlFormulario10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormulario10Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jLabel28))
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario10Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(180, 180, 180)))
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario10Layout.createSequentialGroup()
                        .addComponent(btnReporteParticipantes)
                        .addGap(303, 303, 303))))
        );
        pnlFormulario10Layout.setVerticalGroup(
            pnlFormulario10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario10Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel28)
                .addGap(35, 35, 35)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addGroup(pnlFormulario10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormulario10Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel31))
                    .addComponent(txtCodigoEventoReporteParticipantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormulario10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTipoDeParticipanteReporteParticipantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(pnlFormulario10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtInstitucionDeProcedenciaReporteParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(btnReporteParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );

        JTPFormularios.addTab("Reporte de Participantes", pnlFormulario10);

        pnlFormulario9.setBackground(new java.awt.Color(0, 51, 51));

        jLabel46.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("REPORTE DE ACTIVIDADES");

        jLabel47.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("LAS PALABRAS DEBEN IR ENTRE COMILLAS Y A EXCEPCIÓN DE LOS NÚMEROS");

        jLabel48.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Ejemplo: \"EVT-001\" \"ponente@cunoc.edu.gt\"");

        jLabel49.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Código del evento");

        txtCodigoEventoReporteActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEventoReporteActividadesActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Tipo de actividad");

        cbTipoDeActividadReporteDeActividades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHARLA", "TALLER", "DEBATE", "OTRA" }));

        jLabel52.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Correo del ponente");

        btnReporteActividades.setBackground(new java.awt.Color(102, 102, 102));
        btnReporteActividades.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReporteActividades.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteActividades.setText("Generar Reporte de Actividades");
        btnReporteActividades.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReporteActividades.setOpaque(false);
        btnReporteActividades.setBorderPainted(false);
        btnReporteActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActividadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormulario9Layout = new javax.swing.GroupLayout(pnlFormulario9);
        pnlFormulario9.setLayout(pnlFormulario9Layout);
        pnlFormulario9Layout.setHorizontalGroup(
            pnlFormulario9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario9Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(pnlFormulario9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52))
                .addGap(60, 60, 60)
                .addGroup(pnlFormulario9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTipoDeActividadReporteDeActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreoPonenteReporteActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoEventoReporteActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFormulario9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario9Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario9Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(356, 356, 356))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario9Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addGap(284, 284, 284))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario9Layout.createSequentialGroup()
                        .addComponent(btnReporteActividades)
                        .addGap(341, 341, 341))))
        );
        pnlFormulario9Layout.setVerticalGroup(
            pnlFormulario9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario9Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel46)
                .addGap(35, 35, 35)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addGap(100, 100, 100)
                .addGroup(pnlFormulario9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlFormulario9Layout.createSequentialGroup()
                        .addGroup(pnlFormulario9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoEventoReporteActividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49))
                        .addGap(18, 18, 18)
                        .addComponent(cbTipoDeActividadReporteDeActividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCorreoPonenteReporteActividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormulario9Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel52)))
                .addGap(128, 128, 128)
                .addComponent(btnReporteActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        JTPFormularios.addTab("Reporte de Actividades", pnlFormulario9);

        pnlFormulario11.setBackground(new java.awt.Color(0, 51, 51));

        jLabel37.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("REPORTE DE EVENTOS");

        jLabel38.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("LAS PALABRAS DEBEN IR ENTRE COMILLAS Y A EXCEPCIÓN DE LOS NÚMEROS");

        jLabel39.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Ejemplo: 45 , 150");

        jLabel41.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Fecha inicial");

        spnFechaInicialReporteEventos.setModel(new javax.swing.SpinnerDateModel());
        spnFechaInicialReporteEventos.setToolTipText("");
        spnFechaInicialReporteEventos.setFocusable(false);

        jLabel42.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Tipo de evento");

        cbTipoEventosReporteEventos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHARLA", "CONGRESO", "TALLER", "DEBATE" }));

        jLabel45.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Valor inicial de cupo");

        spnValorInicialReporteEventos.setModel(new javax.swing.SpinnerNumberModel(5, 5, null, 1));

        btnReporteDeEventos.setBackground(new java.awt.Color(102, 102, 102));
        btnReporteDeEventos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReporteDeEventos.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteDeEventos.setText("Generar Reporte de Eventos");
        btnReporteDeEventos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReporteDeEventos.setOpaque(false);
        btnReporteDeEventos.setBorderPainted(false);
        btnReporteDeEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteDeEventosActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Fecha final");

        spnFechaFinalReporteEventos.setModel(new javax.swing.SpinnerDateModel());
        spnFechaFinalReporteEventos.setToolTipText("");
        spnFechaFinalReporteEventos.setFocusable(false);

        jLabel53.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Valor final de cupo");

        spnValorFinalReporteEventos.setModel(new javax.swing.SpinnerNumberModel(5, 5, null, 1));

        javax.swing.GroupLayout pnlFormulario11Layout = new javax.swing.GroupLayout(pnlFormulario11);
        pnlFormulario11.setLayout(pnlFormulario11Layout);
        pnlFormulario11Layout.setHorizontalGroup(
            pnlFormulario11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario11Layout.createSequentialGroup()
                .addGroup(pnlFormulario11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormulario11Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(pnlFormulario11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel38)
                            .addGroup(pnlFormulario11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlFormulario11Layout.createSequentialGroup()
                                    .addGroup(pnlFormulario11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel41)
                                        .addComponent(jLabel42))
                                    .addGap(56, 56, 56)
                                    .addComponent(cbTipoEventosReporteEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlFormulario11Layout.createSequentialGroup()
                                        .addGroup(pnlFormulario11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel45)
                                            .addComponent(jLabel53))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlFormulario11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(spnValorFinalReporteEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spnFechaFinalReporteEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spnValorInicialReporteEventos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel50)
                                    .addComponent(spnFechaInicialReporteEventos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlFormulario11Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(btnReporteDeEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormulario11Layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jLabel39))
                    .addGroup(pnlFormulario11Layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(jLabel37)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        pnlFormulario11Layout.setVerticalGroup(
            pnlFormulario11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario11Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel37)
                .addGap(35, 35, 35)
                .addComponent(jLabel38)
                .addGroup(pnlFormulario11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlFormulario11Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel42)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormulario11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbTipoEventosReporteEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(pnlFormulario11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(spnFechaInicialReporteEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFormulario11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(spnFechaFinalReporteEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormulario11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(spnValorInicialReporteEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormulario11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(spnValorFinalReporteEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addComponent(btnReporteDeEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        JTPFormularios.addTab("Reporte de Eventos", pnlFormulario11);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JTPFormularios)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pnlOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTPFormularios))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        this.dispose();
        new JFMenuPrincipal(validacionF.getConnect()).setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu1ActionPerformed
    }//GEN-LAST:event_btnMenu1ActionPerformed

    private void btnRegistrarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEventoActionPerformed
        if (txtCodigoEvento.getText().isBlank() || txtCodigoEvento.getText().isEmpty() || txtCodigoEvento.getText().length() > 7
                || txtTituloEvento.getText().isBlank() || txtTituloEvento.getText().isEmpty() || txtTituloEvento.getText().length() > 45
                || txtUbicacionEvento.getText().isBlank() || txtUbicacionEvento.getText().isEmpty() || txtUbicacionEvento.getText().length() > 149) {
            JOptionPane.showMessageDialog(null, "SE TIENEN QUE LLENAR TODOS LOS CAMPOS", "ERROR", JOptionPane.WARNING_MESSAGE);
            return;
        }
        validacionF.obtenerContenido(new String[]{"REGISTRO_EVENTO", txtCodigoEvento.getText(), new SimpleDateFormat("dd/MM/yyyy").format(spnFecha.getValue()), cBTiposDeEventos.getSelectedItem().toString(), txtTituloEvento.getText(), txtUbicacionEvento.getText(), spnCupo.getValue().toString(), spnMontoEvento.getValue().toString()});
        iniciarLog();
    }//GEN-LAST:event_btnRegistrarEventoActionPerformed

    private void txtCorreoAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoAsistenciaActionPerformed
    }//GEN-LAST:event_txtCorreoAsistenciaActionPerformed

    private void btnRegistrarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAsistenciaActionPerformed
        if (txtCorreoAsistencia.getText().isBlank() || txtCorreoAsistencia.getText().isEmpty() || txtCorreoAsistencia.getText().length() > 44
                || txtCodigoActividadAsistencia.getText().isBlank() || txtCodigoActividadAsistencia.getText().isEmpty() || txtCodigoActividadAsistencia.getText().length() > 7) {
            JOptionPane.showMessageDialog(null, "SE TIENEN QUE LLENAR TODOS LOS CAMPOS", "ERROR", JOptionPane.WARNING_MESSAGE);
            return;
        }
        validacionF.obtenerContenido(new String[]{"ASISTENCIA", txtCorreoAsistencia.getText(), txtCodigoActividadAsistencia.getText()});
        iniciarLog();
    }//GEN-LAST:event_btnRegistrarAsistenciaActionPerformed

    private void txtCodigoEventoReporteParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEventoReporteParticipantesActionPerformed
    }//GEN-LAST:event_txtCodigoEventoReporteParticipantesActionPerformed

    private void btnReporteParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteParticipantesActionPerformed
        if (txtCodigoEventoReporteParticipantes.getText().isBlank() || txtCodigoEventoReporteParticipantes.getText().isEmpty() || txtCodigoEventoReporteParticipantes.getText().length() > 7
                || txtInstitucionDeProcedenciaReporteParticipantes.getText().isBlank() || txtInstitucionDeProcedenciaReporteParticipantes.getText().isEmpty() || txtInstitucionDeProcedenciaReporteParticipantes.getText().length() > 149) {
            JOptionPane.showMessageDialog(null, "SE TIENEN QUE LLENAR TODOS LOS CAMPOS", "ERROR", JOptionPane.WARNING_MESSAGE);
            return;
        }
        validacionF.obtenerContenido(new String[]{"REPORTE_PARTICIPANTES", txtCodigoEventoReporteParticipantes.getText(), cbTipoDeParticipanteReporteParticipantes.getSelectedItem().toString(), txtInstitucionDeProcedenciaReporteParticipantes.getText()});
        iniciarLog();
    }//GEN-LAST:event_btnReporteParticipantesActionPerformed

    private void btnReporteDeEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteDeEventosActionPerformed
        validacionF.obtenerContenido(new String[]{"REPORTE_EVENTOS", cbTipoEventosReporteEventos.getSelectedItem().toString(), new SimpleDateFormat("dd/MM/yyyy").format(spnFechaInicialReporteEventos.getValue()), new SimpleDateFormat("dd/MM/yyyy").format(spnFechaFinalReporteEventos.getValue()), spnValorInicialReporteEventos.getValue().toString(), spnValorFinalReporteEventos.getValue().toString()});
        iniciarLog();
    }//GEN-LAST:event_btnReporteDeEventosActionPerformed

    private void txtCodigoEventoReporteActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEventoReporteActividadesActionPerformed
    }//GEN-LAST:event_txtCodigoEventoReporteActividadesActionPerformed

    private void btnReporteActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActividadesActionPerformed
        if (txtCodigoEventoReporteActividades.getText().isBlank() || txtCodigoEventoReporteActividades.getText().isEmpty() || txtCodigoEventoReporteActividades.getText().length() > 7
                || txtCorreoPonenteReporteActividades.getText().isBlank() || txtCorreoPonenteReporteActividades.getText().isEmpty() || txtCorreoPonenteReporteActividades.getText().length() > 44) {
            JOptionPane.showMessageDialog(null, "SE TIENEN QUE LLENAR TODOS LOS CAMPOS", "ERROR", JOptionPane.WARNING_MESSAGE);
            return;
        }
        validacionF.obtenerContenido(new String[]{"REPORTE_ACTIVIDADES", txtCodigoEventoReporteActividades.getText(), cbTipoDeActividadReporteDeActividades.getSelectedItem().toString(), txtCorreoPonenteReporteActividades.getText()});
        iniciarLog();
    }//GEN-LAST:event_btnReporteActividadesActionPerformed

    private void txtCorreoParticipanteValidarInscripciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoParticipanteValidarInscripciónActionPerformed
    }//GEN-LAST:event_txtCorreoParticipanteValidarInscripciónActionPerformed

    private void btnValidarInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarInscripcionActionPerformed
        if (txtCorreoParticipanteValidarInscripción.getText().isBlank() || txtCorreoParticipanteValidarInscripción.getText().isEmpty() || txtCorreoParticipanteValidarInscripción.getText().length() > 44
                || txtCodigoEventoValidarInscripcion.getText().isBlank() || txtCodigoEventoValidarInscripcion.getText().isEmpty() || txtCodigoEventoValidarInscripcion.getText().length() > 7) {
            JOptionPane.showMessageDialog(null, "SE TIENEN QUE LLENAR TODOS LOS CAMPOS", "ERROR", JOptionPane.WARNING_MESSAGE);
            return;
        }
        validacionF.obtenerContenido(new String[]{"VALIDAR_INSCRIPCION", txtCorreoParticipanteValidarInscripción.getText(), txtCodigoEventoValidarInscripcion.getText()});
        iniciarLog();
    }//GEN-LAST:event_btnValidarInscripcionActionPerformed

    private void txtCorreoDelParticipantePagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoDelParticipantePagoActionPerformed
    }//GEN-LAST:event_txtCorreoDelParticipantePagoActionPerformed

    private void btnRealizarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPagoActionPerformed
        if (txtCorreoDelParticipantePago.getText().isBlank() || txtCorreoDelParticipantePago.getText().isEmpty() || txtCorreoDelParticipantePago.getText().length() > 44
                || txtCodigoEventoPago.getText().isBlank() || txtCodigoEventoPago.getText().isEmpty() || txtCodigoEventoPago.getText().length() > 7) {
            JOptionPane.showMessageDialog(null, "SE TIENEN QUE LLENAR TODOS LOS CAMPOS", "ERROR", JOptionPane.WARNING_MESSAGE);
            return;
        }
        validacionF.obtenerContenido(new String[]{"PAGO", txtCorreoDelParticipantePago.getText(), txtCodigoEventoPago.getText(), cbMetodoDePago.getSelectedItem().toString(), spnMonto.getValue().toString()});
        iniciarLog();
    }//GEN-LAST:event_btnRealizarPagoActionPerformed

    private void txtCorreoParticipanteInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoParticipanteInscripcionActionPerformed
    }//GEN-LAST:event_txtCorreoParticipanteInscripcionActionPerformed

    private void btnRealizarInscipcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarInscipcionActionPerformed
        if (txtCorreoParticipanteInscripcion.getText().isBlank() || txtCorreoParticipanteInscripcion.getText().isEmpty() || txtCorreoParticipanteInscripcion.getText().length() > 44
                || txtCodigoEventoInscripcion.getText().isBlank() || txtCodigoEventoInscripcion.getText().isEmpty() || txtCodigoEventoInscripcion.getText().length() > 7) {
            JOptionPane.showMessageDialog(null, "SE TIENEN QUE LLENAR TODOS LOS CAMPOS", "ERROR", JOptionPane.WARNING_MESSAGE);
            return;
        }
        validacionF.obtenerContenido(new String[]{"INSCRIPCION", txtCorreoParticipanteInscripcion.getText(), txtCodigoEventoInscripcion.getText(), cbTipoDeInscripcion.getSelectedItem().toString()});
        iniciarLog();
    }

    /*
        }    }//GEN-LAST:event_btnRealizarInscipcionActionPerformed
*/
    private void txtNombreCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCompletoActionPerformed
    }//GEN-LAST:event_txtNombreCompletoActionPerformed

    private void btnRegistrarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarParticipanteActionPerformed
        if (txtNombreCompleto.getText().isBlank() || txtNombreCompleto.getText().isEmpty() || txtNombreCompleto.getText().length() > 44
                || txtInstitucion.getText().isBlank() || txtInstitucion.getText().isEmpty() || txtInstitucion.getText().length() > 149
                || txtCorreo.getText().isBlank() || txtCorreo.getText().isEmpty() || txtCorreo.getText().length() > 44) {
            JOptionPane.showMessageDialog(null, "SE TIENEN QUE LLENAR TODOS LOS CAMPOS", "ERROR", JOptionPane.WARNING_MESSAGE);
            return;
        }
        validacionF.obtenerContenido(new String[]{"REGISTRO_PARTICIPANTE", txtNombreCompleto.getText(), cBTipoDeParticipante.getSelectedItem().toString(), txtInstitucion.getText(), txtCorreo.getText()});
        iniciarLog();
    }//GEN-LAST:event_btnRegistrarParticipanteActionPerformed

    private void btnMenu12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu12ActionPerformed
    }//GEN-LAST:event_btnMenu12ActionPerformed

    private void txtCodigoEventoInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEventoInscripcionActionPerformed
    }//GEN-LAST:event_txtCodigoEventoInscripcionActionPerformed

    private void txtCodigoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEventoActionPerformed
    }//GEN-LAST:event_txtCodigoEventoActionPerformed

    private void txtCodigoEventoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEventoPagoActionPerformed
    }//GEN-LAST:event_txtCodigoEventoPagoActionPerformed

    private void txtCodigoEventoActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEventoActividadActionPerformed
    }//GEN-LAST:event_txtCodigoEventoActividadActionPerformed

    private void btnRegistrarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActividadActionPerformed
        if (txtCodigoActividad.getText().isBlank() || txtCodigoActividad.getText().isEmpty() || txtCodigoActividad.getText().length() > 7
                || txtCodigoEventoActividad.getText().isBlank() || txtCodigoEventoActividad.getText().isEmpty() || txtCodigoEventoActividad.getText().length() > 7
                || txtTituloActividad.getText().isBlank() || txtTituloActividad.getText().isEmpty() || txtTituloActividad.getText().length() > 199
                || txtCorreoPonente.getText().isBlank() || txtCorreoPonente.getText().isEmpty() || txtCorreoPonente.getText().length() > 44
                || txtHoraInicio.getText().isBlank() || txtHoraInicio.getText().isEmpty() || !txtHoraInicio.getText().trim().substring(2, 3).equals(":") || txtHoraInicio.getText().length() > 5
                || txtHoraFin.getText().isBlank() || txtHoraFin.getText().isEmpty() || !txtHoraFin.getText().trim().substring(2, 3).equals(":") || txtHoraFin.getText().length() > 5) {
            JOptionPane.showMessageDialog(null, "SE TIENEN QUE LLENAR TODOS LOS CAMPOS Y LAS FECHAS DEBEN DE ESTAR EN FORMATO 'HH:MM'", "ERROR", JOptionPane.WARNING_MESSAGE);
            return;
        }
        validacionF.obtenerContenido(new String[]{"REGISTRO_ACTIVIDAD", txtCodigoActividad.getText(), txtCodigoEventoActividad.getText(), cbTipoDeActividad.getSelectedItem().toString(), txtTituloActividad.getText(), txtCorreoPonente.getText(), txtHoraInicio.getText().trim(), txtHoraFin.getText().trim(), spnCupoActividad.getValue().toString()});
        iniciarLog();
    }//GEN-LAST:event_btnRegistrarActividadActionPerformed

    private void txtCodigoActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActividadActionPerformed
    }//GEN-LAST:event_txtCodigoActividadActionPerformed

    private void txtHoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraInicioActionPerformed
    }//GEN-LAST:event_txtHoraInicioActionPerformed

    private void txtHoraFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraFinActionPerformed
    }//GEN-LAST:event_txtHoraFinActionPerformed

    private void txtCorreoCertificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoCertificadoActionPerformed
    }//GEN-LAST:event_txtCorreoCertificadoActionPerformed

    private void btnSolicitarCertificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarCertificadoActionPerformed
        if (txtCorreoCertificado.getText().isBlank() || txtCorreoCertificado.getText().isEmpty() || txtCorreoCertificado.getText().length() > 44
                || txtCodigoEventoCertificado.getText().isBlank() || txtCodigoEventoCertificado.getText().isEmpty() || txtCodigoEventoCertificado.getText().length() > 7) {
            JOptionPane.showMessageDialog(null, "SE TIENEN QUE LLENAR TODOS LOS CAMPOS", "ERROR", JOptionPane.WARNING_MESSAGE);
            return;
        }
        validacionF.obtenerContenido(new String[]{"CERTIFICADO", txtCorreoCertificado.getText(), txtCodigoEventoCertificado.getText()});
        iniciarLog();
    }//GEN-LAST:event_btnSolicitarCertificadoActionPerformed

    private void cbTipoDeParticipanteReporteParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoDeParticipanteReporteParticipantesActionPerformed
    }//GEN-LAST:event_cbTipoDeParticipanteReporteParticipantesActionPerformed

    private void cBTiposDeEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBTiposDeEventosActionPerformed
    }//GEN-LAST:event_cBTiposDeEventosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTPFormularios;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMenu1;
    private javax.swing.JButton btnMenu12;
    private javax.swing.JButton btnMenu13;
    private javax.swing.JButton btnMenu14;
    private javax.swing.JButton btnRealizarInscipcion;
    private javax.swing.JButton btnRealizarPago;
    private javax.swing.JButton btnRegistrarActividad;
    private javax.swing.JButton btnRegistrarAsistencia;
    private javax.swing.JButton btnRegistrarEvento;
    private javax.swing.JButton btnRegistrarParticipante;
    private javax.swing.JButton btnReporteActividades;
    private javax.swing.JButton btnReporteDeEventos;
    private javax.swing.JButton btnReporteParticipantes;
    private javax.swing.JButton btnSolicitarCertificado;
    private javax.swing.JButton btnValidarInscripcion;
    private javax.swing.JComboBox<String> cBTipoDeParticipante;
    private javax.swing.JComboBox<String> cBTiposDeEventos;
    private javax.swing.JComboBox<String> cbMetodoDePago;
    private javax.swing.JComboBox<String> cbTipoDeActividad;
    private javax.swing.JComboBox<String> cbTipoDeActividadReporteDeActividades;
    private javax.swing.JComboBox<String> cbTipoDeInscripcion;
    private javax.swing.JComboBox<String> cbTipoDeParticipanteReporteParticipantes;
    private javax.swing.JComboBox<String> cbTipoEventosReporteEventos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlFormulario1;
    private javax.swing.JPanel pnlFormulario10;
    private javax.swing.JPanel pnlFormulario11;
    private javax.swing.JPanel pnlFormulario2;
    private javax.swing.JPanel pnlFormulario3;
    private javax.swing.JPanel pnlFormulario4;
    private javax.swing.JPanel pnlFormulario5;
    private javax.swing.JPanel pnlFormulario6;
    private javax.swing.JPanel pnlFormulario7;
    private javax.swing.JPanel pnlFormulario8;
    private javax.swing.JPanel pnlFormulario9;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JSpinner spnCupo;
    private javax.swing.JSpinner spnCupoActividad;
    private javax.swing.JSpinner spnFecha;
    private javax.swing.JSpinner spnFechaFinalReporteEventos;
    private javax.swing.JSpinner spnFechaInicialReporteEventos;
    private javax.swing.JSpinner spnMonto;
    private javax.swing.JSpinner spnMontoEvento;
    private javax.swing.JSpinner spnValorFinalReporteEventos;
    private javax.swing.JSpinner spnValorInicialReporteEventos;
    private javax.swing.JTextField txtCodigoActividad;
    private javax.swing.JTextField txtCodigoActividadAsistencia;
    private javax.swing.JTextField txtCodigoEvento;
    private javax.swing.JTextField txtCodigoEventoActividad;
    private javax.swing.JTextField txtCodigoEventoCertificado;
    private javax.swing.JTextField txtCodigoEventoInscripcion;
    private javax.swing.JTextField txtCodigoEventoPago;
    private javax.swing.JTextField txtCodigoEventoReporteActividades;
    private javax.swing.JTextField txtCodigoEventoReporteParticipantes;
    private javax.swing.JTextField txtCodigoEventoValidarInscripcion;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreoAsistencia;
    private javax.swing.JTextField txtCorreoCertificado;
    private javax.swing.JTextField txtCorreoDelParticipantePago;
    private javax.swing.JTextField txtCorreoParticipanteInscripcion;
    private javax.swing.JTextField txtCorreoParticipanteValidarInscripción;
    private javax.swing.JTextField txtCorreoPonente;
    private javax.swing.JTextField txtCorreoPonenteReporteActividades;
    private javax.swing.JTextField txtHoraFin;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtInstitucion;
    private javax.swing.JTextField txtInstitucionDeProcedenciaReporteParticipantes;
    private javax.swing.JTextField txtNombreCompleto;
    private javax.swing.JTextField txtTituloActividad;
    private javax.swing.JTextField txtTituloEvento;
    private javax.swing.JTextField txtUbicacionEvento;
    // End of variables declaration//GEN-END:variables

}
