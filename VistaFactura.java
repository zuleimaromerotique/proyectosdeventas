
package vista;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.SQLException;
import javax.swing.JFileChooser;

/**
 *
 * @author zulei
 */
public class VistaFactura extends javax.swing.JFrame {

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

    String fecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());

    private void limpiarCajas() {
        txtClienteFactura.setText(null);
        txtVendedorFactura.setText(null);
        txtCantidadproducto1.setText(null);
        txtFechaFactura.setText(null);
        txtTotalFactura1.setText(null);
        txtIVA.setText(null);
        txtsubtotal.setText(null);
        txtTotalResl.setText(null);
        txtPrecioFactura2.setText(null);
        txtPrecioFactura1.setText(null);
        txtTotalFactura2.setText(null);
        txtproducto1.setText(null);
        txtproducto2.setText(null);
        txtcantidadproducto2.setText(null);

    }

    public VistaFactura() {
        initComponents();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);

        txtFechaFactura.setText(fecha);
        txtFechaFactura.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnEncabezado = new javax.swing.JPanel();
        lbFacturaEncabezado = new javax.swing.JLabel();
        fechaHora = new javax.swing.JLabel();
        pnFactura2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbFechaYhoraFactu = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        lbClienFactura = new javax.swing.JLabel();
        lbVendedoFactura = new javax.swing.JLabel();
        lbEncaProduFactu = new javax.swing.JLabel();
        lbProductoFactura = new javax.swing.JLabel();
        lbPrecioProFactura = new javax.swing.JLabel();
        txtVendedorFactura = new javax.swing.JTextField();
        lbCantidadProductos = new javax.swing.JLabel();
        sepradoProductoFactura = new javax.swing.JSeparator();
        txtcantidadproducto2 = new javax.swing.JTextField();
        txtClienteFactura = new javax.swing.JTextField();
        txtPrecioFactura2 = new javax.swing.JTextField();
        txtFechaFactura = new javax.swing.JTextField();
        txtproducto1 = new javax.swing.JTextField();
        txtTotalFactura1 = new javax.swing.JTextField();
        btnBuscarFactura = new javax.swing.JButton();
        Total = new javax.swing.JLabel();
        btnGuardarFactu = new javax.swing.JButton();
        btnReporteFactura1 = new javax.swing.JButton();
        txtCantidadproducto1 = new javax.swing.JTextField();
        txtPrecioFactura1 = new javax.swing.JTextField();
        pnFactura1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbRegistroFactura1 = new javax.swing.JLabel();
        lbDerechAutor1 = new javax.swing.JLabel();
        lbPrecioProFactura4 = new javax.swing.JLabel();
        txtproducto2 = new javax.swing.JTextField();
        txtTotalFactura2 = new javax.swing.JTextField();
        txtsubtotal = new javax.swing.JTextField();
        lbPrecioProFactura1 = new javax.swing.JLabel();
        txtTotalResl = new javax.swing.JTextField();
        lbPrecioProFactura2 = new javax.swing.JLabel();
        lbPrecioProFactura3 = new javax.swing.JLabel();
        txtIVA = new javax.swing.JTextField();
        btnselecionaFactura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnEncabezado.setBackground(new java.awt.Color(102, 204, 255));
        pnEncabezado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lbFacturaEncabezado.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbFacturaEncabezado.setText("Factura");

        fechaHora.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnEncabezadoLayout = new javax.swing.GroupLayout(pnEncabezado);
        pnEncabezado.setLayout(pnEncabezadoLayout);
        pnEncabezadoLayout.setHorizontalGroup(
            pnEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFacturaEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(fechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(579, Short.MAX_VALUE))
        );
        pnEncabezadoLayout.setVerticalGroup(
            pnEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbFacturaEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addGroup(pnEncabezadoLayout.createSequentialGroup()
                .addComponent(fechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnFactura2.setBackground(new java.awt.Color(255, 255, 255));
        pnFactura2.setToolTipText("");

        lbFechaYhoraFactu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbFechaYhoraFactu.setText("Fecha y Hora");
        lbFechaYhoraFactu.setToolTipText("");

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel19.setText("Productos Facturas");

        jLabel20.setText("Registro");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        lbClienFactura.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbClienFactura.setText("Cliente");
        lbClienFactura.setToolTipText("");

        lbVendedoFactura.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbVendedoFactura.setText("Vendedor");
        lbVendedoFactura.setToolTipText("");

        lbEncaProduFactu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbEncaProduFactu.setText("PRODUCTO");

        lbProductoFactura.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lbProductoFactura.setText("Producto");

        lbPrecioProFactura.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbPrecioProFactura.setText("IVA");

        txtVendedorFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendedorFacturaActionPerformed(evt);
            }
        });

        lbCantidadProductos.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lbCantidadProductos.setText("Cantidad");

        txtcantidadproducto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadproducto2ActionPerformed(evt);
            }
        });

        txtClienteFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteFacturaActionPerformed(evt);
            }
        });

        txtPrecioFactura2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioFactura2ActionPerformed(evt);
            }
        });

        txtFechaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaFacturaActionPerformed(evt);
            }
        });

        txtproducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproducto1ActionPerformed(evt);
            }
        });

        txtTotalFactura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalFactura1ActionPerformed(evt);
            }
        });

        btnBuscarFactura.setText("Buscar");
        btnBuscarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFacturaActionPerformed(evt);
            }
        });

        Total.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        Total.setText("Total");

        btnGuardarFactu.setText("Guadar");
        btnGuardarFactu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarFactuActionPerformed(evt);
            }
        });

        btnReporteFactura1.setText("Imprimir");
        btnReporteFactura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteFactura1ActionPerformed(evt);
            }
        });

        txtCantidadproducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadproducto1ActionPerformed(evt);
            }
        });

        txtPrecioFactura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioFactura1ActionPerformed(evt);
            }
        });

        pnFactura1.setBackground(new java.awt.Color(255, 255, 255));

        lbRegistroFactura1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbRegistroFactura1.setText("Registro");

        lbDerechAutor1.setText("© Todos los Derechos Reservados 2022");

        lbPrecioProFactura4.setText("© Todos los derechos 2022");

        javax.swing.GroupLayout pnFactura1Layout = new javax.swing.GroupLayout(pnFactura1);
        pnFactura1.setLayout(pnFactura1Layout);
        pnFactura1Layout.setHorizontalGroup(
            pnFactura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFactura1Layout.createSequentialGroup()
                .addContainerGap(362, Short.MAX_VALUE)
                .addComponent(lbDerechAutor1)
                .addGap(380, 380, 380)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnFactura1Layout.createSequentialGroup()
                .addGroup(pnFactura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFactura1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lbRegistroFactura1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFactura1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lbPrecioProFactura4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnFactura1Layout.setVerticalGroup(
            pnFactura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFactura1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbPrecioProFactura4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel10)
                .addGap(57, 57, 57)
                .addComponent(lbRegistroFactura1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(lbDerechAutor1)
                .addGap(138, 138, 138))
        );

        txtproducto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproducto2ActionPerformed(evt);
            }
        });

        txtTotalFactura2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalFactura2ActionPerformed(evt);
            }
        });

        txtsubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubtotalActionPerformed(evt);
            }
        });

        lbPrecioProFactura1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lbPrecioProFactura1.setText("Precio");

        txtTotalResl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalReslActionPerformed(evt);
            }
        });

        lbPrecioProFactura2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbPrecioProFactura2.setText("SUBTOTAL");

        lbPrecioProFactura3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbPrecioProFactura3.setText("TOTAL");

        txtIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIVAActionPerformed(evt);
            }
        });

        btnselecionaFactura.setText("Resultado");
        btnselecionaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselecionaFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnFactura2Layout = new javax.swing.GroupLayout(pnFactura2);
        pnFactura2.setLayout(pnFactura2Layout);
        pnFactura2Layout.setHorizontalGroup(
            pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFactura2Layout.createSequentialGroup()
                .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnFactura2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnFactura2Layout.createSequentialGroup()
                                .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(pnFactura2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(lbClienFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtClienteFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(lbVendedoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtVendedorFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(114, 114, 114))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnFactura2Layout.createSequentialGroup()
                                        .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pnFactura2Layout.createSequentialGroup()
                                                    .addGap(33, 33, 33)
                                                    .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(txtCantidadproducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtcantidadproducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(lbCantidadProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbEncaProduFactu, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(30, 30, 30)
                                                    .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(lbPrecioProFactura1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtPrecioFactura2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                                        .addComponent(txtPrecioFactura1)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbPrecioProFactura3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbPrecioProFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(pnFactura2Layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(btnGuardarFactu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(45, 45, 45)
                                        .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnFactura2Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(lbProductoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtproducto1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                                .addComponent(txtproducto2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                                            .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtTotalResl, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                                .addComponent(txtIVA, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtsubtotal, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(btnselecionaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnFactura2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lbFechaYhoraFactu, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnFactura2Layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTotalFactura1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTotalFactura2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnReporteFactura1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnFactura2Layout.createSequentialGroup()
                                .addComponent(btnBuscarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnFactura2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)))
                .addGap(201, 201, 201))
            .addGroup(pnFactura2Layout.createSequentialGroup()
                .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFactura2Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(pnFactura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFactura2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sepradoProductoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnFactura2Layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(963, Short.MAX_VALUE)))
            .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnFactura2Layout.createSequentialGroup()
                    .addGap(313, 313, 313)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(771, Short.MAX_VALUE)))
            .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnFactura2Layout.createSequentialGroup()
                    .addGap(240, 240, 240)
                    .addComponent(lbPrecioProFactura2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(826, Short.MAX_VALUE)))
        );
        pnFactura2Layout.setVerticalGroup(
            pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFactura2Layout.createSequentialGroup()
                .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFactura2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2))
                    .addGroup(pnFactura2Layout.createSequentialGroup()
                        .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnFactura2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnFactura2Layout.createSequentialGroup()
                                        .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lbClienFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbVendedoFactura)
                                            .addComponent(txtClienteFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtVendedorFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(9, 9, 9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFactura2Layout.createSequentialGroup()
                                        .addComponent(lbFechaYhoraFactu)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                            .addGroup(pnFactura2Layout.createSequentialGroup()
                                .addComponent(txtFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(btnBuscarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sepradoProductoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEncaProduFactu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFactura2Layout.createSequentialGroup()
                        .addComponent(lbCantidadProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantidadproducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFactura2Layout.createSequentialGroup()
                        .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbProductoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPrecioProFactura1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPrecioFactura1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtproducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTotalFactura1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcantidadproducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioFactura2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtproducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalFactura2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbPrecioProFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnFactura2Layout.createSequentialGroup()
                        .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrecioProFactura3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalResl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarFactu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnselecionaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteFactura1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnFactura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFactura2Layout.createSequentialGroup()
                    .addContainerGap(1316, Short.MAX_VALUE)
                    .addComponent(jLabel19)
                    .addGap(71, 71, 71)))
            .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFactura2Layout.createSequentialGroup()
                    .addContainerGap(1347, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)))
            .addGroup(pnFactura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnFactura2Layout.createSequentialGroup()
                    .addGap(267, 267, 267)
                    .addComponent(lbPrecioProFactura2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1111, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnFactura2, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnFactura2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioFactura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioFactura1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioFactura1ActionPerformed
     
    private void txtCantidadproducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadproducto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadproducto1ActionPerformed

    private void btnReporteFactura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteFactura1ActionPerformed
       JFileChooser dlg =new JFileChooser();
       int Option = dlg.showSaveDialog(this);
       
       if(Option == JFileChooser.APPROVE_OPTION){
        File f= dlg.getSelectedFile();
        String f1=f.toString();
        
    }
       
       
    }//GEN-LAST:event_btnReporteFactura1ActionPerformed

    private void btnGuardarFactuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarFactuActionPerformed
        Connection Conexion = null;
        try {
            Conexion = getConnection();
            ps = (PreparedStatement) Conexion.prepareStatement("INSERT INTO facturas(id,cliente,Vendedor,descripcion,fecha,total)VALUES(?,?,?,?,?,?)");
            ps.setInt(1, 0);
            ps.setString(2, txtClienteFactura.getText());
            ps.setString(3, txtVendedorFactura.getText());
            ps.setString(4, txtproducto1.getText());
            ps.setString(5, txtFechaFactura.getText());
            ps.setString(6, txtTotalFactura2.getText());
            int res = ps.executeUpdate();
            if (res > 0) {

                JOptionPane.showMessageDialog(null, " Guardado");
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "error al Guardado");
                limpiarCajas();
            }
            Conexion.close();
        } catch (Exception e) {
            System.err.println(e);

        }
    }//GEN-LAST:event_btnGuardarFactuActionPerformed
    
    private void btnBuscarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFacturaActionPerformed
        Connection Conexion = null;

        try {
            Conexion = getConnection();
            ps = (PreparedStatement) Conexion.prepareStatement("SELECT *FROM  facturas WHERE cliente=?");
            if (rs.next()) {
                txtClienteFactura.setText(rs.getString("cliente"));
                txtVendedorFactura.setText(rs.getString("Vendedor"));
                txtproducto1.setText(rs.getString("descripcion"));
                txtFechaFactura.setText(rs.getString("fecha"));
                txtTotalResl.setText(rs.getString("total"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro ");
            }

        } catch (Exception e) {
            System.err.println(e);

        }
    }//GEN-LAST:event_btnBuscarFacturaActionPerformed

    private void txtTotalFactura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalFactura1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalFactura1ActionPerformed

    private void txtproducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproducto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproducto1ActionPerformed

    private void txtFechaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaFacturaActionPerformed

    private void txtPrecioFactura2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioFactura2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioFactura2ActionPerformed

    private void txtClienteFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteFacturaActionPerformed

    private void txtcantidadproducto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadproducto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadproducto2ActionPerformed

    private void txtVendedorFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendedorFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVendedorFacturaActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void txtproducto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproducto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproducto2ActionPerformed

    private void txtTotalFactura2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalFactura2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalFactura2ActionPerformed

    private void txtsubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubtotalActionPerformed

    private void txtTotalReslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalReslActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalReslActionPerformed

    private void txtIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIVAActionPerformed

    private void btnselecionaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselecionaFacturaActionPerformed
        double pro1, pro2, valo1, valo2, vatol1, vatol2, subtotal, iva, valorapagar;
        pro1 = Double.parseDouble(txtCantidadproducto1.getText());
        pro2 = Double.parseDouble(txtcantidadproducto2.getText());
        valo1 = Double.parseDouble(txtPrecioFactura1.getText());
        valo2 = Double.parseDouble(txtPrecioFactura2.getText());
        vatol1=pro1*valo1;
        vatol2=  pro2*valo2;
        String valt1=vatol1+"";
        String valt2=vatol2+"";
        txtTotalFactura1.setText(valt1);
          txtTotalFactura2.setText(valt2);
          subtotal=vatol1+vatol2;
          String sT=subtotal+"";
          txtsubtotal.setText(sT);
          iva=subtotal*0.19;
          String IV=iva+"";
          txtIVA.setText(IV);
          valorapagar=subtotal+iva;
          String vp=valorapagar+"";
          txtTotalResl.setText(vp);
          
          
    }//GEN-LAST:event_btnselecionaFacturaActionPerformed

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
            java.util.logging.Logger.getLogger(VistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Total;
    public javax.swing.JButton btnBuscarFactura;
    public javax.swing.JButton btnGuardarFactu;
    public javax.swing.JButton btnReporteFactura1;
    public javax.swing.JButton btnselecionaFactura;
    public javax.swing.JLabel fechaHora;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JTextField jTextField6;
    public javax.swing.JLabel lbCantidadProductos;
    public javax.swing.JLabel lbClienFactura;
    public javax.swing.JLabel lbDerechAutor1;
    public javax.swing.JLabel lbEncaProduFactu;
    private javax.swing.JLabel lbFacturaEncabezado;
    public javax.swing.JLabel lbFechaYhoraFactu;
    public javax.swing.JLabel lbPrecioProFactura;
    public javax.swing.JLabel lbPrecioProFactura1;
    public javax.swing.JLabel lbPrecioProFactura2;
    public javax.swing.JLabel lbPrecioProFactura3;
    public javax.swing.JLabel lbPrecioProFactura4;
    private javax.swing.JLabel lbProductoFactura;
    public javax.swing.JLabel lbRegistroFactura1;
    public javax.swing.JLabel lbVendedoFactura;
    public javax.swing.JPanel pnEncabezado;
    private javax.swing.JPanel pnFactura1;
    public javax.swing.JPanel pnFactura2;
    private javax.swing.JSeparator sepradoProductoFactura;
    public javax.swing.JTextField txtCantidadproducto1;
    public javax.swing.JTextField txtClienteFactura;
    public javax.swing.JTextField txtFechaFactura;
    public javax.swing.JTextField txtIVA;
    public javax.swing.JTextField txtPrecioFactura1;
    public javax.swing.JTextField txtPrecioFactura2;
    public javax.swing.JTextField txtTotalFactura1;
    public javax.swing.JTextField txtTotalFactura2;
    public javax.swing.JTextField txtTotalResl;
    public javax.swing.JTextField txtVendedorFactura;
    public javax.swing.JTextField txtcantidadproducto2;
    public javax.swing.JTextField txtproducto1;
    public javax.swing.JTextField txtproducto2;
    public javax.swing.JTextField txtsubtotal;
    // End of variables declaration//GEN-END:variables
}
