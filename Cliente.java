package vista;

import com.mysql.jdbc.PreparedStatement;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Cliente extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet rs;

    Connection Conexion = null;

    public static final String URL = "jdbc:mysql://localhost:3306/bd";
    public static final String usuario = "root";
    public static final String contraseña = "";

    public static Connection getConnection() {
        Connection Conexion = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection(URL, usuario, contraseña);

        } catch (Exception e) {
            System.err.println("e");
        }
        return Conexion;
    }

    public Cliente() {
        initComponents();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
         txtId.setVisible(false);

    }

    private void Limpiarcaja() {
        combTipo.setSelectedIndex(0);
        txtDocumento.setText(null);
        txtNombre.setText(null);
        txtApellidoCliente.setText(null);
        txtDirrecionCliente.setText(null);
        txtTelefonoCliente.setText(null);
        TxtCorreo.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnDatoscliente = new javax.swing.JPanel();
        txtDocumento = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        txtDirrecionCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        labTipo = new javax.swing.JLabel();
        lbTelefono = new javax.swing.JLabel();
        lbicono = new javax.swing.JLabel();
        lbNombreCliente = new javax.swing.JLabel();
        lbDocumentos = new javax.swing.JLabel();
        lbDirrecion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        combTipo = new javax.swing.JComboBox<>();
        btnEliminarCliente = new javax.swing.JButton();
        BtnGuardarCliente = new javax.swing.JButton();
        lbApellidocliente = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtApellidoCliente = new javax.swing.JTextField();
        lbCorreo = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        labTipo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("Cliente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(558, 558, 558))
        );

        pnDatoscliente.setBackground(new java.awt.Color(255, 255, 255));
        pnDatoscliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 24))); // NOI18N
        pnDatoscliente.setAutoscrolls(true);

        txtDocumento.setMaximumSize(new java.awt.Dimension(20, 20));
        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });
        txtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDocumentoKeyPressed(evt);
            }
        });

        TxtCorreo.setMaximumSize(new java.awt.Dimension(20, 20));
        TxtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCorreoActionPerformed(evt);
            }
        });

        txtDirrecionCliente.setMaximumSize(new java.awt.Dimension(20, 20));
        txtDirrecionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirrecionClienteActionPerformed(evt);
            }
        });
        txtDirrecionCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDirrecionClienteKeyPressed(evt);
            }
        });

        txtTelefonoCliente.setMaximumSize(new java.awt.Dimension(20, 20));
        txtTelefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoClienteActionPerformed(evt);
            }
        });
        txtTelefonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoClienteKeyPressed(evt);
            }
        });

        labTipo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labTipo.setText("Tipo");

        lbTelefono.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lbTelefono.setText("Telefono");

        lbicono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes.png"))); // NOI18N

        lbNombreCliente.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lbNombreCliente.setText("Nombre");

        lbDocumentos.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lbDocumentos.setText("Documento");

        lbDirrecion.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lbDirrecion.setText("Dirrecion");

        txtNombre.setMaximumSize(new java.awt.Dimension(20, 20));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        combTipo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        combTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Identidad", "CC", "TI", "Extrajero" }));
        combTipo.setMaximumSize(new java.awt.Dimension(20, 20));
        combTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combTipoActionPerformed(evt);
            }
        });
        combTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combTipoKeyPressed(evt);
            }
        });

        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        BtnGuardarCliente.setText("Guardar");
        BtnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarClienteActionPerformed(evt);
            }
        });

        lbApellidocliente.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lbApellidocliente.setText("Apellido");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        txtApellidoCliente.setMaximumSize(new java.awt.Dimension(20, 20));
        txtApellidoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoClienteActionPerformed(evt);
            }
        });
        txtApellidoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoClienteKeyPressed(evt);
            }
        });

        lbCorreo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lbCorreo.setText("Correo");

        txtId.setMaximumSize(new java.awt.Dimension(20, 20));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        labTipo1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labTipo1.setText("© Todos los derechos 2022");

        javax.swing.GroupLayout pnDatosclienteLayout = new javax.swing.GroupLayout(pnDatoscliente);
        pnDatoscliente.setLayout(pnDatosclienteLayout);
        pnDatosclienteLayout.setHorizontalGroup(
            pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDatosclienteLayout.createSequentialGroup()
                .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDatosclienteLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbApellidocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbDirrecion, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbicono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnDatosclienteLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(BtnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDatosclienteLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDatosclienteLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellidoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDirrecionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnDatosclienteLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnDatosclienteLayout.createSequentialGroup()
                            .addComponent(lbDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDatosclienteLayout.createSequentialGroup()
                            .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(38, 38, 38)
                            .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(13, 13, 13)))
                    .addGroup(pnDatosclienteLayout.createSequentialGroup()
                        .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(pnDatosclienteLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(labTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnDatosclienteLayout.setVerticalGroup(
            pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDatosclienteLayout.createSequentialGroup()
                .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDatosclienteLayout.createSequentialGroup()
                        .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnDatosclienteLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnDatosclienteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbicono, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labTipo)
                            .addComponent(combTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDatosclienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnDatosclienteLayout.createSequentialGroup()
                                .addComponent(lbDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(pnDatosclienteLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(24, 24, 24)))
                        .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDatosclienteLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnDatosclienteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbApellidocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnDatosclienteLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtApellidoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDirrecion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDirrecionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(pnDatosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addComponent(labTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnDatoscliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnDatoscliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoClienteActionPerformed

    private void BtnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarClienteActionPerformed
        try {
            Connection cn = getConnection();
            ps = (PreparedStatement) cn.prepareStatement("INSERT INTO cliente(id,documento,tipodocumento,nombre,apellido,direccion,telefono,correo)VALUES(?,?,?,?,?,?,?,?)");
            ps.setInt(1, 0);
            ps.setString(2, txtDocumento.getText());
            ps.setString(3, combTipo.getSelectedItem().toString());
            ps.setString(4, txtNombre.getText());
            ps.setString(5, txtApellidoCliente.getText());
            ps.setString(6, txtDirrecionCliente.getText());
            ps.setString(7, txtTelefonoCliente.getText());
             ps.setString(8, TxtCorreo.getText());
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Guardado Cliente");
                Limpiarcaja();
            } else {
                JOptionPane.showMessageDialog(null, "NO se Guardo Cliente ");
                Limpiarcaja();
            }
            cn.close();
        } catch (Exception e) {
            System.err.println();
        }


    }//GEN-LAST:event_BtnGuardarClienteActionPerformed


    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTelefonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoClienteActionPerformed

    private void txtDirrecionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirrecionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirrecionClienteActionPerformed

    private void TxtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCorreoActionPerformed

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
 try {
            Connection cn = getConnection();
            ps = (PreparedStatement) cn.prepareStatement("UPDATE cliente SET documento=?,tipodocumento=?,nombre=?,apellido=?,direccion=?,telefono=?,correo=? WHERE id=?");
           
            ps.setString(1, txtDocumento.getText());
            ps.setString(2, combTipo.getSelectedItem().toString());
            ps.setString(3, txtNombre.getText());
            ps.setString(4, txtApellidoCliente.getText());
            ps.setString(5, txtDirrecionCliente.getText());
            ps.setString(6, txtTelefonoCliente.getText());
             ps.setString(7, TxtCorreo.getText());
             ps.setString(8, txtId.getText());
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "modificado Cliente");
                Limpiarcaja();
            } else {
                JOptionPane.showMessageDialog(null, "NO se Modifico");
                Limpiarcaja();
            }
            cn.close();
        } catch (Exception e) {
            System.err.println();
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
      try {
            Connection cn = getConnection();
            ps = (PreparedStatement) cn.prepareStatement("DELETE FROM cliente WHERE id=?");
            ps.setString(1,(txtId.getText()));
             int rs = ps.executeUpdate();
            if (rs>0) {
               JOptionPane.showMessageDialog(null, "Elimino ");
            } else {
                JOptionPane.showMessageDialog(null, "No se Elimino");
            }
            cn.close();
        } catch (Exception e) {
            System.err.println(e);;
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {
            Connection cn = getConnection();
            ps = (PreparedStatement) cn.prepareStatement("SELECT *FROM  cliente WHERE documento = ?");
            ps.setString(1,txtDocumento.getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                
                combTipo.setSelectedItem(rs.getString("tipodocumento"));
                txtNombre.setText(rs.getString("nombre"));
                txtApellidoCliente.setText(rs.getString("apellido"));
                txtDirrecionCliente.setText(rs.getString("direccion"));
                txtTelefonoCliente.setText(rs.getString("telefono"));
                 TxtCorreo.setText(rs.getString("correo"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro ");
            }
            cn.close();
        } catch (Exception e) {
            System.err.println(e);;
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void combTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combTipoActionPerformed
   
   // TODO add your handling code here:
    }//GEN-LAST:event_combTipoActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
            txtApellidoCliente.requestFocus();
            
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void combTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combTipoKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            txtNombre.requestFocus();
            
            
        }
    }//GEN-LAST:event_combTipoKeyPressed

    private void txtApellidoClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoClienteKeyPressed
          if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            txtDirrecionCliente.requestFocus();
    }//GEN-LAST:event_txtApellidoClienteKeyPressed
    }
    private void txtDirrecionClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirrecionClienteKeyPressed
          if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            txtDocumento.requestFocus();
          }
    }//GEN-LAST:event_txtDirrecionClienteKeyPressed

    private void txtDocumentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDocumentoKeyPressed
         if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            TxtCorreo.requestFocus();
         }
    }//GEN-LAST:event_txtDocumentoKeyPressed

    private void txtTelefonoClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoClienteKeyPressed
         if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
           combTipo.requestFocus();
    }//GEN-LAST:event_txtTelefonoClienteKeyPressed
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnGuardarCliente;
    public javax.swing.JTextField TxtCorreo;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEliminarCliente;
    public javax.swing.JButton btnModificar;
    public javax.swing.JComboBox<String> combTipo;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel labTipo;
    public javax.swing.JLabel labTipo1;
    public javax.swing.JLabel lbApellidocliente;
    public javax.swing.JLabel lbCorreo;
    public javax.swing.JLabel lbDirrecion;
    public javax.swing.JLabel lbDocumentos;
    public javax.swing.JLabel lbNombreCliente;
    public javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbicono;
    public javax.swing.JPanel pnDatoscliente;
    public javax.swing.JTextField txtApellidoCliente;
    public javax.swing.JTextField txtDirrecionCliente;
    public javax.swing.JTextField txtDocumento;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
