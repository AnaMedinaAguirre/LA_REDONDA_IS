package Vista;

public class Frm_Menu extends javax.swing.JFrame {

    public Frm_Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        MenuItemGestionarProveedores = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        MenuItemGestionarClientes = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        MenuItemGestionarProductos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        MenuItemGestionarTransaccion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuItemGestionarVentas = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        MenuItemCerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1380, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        getContentPane().add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 630));

        jMenu7.setBackground(new java.awt.Color(204, 204, 255));
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/employee.png"))); // NOI18N
        jMenu7.setText("Porveedores");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(210, 50));

        MenuItemGestionarProveedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuItemGestionarProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/personal.png"))); // NOI18N
        MenuItemGestionarProveedores.setText("Gestionar Proveedores");
        MenuItemGestionarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemGestionarProveedoresActionPerformed(evt);
            }
        });
        jMenu7.add(MenuItemGestionarProveedores);

        jMenuBar1.add(jMenu7);

        jMenu8.setBackground(new java.awt.Color(204, 204, 255));
        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/employee.png"))); // NOI18N
        jMenu8.setText("Clientes");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(210, 50));

        MenuItemGestionarClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuItemGestionarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/personal.png"))); // NOI18N
        MenuItemGestionarClientes.setText("Gestionar Clientes");
        MenuItemGestionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemGestionarClientesActionPerformed(evt);
            }
        });
        jMenu8.add(MenuItemGestionarClientes);

        jMenuBar1.add(jMenu8);

        jMenu5.setBackground(new java.awt.Color(204, 204, 255));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/register.png"))); // NOI18N
        jMenu5.setText("Productos");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(210, 50));

        MenuItemGestionarProductos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuItemGestionarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gestionTipoIncid.png"))); // NOI18N
        MenuItemGestionarProductos.setText("Gestionar Productos");
        MenuItemGestionarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemGestionarProductosActionPerformed(evt);
            }
        });
        jMenu5.add(MenuItemGestionarProductos);

        jMenuBar1.add(jMenu5);

        jMenu1.setBackground(new java.awt.Color(204, 204, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TRANSACCIOON.png"))); // NOI18N
        jMenu1.setText("Transacción");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(210, 50));

        MenuItemGestionarTransaccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuItemGestionarTransaccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gestion.png"))); // NOI18N
        MenuItemGestionarTransaccion.setText("Gestionar Transacción");
        MenuItemGestionarTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemGestionarTransaccionActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemGestionarTransaccion);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(204, 204, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/export.png"))); // NOI18N
        jMenu2.setText("Inventario");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(210, 50));

        MenuItemGestionarVentas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuItemGestionarVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/newIncidencia.png"))); // NOI18N
        MenuItemGestionarVentas.setText("Gestionar Ventas");
        jMenu2.add(MenuItemGestionarVentas);

        jMenuBar1.add(jMenu2);

        jMenu10.setBackground(new java.awt.Color(204, 204, 255));
        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logout.png"))); // NOI18N
        jMenu10.setText("Cerrar Sesión");
        jMenu10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu10.setPreferredSize(new java.awt.Dimension(210, 50));

        MenuItemCerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuItemCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logout2.png"))); // NOI18N
        MenuItemCerrar.setText("Cerrar Sesión");
        MenuItemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCerrarActionPerformed(evt);
            }
        });
        jMenu10.add(MenuItemCerrar);

        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MenuItemCerrarActionPerformed

    private void MenuItemGestionarTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemGestionarTransaccionActionPerformed

    }//GEN-LAST:event_MenuItemGestionarTransaccionActionPerformed

    private void MenuItemGestionarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemGestionarProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemGestionarProductosActionPerformed

    private void MenuItemGestionarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemGestionarProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemGestionarProveedoresActionPerformed

    private void MenuItemGestionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemGestionarClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemGestionarClientesActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem MenuItemCerrar;
    public javax.swing.JMenuItem MenuItemGestionarClientes;
    public javax.swing.JMenuItem MenuItemGestionarProductos;
    public javax.swing.JMenuItem MenuItemGestionarProveedores;
    public javax.swing.JMenuItem MenuItemGestionarTransaccion;
    public javax.swing.JMenuItem MenuItemGestionarVentas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    public javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
