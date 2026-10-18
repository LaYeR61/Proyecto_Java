package view;

public class Clientes extends javax.swing.JFrame {

    public Clientes() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        txtBuscarGlobal = new javax.swing.JTextField();
        btnNotificaciones = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        pnlSidebar = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnProduccion = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnContactenos = new javax.swing.JButton();
        pnlMenuInferior = new javax.swing.JPanel();
        btnPerfil = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        pnlContenido = new javax.swing.JPanel();
        pnlTitulo = new javax.swing.JPanel();
        pnlTextoTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        btnNuevoCliente = new javax.swing.JButton();
        pnlCentro = new javax.swing.JPanel();
        pnlCliente = new javax.swing.JPanel();
        pnlAvatar = new javax.swing.JPanel();
        lblAvatar = new javax.swing.JLabel();
        pnlDatosCliente = new javax.swing.JPanel();
        lblNombreCliente = new javax.swing.JLabel();
        lblContactoCliente = new javax.swing.JLabel();
        lblEstadoCliente = new javax.swing.JLabel();
        tabsCliente = new javax.swing.JTabbedPane();
        tabPerfil = new javax.swing.JPanel();
        pnlPerfilSup = new javax.swing.JPanel();
        lblDatosPersonales = new javax.swing.JLabel();
        pnlCampos = new javax.swing.JPanel();
        pnlNombre = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        pnlCorreo = new javax.swing.JPanel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        pnlTelefono = new javax.swing.JPanel();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        pnlDireccion = new javax.swing.JPanel();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        pnlGuardar = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        tabHistorial = new javax.swing.JPanel();
        tabResenas = new javax.swing.JPanel();
        pnlInfo = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gambare - Clientes");
        setPreferredSize(new java.awt.Dimension(1280, 800));

        pnlHeader.setBackground(new java.awt.Color(76, 29, 149));
        pnlHeader.setPreferredSize(new java.awt.Dimension(100, 57));
        pnlHeader.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 16, 12));

        lblLogo.setText("GAMBARE");
        lblLogo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pnlHeader.add(lblLogo);

        txtBuscarGlobal.setText("Buscar...");
        txtBuscarGlobal.setPreferredSize(new java.awt.Dimension(380, 28));
        pnlHeader.add(txtBuscarGlobal);

        btnNotificaciones.setText("Notificaciones (3)");
        pnlHeader.add(btnNotificaciones);

        lblUsuario.setText("Usuario - Almacenista");
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        pnlHeader.add(lblUsuario);

        getContentPane().add(pnlHeader, java.awt.BorderLayout.PAGE_START);

        pnlSidebar.setBackground(new java.awt.Color(46, 16, 101));
        pnlSidebar.setPreferredSize(new java.awt.Dimension(220, 100));
        pnlSidebar.setLayout(new java.awt.BorderLayout());

        pnlMenu.setBackground(new java.awt.Color(46, 16, 101));
        pnlMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 4, 0, 4));
        pnlMenu.setPreferredSize(new java.awt.Dimension(220, 330));
        pnlMenu.setLayout(new java.awt.GridLayout(7, 1, 0, 8));

        btnHome.setBackground(new java.awt.Color(46, 16, 101));
        btnHome.setForeground(new java.awt.Color(196, 181, 253));
        btnHome.setText("Home");
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMenu.add(btnHome);

        btnInventario.setBackground(new java.awt.Color(46, 16, 101));
        btnInventario.setForeground(new java.awt.Color(196, 181, 253));
        btnInventario.setText("Inventario");
        btnInventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMenu.add(btnInventario);

        btnCompras.setBackground(new java.awt.Color(46, 16, 101));
        btnCompras.setForeground(new java.awt.Color(196, 181, 253));
        btnCompras.setText("Compras / Proveedores");
        btnCompras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMenu.add(btnCompras);

        btnProduccion.setBackground(new java.awt.Color(46, 16, 101));
        btnProduccion.setForeground(new java.awt.Color(196, 181, 253));
        btnProduccion.setText("Producción");
        btnProduccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMenu.add(btnProduccion);

        btnVentas.setBackground(new java.awt.Color(46, 16, 101));
        btnVentas.setForeground(new java.awt.Color(196, 181, 253));
        btnVentas.setText("Ventas / Pedidos");
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        pnlMenu.add(btnVentas);

        btnClientes.setText("Clientes");
        btnClientes.setBackground(new java.awt.Color(124, 58, 237));
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMenu.add(btnClientes);

        btnContactenos.setText("Contáctenos");
        btnContactenos.setBackground(new java.awt.Color(46, 16, 101));
        btnContactenos.setForeground(new java.awt.Color(196, 181, 253));
        btnContactenos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMenu.add(btnContactenos);

        pnlSidebar.add(pnlMenu, java.awt.BorderLayout.PAGE_START);

        pnlMenuInferior.setBackground(new java.awt.Color(46, 16, 101));
        pnlMenuInferior.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 4, 12, 4));
        pnlMenuInferior.setPreferredSize(new java.awt.Dimension(220, 100));
        pnlMenuInferior.setLayout(new java.awt.GridLayout(2, 1, 0, 8));

        btnPerfil.setText("Perfil / Configuración");
        btnPerfil.setBackground(new java.awt.Color(46, 16, 101));
        btnPerfil.setForeground(new java.awt.Color(196, 181, 253));
        btnPerfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMenuInferior.add(btnPerfil);

        btnCerrarSesion.setText("Cerrar sesión");
        btnCerrarSesion.setBackground(new java.awt.Color(46, 16, 101));
        btnCerrarSesion.setForeground(new java.awt.Color(196, 181, 253));
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMenuInferior.add(btnCerrarSesion);

        pnlSidebar.add(pnlMenuInferior, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(pnlSidebar, java.awt.BorderLayout.LINE_START);

        pnlContenido.setBackground(new java.awt.Color(241, 245, 249));
        pnlContenido.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 20, 16, 20));
        pnlContenido.setLayout(new java.awt.BorderLayout(0, 16));

        pnlTitulo.setBackground(new java.awt.Color(241, 245, 249));
        pnlTitulo.setPreferredSize(new java.awt.Dimension(100, 56));
        pnlTitulo.setLayout(new java.awt.BorderLayout());

        pnlTextoTitulo.setBackground(new java.awt.Color(241, 245, 249));
        pnlTextoTitulo.setLayout(new java.awt.GridLayout(2, 1));

        lblTitulo.setText("Clientes");
        lblTitulo.setForeground(new java.awt.Color(30, 41, 59));
        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        pnlTextoTitulo.add(lblTitulo);

        lblSubtitulo.setText("Consulta el perfil, historial y reseñas de cada cliente.");
        lblSubtitulo.setForeground(new java.awt.Color(100, 116, 139));
        pnlTextoTitulo.add(lblSubtitulo);

        pnlTitulo.add(pnlTextoTitulo, java.awt.BorderLayout.LINE_START);

        btnNuevoCliente.setText("+ Nuevo cliente");
        btnNuevoCliente.setBackground(new java.awt.Color(37, 99, 235));
        btnNuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoCliente.setPreferredSize(new java.awt.Dimension(170, 40));
        pnlTitulo.add(btnNuevoCliente, java.awt.BorderLayout.LINE_END);

        pnlContenido.add(pnlTitulo, java.awt.BorderLayout.PAGE_START);

        pnlCentro.setBackground(new java.awt.Color(241, 245, 249));
        pnlCentro.setLayout(new java.awt.BorderLayout(0, 16));

        pnlCliente.setBackground(new java.awt.Color(255, 255, 255));
        pnlCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(14, 20, 14, 20));
        pnlCliente.setPreferredSize(new java.awt.Dimension(100, 90));
        pnlCliente.setLayout(new java.awt.BorderLayout(16, 0));

        pnlAvatar.setBackground(new java.awt.Color(124, 58, 237));
        pnlAvatar.setPreferredSize(new java.awt.Dimension(56, 56));
        pnlAvatar.setLayout(new java.awt.GridLayout(1, 1));

        lblAvatar.setText("LG");
        lblAvatar.setForeground(new java.awt.Color(255, 255, 255));
        lblAvatar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblAvatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlAvatar.add(lblAvatar);

        pnlCliente.add(pnlAvatar, java.awt.BorderLayout.LINE_START);

        pnlDatosCliente.setBackground(new java.awt.Color(255, 255, 255));
        pnlDatosCliente.setLayout(new java.awt.GridLayout(2, 1));

        lblNombreCliente.setText("Laura Gómez");
        lblNombreCliente.setForeground(new java.awt.Color(30, 41, 59));
        lblNombreCliente.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        pnlDatosCliente.add(lblNombreCliente);

        lblContactoCliente.setText("laura.gomez@correo.com  •  +57 300 555 1234");
        lblContactoCliente.setForeground(new java.awt.Color(100, 116, 139));
        pnlDatosCliente.add(lblContactoCliente);

        pnlCliente.add(pnlDatosCliente, java.awt.BorderLayout.CENTER);

        lblEstadoCliente.setText("Cliente activo");
        lblEstadoCliente.setForeground(new java.awt.Color(22, 163, 74));
        lblEstadoCliente.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        pnlCliente.add(lblEstadoCliente, java.awt.BorderLayout.LINE_END);

        pnlCentro.add(pnlCliente, java.awt.BorderLayout.PAGE_START);

        tabPerfil.setBackground(new java.awt.Color(255, 255, 255));
        tabPerfil.setLayout(new java.awt.BorderLayout());

        pnlPerfilSup.setBackground(new java.awt.Color(255, 255, 255));
        pnlPerfilSup.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 20, 8, 20));
        pnlPerfilSup.setPreferredSize(new java.awt.Dimension(100, 300));
        pnlPerfilSup.setLayout(new java.awt.BorderLayout());

        lblDatosPersonales.setText("Datos personales");
        lblDatosPersonales.setForeground(new java.awt.Color(30, 41, 59));
        lblDatosPersonales.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDatosPersonales.setPreferredSize(new java.awt.Dimension(100, 30));
        pnlPerfilSup.add(lblDatosPersonales, java.awt.BorderLayout.PAGE_START);

        pnlCampos.setBackground(new java.awt.Color(255, 255, 255));
        pnlCampos.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 0, 8, 0));
        pnlCampos.setLayout(new java.awt.GridLayout(2, 2, 24, 16));

        pnlNombre.setBackground(new java.awt.Color(255, 255, 255));
        pnlNombre.setLayout(new java.awt.GridLayout(2, 1, 0, 4));

        lblNombre.setText("Nombre completo");
        lblNombre.setForeground(new java.awt.Color(100, 116, 139));
        pnlNombre.add(lblNombre);

        txtNombre.setText("Laura Gómez");
        pnlNombre.add(txtNombre);

        pnlCampos.add(pnlNombre);

        pnlCorreo.setBackground(new java.awt.Color(255, 255, 255));
        pnlCorreo.setLayout(new java.awt.GridLayout(2, 1, 0, 4));

        lblCorreo.setText("Correo electrónico");
        lblCorreo.setForeground(new java.awt.Color(100, 116, 139));
        pnlCorreo.add(lblCorreo);

        txtCorreo.setText("laura.gomez@correo.com");
        pnlCorreo.add(txtCorreo);

        pnlCampos.add(pnlCorreo);

        pnlTelefono.setBackground(new java.awt.Color(255, 255, 255));
        pnlTelefono.setLayout(new java.awt.GridLayout(2, 1, 0, 4));

        lblTelefono.setText("Teléfono");
        lblTelefono.setForeground(new java.awt.Color(100, 116, 139));
        pnlTelefono.add(lblTelefono);

        txtTelefono.setText("+57 300 555 1234");
        pnlTelefono.add(txtTelefono);

        pnlCampos.add(pnlTelefono);

        pnlDireccion.setBackground(new java.awt.Color(255, 255, 255));
        pnlDireccion.setLayout(new java.awt.GridLayout(2, 1, 0, 4));

        lblDireccion.setText("Dirección");
        lblDireccion.setForeground(new java.awt.Color(100, 116, 139));
        pnlDireccion.add(lblDireccion);

        txtDireccion.setText("Cra 15 # 80-22, Bogotá");
        pnlDireccion.add(txtDireccion);

        pnlCampos.add(pnlDireccion);

        pnlPerfilSup.add(pnlCampos, java.awt.BorderLayout.CENTER);

        pnlGuardar.setBackground(new java.awt.Color(255, 255, 255));
        pnlGuardar.setPreferredSize(new java.awt.Dimension(100, 56));
        pnlGuardar.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 8));

        btnGuardar.setText("Guardar cambios");
        btnGuardar.setBackground(new java.awt.Color(37, 99, 235));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setPreferredSize(new java.awt.Dimension(200, 40));
        pnlGuardar.add(btnGuardar);

        pnlPerfilSup.add(pnlGuardar, java.awt.BorderLayout.PAGE_END);

        tabPerfil.add(pnlPerfilSup, java.awt.BorderLayout.PAGE_START);

        tabsCliente.addTab("Perfil", tabPerfil);

        tabHistorial.setBackground(new java.awt.Color(255, 255, 255));
        tabHistorial.setLayout(new java.awt.BorderLayout());
        tabsCliente.addTab("Historial de pedidos", tabHistorial);

        tabResenas.setBackground(new java.awt.Color(255, 255, 255));
        tabResenas.setLayout(new java.awt.BorderLayout());
        tabsCliente.addTab("Reseñas", tabResenas);

        pnlCentro.add(tabsCliente, java.awt.BorderLayout.CENTER);

        pnlInfo.setBackground(new java.awt.Color(239, 246, 255));
        pnlInfo.setPreferredSize(new java.awt.Dimension(100, 44));
        pnlInfo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 16, 12));

        lblInfo.setText("Cambia a las pestañas “Historial de pedidos” o “Reseñas” para ver el resto de la información del cliente.");
        lblInfo.setForeground(new java.awt.Color(30, 64, 175));
        pnlInfo.add(lblInfo);

        pnlCentro.add(pnlInfo, java.awt.BorderLayout.PAGE_END);

        pnlContenido.add(pnlCentro, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlContenido, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnContactenos;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnNotificaciones;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnProduccion;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JLabel lblContactoCliente;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDatosPersonales;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEstadoCliente;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlAvatar;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlCliente;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JPanel pnlCorreo;
    private javax.swing.JPanel pnlDatosCliente;
    private javax.swing.JPanel pnlDireccion;
    private javax.swing.JPanel pnlGuardar;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlMenuInferior;
    private javax.swing.JPanel pnlNombre;
    private javax.swing.JPanel pnlPerfilSup;
    private javax.swing.JPanel pnlSidebar;
    private javax.swing.JPanel pnlTelefono;
    private javax.swing.JPanel pnlTextoTitulo;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPanel tabHistorial;
    private javax.swing.JPanel tabPerfil;
    private javax.swing.JPanel tabResenas;
    private javax.swing.JTabbedPane tabsCliente;
    private javax.swing.JTextField txtBuscarGlobal;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
