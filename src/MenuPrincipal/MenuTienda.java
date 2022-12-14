/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MenuPrincipal;

import ProductosTienda.CatalogoProducto;
import UsuariosTienda.AgregarUsuario;


/**
 *
 * @author Antony Salcedo
 */
public class MenuTienda extends javax.swing.JFrame {

    private static MenuTienda menuTienda;
    /**
     * Creates new form Menu_1
     */
    private MenuTienda() {
        initComponents();
    }
    
    public static MenuTienda getInstance(){
        if(menuTienda==null)
            menuTienda=new MenuTienda();
        return menuTienda;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_1_Logo_Tienda = new javax.swing.JPanel();
        Logo_Tienda = new javax.swing.JLabel();
        Panel_2_Boton_Seleccion = new javax.swing.JPanel();
        btnRopa_0 = new javax.swing.JButton();
        btnCocina_1 = new javax.swing.JButton();
        btnJuguetes_2 = new javax.swing.JButton();
        btnTecnologia_3 = new javax.swing.JButton();
        Menu_Principal = new javax.swing.JMenuBar();
        Panel_Menu_Configuracion = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        Menu_Usuario = new javax.swing.JMenu();
        Perfil = new javax.swing.JMenuItem();
        Inicio = new javax.swing.JMenuItem();
        Crear = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        Panel_Menu_Carrito = new javax.swing.JMenu();
        Panel_Menu_Registro = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_1_Logo_Tienda.setLayout(new java.awt.GridLayout(1, 0));

        Logo_Tienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Dise??o sin t??tulo (1) (1).png"))); // NOI18N
        Panel_1_Logo_Tienda.add(Logo_Tienda);

        getContentPane().add(Panel_1_Logo_Tienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 412, 240));

        Panel_2_Boton_Seleccion.setLayout(new java.awt.GridLayout(0, 2, 5, 5));

        btnRopa_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/venta-online (1).png"))); // NOI18N
        btnRopa_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRopa_0ActionPerformed(evt);
            }
        });
        Panel_2_Boton_Seleccion.add(btnRopa_0);

        btnCocina_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/carton-de-huevos (1).png"))); // NOI18N
        btnCocina_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCocina_1ActionPerformed(evt);
            }
        });
        Panel_2_Boton_Seleccion.add(btnCocina_1);

        btnJuguetes_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/control-de-juego (1).png"))); // NOI18N
        btnJuguetes_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuguetes_2ActionPerformed(evt);
            }
        });
        Panel_2_Boton_Seleccion.add(btnJuguetes_2);

        btnTecnologia_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/tienda-online (1).png"))); // NOI18N
        btnTecnologia_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTecnologia_3ActionPerformed(evt);
            }
        });
        Panel_2_Boton_Seleccion.add(btnTecnologia_3);

        getContentPane().add(Panel_2_Boton_Seleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 242, 412, 270));

        Panel_Menu_Configuracion.setText("Men??.");

        jMenuItem3.setText("Inicio.");
        Panel_Menu_Configuracion.add(jMenuItem3);

        Menu_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/perfil (1).png"))); // NOI18N
        Menu_Usuario.setText("Usuario.");

        Perfil.setText("Invitado");
        Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfilActionPerformed(evt);
            }
        });
        Menu_Usuario.add(Perfil);

        Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Correo.png"))); // NOI18N
        Inicio.setText("Iniciar sesion.");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        Menu_Usuario.add(Inicio);

        Crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Redes.png"))); // NOI18N
        Crear.setText("Crear usuario.");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        Menu_Usuario.add(Crear);

        Panel_Menu_Configuracion.add(Menu_Usuario);

        Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, 0));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Salir.jpg"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Panel_Menu_Configuracion.add(Salir);

        Menu_Principal.add(Panel_Menu_Configuracion);

        Panel_Menu_Carrito.setText("Carrito Compras.");
        Panel_Menu_Carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Panel_Menu_CarritoActionPerformed(evt);
            }
        });
        Menu_Principal.add(Panel_Menu_Carrito);

        Panel_Menu_Registro.setText("Configuraci??n.");

        jMenu1.setText("Mostrar.");

        jMenuItem1.setText("Usuarios.");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Productos.");
        jMenu1.add(jMenuItem2);

        Panel_Menu_Registro.add(jMenu1);

        Menu_Principal.add(Panel_Menu_Registro);

        setJMenuBar(Menu_Principal);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTecnologia_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecnologia_3ActionPerformed
        // TODO add your handling code here:
        CatalogoProducto tecnologia =CatalogoProducto.getInstance();
        tecnologia.SeleccionTituloCatalogo(3);
        tecnologia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTecnologia_3ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        // TODO add your handling code here:
        InicioSesion interfaz = InicioSesion.getInstance();
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_InicioActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        // TODO add your handling code here:
        AgregarUsuario interfaz = AgregarUsuario.getInstance();
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CrearActionPerformed

    private void PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PerfilActionPerformed

    private void btnRopa_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRopa_0ActionPerformed
        // TODO add your handling code here:
        CatalogoProducto ropa =CatalogoProducto.getInstance();
        ropa.SeleccionTituloCatalogo(0);
        ropa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRopa_0ActionPerformed

    private void btnCocina_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCocina_1ActionPerformed
        // TODO add your handling code here:
        CatalogoProducto cocina =CatalogoProducto.getInstance();
        cocina.SeleccionTituloCatalogo(1);
        cocina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCocina_1ActionPerformed

    private void btnJuguetes_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuguetes_2ActionPerformed
        // TODO add your handling code here:
        CatalogoProducto Juguetes =CatalogoProducto.getInstance();
        Juguetes.SeleccionTituloCatalogo(2);
        Juguetes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnJuguetes_2ActionPerformed

    private void Panel_Menu_CarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Panel_Menu_CarritoActionPerformed
        // TODO add your handling code here:
        new MostrarCompra().setVisible(true);
    }//GEN-LAST:event_Panel_Menu_CarritoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Crear;
    private javax.swing.JMenuItem Inicio;
    private javax.swing.JLabel Logo_Tienda;
    private javax.swing.JMenuBar Menu_Principal;
    private javax.swing.JMenu Menu_Usuario;
    private javax.swing.JPanel Panel_1_Logo_Tienda;
    private javax.swing.JPanel Panel_2_Boton_Seleccion;
    private javax.swing.JMenu Panel_Menu_Carrito;
    private javax.swing.JMenu Panel_Menu_Configuracion;
    private javax.swing.JMenu Panel_Menu_Registro;
    private javax.swing.JMenuItem Perfil;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JButton btnCocina_1;
    private javax.swing.JButton btnJuguetes_2;
    private javax.swing.JButton btnRopa_0;
    private javax.swing.JButton btnTecnologia_3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
