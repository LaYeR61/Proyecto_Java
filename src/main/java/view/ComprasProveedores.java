package view;

public class ComprasProveedores extends javax.swing.JFrame {

    public ComprasProveedores() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        btnNuevaSolicitud = new javax.swing.JButton();
        pnlCentro = new javax.swing.JPanel();
        pnlTarjetas = new javax.swing.JPanel();
        pnlSolicitudes = new javax.swing.JPanel();
        lblSolicitudesNum = new javax.swing.JLabel();
        lblSolicitudesTxt = new javax.swing.JLabel();
        pnlCotizaciones = new javax.swing.JPanel();
        lblCotizacionesNum = new javax.swing.JLabel();
        lblCotizacionesTxt = new javax.swing.JLabel();
        pnlProveedores = new javax.swing.JPanel();
        lblProveedoresNum = new javax.swing.JLabel();
        lblProveedoresTxt = new javax.swing.JLabel();
        pnlAlertas = new javax.swing.JPanel();
        lblAlertasNum = new javax.swing.JLabel();
        lblAlertasTxt = new javax.swing.JLabel();
        tabsCompras = new javax.swing.JTabbedPane();
        tabSolicitudes = new javax.swing.JPanel();
        pnlFiltros = new javax.swing.JPanel();
        txtBuscarProveedor = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        cboCategoria = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        btnFiltros = new javax.swing.JButton();
        scrollSolicitudes = new javax.swing.JScrollPane();
        tablaSolicitudes = new javax.swing.JTable();
        pnlPaginacion = new javax.swing.JPanel();
        btnAnterior = new javax.swing.JButton();
        btnPag1 = new javax.swing.JButton();
        btnPag2 = new javax.swing.JButton();
        btnPag3 = new javax.swing.JButton();
        lblPuntos = new javax.swing.JLabel();
        btnPag16 = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        tabCotizaciones = new javax.swing.JPanel();
        tabProveedores = new javax.swing.JPanel();
        tabRecepcion = new javax.swing.JPanel();
        tabValidacion = new javax.swing.JPanel();
        pnlInfo = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gambare - Compras / Proveedores");
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

        btnHome.setText("Home");
        btnHome.setBackground(new java.awt.Color(46, 16, 101));
        btnHome.setForeground(new java.awt.Color(196, 181, 253));
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMenu.add(btnHome);

        btnInventario.setText("Inventario");
        btnInventario.setBackground(new java.awt.Color(46, 16, 101));
        btnInventario.setForeground(new java.awt.Color(196, 181, 253));
        btnInventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMenu.add(btnInventario);

        btnCompras.setText("Compras / Proveedores");
        btnCompras.setBackground(new java.awt.Color(124, 58, 237));
        btnCompras.setForeground(new java.awt.Color(255, 255, 255));
        btnCompras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMenu.add(btnCompras);

        btnProduccion.setText("Producción");
        btnProduccion.setBackground(new java.awt.Color(46, 16, 101));
        btnProduccion.setForeground(new java.awt.Color(196, 181, 253));
        btnProduccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMenu.add(btnProduccion);

        btnVentas.setText("Ventas / Pedidos");
        btnVentas.setBackground(new java.awt.Color(46, 16, 101));
        btnVentas.setForeground(new java.awt.Color(196, 181, 253));
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMenu.add(btnVentas);

        btnClientes.setText("Clientes");
        btnClientes.setBackground(new java.awt.Color(46, 16, 101));
        btnClientes.setForeground(new java.awt.Color(196, 181, 253));
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

        lblTitulo.setText("Compras / Proveedores");
        lblTitulo.setForeground(new java.awt.Color(30, 41, 59));
        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        pnlTextoTitulo.add(lblTitulo);

        lblSubtitulo.setText("Gestiona solicitudes, cotizaciones y proveedores de materiales.");
        lblSubtitulo.setForeground(new java.awt.Color(100, 116, 139));
        pnlTextoTitulo.add(lblSubtitulo);

        pnlTitulo.add(pnlTextoTitulo, java.awt.BorderLayout.LINE_START);

        btnNuevaSolicitud.setText("+ Nueva solicitud");
        btnNuevaSolicitud.setBackground(new java.awt.Color(37, 99, 235));
        btnNuevaSolicitud.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaSolicitud.setPreferredSize(new java.awt.Dimension(170, 40));
        pnlTitulo.add(btnNuevaSolicitud, java.awt.BorderLayout.LINE_END);

        pnlContenido.add(pnlTitulo, java.awt.BorderLayout.PAGE_START);

        pnlCentro.setBackground(new java.awt.Color(241, 245, 249));
        pnlCentro.setLayout(new java.awt.BorderLayout(0, 16));

        pnlTarjetas.setBackground(new java.awt.Color(241, 245, 249));
        pnlTarjetas.setPreferredSize(new java.awt.Dimension(100, 80));
        pnlTarjetas.setLayout(new java.awt.GridLayout(1, 4, 14, 0));

        pnlSolicitudes.setBackground(new java.awt.Color(255, 255, 255));
        pnlSolicitudes.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 16, 12, 16));
        pnlSolicitudes.setLayout(new java.awt.GridLayout(2, 1));

        lblSolicitudesNum.setText("12");
        lblSolicitudesNum.setForeground(new java.awt.Color(30, 41, 59));
        lblSolicitudesNum.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        pnlSolicitudes.add(lblSolicitudesNum);

        lblSolicitudesTxt.setText("Solicitudes activas");
        lblSolicitudesTxt.setForeground(new java.awt.Color(100, 116, 139));
        pnlSolicitudes.add(lblSolicitudesTxt);

        pnlTarjetas.add(pnlSolicitudes);

        pnlCotizaciones.setBackground(new java.awt.Color(255, 255, 255));
        pnlCotizaciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 16, 12, 16));
        pnlCotizaciones.setLayout(new java.awt.GridLayout(2, 1));

        lblCotizacionesNum.setText("5");
        lblCotizacionesNum.setForeground(new java.awt.Color(30, 41, 59));
        lblCotizacionesNum.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        pnlCotizaciones.add(lblCotizacionesNum);

        lblCotizacionesTxt.setText("Cotizaciones pendientes");
        lblCotizacionesTxt.setForeground(new java.awt.Color(100, 116, 139));
        pnlCotizaciones.add(lblCotizacionesTxt);

        pnlTarjetas.add(pnlCotizaciones);

        pnlProveedores.setBackground(new java.awt.Color(255, 255, 255));
        pnlProveedores.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 16, 12, 16));
        pnlProveedores.setLayout(new java.awt.GridLayout(2, 1));

        lblProveedoresNum.setText("8");
        lblProveedoresNum.setForeground(new java.awt.Color(30, 41, 59));
        lblProveedoresNum.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        pnlProveedores.add(lblProveedoresNum);

        lblProveedoresTxt.setText("Proveedores registrados");
        lblProveedoresTxt.setForeground(new java.awt.Color(100, 116, 139));
        pnlProveedores.add(lblProveedoresTxt);

        pnlTarjetas.add(pnlProveedores);

        pnlAlertas.setBackground(new java.awt.Color(255, 255, 255));
        pnlAlertas.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 16, 12, 16));
        pnlAlertas.setLayout(new java.awt.GridLayout(2, 1));

        lblAlertasNum.setText("2");
        lblAlertasNum.setForeground(new java.awt.Color(30, 41, 59));
        lblAlertasNum.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        pnlAlertas.add(lblAlertasNum);

        lblAlertasTxt.setText("Alertas de cotización");
        lblAlertasTxt.setForeground(new java.awt.Color(100, 116, 139));
        pnlAlertas.add(lblAlertasTxt);

        pnlTarjetas.add(pnlAlertas);

        pnlCentro.add(pnlTarjetas, java.awt.BorderLayout.PAGE_START);

        tabSolicitudes.setBackground(new java.awt.Color(255, 255, 255));
        tabSolicitudes.setLayout(new java.awt.BorderLayout());

        pnlFiltros.setBackground(new java.awt.Color(255, 255, 255));
        pnlFiltros.setPreferredSize(new java.awt.Dimension(100, 52));
        pnlFiltros.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));

        txtBuscarProveedor.setText("Buscar proveedor o material...");
        txtBuscarProveedor.setPreferredSize(new java.awt.Dimension(260, 28));
        pnlFiltros.add(txtBuscarProveedor);

        lblCategoria.setText("Categoría");
        lblCategoria.setForeground(new java.awt.Color(100, 116, 139));
        pnlFiltros.add(lblCategoria);

        cboCategoria.setPreferredSize(new java.awt.Dimension(150, 28));
        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "Telas", "Tintas", "Vinilos", "Hilos" }));
        pnlFiltros.add(cboCategoria);

        lblEstado.setText("Estado");
        lblEstado.setForeground(new java.awt.Color(100, 116, 139));
        pnlFiltros.add(lblEstado);

        cboEstado.setPreferredSize(new java.awt.Dimension(150, 28));
        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Enviado", "Pendiente", "Recibido", "Rechazado" }));
        pnlFiltros.add(cboEstado);

        btnFiltros.setText("Filtros");
        pnlFiltros.add(btnFiltros);

        tabSolicitudes.add(pnlFiltros, java.awt.BorderLayout.PAGE_START);

        tablaSolicitudes.setModel(new javax.swing.table.DefaultTableModel(new Object [][] { {"SOL-001", "Textiles Andinos", "Algodón Premium (50m)", "12/09/2026", "Enviado", "Ver / Editar"}, {"SOL-002", "Insumos Bogotá", "Tinta Negra (30 uds)", "10/09/2026", "Pendiente", "Ver / Editar"}, {"SOL-003", "Vinilos SAS", "Vinilo Textil (40m)", "08/09/2026", "Recibido", "Ver / Editar"}, {"SOL-004", "Hilos del Valle", "Hilo Poliéster (60 uds)", "05/09/2026", "Rechazado", "Ver / Editar"} }, new String [] {"Código", "Proveedor", "Material solicitado", "Fecha de envío", "Estado", "Acciones"}));
        tablaSolicitudes.setRowHeight(28);
        scrollSolicitudes.setViewportView(tablaSolicitudes);

        tabSolicitudes.add(scrollSolicitudes, java.awt.BorderLayout.CENTER);

        pnlPaginacion.setBackground(new java.awt.Color(255, 255, 255));
        pnlPaginacion.setPreferredSize(new java.awt.Dimension(100, 50));
        pnlPaginacion.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 6, 10));

        btnAnterior.setText("<");
        btnAnterior.setForeground(new java.awt.Color(30, 41, 59));
        pnlPaginacion.add(btnAnterior);

        btnPag1.setText("1");
        btnPag1.setBackground(new java.awt.Color(37, 99, 235));
        btnPag1.setForeground(new java.awt.Color(255, 255, 255));
        pnlPaginacion.add(btnPag1);

        btnPag2.setText("2");
        btnPag2.setForeground(new java.awt.Color(30, 41, 59));
        pnlPaginacion.add(btnPag2);

        btnPag3.setText("3");
        btnPag3.setForeground(new java.awt.Color(30, 41, 59));
        pnlPaginacion.add(btnPag3);

        lblPuntos.setText("...");
        lblPuntos.setForeground(new java.awt.Color(100, 116, 139));
        pnlPaginacion.add(lblPuntos);

        btnPag16.setText("16");
        btnPag16.setForeground(new java.awt.Color(30, 41, 59));
        pnlPaginacion.add(btnPag16);

        btnSiguiente.setText(">");
        btnSiguiente.setForeground(new java.awt.Color(30, 41, 59));
        pnlPaginacion.add(btnSiguiente);

        tabSolicitudes.add(pnlPaginacion, java.awt.BorderLayout.PAGE_END);

        tabsCompras.addTab("Solicitudes", tabSolicitudes);

        tabCotizaciones.setBackground(new java.awt.Color(255, 255, 255));
        tabCotizaciones.setLayout(new java.awt.BorderLayout());
        tabsCompras.addTab("Cotizaciones", tabCotizaciones);

        tabProveedores.setBackground(new java.awt.Color(255, 255, 255));
        tabProveedores.setLayout(new java.awt.BorderLayout());
        tabsCompras.addTab("Proveedores", tabProveedores);

        tabRecepcion.setBackground(new java.awt.Color(255, 255, 255));
        tabRecepcion.setLayout(new java.awt.BorderLayout());
        tabsCompras.addTab("Recepción de materiales", tabRecepcion);

        tabValidacion.setBackground(new java.awt.Color(255, 255, 255));
        tabValidacion.setLayout(new java.awt.BorderLayout());
        tabsCompras.addTab("Validación", tabValidacion);

        pnlCentro.add(tabsCompras, java.awt.BorderLayout.CENTER);

        pnlInfo.setBackground(new java.awt.Color(239, 246, 255));
        pnlInfo.setPreferredSize(new java.awt.Dimension(100, 44));
        pnlInfo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 16, 12));

        lblInfo.setText("Las cotizaciones marcadas como “Rechazado” generan una alerta automática para el comprador.");
        lblInfo.setForeground(new java.awt.Color(30, 64, 175));
        pnlInfo.add(lblInfo);

        pnlCentro.add(pnlInfo, java.awt.BorderLayout.PAGE_END);

        pnlContenido.add(pnlCentro, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlContenido, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprasProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnContactenos;
    private javax.swing.JButton btnFiltros;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnNotificaciones;
    private javax.swing.JButton btnNuevaSolicitud;
    private javax.swing.JButton btnPag1;
    private javax.swing.JButton btnPag16;
    private javax.swing.JButton btnPag2;
    private javax.swing.JButton btnPag3;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnProduccion;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVentas;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JLabel lblAlertasNum;
    private javax.swing.JLabel lblAlertasTxt;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCotizacionesNum;
    private javax.swing.JLabel lblCotizacionesTxt;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblProveedoresNum;
    private javax.swing.JLabel lblProveedoresTxt;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JLabel lblSolicitudesNum;
    private javax.swing.JLabel lblSolicitudesTxt;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlAlertas;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JPanel pnlCotizaciones;
    private javax.swing.JPanel pnlFiltros;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlMenuInferior;
    private javax.swing.JPanel pnlPaginacion;
    private javax.swing.JPanel pnlProveedores;
    private javax.swing.JPanel pnlSidebar;
    private javax.swing.JPanel pnlSolicitudes;
    private javax.swing.JPanel pnlTarjetas;
    private javax.swing.JPanel pnlTextoTitulo;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JScrollPane scrollSolicitudes;
    private javax.swing.JPanel tabCotizaciones;
    private javax.swing.JPanel tabProveedores;
    private javax.swing.JPanel tabRecepcion;
    private javax.swing.JPanel tabSolicitudes;
    private javax.swing.JPanel tabValidacion;
    private javax.swing.JTable tablaSolicitudes;
    private javax.swing.JTabbedPane tabsCompras;
    private javax.swing.JTextField txtBuscarGlobal;
    private javax.swing.JTextField txtBuscarProveedor;
    // End of variables declaration//GEN-END:variables
}
