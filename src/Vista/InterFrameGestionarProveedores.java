package Vista;

import DAO.GenerarPDF_Empleados;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterFrameGestionarProveedores extends javax.swing.JInternalFrame {
    
    public InterFrameGestionarProveedores() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCargoContacto = new javax.swing.JTextField();
        txtIDProveedores = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNombreContacto = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPagWeb = new javax.swing.JTextField();
        txtNombreCompania = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jlblCantidadregistros = new javax.swing.JLabel();
        btnGenerarPDF = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gestionar Proveedores");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTIONAR PROVEEDORES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 290, 43));

        jPanel2.setBackground(new java.awt.Color(0, 133, 133));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblProveedores);

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
        jLabel3.setText("CONTACTO:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("DIRECCIÓN:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("CONTACTO:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("ID:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        jPanel3.add(txtCargoContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 210, 40));
        jPanel3.add(txtIDProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 210, 40));

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel3.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 190, 40));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("COMPAÑÍA:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txtNombreContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreContactoActionPerformed(evt);
            }
        });
        jPanel3.add(txtNombreContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 210, 40));

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel3.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 190, 40));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText("TELÉFONO:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setText("PÁGINA WEB:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        txtPagWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagWebActionPerformed(evt);
            }
        });
        jPanel3.add(txtPagWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 190, 40));

        txtNombreCompania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCompaniaActionPerformed(evt);
            }
        });
        jPanel3.add(txtNombreCompania, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 210, 40));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setText("NOMBRE");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("NOMBRE");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("CARGO");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 690, 240));

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

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
        GenerarPDF_Empleados reporte = new GenerarPDF_Empleados();
        try {
            reporte.GenerarPDFIncidencias();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InterFrameGestionarProveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGenerarPDFActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtNombreContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreContactoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtPagWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagWebActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagWebActionPerformed

    private void txtNombreCompaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCompaniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCompaniaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnConsultar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGenerarPDF;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel jlblCantidadregistros;
    public javax.swing.JTable tblProveedores;
    public javax.swing.JTextField txtCargoContacto;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtIDProveedores;
    public javax.swing.JTextField txtNombreCompania;
    public javax.swing.JTextField txtNombreContacto;
    public javax.swing.JTextField txtPagWeb;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
