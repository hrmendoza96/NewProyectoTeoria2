package main;

import com.sun.glass.events.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class main extends javax.swing.JFrame {

    ArrayList<Equipo> equipos = new ArrayList(); //ArrayList de equipos
    boolean siReviso = false;
    DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
    DecimalFormat df = new DecimalFormat("#.00"); //Formato de los decimales que se utilizara mas adelante con el manejo de los pesos
    Torneo torneo = null; //Objeto de Torneo utilizado para manejar el torneo unico con 2 jornadas dentro del sistema de quinela

    public main() throws IOException {

        //Cargar componentes externos del Jframe
        //this.setLocationRelativeTo(null);
        this.setIconImage(ImageIO.read(new File("./src/Pics/iconframe.png")));

        /**
         * Cargar los Equipos en el arraylist de <equipo>
         */
        File file = null;
        BufferedReader br = null;
        FileReader fr = null;

        try {
            file = new File("./src/Data/Equipos.txt");
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String nombre = "";

            while ((nombre = br.readLine()) != null) {
                Equipo eq = new Equipo(nombre);
                equipos.add(eq);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            br.close();
            fr.close();
        }

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Administracion_Dialog = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btn_ModificarTorneo = new javax.swing.JButton();
        btn_VisualizarTorneo = new javax.swing.JButton();
        btn_BorrarTorneo = new javax.swing.JButton();
        btn_CrearTorneo = new javax.swing.JButton();
        btn_SalirAdmin = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        VisualizarJornadas_Dia = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaJornadaA = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_SalirVisualizacionTorneo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaJornadaB = new javax.swing.JTable();
        JDialog_Participacion = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        btn_VerEquipos = new javax.swing.JButton();
        btn_QuinelaDeJornada = new javax.swing.JButton();
        btn_VerTorneoParticipacion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        MenuApuestas = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        label_NumJornadaMenuApuestas = new javax.swing.JLabel();
        rb_EquipoA = new javax.swing.JRadioButton();
        rb_Empate = new javax.swing.JRadioButton();
        rb_EquipoB = new javax.swing.JRadioButton();
        btn_SiguentePartido = new javax.swing.JButton();
        Dialog_IngresarApuesta = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        tf_MontoApuesta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        ModificarTorneo_Dia = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btn_modificarjugador = new javax.swing.JButton();
        btn_ModificarArbitro = new javax.swing.JButton();
        btn_modificarentrenador = new javax.swing.JButton();
        btn_salirmodificar = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        VisualizarEntrenadores_Dia = new javax.swing.JDialog();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_entrenadores = new javax.swing.JTable();
        btn_SalirVisualizarEntrenadores = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        VisualizarTorneoMenu_Dia = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        btn_VerJornadas = new javax.swing.JButton();
        btn_Verequipos = new javax.swing.JButton();
        btn_VerArbitros = new javax.swing.JButton();
        btn_VerEntrenadores = new javax.swing.JButton();
        btn_SalirVisualizarTorneo = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        VisualizarEquipos_Dia = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_equipos = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        cb_equipos = new javax.swing.JComboBox<>();
        btn_actualizartablaequipos = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        btn_SalirVerEquipos = new javax.swing.JButton();
        VisualizarArbitros_Dia = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        tb_Arbitros = new javax.swing.JTable();
        btn_SalirVisualizarArbitros = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        Dialog_SelecJornada = new javax.swing.JDialog();
        LabelJornadaQuinela = new javax.swing.JLabel();
        btn_JornadaA = new javax.swing.JButton();
        btn_JornadaB = new javax.swing.JButton();
        DialogJornadaA = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TablaJornadaAApuestas = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cb_EquiposJornadaA = new javax.swing.JComboBox<>();
        txt_ApuestaA = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cb_MultiplicadorA = new javax.swing.JComboBox<>();
        btn_ResultadosJA = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        JMOMenuOpciones = new javax.swing.JMenu();
        MenuShowOptions = new javax.swing.JMenuItem();
        DialogJornadaB = new javax.swing.JDialog();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TablaJornadaBApuestas = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        txt_ApuestaB = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cb_EquiposJornadaB = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        cb_MultiplicadorB = new javax.swing.JComboBox<>();
        btn_ResultadosJB = new javax.swing.JButton();
        jMenuBar3 = new javax.swing.JMenuBar();
        JMOMenuOpciones1 = new javax.swing.JMenu();
        MenuShowOptions1 = new javax.swing.JMenuItem();
        ResultadosQuinela = new javax.swing.JDialog();
        jLabel24 = new javax.swing.JLabel();
        txt_EquipoQAposto = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txt_EquipoQGano = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txt_ApuestaRealizada = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_MultiplicadorSeleccionado = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txt_PorcentajeGanancia = new javax.swing.JTextField();
        DialogTorneoUsuario = new javax.swing.JDialog();
        jLabel30 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        TablaJornadaAUsuario = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        TablaJornadaBUsuario = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        btn_SalirVisualizacionTorneoUsuario = new javax.swing.JButton();
        ModificarArbitro_Dia = new javax.swing.JDialog();
        jLabel33 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jScrollPane11 = new javax.swing.JScrollPane();
        tb_ModificarArbitros = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        tf_NombreArbitro = new javax.swing.JTextField();
        btn_ModificarArbitroDia = new javax.swing.JButton();
        spin_pesoarbitro = new javax.swing.JSpinner();
        btn_SalirModificacionArbitro = new javax.swing.JButton();
        VerEquipos_Usuario_Dia = new javax.swing.JDialog();
        btn_SalirVerEquiposUsuario = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tb_equiposusuario = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        cb_equiposusuario = new javax.swing.JComboBox<>();
        btn_actualizartablaequiposusuario = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JSeparator();
        ModificarEntrenador_Dia = new javax.swing.JDialog();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tb_ModificarEntrenadores = new javax.swing.JTable();
        tf_NombreEntrenador = new javax.swing.JTextField();
        btn_ModificarEntrenadorDIa = new javax.swing.JButton();
        spin_pesoentrenador = new javax.swing.JSpinner();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        btn_SalirModificacionEntrenador = new javax.swing.JButton();
        ModificarJugador_Dia = new javax.swing.JDialog();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tb_ModificarJugador = new javax.swing.JTable();
        chkb_Nombre = new javax.swing.JCheckBox();
        chkb_FechaNac = new javax.swing.JCheckBox();
        chkb_Tipo = new javax.swing.JCheckBox();
        chkb_Peso = new javax.swing.JCheckBox();
        chkb_Equipo = new javax.swing.JCheckBox();
        tf_NombreJugador = new javax.swing.JTextField();
        rb_Titular = new javax.swing.JRadioButton();
        rb_Reserva = new javax.swing.JRadioButton();
        spin_PesoJugador = new javax.swing.JSpinner();
        cb_EquipoJugador = new javax.swing.JComboBox<>();
        btn_ModificarJugadorDia = new javax.swing.JButton();
        btn_SalirModificacionJugador = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        btn_BuscarJugador = new javax.swing.JButton();
        tf_IDJugador = new javax.swing.JTextField();
        dc_FechaNacimiento = new com.toedter.calendar.JDateChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btn_admin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_quinela = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        Administracion_Dialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Administracion_Dialog.setTitle("Administración");
        Administracion_Dialog.setIconImage(null);

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel3.setText("Administración");

        btn_ModificarTorneo.setText("Modificar Torneo");
        btn_ModificarTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ModificarTorneoMouseClicked(evt);
            }
        });

        btn_VisualizarTorneo.setText("Visualizar Torneo");
        btn_VisualizarTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VisualizarTorneoActionPerformed(evt);
            }
        });

        btn_BorrarTorneo.setText("Borrar Torneo");
        btn_BorrarTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarTorneoActionPerformed(evt);
            }
        });

        btn_CrearTorneo.setText("Crear Torneo");
        btn_CrearTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CrearTorneoActionPerformed(evt);
            }
        });

        btn_SalirAdmin.setText("Salir");
        btn_SalirAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Administracion_DialogLayout = new javax.swing.GroupLayout(Administracion_Dialog.getContentPane());
        Administracion_Dialog.getContentPane().setLayout(Administracion_DialogLayout);
        Administracion_DialogLayout.setHorizontalGroup(
            Administracion_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Administracion_DialogLayout.createSequentialGroup()
                .addGroup(Administracion_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Administracion_DialogLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel3))
                    .addGroup(Administracion_DialogLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Administracion_DialogLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(Administracion_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Administracion_DialogLayout.createSequentialGroup()
                                .addComponent(btn_CrearTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_BorrarTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Administracion_DialogLayout.createSequentialGroup()
                                .addComponent(btn_ModificarTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_VisualizarTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Administracion_DialogLayout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(btn_SalirAdmin))))
                    .addGroup(Administracion_DialogLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        Administracion_DialogLayout.setVerticalGroup(
            Administracion_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Administracion_DialogLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Administracion_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_CrearTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_BorrarTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(Administracion_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ModificarTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_VisualizarTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_SalirAdmin)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        VisualizarJornadas_Dia.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        VisualizarJornadas_Dia.setResizable(false);

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel4.setText("Torneo");

        TablaJornadaA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipo Visita", "Peso Visita", "Equipo Casa", "Peso Casa", "Diferencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaJornadaA);

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel5.setText("Jornada B");

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel6.setText("Jornada A");

        btn_SalirVisualizacionTorneo.setText("Salir");
        btn_SalirVisualizacionTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirVisualizacionTorneoActionPerformed(evt);
            }
        });

        TablaJornadaB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipo Visita", "Peso Visita", "Equipo Casa", "Peso Casa", "Diferencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TablaJornadaB);

        javax.swing.GroupLayout VisualizarJornadas_DiaLayout = new javax.swing.GroupLayout(VisualizarJornadas_Dia.getContentPane());
        VisualizarJornadas_Dia.getContentPane().setLayout(VisualizarJornadas_DiaLayout);
        VisualizarJornadas_DiaLayout.setHorizontalGroup(
            VisualizarJornadas_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualizarJornadas_DiaLayout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(262, 262, 262))
            .addGroup(VisualizarJornadas_DiaLayout.createSequentialGroup()
                .addGroup(VisualizarJornadas_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VisualizarJornadas_DiaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(VisualizarJornadas_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_SalirVisualizacionTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(VisualizarJornadas_DiaLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(VisualizarJornadas_DiaLayout.createSequentialGroup()
                        .addGap(526, 526, 526)
                        .addGroup(VisualizarJornadas_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        VisualizarJornadas_DiaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane3});

        VisualizarJornadas_DiaLayout.setVerticalGroup(
            VisualizarJornadas_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualizarJornadas_DiaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(VisualizarJornadas_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(VisualizarJornadas_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btn_SalirVisualizacionTorneo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        VisualizarJornadas_DiaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane3});

        btn_VerEquipos.setText("Ver Equipos");
        btn_VerEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerEquiposActionPerformed(evt);
            }
        });

        btn_QuinelaDeJornada.setText("Quinela de la Jornada");
        btn_QuinelaDeJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuinelaDeJornadaActionPerformed(evt);
            }
        });

        btn_VerTorneoParticipacion.setText("Ver Torneo");
        btn_VerTorneoParticipacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerTorneoParticipacionActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setText("Participación");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btn_VerEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btn_QuinelaDeJornada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btn_VerTorneoParticipacion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(201, 201, 201))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_QuinelaDeJornada, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_VerEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_VerTorneoParticipacion, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JDialog_ParticipacionLayout = new javax.swing.GroupLayout(JDialog_Participacion.getContentPane());
        JDialog_Participacion.getContentPane().setLayout(JDialog_ParticipacionLayout);
        JDialog_ParticipacionLayout.setHorizontalGroup(
            JDialog_ParticipacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JDialog_ParticipacionLayout.setVerticalGroup(
            JDialog_ParticipacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel9.setText("JORNADA");

        label_NumJornadaMenuApuestas.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        label_NumJornadaMenuApuestas.setText("#");

        rb_EquipoA.setText("Equipo A");
        rb_EquipoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_EquipoAActionPerformed(evt);
            }
        });

        rb_Empate.setText("Empate");

        rb_EquipoB.setText("Equipo B");

        btn_SiguentePartido.setText("Siguiente Partido");

        javax.swing.GroupLayout MenuApuestasLayout = new javax.swing.GroupLayout(MenuApuestas.getContentPane());
        MenuApuestas.getContentPane().setLayout(MenuApuestasLayout);
        MenuApuestasLayout.setHorizontalGroup(
            MenuApuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuApuestasLayout.createSequentialGroup()
                .addGroup(MenuApuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuApuestasLayout.createSequentialGroup()
                        .addGroup(MenuApuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuApuestasLayout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(label_NumJornadaMenuApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuApuestasLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(rb_EquipoA)
                                .addGap(91, 91, 91)
                                .addComponent(rb_Empate)
                                .addGap(67, 67, 67)
                                .addComponent(rb_EquipoB)))
                        .addGap(0, 147, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuApuestasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_SiguentePartido)))
                .addContainerGap())
        );
        MenuApuestasLayout.setVerticalGroup(
            MenuApuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuApuestasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(MenuApuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(label_NumJornadaMenuApuestas))
                .addGap(105, 105, 105)
                .addGroup(MenuApuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_EquipoA)
                    .addComponent(rb_Empate)
                    .addComponent(rb_EquipoB))
                .addGap(18, 18, 18)
                .addComponent(btn_SiguentePartido)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel8.setText("Ingrese cuanto desea invertir en la quinela de la Jornada:");

        jButton4.setText("Confirmar Apuesta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(tf_MontoApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jButton4)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(tf_MontoApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton4)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Dialog_IngresarApuestaLayout = new javax.swing.GroupLayout(Dialog_IngresarApuesta.getContentPane());
        Dialog_IngresarApuesta.getContentPane().setLayout(Dialog_IngresarApuestaLayout);
        Dialog_IngresarApuestaLayout.setHorizontalGroup(
            Dialog_IngresarApuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Dialog_IngresarApuestaLayout.setVerticalGroup(
            Dialog_IngresarApuestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ModificarTorneo_Dia.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        ModificarTorneo_Dia.setResizable(false);

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel10.setText("Modificar Torneo");

        btn_modificarjugador.setText("Modificar Jugador");
        btn_modificarjugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarjugadorMouseClicked(evt);
            }
        });

        btn_ModificarArbitro.setText("Modificar Arbitro");
        btn_ModificarArbitro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ModificarArbitroMouseClicked(evt);
            }
        });

        btn_modificarentrenador.setText("Modificar Entrenador");
        btn_modificarentrenador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarentrenadorMouseClicked(evt);
            }
        });

        btn_salirmodificar.setText("Salir");
        btn_salirmodificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salirmodificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ModificarTorneo_DiaLayout = new javax.swing.GroupLayout(ModificarTorneo_Dia.getContentPane());
        ModificarTorneo_Dia.getContentPane().setLayout(ModificarTorneo_DiaLayout);
        ModificarTorneo_DiaLayout.setHorizontalGroup(
            ModificarTorneo_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarTorneo_DiaLayout.createSequentialGroup()
                .addGroup(ModificarTorneo_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModificarTorneo_DiaLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(ModificarTorneo_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_modificarjugador)
                            .addComponent(btn_modificarentrenador)
                            .addComponent(btn_ModificarArbitro)))
                    .addGroup(ModificarTorneo_DiaLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btn_salirmodificar))
                    .addGroup(ModificarTorneo_DiaLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(ModificarTorneo_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ModificarTorneo_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        ModificarTorneo_DiaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_ModificarArbitro, btn_modificarentrenador, btn_modificarjugador});

        ModificarTorneo_DiaLayout.setVerticalGroup(
            ModificarTorneo_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarTorneo_DiaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_ModificarArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_modificarjugador, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_modificarentrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_salirmodificar)
                .addContainerGap())
        );

        ModificarTorneo_DiaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_ModificarArbitro, btn_modificarentrenador, btn_modificarjugador});

        VisualizarEntrenadores_Dia.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        VisualizarEntrenadores_Dia.setResizable(false);

        jLabel14.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel14.setText("Entrenadores");

        tb_entrenadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Equipo", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tb_entrenadores);

        btn_SalirVisualizarEntrenadores.setText("Salir");
        btn_SalirVisualizarEntrenadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SalirVisualizarEntrenadoresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout VisualizarEntrenadores_DiaLayout = new javax.swing.GroupLayout(VisualizarEntrenadores_Dia.getContentPane());
        VisualizarEntrenadores_Dia.getContentPane().setLayout(VisualizarEntrenadores_DiaLayout);
        VisualizarEntrenadores_DiaLayout.setHorizontalGroup(
            VisualizarEntrenadores_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualizarEntrenadores_DiaLayout.createSequentialGroup()
                .addGroup(VisualizarEntrenadores_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_SalirVisualizarEntrenadores, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(VisualizarEntrenadores_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(VisualizarEntrenadores_DiaLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(VisualizarEntrenadores_DiaLayout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addGroup(VisualizarEntrenadores_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VisualizarEntrenadores_DiaLayout.setVerticalGroup(
            VisualizarEntrenadores_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualizarEntrenadores_DiaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_SalirVisualizarEntrenadores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        VisualizarTorneoMenu_Dia.setResizable(false);

        jLabel11.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel11.setText("Visualizar Torneo");

        btn_VerJornadas.setText("Ver Jornadas");
        btn_VerJornadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerJornadasActionPerformed(evt);
            }
        });

        btn_Verequipos.setText("Ver Equipos");
        btn_Verequipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerequiposActionPerformed(evt);
            }
        });

        btn_VerArbitros.setText("Ver Arbitros");
        btn_VerArbitros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerArbitrosActionPerformed(evt);
            }
        });

        btn_VerEntrenadores.setText("Ver Entrenadores");
        btn_VerEntrenadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerEntrenadoresActionPerformed(evt);
            }
        });

        btn_SalirVisualizarTorneo.setText("Regresar");
        btn_SalirVisualizarTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SalirVisualizarTorneoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout VisualizarTorneoMenu_DiaLayout = new javax.swing.GroupLayout(VisualizarTorneoMenu_Dia.getContentPane());
        VisualizarTorneoMenu_Dia.getContentPane().setLayout(VisualizarTorneoMenu_DiaLayout);
        VisualizarTorneoMenu_DiaLayout.setHorizontalGroup(
            VisualizarTorneoMenu_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VisualizarTorneoMenu_DiaLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(VisualizarTorneoMenu_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VisualizarTorneoMenu_DiaLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VisualizarTorneoMenu_DiaLayout.createSequentialGroup()
                        .addGroup(VisualizarTorneoMenu_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VisualizarTorneoMenu_DiaLayout.createSequentialGroup()
                                .addComponent(btn_VerEntrenadores)
                                .addGap(18, 18, 18)
                                .addComponent(btn_VerArbitros))
                            .addGroup(VisualizarTorneoMenu_DiaLayout.createSequentialGroup()
                                .addComponent(btn_VerJornadas)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Verequipos)))
                        .addGap(108, 108, 108))))
            .addGroup(VisualizarTorneoMenu_DiaLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(VisualizarTorneoMenu_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator5))
                .addGap(61, 61, 61))
            .addGroup(VisualizarTorneoMenu_DiaLayout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(btn_SalirVisualizarTorneo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        VisualizarTorneoMenu_DiaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_VerArbitros, btn_VerEntrenadores, btn_VerJornadas, btn_Verequipos});

        VisualizarTorneoMenu_DiaLayout.setVerticalGroup(
            VisualizarTorneoMenu_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualizarTorneoMenu_DiaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(VisualizarTorneoMenu_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_VerJornadas)
                    .addComponent(btn_Verequipos))
                .addGap(27, 27, 27)
                .addGroup(VisualizarTorneoMenu_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_VerEntrenadores, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_VerArbitros))
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_SalirVisualizarTorneo)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        VisualizarTorneoMenu_DiaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_VerArbitros, btn_VerEntrenadores, btn_VerJornadas, btn_Verequipos});

        VisualizarEquipos_Dia.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        VisualizarEquipos_Dia.setResizable(false);

        jLabel12.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel12.setText("Equipos");

        tb_equipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Jugador", "Edad", "Fecha Nacimiento", "Peso ", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tb_equipos);

        jLabel13.setText("Equipo:");

        btn_actualizartablaequipos.setText("Actualizar");
        btn_actualizartablaequipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_actualizartablaequiposMouseClicked(evt);
            }
        });

        btn_SalirVerEquipos.setText("Salir");
        btn_SalirVerEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SalirVerEquiposMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout VisualizarEquipos_DiaLayout = new javax.swing.GroupLayout(VisualizarEquipos_Dia.getContentPane());
        VisualizarEquipos_Dia.getContentPane().setLayout(VisualizarEquipos_DiaLayout);
        VisualizarEquipos_DiaLayout.setHorizontalGroup(
            VisualizarEquipos_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualizarEquipos_DiaLayout.createSequentialGroup()
                .addGroup(VisualizarEquipos_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VisualizarEquipos_DiaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_SalirVerEquipos))
                    .addGroup(VisualizarEquipos_DiaLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE))
                    .addGroup(VisualizarEquipos_DiaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addGap(27, 27, 27)
                        .addComponent(cb_equipos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_actualizartablaequipos, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(VisualizarEquipos_DiaLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(VisualizarEquipos_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VisualizarEquipos_DiaLayout.setVerticalGroup(
            VisualizarEquipos_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualizarEquipos_DiaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(VisualizarEquipos_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cb_equipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizartablaequipos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btn_SalirVerEquipos)
                .addContainerGap())
        );

        VisualizarArbitros_Dia.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        VisualizarArbitros_Dia.setResizable(false);

        jLabel15.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel15.setText("Arbitros");

        tb_Arbitros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Partido", "Tipo", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tb_Arbitros);

        btn_SalirVisualizarArbitros.setText("Salir");
        btn_SalirVisualizarArbitros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SalirVisualizarArbitrosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout VisualizarArbitros_DiaLayout = new javax.swing.GroupLayout(VisualizarArbitros_Dia.getContentPane());
        VisualizarArbitros_Dia.getContentPane().setLayout(VisualizarArbitros_DiaLayout);
        VisualizarArbitros_DiaLayout.setHorizontalGroup(
            VisualizarArbitros_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualizarArbitros_DiaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(VisualizarArbitros_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_SalirVisualizarArbitros, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VisualizarArbitros_DiaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(VisualizarArbitros_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(258, 258, 258))
        );
        VisualizarArbitros_DiaLayout.setVerticalGroup(
            VisualizarArbitros_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualizarArbitros_DiaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btn_SalirVisualizarArbitros)
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        LabelJornadaQuinela.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelJornadaQuinela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelJornadaQuinela.setText("Seleccione la Jornada");

        btn_JornadaA.setText("Jornada A");
        btn_JornadaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_JornadaAActionPerformed(evt);
            }
        });

        btn_JornadaB.setText("Jornada B");
        btn_JornadaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_JornadaBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Dialog_SelecJornadaLayout = new javax.swing.GroupLayout(Dialog_SelecJornada.getContentPane());
        Dialog_SelecJornada.getContentPane().setLayout(Dialog_SelecJornadaLayout);
        Dialog_SelecJornadaLayout.setHorizontalGroup(
            Dialog_SelecJornadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dialog_SelecJornadaLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(Dialog_SelecJornadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dialog_SelecJornadaLayout.createSequentialGroup()
                        .addGroup(Dialog_SelecJornadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_JornadaA, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(btn_JornadaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dialog_SelecJornadaLayout.createSequentialGroup()
                        .addComponent(LabelJornadaQuinela, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        Dialog_SelecJornadaLayout.setVerticalGroup(
            Dialog_SelecJornadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dialog_SelecJornadaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(LabelJornadaQuinela)
                .addGap(47, 47, 47)
                .addComponent(btn_JornadaA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btn_JornadaB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Jornada A");

        TablaJornadaAApuestas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipo Visita", "Equipo Casa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaJornadaAApuestas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaJornadaAApuestasMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(TablaJornadaAApuestas);

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel17.setText("Seleccione su apuesta (Hasta 100,000)");

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel18.setText("Seleccione su equipo");

        txt_ApuestaA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ApuestaAKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel19.setText("Seleccione su multiplicador");

        cb_MultiplicadorA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "15", "30" }));

        btn_ResultadosJA.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btn_ResultadosJA.setText("Ver Resultados");
        btn_ResultadosJA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResultadosJAActionPerformed(evt);
            }
        });

        JMOMenuOpciones.setText("Opciones");

        MenuShowOptions.setText("Ayuda");
        MenuShowOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuShowOptionsActionPerformed(evt);
            }
        });
        JMOMenuOpciones.add(MenuShowOptions);

        jMenuBar2.add(JMOMenuOpciones);

        DialogJornadaA.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout DialogJornadaALayout = new javax.swing.GroupLayout(DialogJornadaA.getContentPane());
        DialogJornadaA.getContentPane().setLayout(DialogJornadaALayout);
        DialogJornadaALayout.setHorizontalGroup(
            DialogJornadaALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogJornadaALayout.createSequentialGroup()
                .addGroup(DialogJornadaALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogJornadaALayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel16))
                    .addGroup(DialogJornadaALayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(DialogJornadaALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DialogJornadaALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cb_EquiposJornadaA, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ApuestaA, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_MultiplicadorA, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogJornadaALayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_ResultadosJA)
                .addGap(135, 135, 135))
        );
        DialogJornadaALayout.setVerticalGroup(
            DialogJornadaALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogJornadaALayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DialogJornadaALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogJornadaALayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(txt_ApuestaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(cb_EquiposJornadaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(cb_MultiplicadorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(btn_ResultadosJA)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Jornada B");

        TablaJornadaBApuestas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipo Visita", "Equipo Casa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaJornadaBApuestas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaJornadaBApuestasMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(TablaJornadaBApuestas);

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel21.setText("Seleccione su apuesta (Hasta 100,000)");

        txt_ApuestaB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ApuestaBKeyTyped(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel22.setText("Seleccione su equipo");

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel23.setText("Seleccione su multiplicador");

        cb_MultiplicadorB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "15", "30" }));

        btn_ResultadosJB.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btn_ResultadosJB.setText("Ver Resultados");
        btn_ResultadosJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResultadosJBActionPerformed(evt);
            }
        });

        JMOMenuOpciones1.setText("Opciones");

        MenuShowOptions1.setText("Ayuda");
        MenuShowOptions1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuShowOptions1ActionPerformed(evt);
            }
        });
        JMOMenuOpciones1.add(MenuShowOptions1);

        jMenuBar3.add(JMOMenuOpciones1);

        DialogJornadaB.setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout DialogJornadaBLayout = new javax.swing.GroupLayout(DialogJornadaB.getContentPane());
        DialogJornadaB.getContentPane().setLayout(DialogJornadaBLayout);
        DialogJornadaBLayout.setHorizontalGroup(
            DialogJornadaBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogJornadaBLayout.createSequentialGroup()
                .addGroup(DialogJornadaBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogJornadaBLayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel20))
                    .addGroup(DialogJornadaBLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(DialogJornadaBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DialogJornadaBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cb_EquiposJornadaB, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ApuestaB, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_MultiplicadorB, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogJornadaBLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_ResultadosJB)
                .addGap(159, 159, 159))
        );
        DialogJornadaBLayout.setVerticalGroup(
            DialogJornadaBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogJornadaBLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DialogJornadaBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogJornadaBLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(txt_ApuestaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(cb_EquiposJornadaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(cb_MultiplicadorB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btn_ResultadosJB)
                .addGap(16, 16, 16))
        );

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Equipo por el cual apostó:");

        txt_EquipoQAposto.setEnabled(false);

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Equipo que ganó el partido:");

        txt_EquipoQGano.setEnabled(false);

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Apuesta realizada:");

        txt_ApuestaRealizada.setEnabled(false);

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Multiplicador Seleccionado:");

        txt_MultiplicadorSeleccionado.setEnabled(false);

        jLabel28.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Porcentaje de Ganancia:");

        txt_PorcentajeGanancia.setEnabled(false);

        javax.swing.GroupLayout ResultadosQuinelaLayout = new javax.swing.GroupLayout(ResultadosQuinela.getContentPane());
        ResultadosQuinela.getContentPane().setLayout(ResultadosQuinelaLayout);
        ResultadosQuinelaLayout.setHorizontalGroup(
            ResultadosQuinelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultadosQuinelaLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(ResultadosQuinelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(ResultadosQuinelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_EquipoQGano, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ApuestaRealizada, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MultiplicadorSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_PorcentajeGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_EquipoQAposto, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ResultadosQuinelaLayout.setVerticalGroup(
            ResultadosQuinelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultadosQuinelaLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(ResultadosQuinelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(txt_EquipoQAposto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(ResultadosQuinelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txt_EquipoQGano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(ResultadosQuinelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txt_ApuestaRealizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(ResultadosQuinelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txt_MultiplicadorSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(ResultadosQuinelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txt_PorcentajeGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jLabel30.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel30.setText("Torneo");

        jLabel31.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel31.setText("Jornada A");

        TablaJornadaAUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipo Visita", "Equipo Casa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane8.setViewportView(TablaJornadaAUsuario);

        TablaJornadaBUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipo Visita", "Equipo Casa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane9.setViewportView(TablaJornadaBUsuario);

        jLabel32.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel32.setText("Jornada B");

        btn_SalirVisualizacionTorneoUsuario.setText("Salir");
        btn_SalirVisualizacionTorneoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirVisualizacionTorneoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogTorneoUsuarioLayout = new javax.swing.GroupLayout(DialogTorneoUsuario.getContentPane());
        DialogTorneoUsuario.getContentPane().setLayout(DialogTorneoUsuarioLayout);
        DialogTorneoUsuarioLayout.setHorizontalGroup(
            DialogTorneoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogTorneoUsuarioLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addGap(192, 192, 192))
            .addGroup(DialogTorneoUsuarioLayout.createSequentialGroup()
                .addGroup(DialogTorneoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogTorneoUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DialogTorneoUsuarioLayout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addGroup(DialogTorneoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogTorneoUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_SalirVisualizacionTorneoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        DialogTorneoUsuarioLayout.setVerticalGroup(
            DialogTorneoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogTorneoUsuarioLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(DialogTorneoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DialogTorneoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(btn_SalirVisualizacionTorneoUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel33.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel33.setText("Modificar Arbitro");

        tb_ModificarArbitros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Partido", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(tb_ModificarArbitros);

        jLabel35.setText("Nombre:");

        jLabel36.setText("Peso:");

        btn_ModificarArbitroDia.setText("Modificar");
        btn_ModificarArbitroDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ModificarArbitroDiaMouseClicked(evt);
            }
        });

        spin_pesoarbitro.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 50.0d, 1.0d));

        btn_SalirModificacionArbitro.setText("Salir");
        btn_SalirModificacionArbitro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SalirModificacionArbitroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ModificarArbitro_DiaLayout = new javax.swing.GroupLayout(ModificarArbitro_Dia.getContentPane());
        ModificarArbitro_Dia.getContentPane().setLayout(ModificarArbitro_DiaLayout);
        ModificarArbitro_DiaLayout.setHorizontalGroup(
            ModificarArbitro_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarArbitro_DiaLayout.createSequentialGroup()
                .addGroup(ModificarArbitro_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModificarArbitro_DiaLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(ModificarArbitro_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ModificarArbitro_DiaLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(ModificarArbitro_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ModificarArbitro_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_NombreArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spin_pesoarbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarArbitro_DiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ModificarArbitro_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(ModificarArbitro_DiaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_SalirModificacionArbitro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_ModificarArbitroDia)))
                .addGap(30, 30, 30))
        );
        ModificarArbitro_DiaLayout.setVerticalGroup(
            ModificarArbitro_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarArbitro_DiaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(ModificarArbitro_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(tf_NombreArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ModificarArbitro_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(spin_pesoarbitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(ModificarArbitro_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ModificarArbitroDia)
                    .addComponent(btn_SalirModificacionArbitro))
                .addContainerGap())
        );

        btn_SalirVerEquiposUsuario.setText("Salir");
        btn_SalirVerEquiposUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SalirVerEquiposUsuarioMouseClicked(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel29.setText("Equipos");

        tb_equiposusuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Jugador", "Edad", "Fecha Nacimiento", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(tb_equiposusuario);

        jLabel34.setText("Equipo:");

        btn_actualizartablaequiposusuario.setText("Actualizar");
        btn_actualizartablaequiposusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_actualizartablaequiposusuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout VerEquipos_Usuario_DiaLayout = new javax.swing.GroupLayout(VerEquipos_Usuario_Dia.getContentPane());
        VerEquipos_Usuario_Dia.getContentPane().setLayout(VerEquipos_Usuario_DiaLayout);
        VerEquipos_Usuario_DiaLayout.setHorizontalGroup(
            VerEquipos_Usuario_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerEquipos_Usuario_DiaLayout.createSequentialGroup()
                .addGroup(VerEquipos_Usuario_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VerEquipos_Usuario_DiaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_SalirVerEquiposUsuario))
                    .addGroup(VerEquipos_Usuario_DiaLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE))
                    .addGroup(VerEquipos_Usuario_DiaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel34)
                        .addGap(27, 27, 27)
                        .addComponent(cb_equiposusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_actualizartablaequiposusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(VerEquipos_Usuario_DiaLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(VerEquipos_Usuario_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VerEquipos_Usuario_DiaLayout.setVerticalGroup(
            VerEquipos_Usuario_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerEquipos_Usuario_DiaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(VerEquipos_Usuario_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(cb_equiposusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizartablaequiposusuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(btn_SalirVerEquiposUsuario)
                .addContainerGap())
        );

        jLabel37.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel37.setText("Modificar Entrenador");

        tb_ModificarEntrenadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Equipo", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(tb_ModificarEntrenadores);

        btn_ModificarEntrenadorDIa.setText("Modificar");
        btn_ModificarEntrenadorDIa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ModificarEntrenadorDIaMouseClicked(evt);
            }
        });

        spin_pesoentrenador.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 50.0d, 1.0d));

        jLabel38.setText("Nombre:");

        jLabel39.setText("Peso:");

        btn_SalirModificacionEntrenador.setText("Salir");
        btn_SalirModificacionEntrenador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SalirModificacionEntrenadorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ModificarEntrenador_DiaLayout = new javax.swing.GroupLayout(ModificarEntrenador_Dia.getContentPane());
        ModificarEntrenador_Dia.getContentPane().setLayout(ModificarEntrenador_DiaLayout);
        ModificarEntrenador_DiaLayout.setHorizontalGroup(
            ModificarEntrenador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarEntrenador_DiaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(ModificarEntrenador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ModificarEntrenador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_NombreEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spin_pesoentrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarEntrenador_DiaLayout.createSequentialGroup()
                .addGroup(ModificarEntrenador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ModificarEntrenador_DiaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_SalirModificacionEntrenador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ModificarEntrenadorDIa))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ModificarEntrenador_DiaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ModificarEntrenador_DiaLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(ModificarEntrenador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator15))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ModificarEntrenador_DiaLayout.setVerticalGroup(
            ModificarEntrenador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarEntrenador_DiaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ModificarEntrenador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(tf_NombreEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ModificarEntrenador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(spin_pesoentrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(ModificarEntrenador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ModificarEntrenadorDIa)
                    .addComponent(btn_SalirModificacionEntrenador))
                .addContainerGap())
        );

        jLabel40.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel40.setText("Modificar Jugador");

        tb_ModificarJugador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Fecha Nac.", "Tipo", "Peso", "Equipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane13.setViewportView(tb_ModificarJugador);

        chkb_Nombre.setSelected(true);
        chkb_Nombre.setText("Nombre:");
        chkb_Nombre.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkb_NombreStateChanged(evt);
            }
        });

        chkb_FechaNac.setSelected(true);
        chkb_FechaNac.setText("Fecha Nac.:");
        chkb_FechaNac.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkb_FechaNacStateChanged(evt);
            }
        });

        chkb_Tipo.setSelected(true);
        chkb_Tipo.setText("Tipo:");
        chkb_Tipo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkb_TipoStateChanged(evt);
            }
        });

        chkb_Peso.setSelected(true);
        chkb_Peso.setText("Peso:");
        chkb_Peso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkb_PesoStateChanged(evt);
            }
        });

        chkb_Equipo.setSelected(true);
        chkb_Equipo.setText("Equipo:");
        chkb_Equipo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkb_EquipoStateChanged(evt);
            }
        });

        buttonGroup1.add(rb_Titular);
        rb_Titular.setText("Titular");

        buttonGroup1.add(rb_Reserva);
        rb_Reserva.setText("Reserva");

        spin_PesoJugador.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 120.0d, 1.0d));

        btn_ModificarJugadorDia.setText("Modificar");
        btn_ModificarJugadorDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ModificarJugadorDiaMouseClicked(evt);
            }
        });

        btn_SalirModificacionJugador.setText("Salir");
        btn_SalirModificacionJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SalirModificacionJugadorMouseClicked(evt);
            }
        });

        jLabel41.setText("ID Jugador:");

        btn_BuscarJugador.setText("Buscar");
        btn_BuscarJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BuscarJugadorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ModificarJugador_DiaLayout = new javax.swing.GroupLayout(ModificarJugador_Dia.getContentPane());
        ModificarJugador_Dia.getContentPane().setLayout(ModificarJugador_DiaLayout);
        ModificarJugador_DiaLayout.setHorizontalGroup(
            ModificarJugador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarJugador_DiaLayout.createSequentialGroup()
                .addGroup(ModificarJugador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModificarJugador_DiaLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ModificarJugador_DiaLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel40))
                    .addGroup(ModificarJugador_DiaLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(ModificarJugador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ModificarJugador_DiaLayout.createSequentialGroup()
                                .addComponent(btn_SalirModificacionJugador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_ModificarJugadorDia))
                            .addGroup(ModificarJugador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ModificarJugador_DiaLayout.createSequentialGroup()
                                    .addGroup(ModificarJugador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(chkb_Nombre)
                                        .addComponent(chkb_FechaNac)
                                        .addComponent(chkb_Tipo)
                                        .addComponent(chkb_Peso)
                                        .addComponent(chkb_Equipo))
                                    .addGroup(ModificarJugador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ModificarJugador_DiaLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(ModificarJugador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tf_NombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(ModificarJugador_DiaLayout.createSequentialGroup()
                                                    .addComponent(rb_Titular)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(rb_Reserva))
                                                .addGroup(ModificarJugador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(cb_EquipoJugador, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(spin_PesoJugador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(ModificarJugador_DiaLayout.createSequentialGroup()
                                            .addGap(7, 7, 7)
                                            .addComponent(dc_FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(ModificarJugador_DiaLayout.createSequentialGroup()
                                    .addComponent(jLabel41)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf_IDJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addComponent(btn_BuscarJugador))))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        ModificarJugador_DiaLayout.setVerticalGroup(
            ModificarJugador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarJugador_DiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(ModificarJugador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(btn_BuscarJugador)
                    .addComponent(tf_IDJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(ModificarJugador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkb_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_NombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ModificarJugador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkb_FechaNac)
                    .addComponent(dc_FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ModificarJugador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkb_Tipo)
                    .addComponent(rb_Titular)
                    .addComponent(rb_Reserva))
                .addGap(18, 18, 18)
                .addGroup(ModificarJugador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkb_Peso)
                    .addComponent(spin_PesoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ModificarJugador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkb_Equipo)
                    .addComponent(cb_EquipoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ModificarJugador_DiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ModificarJugadorDia)
                    .addComponent(btn_SalirModificacionJugador))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quinela 2017");
        setResizable(false);

        btn_admin.setText("Administración");
        btn_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_adminMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel1.setText("Quinela 2017");

        btn_quinela.setText("Participación");
        btn_quinela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quinelaActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/fondo.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btn_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(btn_quinela, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(btn_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(btn_quinela, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_adminMouseClicked
        this.Administracion_Dialog.pack();
        this.Administracion_Dialog.setLocationRelativeTo(null);
        this.Administracion_Dialog.setVisible(true);
    }//GEN-LAST:event_btn_adminMouseClicked
    private void btn_VisualizarTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VisualizarTorneoActionPerformed
        this.VisualizarTorneoMenu_Dia.pack();
        this.VisualizarTorneoMenu_Dia.setLocationRelativeTo(null);
        this.VisualizarTorneoMenu_Dia.setVisible(true);
    }//GEN-LAST:event_btn_VisualizarTorneoActionPerformed
    private void btn_BorrarTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarTorneoActionPerformed
        if (torneo != null) {
            torneo = null;
            JOptionPane.showMessageDialog(null, "¡El torneo se ha borrado exitosamente!", "Torneo Borrado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "¡No hay ningun torneo que borrar!", "Torneo", JOptionPane.INFORMATION_MESSAGE);
        }//Fin del if
    }//GEN-LAST:event_btn_BorrarTorneoActionPerformed
    private void btn_CrearTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearTorneoActionPerformed
        CrearEquipos();
        CrearPartidos();
        //  RedondearPesos();
        JOptionPane.showMessageDialog(null, "¡El torneo se ha creado aleatoriamente!", "Torneo Creado", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_CrearTorneoActionPerformed
    private void btn_SalirVisualizacionTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirVisualizacionTorneoActionPerformed
        this.VisualizarJornadas_Dia.setVisible(false);
    }//GEN-LAST:event_btn_SalirVisualizacionTorneoActionPerformed
    private void btn_SalirAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirAdminActionPerformed
        this.Administracion_Dialog.setVisible(false);
    }//GEN-LAST:event_btn_SalirAdminActionPerformed
    private void btn_VerEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerEquiposActionPerformed
        if (torneo == null) {
            JOptionPane.showMessageDialog(null, "¡No existe ningun torneo!", "Error Torneo", JOptionPane.ERROR_MESSAGE);
        } else {
            ((DefaultTableModel) tb_equiposusuario.getModel()).setRowCount(0);
            for (Equipo equipo : equipos) {
                cb_equiposusuario.addItem(equipo.getNombreEquipo());
            }//Fin del for
            this.VerEquipos_Usuario_Dia.pack();
            this.VerEquipos_Usuario_Dia.setModal(true);
            this.VerEquipos_Usuario_Dia.setTitle("Equipos");
            this.VerEquipos_Usuario_Dia.setLocationRelativeTo(null);
            this.VerEquipos_Usuario_Dia.setVisible(true);
        }//Fin del if else
    }//GEN-LAST:event_btn_VerEquiposActionPerformed
    private void rb_EquipoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_EquipoAActionPerformed


    }//GEN-LAST:event_rb_EquipoAActionPerformed

    private void btn_VerTorneoParticipacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerTorneoParticipacionActionPerformed
        VerTorneoUsuario();
    }//GEN-LAST:event_btn_VerTorneoParticipacionActionPerformed
    private void btn_quinelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quinelaActionPerformed
        this.JDialog_Participacion.pack();
        this.JDialog_Participacion.setModal(true);
        this.JDialog_Participacion.setLocationRelativeTo(null);
        this.JDialog_Participacion.setVisible(true);
    }//GEN-LAST:event_btn_quinelaActionPerformed
    private void btn_ModificarTorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ModificarTorneoMouseClicked
        this.ModificarTorneo_Dia.pack();
        this.ModificarTorneo_Dia.setLocationRelativeTo(null);
        this.ModificarTorneo_Dia.setVisible(true);
    }//GEN-LAST:event_btn_ModificarTorneoMouseClicked

    private void btn_salirmodificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirmodificarMouseClicked
        this.ModificarTorneo_Dia.setVisible(false);
        this.Administracion_Dialog.setVisible(true);
    }//GEN-LAST:event_btn_salirmodificarMouseClicked
    private void btn_SalirVisualizarTorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalirVisualizarTorneoMouseClicked
        this.Administracion_Dialog.setVisible(true);
        this.VisualizarTorneoMenu_Dia.setVisible(false);
    }//GEN-LAST:event_btn_SalirVisualizarTorneoMouseClicked
    private void btn_SalirVerEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalirVerEquiposMouseClicked
        cb_equipos.removeAllItems();
        this.VisualizarTorneoMenu_Dia.setVisible(true);
        this.VisualizarEquipos_Dia.setVisible(false);
    }//GEN-LAST:event_btn_SalirVerEquiposMouseClicked
    private void btn_actualizartablaequiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizartablaequiposMouseClicked
        ((DefaultTableModel) tb_equipos.getModel()).setRowCount(0);
        String eqelegido = String.valueOf(cb_equipos.getSelectedItem());
        int posicionEquipo = 0;
        for (int i = 0; i < equipos.size(); i++) {
            if (eqelegido.equals(equipos.get(i).getNombreEquipo())) {
                posicionEquipo = i;
                i = equipos.size();
            }//Fin del if
        }//Fin del for

        for (Jugador jug : equipos.get(posicionEquipo).getJugadores()) {
            DefaultTableModel model = ((DefaultTableModel) tb_equipos.getModel());
            Object[] row = {jug.getNombreJugador(), jug.getEdad(), dateformat.format(jug.getFechaNac()), jug.getPesoJugador(), jug.getTipoJugador()};
            model.addRow(row);
        }//Fin del for
    }//GEN-LAST:event_btn_actualizartablaequiposMouseClicked

    private void btn_SalirVisualizarEntrenadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalirVisualizarEntrenadoresMouseClicked
        this.VisualizarEntrenadores_Dia.setVisible(false);
    }//GEN-LAST:event_btn_SalirVisualizarEntrenadoresMouseClicked
    private void btn_SalirVisualizarArbitrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalirVisualizarArbitrosMouseClicked
        this.VisualizarArbitros_Dia.setVisible(false);
    }//GEN-LAST:event_btn_SalirVisualizarArbitrosMouseClicked

    private void btn_QuinelaDeJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuinelaDeJornadaActionPerformed
        this.Dialog_SelecJornada.pack();
        this.Dialog_SelecJornada.setModal(true);
        this.Dialog_SelecJornada.setTitle("Jornada");
        this.Dialog_SelecJornada.setLocationRelativeTo(null);
        this.Dialog_SelecJornada.setVisible(true);
    }//GEN-LAST:event_btn_QuinelaDeJornadaActionPerformed

    private void btn_JornadaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_JornadaAActionPerformed
        if (torneo == null) {
            JOptionPane.showMessageDialog(null, "No existe ningún torneo.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        } else {
            this.DialogJornadaA.pack();
            this.DialogJornadaA.setModal(true);
            this.DialogJornadaA.setTitle("Jornada A");
            this.DialogJornadaA.setLocationRelativeTo(null);
            ((DefaultTableModel) TablaJornadaAApuestas.getModel()).setRowCount(0);
            for (Partido p : torneo.getJornadas().get(0).getPartidos()) {
                DefaultTableModel model = ((DefaultTableModel) TablaJornadaAApuestas.getModel());
                Object[] row = {p.getA().getNombreEquipo(), p.getB().getNombreEquipo()};
                model.addRow(row);
            }//Fin del for
            this.DialogJornadaA.setVisible(true);
        }//Fin  del if else
    }//GEN-LAST:event_btn_JornadaAActionPerformed
    private void btn_JornadaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_JornadaBActionPerformed
        if (torneo == null) {
            JOptionPane.showMessageDialog(null, "No existe ningún torneo.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        } else {
            this.DialogJornadaB.pack();
            this.DialogJornadaB.setModal(true);
            this.DialogJornadaB.setTitle("Jornada");
            this.DialogJornadaB.setLocationRelativeTo(null);
            ((DefaultTableModel) TablaJornadaBApuestas.getModel()).setRowCount(0);
            for (Partido p : torneo.getJornadas().get(1).getPartidos()) {
                DefaultTableModel model = ((DefaultTableModel) TablaJornadaBApuestas.getModel());
                Object[] row = {p.getA().getNombreEquipo(), p.getB().getNombreEquipo()};
                model.addRow(row);
            }//Fin del for
            this.DialogJornadaB.setVisible(true);
        }//Fin del if else
    }//GEN-LAST:event_btn_JornadaBActionPerformed

    private void MenuShowOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuShowOptionsActionPerformed
        JOptionPane.showMessageDialog(null, "Para crear una apuesta debes de:\n"
                + "1. Presionar la fila en la que se encuentran los equipos que jugaran el partido.\n"
                + "2. Seleccionar tu monto de oferta.\n"
                + "3. Seleccionar el equipo que crees que va a ganar.\n"
                + "4. Seleccionar su multiplicador.\n"
                + "5. ¡Mira tus resultados!", "Ayuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_MenuShowOptionsActionPerformed
    private void TablaJornadaAApuestasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaJornadaAApuestasMouseClicked
        MetodoComboBoxJornadaA();
    }//GEN-LAST:event_TablaJornadaAApuestasMouseClicked
    private void txt_ApuestaAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ApuestaAKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACKSPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }//Fin del if
        if (txt_ApuestaA.getText().length() > 5) {
            evt.consume();
        }//Fin del if
    }//GEN-LAST:event_txt_ApuestaAKeyTyped

    private void MenuShowOptions1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuShowOptions1ActionPerformed
        JOptionPane.showMessageDialog(null, "Para crear una apuesta debes de:\n"
                + "1. Presionar la fila en la que se encuentran los equipos que jugaran el partido.\n"
                + "2. Seleccionar tu monto de oferta.\n"
                + "3. Seleccionar el equipo que crees que va a ganar.\n"
                + "4. Seleccionar su multiplicador.\n"
                + "5. ¡Mira tus resultados!", "Ayuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_MenuShowOptions1ActionPerformed
    private void TablaJornadaBApuestasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaJornadaBApuestasMouseClicked
        MetodoComboBoxJornadaB();
    }//GEN-LAST:event_TablaJornadaBApuestasMouseClicked
    private void txt_ApuestaBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ApuestaBKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACKSPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }//Fin del if
        if (txt_ApuestaB.getText().length() > 5) {
            evt.consume();
        }//Fin del if
    }//GEN-LAST:event_txt_ApuestaBKeyTyped

    private void btn_VerJornadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerJornadasActionPerformed
        cargarTablasTorneo();
    }//GEN-LAST:event_btn_VerJornadasActionPerformed
    private void btn_VerequiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerequiposActionPerformed
        if (torneo == null) {
            JOptionPane.showMessageDialog(null, "No existe ningún torneo.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        } else {
            ((DefaultTableModel) tb_equipos.getModel()).setRowCount(0);
            for (Equipo equipo : equipos) {
                cb_equipos.addItem(equipo.getNombreEquipo());
            }//Fin del for
            this.VisualizarEquipos_Dia.pack();

            this.VisualizarEquipos_Dia.setVisible(true);
        }//Fin del if else 
    }//GEN-LAST:event_btn_VerequiposActionPerformed
    private void btn_VerEntrenadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerEntrenadoresActionPerformed
        if (torneo == null) {
            JOptionPane.showMessageDialog(null, "No existe ningún torneo.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        } else {
            ((DefaultTableModel) tb_entrenadores.getModel()).setRowCount(0);
            for (Equipo equipo : equipos) {
                Entrenador e = equipo.getTrainer();
                DefaultTableModel model = ((DefaultTableModel) tb_entrenadores.getModel());
                Object[] row = {e.getNombreEntrenador(), e.getEquipo().getNombreEquipo(), e.getPesoEntrenador()};
                model.addRow(row);
            }//Fin del for
            this.VisualizarEntrenadores_Dia.pack();
            this.VisualizarEntrenadores_Dia.setModal(true);
            this.VisualizarEntrenadores_Dia.setLocationRelativeTo(null);
            this.VisualizarEntrenadores_Dia.setVisible(true);
        }//Fin del ifelse
    }//GEN-LAST:event_btn_VerEntrenadoresActionPerformed
    private void btn_VerArbitrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerArbitrosActionPerformed
        if (torneo == null) {
            JOptionPane.showMessageDialog(null, "No existe ningún torneo.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        } else {
            ((DefaultTableModel) tb_Arbitros.getModel()).setRowCount(0);
            for (Partido p : torneo.getJornadas().get(0).getPartidos()) {
                for (Arbitro a : p.getArbitros()) {
                    DefaultTableModel model = ((DefaultTableModel) tb_Arbitros.getModel());
                    Object[] row = {a.getNombreArbitro(), a.getPartido().getA().getNombreEquipo() + " VS "
                        + a.getPartido().getB().getNombreEquipo(), a.getTipo(), a.getPesoArbitro()};
                    model.addRow(row);
                }//Fin del for
            }//Fin del for
            this.VisualizarArbitros_Dia.pack();
            this.VisualizarArbitros_Dia.setModal(true);
            this.VisualizarArbitros_Dia.setLocationRelativeTo(null);
            this.VisualizarArbitros_Dia.setVisible(true);
        }//Fin del if else
    }//GEN-LAST:event_btn_VerArbitrosActionPerformed


    private void btn_ResultadosJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResultadosJBActionPerformed
        if (!txt_ApuestaB.getText().equals("")) {
            this.ResultadosQuinela.pack();
            this.ResultadosQuinela.setModal(true);
            this.ResultadosQuinela.setTitle("Resultados");
            this.ResultadosQuinela.setLocationRelativeTo(null);
            double ApuestaB = Double.parseDouble(txt_ApuestaB.getText().toString());
            if (ApuestaB > 100000) {
                JOptionPane.showMessageDialog(null, "No ha ingresado una cantidad valida.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                txt_EquipoQAposto.setText(cb_EquiposJornadaB.getSelectedItem().toString());
                txt_ApuestaRealizada.setText(txt_ApuestaB.getText());
                txt_MultiplicadorSeleccionado.setText(cb_MultiplicadorB.getSelectedItem().toString());
                int indice = this.TablaJornadaBApuestas.getSelectedRow();
                TableModel modeloMesa = TablaJornadaBApuestas.getModel();
                String equipo1 = modeloMesa.getValueAt(indice, 0).toString();
                String equipo2 = modeloMesa.getValueAt(indice, 1).toString();
                ((DefaultTableModel) TablaJornadaBUsuario.getModel()).setRowCount(0);
                for (Partido p : torneo.getJornadas().get(1).getPartidos()) {
                    if (p.getA().getNombreEquipo().equals(equipo1) && p.getB().getNombreEquipo().equals(equipo2)) {
                        if (p.getA().getPeso() > p.getB().getPeso()) {
                            txt_EquipoQGano.setText(equipo1);
                        } else if (p.getB().getPeso() > p.getA().getPeso()) {
                            txt_EquipoQGano.setText(equipo2);
                        }//Fin del if
                    }//Fin del if
                }//FIn del for
                if (txt_EquipoQAposto.getText().equals(txt_EquipoQGano.getText().toString())) {
                    double ApB = Double.parseDouble(txt_ApuestaB.getText().toString());
                    double multiplicador = Double.parseDouble(txt_MultiplicadorSeleccionado.getText().toString());
                    double valorFinal = ApB * multiplicador;
                    double incremento = valorFinal - ApB;
                    double resultado = incremento / ApB;
                    double ValorPorcentaje = resultado * 100;
                    txt_PorcentajeGanancia.setText(ValorPorcentaje + "%");
                } else {
                    txt_PorcentajeGanancia.setText("No hubo ganancia.");
                }//Fin del if
                this.ResultadosQuinela.setVisible(true);
            }//Fin delif else
        } else {
            JOptionPane.showMessageDialog(null, "No ha ingresado una cantidad a apostar.", "Error", JOptionPane.ERROR_MESSAGE);
        }//Fin del if else
    }//GEN-LAST:event_btn_ResultadosJBActionPerformed
    private void btn_ResultadosJAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResultadosJAActionPerformed
        if (!txt_ApuestaA.getText().equals("")) {
            this.ResultadosQuinela.pack();
            this.ResultadosQuinela.setModal(true);
            this.ResultadosQuinela.setTitle("Resultados");
            this.ResultadosQuinela.setLocationRelativeTo(null);
            double ApuestaA = Double.parseDouble(txt_ApuestaA.getText().toString());
            if (ApuestaA > 100000) {
                JOptionPane.showMessageDialog(null, "No ha ingresado una cantidad valida.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                txt_EquipoQAposto.setText(cb_EquiposJornadaA.getSelectedItem().toString());
                txt_ApuestaRealizada.setText(txt_ApuestaA.getText());
                txt_MultiplicadorSeleccionado.setText(cb_MultiplicadorA.getSelectedItem().toString());
                int indice = this.TablaJornadaAApuestas.getSelectedRow();
                TableModel modeloMesa = TablaJornadaAApuestas.getModel();
                String equipo1 = modeloMesa.getValueAt(indice, 0).toString();
                String equipo2 = modeloMesa.getValueAt(indice, 1).toString();
                ((DefaultTableModel) TablaJornadaAUsuario.getModel()).setRowCount(0);
                for (Partido p : torneo.getJornadas().get(0).getPartidos()) {
                    if (p.getA().getNombreEquipo().equals(equipo1) && p.getB().getNombreEquipo().equals(equipo2)) {
                        if (p.getA().getPeso() > p.getB().getPeso()) {
                            txt_EquipoQGano.setText(equipo1);
                        } else if (p.getB().getPeso() > p.getA().getPeso()) {
                            txt_EquipoQGano.setText(equipo2);
                        }//Fin del if
                    }//Fin del if
                }//FIn del for
                if (txt_EquipoQAposto.getText().equals(txt_EquipoQGano.getText().toString())) {
                    double multiplicador = Double.parseDouble(txt_MultiplicadorSeleccionado.getText().toString());
                    double valorFinal = ApuestaA * multiplicador;
                    double incremento = valorFinal - ApuestaA;
                    double resultado = incremento / ApuestaA;
                    double ValorPorcentaje = resultado * 100;
                    txt_PorcentajeGanancia.setText(ValorPorcentaje + "%");
                } else {
                    txt_PorcentajeGanancia.setText("No hubo ganancia.");
                }//Fin del if else
                this.ResultadosQuinela.setVisible(true);
            }//Fin delif else
        } else {
            JOptionPane.showMessageDialog(null, "No ha ingresado una cantidad a apostar.", "Error", JOptionPane.ERROR_MESSAGE);
        }//Fin del if else 
    }//GEN-LAST:event_btn_ResultadosJAActionPerformed

    private void btn_SalirVisualizacionTorneoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirVisualizacionTorneoUsuarioActionPerformed
        this.DialogTorneoUsuario.dispose();
    }//GEN-LAST:event_btn_SalirVisualizacionTorneoUsuarioActionPerformed

    public void ActualizarTablasArbitro() { //para la parte de modificar arbitros
        ((DefaultTableModel) tb_ModificarArbitros.getModel()).setRowCount(0);
        for (Partido p : torneo.getJornadas().get(0).getPartidos()) {
            for (Arbitro a : p.getArbitros()) {
                DefaultTableModel model = ((DefaultTableModel) tb_ModificarArbitros.getModel());
                Object[] row = {a.getNombreArbitro(), a.getPartido().getA().getNombreEquipo() + " VS "
                    + a.getPartido().getB().getNombreEquipo(), a.getPesoArbitro()};
                model.addRow(row);
            }//Fin del for
        }//Fin del for
    }

    public void ActualizarTablasEntrenadores() { //para la parte de modificar entrenadores
        ((DefaultTableModel) tb_ModificarEntrenadores.getModel()).setRowCount(0);
        for (Equipo equipo : equipos) {
            Entrenador e = equipo.getTrainer();
            DefaultTableModel model = ((DefaultTableModel) tb_ModificarEntrenadores.getModel());
            Object[] row = {e.getNombreEntrenador(), e.getEquipo().getNombreEquipo(), e.getPesoEntrenador()};
            model.addRow(row);
        }//Fin del for
    }

    private void btn_ModificarArbitroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ModificarArbitroMouseClicked

        if (torneo == null) {
            JOptionPane.showMessageDialog(null, "No existe ningún torneo.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        } else {
            ActualizarTablasArbitro();
            this.ModificarArbitro_Dia.pack();
            this.ModificarArbitro_Dia.setVisible(true);

        }

    }//GEN-LAST:event_btn_ModificarArbitroMouseClicked

    private void btn_SalirVerEquiposUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalirVerEquiposUsuarioMouseClicked

        this.JDialog_Participacion.setVisible(true);
        this.VerEquipos_Usuario_Dia.setVisible(false);
    }//GEN-LAST:event_btn_SalirVerEquiposUsuarioMouseClicked

    private void btn_actualizartablaequiposusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizartablaequiposusuarioMouseClicked

        ((DefaultTableModel) tb_equiposusuario.getModel()).setRowCount(0);
        String eqelegido = String.valueOf(cb_equiposusuario.getSelectedItem());
        int posicionEquipo = 0;
        for (int i = 0; i < equipos.size(); i++) {
            if (eqelegido.equals(equipos.get(i).getNombreEquipo())) {
                posicionEquipo = i;
                i = equipos.size();
            }//Fin del if
        }//Fin del for
        DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
        for (Jugador jug : equipos.get(posicionEquipo).getJugadores()) {
            DefaultTableModel model = ((DefaultTableModel) tb_equiposusuario.getModel());
            Object[] row = {jug.getNombreJugador(), jug.getEdad(), dateformat.format(jug.getFechaNac()), jug.getTipoJugador()};
            model.addRow(row);
        }//Fin del for
    }//GEN-LAST:event_btn_actualizartablaequiposusuarioMouseClicked

    private void btn_ModificarArbitroDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ModificarArbitroDiaMouseClicked

        String nombre = tf_NombreArbitro.getText();
        double peso = Double.valueOf(String.valueOf(spin_pesoarbitro.getValue()));

        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacio.");
        } else if (peso > 50) {
            JOptionPane.showMessageDialog(this, "Peso no se puede pasar de 50.");
        } else {
            int row = tb_ModificarArbitros.getSelectedRow();
            int column = tb_ModificarArbitros.getSelectedColumn();

            if (row == -1 || column == -1) {
                JOptionPane.showMessageDialog(this, "Tiene que seleccionar algo primero.");
            } else {

                //usar ID envez del nombre cuando se ponga mongo 
                String IDNombre = String.valueOf(tb_ModificarArbitros.getValueAt(row, column));

                for (Partido p : torneo.getJornadas().get(0).getPartidos()) {
                    for (Arbitro a : p.getArbitros()) {
                        if (IDNombre.equals(a.getNombreArbitro())) {
                            a.setNombreArbitro(nombre);
                            a.setPesoArbitro(peso);
                            break;
                        }
                    }//Fin del for
                }//Fin del for
                ActualizarTablasArbitro();
                JOptionPane.showMessageDialog(this, "Se ha actualizado la infomación del arbitro exitosamente.");
            }

        }

    }//GEN-LAST:event_btn_ModificarArbitroDiaMouseClicked

    private void btn_modificarentrenadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarentrenadorMouseClicked

        if (torneo == null) {
            JOptionPane.showMessageDialog(null, "No existe ningún torneo.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        } else {

            ActualizarTablasEntrenadores();
            this.ModificarEntrenador_Dia.pack();
            this.ModificarEntrenador_Dia.setVisible(true);
        }
    }//GEN-LAST:event_btn_modificarentrenadorMouseClicked

    public double ActualizarPesoEquipo(Equipo a) {

        double PesoTotal = 0.0;

        for (Jugador j : a.getJugadores()) {
            PesoTotal += j.getPesoJugador();
        }

        PesoTotal += +a.getTrainer().getPesoEntrenador();

        return PesoTotal;
    }

    private void btn_ModificarEntrenadorDIaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ModificarEntrenadorDIaMouseClicked

        String nombre = tf_NombreEntrenador.getText();
        double peso = Double.valueOf(String.valueOf(spin_pesoentrenador.getValue()));

        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacio.");
        } else if (peso > 50) {
            JOptionPane.showMessageDialog(this, "Peso no se puede pasar de 50.");
        } else {
            int row = tb_ModificarEntrenadores.getSelectedRow();
            int column = tb_ModificarEntrenadores.getSelectedColumn();

            if (row == -1 || column == -1) {
                JOptionPane.showMessageDialog(this, "Tiene que seleccionar algo primero.");
            } else {

                //usar ID envez del nombre cuando se ponga mongo 
                String IDNombre = String.valueOf(tb_ModificarEntrenadores.getValueAt(row, column));

                double PesoNew = 0.0;

                for (Equipo equipo : equipos) {
                    if (equipo.getTrainer().getNombreEntrenador().equals(IDNombre)) {
                        equipo.getTrainer().setNombreEntrenador(nombre);
                        equipo.getTrainer().setPesoEntrenador(peso);
                        PesoNew = ActualizarPesoEquipo(equipo);
                        equipo.setPeso(PesoNew);
                        break;
                    }
                }
                ActualizarTablasEntrenadores();
                JOptionPane.showMessageDialog(this.ModificarEntrenador_Dia, "Se ha actualizado la infomación del entrenador exitosamente.");
            }
        }

    }//GEN-LAST:event_btn_ModificarEntrenadorDIaMouseClicked

    private void btn_SalirModificacionEntrenadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalirModificacionEntrenadorMouseClicked
        this.ModificarEntrenador_Dia.setVisible(false);

    }//GEN-LAST:event_btn_SalirModificacionEntrenadorMouseClicked

    private void btn_SalirModificacionArbitroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalirModificacionArbitroMouseClicked

        this.ModificarArbitro_Dia.setVisible(false);
    }//GEN-LAST:event_btn_SalirModificacionArbitroMouseClicked

    private void btn_modificarjugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarjugadorMouseClicked

        if (torneo == null) {
            JOptionPane.showMessageDialog(null, "No existe ningún torneo.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        } else {
            ((DefaultTableModel) tb_ModificarJugador.getModel()).setRowCount(0);
            for (Equipo equipo : equipos) {
                cb_EquipoJugador.addItem(equipo.getNombreEquipo());
            }//Fin del for
            this.ModificarJugador_Dia.pack();
            this.ModificarJugador_Dia.setVisible(true);

        }
    }//GEN-LAST:event_btn_modificarjugadorMouseClicked

    private void btn_SalirModificacionJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalirModificacionJugadorMouseClicked

        cb_EquipoJugador.removeAllItems();
        this.ModificarJugador_Dia.setVisible(false);

    }//GEN-LAST:event_btn_SalirModificacionJugadorMouseClicked

    private void chkb_NombreStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkb_NombreStateChanged

        if (chkb_Nombre.isSelected()) {
            tf_NombreJugador.setEnabled(true);
        } else {
            tf_NombreJugador.setEnabled(false);
        }
    }//GEN-LAST:event_chkb_NombreStateChanged

    private void chkb_FechaNacStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkb_FechaNacStateChanged
        
        if (chkb_FechaNac.isSelected()) {
            dc_FechaNacimiento.setEnabled(true);
        } else {
            dc_FechaNacimiento.setEnabled(false);
        }
    }//GEN-LAST:event_chkb_FechaNacStateChanged

    private void chkb_TipoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkb_TipoStateChanged

        if (chkb_Tipo.isSelected()) {
            rb_Titular.setEnabled(true);
            rb_Reserva.setEnabled(true);
        } else {
            rb_Titular.setEnabled(false);
            rb_Reserva.setEnabled(false);
        }
    }//GEN-LAST:event_chkb_TipoStateChanged

    private void chkb_PesoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkb_PesoStateChanged
        if (chkb_Peso.isSelected()) {
            spin_PesoJugador.setEnabled(true);
        } else {
            spin_PesoJugador.setEnabled(false);
        }
    }//GEN-LAST:event_chkb_PesoStateChanged

    private void chkb_EquipoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkb_EquipoStateChanged
        if (chkb_Equipo.isSelected()) {
            cb_EquipoJugador.setEnabled(true);
        } else {
            cb_EquipoJugador.setEnabled(false);
        }
    }//GEN-LAST:event_chkb_EquipoStateChanged

    private void btn_BuscarJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BuscarJugadorMouseClicked
        ((DefaultTableModel) tb_ModificarJugador.getModel()).setRowCount(0);

        String IDJugador = tf_IDJugador.getText();

        if (IDJugador.equals("")) {
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacio.");
        } else {

            for (int i = 0; i < equipos.size(); i++) {
                for (int j = 0; j < equipos.get(i).getJugadores().size(); j++) {
                    if (IDJugador.equals(equipos.get(i).getJugadores().get(j).getNombreJugador())) {

                        PosicionEquipo = i;
                        PosicionJugador = j;

                        Jugador jug = equipos.get(PosicionEquipo).getJugadores().get(PosicionJugador);

                        DefaultTableModel model = ((DefaultTableModel) tb_ModificarJugador.getModel());
                        Object[] row = {jug.getNombreJugador(), jug.getEdad(), dateformat.format(jug.getFechaNac()), jug.getTipoJugador(), jug.getPesoJugador(),
                            jug.getEq().getNombreEquipo()};
                        model.addRow(row);

                        j = equipos.get(i).getJugadores().size();
                        i = equipos.size();

                        IDJugador = "Done";
                        siReviso = true;

                        break;
                    }
                }
            }

            if (!IDJugador.equals("Done")) {
                JOptionPane.showMessageDialog(ModificarJugador_Dia, "No se encontro un jugador con ese ID.");
            }
        }


    }//GEN-LAST:event_btn_BuscarJugadorMouseClicked

    private void btn_ModificarJugadorDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ModificarJugadorDiaMouseClicked

        if (siReviso) { //verifica si busco al jugador 

            siReviso = false; //resetear valor

            Jugador jug = equipos.get(PosicionEquipo).getJugadores().get(PosicionJugador);

            boolean isSame = true;
            int PosicionEquipoNuevo = 0;

            if (chkb_Nombre.isSelected()) {
                String nombre = tf_NombreJugador.getText();
                if (nombre.equals("")) {
                    JOptionPane.showMessageDialog(this, "El nombre no puede estar vacio.");
                    siReviso = true;
                    isSame = false;
                } else {

                    jug.setNombreJugador(nombre);
                }
            }
            if (chkb_FechaNac.isSelected()) {
                Date d = null;
                try {
                    String date = dateformat.format(dc_FechaNacimiento.getDate()); //sin parsearlo a date

                    d = dateformat.parse(date); //ya parseado a date
                    jug.setFechaNac(d);

                    int edad = 2017 - (Integer.parseInt(date.split("/")[2]));
                    jug.setEdad(edad);

                } catch (ParseException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (chkb_Tipo.isSelected()) {
                if (rb_Titular.isSelected()) {
                    jug.setTipoJugador("Titular");
                }
                if (rb_Reserva.isSelected()) {
                    jug.setTipoJugador("Reserva");
                }
            }
            if (chkb_Peso.isSelected()) {
                jug.setPesoJugador(Double.parseDouble(String.valueOf(spin_PesoJugador.getValue())));
            }
            if (chkb_Equipo.isSelected()) {

                String eqelegido = String.valueOf(cb_EquipoJugador.getSelectedItem());
                if (jug.getEq().getNombreEquipo().equals(eqelegido)) { //si el equipo del jugador == equipo elegido nuevo
                    siReviso = true;
                    JOptionPane.showMessageDialog(ModificarJugador_Dia, "Ese es el mismo equipo del jugador.");
                } else {
                    Equipo EqViejo = equipos.get(PosicionEquipo);

                    EqViejo.getJugadores().remove(PosicionJugador); //borrar el jugador que ya cambio de equipo

                    ActualizarPesoEquipo(EqViejo); //actualizar el peso del equipo viejo

                    for (Jugador jugador : EqViejo.getJugadores()) { //cambiar una reserva a titular
                        if (jugador.getTipoJugador().equals("Reserva")) {
                            jugador.setTipoJugador("Titular");
                            break;
                        }
                    }

                    for (int i = 0; i < equipos.size(); i++) {
                        if (eqelegido.equals(equipos.get(i).getNombreEquipo())) {
                            PosicionEquipoNuevo = i;
                            i = equipos.size();
                        }
                    }

                    jug.setEq(equipos.get(PosicionEquipoNuevo));
                    equipos.get(PosicionEquipoNuevo).addJugador(jug);
                    ActualizarPesoEquipo(equipos.get(PosicionEquipoNuevo)); //actualizar peso del equipo nuevo
                    isSame = false;
                }

            }

            if (!isSame) {
                ((DefaultTableModel) tb_ModificarJugador.getModel()).setRowCount(0);
                DefaultTableModel model = ((DefaultTableModel) tb_ModificarJugador.getModel());
                Object[] row = {jug.getNombreJugador(), jug.getEdad(), dateformat.format(jug.getFechaNac()), jug.getTipoJugador(), jug.getPesoJugador(),
                    jug.getEq().getNombreEquipo()};
                model.addRow(row);

                JOptionPane.showMessageDialog(ModificarJugador_Dia, "El jugador se ha modificado exitosamente.");

            }
        } else {

            JOptionPane.showMessageDialog(ModificarJugador_Dia, "Tiene que buscar a alguien primero.");
        }
    }//GEN-LAST:event_btn_ModificarJugadorDiaMouseClicked

    public void ActualizarTablasJugadores() { //para parte de modif jugador

    }

    //Terminados
    public void MetodoComboBoxJornadaA() {
        int indice = this.TablaJornadaAApuestas.getSelectedRow();
        TableModel modeloMesa = TablaJornadaAApuestas.getModel();
        String equipo1 = modeloMesa.getValueAt(indice, 0).toString();
        String equipo2 = modeloMesa.getValueAt(indice, 1).toString();
        // getting exiting combo box model
        DefaultComboBoxModel model = (DefaultComboBoxModel) cb_EquiposJornadaA.getModel();
        // removing old data
        model.removeAllElements();
        String[] arreglo = {equipo1, equipo2};
        for (String item : arreglo) {
            model.addElement(item);
        }//Fin del for
        // setting model with new data
        cb_EquiposJornadaA.setModel(model);
    }//Fin del metodo

    public void MetodoComboBoxJornadaB() {
        int indice = this.TablaJornadaBApuestas.getSelectedRow();
        TableModel modeloMesa = TablaJornadaBApuestas.getModel();
        String equipo1 = modeloMesa.getValueAt(indice, 0).toString();
        String equipo2 = modeloMesa.getValueAt(indice, 1).toString();
        // getting exiting combo box model
        DefaultComboBoxModel model = (DefaultComboBoxModel) cb_EquiposJornadaB.getModel();
        // removing old data
        model.removeAllElements();
        String[] arreglo = {equipo1, equipo2};
        for (String item : arreglo) {
            model.addElement(item);
        }//Fin del for
        // setting model with new data
        cb_EquiposJornadaB.setModel(model);
    }

    public void CrearEquipos() {

        File file = null;
        BufferedReader br = null;
        FileReader fr = null;

        File Entrenadores = null;
        BufferedReader br2 = null;
        FileReader fr2 = null;

        try {
            file = new File("./src/Data/Jugadores.txt");
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            Entrenadores = new File("./src/Data/Entrenadores.txt");
            fr2 = new FileReader(Entrenadores);
            br2 = new BufferedReader(fr2);

            String linea = "";
            String[] partes = new String[4];
            String nombre = "";
            int edad = 0;
            double peso = 0.0;
            double pesoEquipo = 0.0;
            String tipo = "";
            String nac = "";
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

            int contador = 0;
            int PosicionEquipo = -1;
            while ((linea = br.readLine()) != null) { //para agregar jugadores
                partes = linea.split(";");
                nombre = partes[0];
                edad = Integer.parseInt(partes[1]);
                nac = partes[2];
                peso = Double.parseDouble(partes[3]);
                tipo = partes[4];

                Date date;

                date = df.parse(nac);

                Jugador jug = new Jugador(nombre, peso, date, edad);
                jug.setTipoJugador(tipo);

                if (contador == 11) {
                    contador = -5;
                }

                if (contador == 0) {
                    PosicionEquipo++;
                }

                pesoEquipo = equipos.get(PosicionEquipo).getPeso() + peso;

                jug.setEq(equipos.get(PosicionEquipo));
                equipos.get(PosicionEquipo).setPeso(pesoEquipo);
                equipos.get(PosicionEquipo).addJugador(jug);

                contador++;
            }

            linea = "";
            partes = new String[1];
            nombre = "";
            peso = 0.0;

            for (int i = 0; i < 30; i++) { //agrega los entrenadores
                linea = br2.readLine();
                partes = linea.split(";");

                Entrenador e = new Entrenador(partes[0], Double.parseDouble(partes[1]));

                Equipo eq = equipos.get(i);
                e.setEquipo(eq);

                eq.setTrainer(e);

                eq.setPeso(eq.getPeso() + e.getPesoEntrenador());

            }

        } catch (Exception e) {
            e.printStackTrace();
            try {
                br.close();
                fr.close();
                br2.close();
                fr2.close();

            } catch (IOException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//Fin del metodo

    public void RedondearPesos() {
        for (Equipo equipo : equipos) {
            equipo.setPeso(Double.parseDouble(df.format(equipo.getPeso())));
        }
    }//Fin del metodo

    public void CrearPartidos() {

        Jornada jorn1 = new Jornada();
        Jornada jorn2 = new Jornada();

        jorn1 = RandomizarJornada();
        jorn2 = RandomizarJornada();

        torneo = new Torneo();
        torneo.addJornada(jorn1);
        torneo.addJornada(jorn2);

    }//Fin del metodo

    public Partido AgregarArbitros(Partido par, int contador) {

        File file = null;
        BufferedReader br = null;
        FileReader fr = null;

        try {
            file = new File("./src/Data/Arbitros.txt");
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String linea = "";
            String[] partes = new String[2];
            String nombre = "";
            String tipo = "";
            double peso = 0.0;

            int contadorwhile = 0;

            for (int i = 0; i < contador; i++) {
                linea = br.readLine();
            }
            while ((linea = br.readLine()) != null) {

                partes = linea.split(";");
                nombre = partes[0];
                tipo = partes[1];
                peso = Double.parseDouble(partes[2]);

                Arbitro arb = new Arbitro(tipo, nombre, peso);

                arb.setPartido(par);

                par.addArbitro(arb);

                if (contadorwhile == 3) {
                    break;
                }

                contadorwhile++;

            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                br.close();
                fr.close();
            } catch (Exception e) {
            }
        }

        return par;

    }//Fin del metodo

    public Jornada RandomizarJornada() {
        //Sistema para generar las jornadas de manera aleatoria
        Collections.shuffle(equipos); //randomizar el orden de los equipos para asignarles partidos
        Jornada jornada = new Jornada();
        Random r = new Random();
        for (int i = 0; i < 15; i++) {
            Partido par = new Partido();
            Equipo Casa = equipos.get((i * 2) + 1);
            Equipo Visita = equipos.get((i * 2));
            double pesoViejoB = Casa.getPeso(); //casa
            //System.out.println("Casa(old): " + pesoViejoB);
            double pesoViejoA = Visita.getPeso(); //visita
            double aumento = 1.65 * (r.nextInt(20) + 1);
            par.setA(Visita); //i * 2 para conseguir siempre el equipo que va siguente
            Casa.setPeso(pesoViejoB + aumento); //aumentar el peso al equipo de casa
            par.setB(Casa);
            //System.out.println("Casa(aumento): " + Casa.getPeso());
            par = AgregarArbitros(par, i * 4); //va a agregar cada cuatro nuevos arbitros a segun el i del for. i del for = numero de partido
            jornada.addPartido(par);
            /*
            par = new Partido(); //reiniciar variable partido
            r = new Random();
            aumento = 1.65 * (r.nextInt(20) + 1);
            Casa.setPeso(pesoViejoB); //restarle el aumento al equipo de casa que ahora es visitante
            par.setA(Casa);
            Visita.setPeso(pesoViejoA + aumento);
            par.setB(Visita);
            par = AgregarArbitros(par, i * 4);
            //System.out.println("Casa(old2): " + Casa.getPeso());
            jorn2.addPartido(par);
             */
        }//Fin del for
        /*for (Partido par : jorn1.getPartidos()) {
            System.out.println(par.getA().getNombreEquipo() + " VS " + par.getB().getNombreEquipo());
            for (Arbitro arb : par.getArbitros()) {
                System.out.println(arb.getNombreArbitro());
            }
        }*/
        return jornada;
    }//Fin del metodo

    public void cargarTablasTorneo() {
        if (torneo == null) {
            JOptionPane.showMessageDialog(null, "No existe ningún torneo.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        } else {
            ((DefaultTableModel) TablaJornadaA.getModel()).setRowCount(0);
            ((DefaultTableModel) TablaJornadaB.getModel()).setRowCount(0);
            for (Partido p : torneo.getJornadas().get(0).getPartidos()) {
                DefaultTableModel model = ((DefaultTableModel) TablaJornadaA.getModel());
                Object[] row = {p.getA().getNombreEquipo(), p.getA().getPeso(), p.getB().getNombreEquipo(), p.getB().getPeso(),
                    p.getA().getPeso() - p.getB().getPeso()};
                model.addRow(row);
            }//FIn del for
            for (Partido p : torneo.getJornadas().get(1).getPartidos()) {
                DefaultTableModel model = ((DefaultTableModel) TablaJornadaB.getModel());
                Object[] row = {p.getA().getNombreEquipo(), p.getA().getPeso(), p.getB().getNombreEquipo(), p.getB().getPeso(),
                    p.getA().getPeso() - p.getB().getPeso()};
                model.addRow(row);
            }//Fin del for
            this.VisualizarJornadas_Dia.pack();
            this.VisualizarJornadas_Dia.setModal(true);
            this.VisualizarJornadas_Dia.setVisible(true);
            this.Administracion_Dialog.setVisible(false);
            this.JDialog_Participacion.setVisible(false);
        }//Fin del if else
    }//Fin del metodo

    public void VerTorneoUsuario() {
        if (torneo == null) {
            JOptionPane.showMessageDialog(null, "No existe ningún torneo.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        } else {
            ((DefaultTableModel) TablaJornadaAUsuario.getModel()).setRowCount(0);
            ((DefaultTableModel) TablaJornadaBUsuario.getModel()).setRowCount(0);
            for (Partido p : torneo.getJornadas().get(0).getPartidos()) {
                DefaultTableModel model = ((DefaultTableModel) TablaJornadaAUsuario.getModel());
                Object[] row = {p.getA().getNombreEquipo(), p.getB().getNombreEquipo()};
                model.addRow(row);
            }//FIn del for
            for (Partido p : torneo.getJornadas().get(1).getPartidos()) {
                DefaultTableModel model = ((DefaultTableModel) TablaJornadaBUsuario.getModel());
                Object[] row = {p.getA().getNombreEquipo(), p.getB().getNombreEquipo()};
                model.addRow(row);
            }//Fin del for
            this.DialogTorneoUsuario.pack();
            this.DialogTorneoUsuario.setModal(true);
            this.DialogTorneoUsuario.setVisible(true);
            this.Administracion_Dialog.setVisible(false);
            this.JDialog_Participacion.setVisible(false);
        }//Fin del if else
    }//Fin del metodo

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new main().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Administracion_Dialog;
    private javax.swing.JDialog DialogJornadaA;
    private javax.swing.JDialog DialogJornadaB;
    private javax.swing.JDialog DialogTorneoUsuario;
    private javax.swing.JDialog Dialog_IngresarApuesta;
    private javax.swing.JDialog Dialog_SelecJornada;
    private javax.swing.JDialog JDialog_Participacion;
    private javax.swing.JMenu JMOMenuOpciones;
    private javax.swing.JMenu JMOMenuOpciones1;
    private javax.swing.JLabel LabelJornadaQuinela;
    private javax.swing.JDialog MenuApuestas;
    private javax.swing.JMenuItem MenuShowOptions;
    private javax.swing.JMenuItem MenuShowOptions1;
    private javax.swing.JDialog ModificarArbitro_Dia;
    private javax.swing.JDialog ModificarEntrenador_Dia;
    private javax.swing.JDialog ModificarJugador_Dia;
    private javax.swing.JDialog ModificarTorneo_Dia;
    private javax.swing.JDialog ResultadosQuinela;
    private javax.swing.JTable TablaJornadaA;
    private javax.swing.JTable TablaJornadaAApuestas;
    private javax.swing.JTable TablaJornadaAUsuario;
    private javax.swing.JTable TablaJornadaB;
    private javax.swing.JTable TablaJornadaBApuestas;
    private javax.swing.JTable TablaJornadaBUsuario;
    private javax.swing.JDialog VerEquipos_Usuario_Dia;
    private javax.swing.JDialog VisualizarArbitros_Dia;
    private javax.swing.JDialog VisualizarEntrenadores_Dia;
    private javax.swing.JDialog VisualizarEquipos_Dia;
    private javax.swing.JDialog VisualizarJornadas_Dia;
    private javax.swing.JDialog VisualizarTorneoMenu_Dia;
    private javax.swing.JButton btn_BorrarTorneo;
    private javax.swing.JButton btn_BuscarJugador;
    private javax.swing.JButton btn_CrearTorneo;
    private javax.swing.JButton btn_JornadaA;
    private javax.swing.JButton btn_JornadaB;
    private javax.swing.JButton btn_ModificarArbitro;
    private javax.swing.JButton btn_ModificarArbitroDia;
    private javax.swing.JButton btn_ModificarEntrenadorDIa;
    private javax.swing.JButton btn_ModificarJugadorDia;
    private javax.swing.JButton btn_ModificarTorneo;
    private javax.swing.JButton btn_QuinelaDeJornada;
    private javax.swing.JButton btn_ResultadosJA;
    private javax.swing.JButton btn_ResultadosJB;
    private javax.swing.JButton btn_SalirAdmin;
    private javax.swing.JButton btn_SalirModificacionArbitro;
    private javax.swing.JButton btn_SalirModificacionEntrenador;
    private javax.swing.JButton btn_SalirModificacionJugador;
    private javax.swing.JButton btn_SalirVerEquipos;
    private javax.swing.JButton btn_SalirVerEquiposUsuario;
    private javax.swing.JButton btn_SalirVisualizacionTorneo;
    private javax.swing.JButton btn_SalirVisualizacionTorneoUsuario;
    private javax.swing.JButton btn_SalirVisualizarArbitros;
    private javax.swing.JButton btn_SalirVisualizarEntrenadores;
    private javax.swing.JButton btn_SalirVisualizarTorneo;
    private javax.swing.JButton btn_SiguentePartido;
    private javax.swing.JButton btn_VerArbitros;
    private javax.swing.JButton btn_VerEntrenadores;
    private javax.swing.JButton btn_VerEquipos;
    private javax.swing.JButton btn_VerJornadas;
    private javax.swing.JButton btn_VerTorneoParticipacion;
    private javax.swing.JButton btn_Verequipos;
    private javax.swing.JButton btn_VisualizarTorneo;
    private javax.swing.JButton btn_actualizartablaequipos;
    private javax.swing.JButton btn_actualizartablaequiposusuario;
    private javax.swing.JButton btn_admin;
    private javax.swing.JButton btn_modificarentrenador;
    private javax.swing.JButton btn_modificarjugador;
    private javax.swing.JButton btn_quinela;
    private javax.swing.JButton btn_salirmodificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_EquipoJugador;
    private javax.swing.JComboBox<String> cb_EquiposJornadaA;
    private javax.swing.JComboBox<String> cb_EquiposJornadaB;
    private javax.swing.JComboBox<String> cb_MultiplicadorA;
    private javax.swing.JComboBox<String> cb_MultiplicadorB;
    private javax.swing.JComboBox<String> cb_equipos;
    private javax.swing.JComboBox<String> cb_equiposusuario;
    private javax.swing.JCheckBox chkb_Equipo;
    private javax.swing.JCheckBox chkb_FechaNac;
    private javax.swing.JCheckBox chkb_Nombre;
    private javax.swing.JCheckBox chkb_Peso;
    private javax.swing.JCheckBox chkb_Tipo;
    private com.toedter.calendar.JDateChooser dc_FechaNacimiento;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel label_NumJornadaMenuApuestas;
    private javax.swing.JRadioButton rb_Empate;
    private javax.swing.JRadioButton rb_EquipoA;
    private javax.swing.JRadioButton rb_EquipoB;
    private javax.swing.JRadioButton rb_Reserva;
    private javax.swing.JRadioButton rb_Titular;
    private javax.swing.JSpinner spin_PesoJugador;
    private javax.swing.JSpinner spin_pesoarbitro;
    private javax.swing.JSpinner spin_pesoentrenador;
    private javax.swing.JTable tb_Arbitros;
    private javax.swing.JTable tb_ModificarArbitros;
    private javax.swing.JTable tb_ModificarEntrenadores;
    private javax.swing.JTable tb_ModificarJugador;
    private javax.swing.JTable tb_entrenadores;
    private javax.swing.JTable tb_equipos;
    private javax.swing.JTable tb_equiposusuario;
    private javax.swing.JTextField tf_IDJugador;
    private javax.swing.JTextField tf_MontoApuesta;
    private javax.swing.JTextField tf_NombreArbitro;
    private javax.swing.JTextField tf_NombreEntrenador;
    private javax.swing.JTextField tf_NombreJugador;
    private javax.swing.JTextField txt_ApuestaA;
    private javax.swing.JTextField txt_ApuestaB;
    private javax.swing.JTextField txt_ApuestaRealizada;
    private javax.swing.JTextField txt_EquipoQAposto;
    private javax.swing.JTextField txt_EquipoQGano;
    private javax.swing.JTextField txt_MultiplicadorSeleccionado;
    private javax.swing.JTextField txt_PorcentajeGanancia;
    // End of variables declaration//GEN-END:variables

    int PosicionEquipo = 0;
    int PosicionJugador = 0;
}//Fin de la clase
