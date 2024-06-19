package Vista;

import DAO.GenerarPDF_Productos;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterFrameGestionarProductos extends javax.swing.JInternalFrame {
    
    public InterFrameGestionarProductos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreProd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        datecFechaVenc = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPrecioProd = new javax.swing.JTextField();
        txtIDProductos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescripcionProd = new javax.swing.JTextArea();
        txtStockProd = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbxProveedor = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jlblCantidadregistros = new javax.swing.JLabel();
        btnGenerarPDF = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gestionar Productos");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTIONAR PRODUCTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 290, 43));

        jPanel2.setBackground(new java.awt.Color(0, 133, 133));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblProductos);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 210));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 850, 230));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 160, 50));

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/update.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, 50));

        jPanel3.setBackground(new java.awt.Color(0, 133, 133));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("PRECIO:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        txtNombreProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProdActionPerformed(evt);
            }
        });
        jPanel3.add(txtNombreProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 210, 40));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("DESCRIPCION:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("STOCK:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("PROVEEDOR:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("ID:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel3.add(datecFechaVenc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 210, 40));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("VENCIMIENTO:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("FECHA DE");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel3.add(txtPrecioProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 190, 40));
        jPanel3.add(txtIDProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 210, 40));

        txaDescripcionProd.setColumns(20);
        txaDescripcionProd.setRows(5);
        jScrollPane1.setViewportView(txaDescripcionProd);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 190, 100));

        txtStockProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockProdActionPerformed(evt);
            }
        });
        jPanel3.add(txtStockProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 190, 40));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("NOMBRE:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jPanel3.add(cbxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 210, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 690, 250));

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/register.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 50));

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/follow-up.png"))); // NOI18N
        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 160, 50));

        jlblCantidadregistros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblCantidadregistros.setText("Cantidad de Registros :");
        jPanel1.add(jlblCantidadregistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, -1, -1));

        btnGenerarPDF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGenerarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pdf.png"))); // NOI18N
        btnGenerarPDF.setText("EXPORTAR");
        btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtNombreProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProdActionPerformed

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
        GenerarPDF_Productos reporte = new GenerarPDF_Productos();
        try {
            reporte.GenerarPDFProductos();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InterFrameGestionarProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGenerarPDFActionPerformed

    private void txtStockProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockProdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnConsultar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGenerarPDF;
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JComboBox<String> cbxProveedor;
    public com.toedter.calendar.JDateChooser datecFechaVenc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel jlblCantidadregistros;
    public javax.swing.JTable tblProductos;
    public javax.swing.JTextArea txaDescripcionProd;
    public javax.swing.JTextField txtIDProductos;
    public javax.swing.JTextField txtNombreProd;
    public javax.swing.JTextField txtPrecioProd;
    public javax.swing.JTextField txtStockProd;
    // End of variables declaration//GEN-END:variables
}
