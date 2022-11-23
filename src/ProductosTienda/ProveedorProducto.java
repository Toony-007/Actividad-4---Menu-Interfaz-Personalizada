/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProductosTienda;

import MenuPrincipal.*;
import DAOtienda.DAOproductos;
import MenuPrincipal.MenuTienda;
import TiendaController.ProductosController;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson Diaz
 */
public class ProveedorProducto extends javax.swing.JFrame {

    private static ProveedorProducto proveedorProducto;
    
    /**
     * Creates new form proveedorProducto
     */
    private ProveedorProducto() {
        initComponents();
    }
    public static ProveedorProducto getInstance(){
        if(proveedorProducto == null)
            proveedorProducto=new ProveedorProducto();
        return proveedorProducto;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        txtNomProd = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        txtCodProd = new javax.swing.JTextField();
        cboTipo = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        txtPrecProd = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        txtDesProd = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        sliEst = new javax.swing.JSlider();
        spiEst = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registro Producto");
        getContentPane().add(jLabel5, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jPanel11.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("                                       ");
        jPanel11.add(jLabel1, java.awt.BorderLayout.LINE_START);

        jLabel2.setText("                                        ");
        jPanel11.add(jLabel2, java.awt.BorderLayout.LINE_END);

        jLabel3.setText("jLabel3");
        jLabel3.setToolTipText("");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel11.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel11);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre Producto (MAYUSCULA)"));
        jPanel9.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        txtNomProd.setText("Nombres");
        txtNomProd.setToolTipText("");
        txtNomProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomProdMouseClicked(evt);
            }
        });
        txtNomProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomProdActionPerformed(evt);
            }
        });
        txtNomProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomProdKeyTyped(evt);
            }
        });
        jPanel9.add(txtNomProd);

        jPanel1.add(jPanel9);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Referencia Producto"));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodProd.setText("Código Producto");
        txtCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdActionPerformed(evt);
            }
        });
        jPanel8.add(txtCodProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 310, 40));

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ropa", "Cocina", "Juguetes", "Tecnología" }));
        cboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoActionPerformed(evt);
            }
        });
        jPanel8.add(cboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel1.add(jPanel8);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio Producto"));
        jPanel6.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        txtPrecProd.setText("$$$$$$$$$$$$$$$$$$$$$$$$");
        txtPrecProd.setToolTipText("");
        txtPrecProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrecProdMouseClicked(evt);
            }
        });
        txtPrecProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecProdActionPerformed(evt);
            }
        });
        txtPrecProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecProdKeyTyped(evt);
            }
        });
        jPanel6.add(txtPrecProd);

        jPanel1.add(jPanel6);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripción Producto"));
        jPanel10.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        txtDesProd.setText("Descripción");
        txtDesProd.setToolTipText("");
        txtDesProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDesProdMouseClicked(evt);
            }
        });
        txtDesProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesProdActionPerformed(evt);
            }
        });
        txtDesProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDesProdKeyTyped(evt);
            }
        });
        jPanel10.add(txtDesProd);

        jPanel1.add(jPanel10);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Valoración"));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        sliEst.setMinorTickSpacing(10);
        sliEst.setPaintLabels(true);
        sliEst.setPaintTicks(true);
        sliEst.setSnapToTicks(true);
        sliEst.setToolTipText("0");
        sliEst.setValue(0);
        sliEst.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliEstStateChanged(evt);
            }
        });
        jPanel4.add(sliEst);

        spiEst.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(5.0f), Float.valueOf(1.0f)));
        spiEst.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiEstStateChanged(evt);
            }
        });
        jPanel4.add(spiEst);

        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setText("Guardar Progreso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1);

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2);

        getContentPane().add(jPanel7, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecProdMouseClicked
        // TODO add your handling code here:
        txtPrecProd.setText("");
    }//GEN-LAST:event_txtPrecProdMouseClicked

    private void txtPrecProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecProdKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())) evt.consume();
    }//GEN-LAST:event_txtPrecProdKeyTyped

    private void txtPrecProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecProdActionPerformed

    private void txtCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProdActionPerformed

    private void txtNomProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomProdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomProdMouseClicked

    private void txtNomProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomProdActionPerformed

    private void txtNomProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomProdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomProdKeyTyped

    private void txtDesProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDesProdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesProdMouseClicked

    private void txtDesProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesProdActionPerformed

    private void txtDesProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDesProdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesProdKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MenuTienda menuprincipal = MenuTienda.getInstance();
        menuprincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DAOproductos prodCont = ProductosController.getInstance();
        String nomproducto = txtNomProd.getText();
        String precproducto = txtPrecProd.getText();
        String codiproducto = txtCodProd.getText();
        String descproducto = txtDesProd.getText();
        String Tipo = cboTipo.getSelectedItem().toString();
        String valproducto=spiEst.getValue().toString();
        String[] producto = {nomproducto, precproducto,codiproducto, descproducto, valproducto, Tipo};
        if(prodCont.GuardarProducto(producto))
            JOptionPane.showMessageDialog(this, "Guardado Exitoso");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sliEstStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliEstStateChanged
        // TODO add your handling code here:
        spiEst.setValue(sliEst.getValue());
    }//GEN-LAST:event_sliEstStateChanged

    private void spiEstStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiEstStateChanged
        // TODO add your handling code here:
        sliEst.setValue((int) Float.parseFloat(spiEst.getValue()+""));

    }//GEN-LAST:event_spiEstStateChanged

    private void cboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JSlider sliEst;
    private javax.swing.JSpinner spiEst;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JTextField txtDesProd;
    private javax.swing.JTextField txtNomProd;
    private javax.swing.JTextField txtPrecProd;
    // End of variables declaration//GEN-END:variables
}