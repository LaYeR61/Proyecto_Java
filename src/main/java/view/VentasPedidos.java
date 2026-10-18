package view;

public class VentasPedidos extends javax.swing.JFrame {

    public VentasPedidos() {
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
        btnNuevoPedido = new javax.swing.JButton();
        pnlCentro = new javax.swing.JPanel();
        pnlTarjetas = new javax.swing.JPanel();
        pnlPendientes = new javax.swing.JPanel();
        lblPendientesNum = new javax.swing.JLabel();
        lblPendientesTxt = new javax.swing.JLabel();
        pnlPagos = new javax.swing.JPanel();
        lblPagosNum = new javax.swing.JLabel();
        lblPagosTxt = new javax.swing.JLabel();
        pnlEntregados = new javax.swing.JPanel();
        lblEntregadosNum = new javax.swing.JLabel();
        lblEntregadosTxt = new javax.swing.JLabel();
        pnlStock = new javax.swing.JPanel();
        lblStockNum = new javax.swing.JLabel();
        lblStockTxt = new javax.swing.JLabel();
        tabsVentas = new javax.swing.JTabbedPane();
        tabPedidos = new javax.swing.JPanel();
        pnlFiltros = new javax.swing.JPanel();
        txtBuscarPedido = new javax.swing.JTextField();
        lblOrigen = new javax.swing.JLabel();
        cboOrigen = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        btnFiltros = new javax.swing.JButton();
        scrollPedidos = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        pnlPaginacion = new javax.swing.JPanel();
        btnAnterior = new javax.swing.JButton();
        btnPag1 = new javax.swing.JButton();
        btnPag2 = new javax.swing.JButton();
        btnPag3 = new javax.swing.JButton();
        lblPuntos = new javax.swing.JLabel();
        btnPag16 = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        tabVerificacionPago = new javax.swing.JPanel();
        tabEntregas = new javax.swing.JPanel();
        pnlInfo = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gambare - Ventas / Pedidos");
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
        btnCompras.setBackground(new java.awt.Color(46, 16, 101));
        btnCompras.setForeground(new java.awt.Color(196, 181, 253));
        btnCompras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMenu.add(btnCompras);

        btnProduccion.setText("Producción");
        btnProduccion.setBackground(new java.awt.Color(46, 16, 101));
        btnProduccion.setForeground(new java.awt.Color(196, 181, 253));
        btnProduccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMenu.add(btnProduccion);

        btnVentas.setText("Ventas / Pedidos");
        btnVentas.setBackground(new java.awt.Color(124, 58, 237));
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
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

        lblTitulo.setText("Ventas / Pedidos");
        lblTitulo.setForeground(new java.awt.Color(30, 41, 59));
        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        pnlTextoTitulo.add(lblTitulo);

        lblSubtitulo.setText("Consulta y gestiona los pedidos, pagos y entregas.");
        lblSubtitulo.setForeground(new java.awt.Color(100, 116, 139));
        pnlTextoTitulo.add(lblSubtitulo);

        pnlTitulo.add(pnlTextoTitulo, java.awt.BorderLayout.LINE_START);

        btnNuevoPedido.setText("+ Nuevo pedido");
        btnNuevoPedido.setBackground(new java.awt.Color(37, 99, 235));
        btnNuevoPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoPedido.setPreferredSize(new java.awt.Dimension(170, 40));
        pnlTitulo.add(btnNuevoPedido, java.awt.BorderLayout.LINE_END);

        pnlContenido.add(pnlTitulo, java.awt.BorderLayout.PAGE_START);

        pnlCentro.setBackground(new java.awt.Color(241, 245, 249));
        pnlCentro.setLayout(new java.awt.BorderLayout(0, 16));

        pnlTarjetas.setBackground(new java.awt.Color(241, 245, 249));
        pnlTarjetas.setPreferredSize(new java.awt.Dimension(100, 80));
        pnlTarjetas.setLayout(new java.awt.GridLayout(1, 4, 14, 0));

        pnlPendientes.setBackground(new java.awt.Color(255, 255, 255));
        pnlPendientes.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 16, 12, 16));
        pnlPendientes.setLayout(new java.awt.GridLayout(2, 1));

        lblPendientesNum.setText("9");
        lblPendientesNum.setForeground(new java.awt.Color(30, 41, 59));
        lblPendientesNum.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        pnlPendientes.add(lblPendientesNum);

        lblPendientesTxt.setText("Pedidos pendientes");
        lblPendientesTxt.setForeground(new java.awt.Color(100, 116, 139));
        pnlPendientes.add(lblPendientesTxt);

        pnlTarjetas.add(pnlPendientes);

        pnlPagos.setBackground(new java.awt.Color(255, 255, 255));
        pnlPagos.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 16, 12, 16));
        pnlPagos.setLayout(new java.awt.GridLayout(2, 1));

        lblPagosNum.setText("3");
        lblPagosNum.setForeground(new java.awt.Color(30, 41, 59));
        lblPagosNum.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        pnlPagos.add(lblPagosNum);

        lblPagosTxt.setText("Pagos por verificar");
        lblPagosTxt.setForeground(new java.awt.Color(100, 116, 139));
        pnlPagos.add(lblPagosTxt);

        pnlTarjetas.add(pnlPagos);

        pnlEntregados.setBackground(new java.awt.Color(255, 255, 255));
        pnlEntregados.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 16, 12, 16));
        pnlEntregados.setLayout(new java.awt.GridLayout(2, 1));

        lblEntregadosNum.setText("24");
        lblEntregadosNum.setForeground(new java.awt.Color(30, 41, 59));
        lblEntregadosNum.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        pnlEntregados.add(lblEntregadosNum);

        lblEntregadosTxt.setText("Pedidos entregados");
        lblEntregadosTxt.setForeground(new java.awt.Color(100, 116, 139));
        pnlEntregados.add(lblEntregadosTxt);

        pnlTarjetas.add(pnlEntregados);

        pnlStock.setBackground(new java.awt.Color(255, 255, 255));
        pnlStock.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 16, 12, 16));
        pnlStock.setLayout(new java.awt.GridLayout(2, 1));

        lblStockNum.setText("2");
        lblStockNum.setForeground(new java.awt.Color(30, 41, 59));
        lblStockNum.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        pnlStock.add(lblStockNum);

        lblStockTxt.setText("Stock insuficiente");
        lblStockTxt.setForeground(new java.awt.Color(100, 116, 139));
        pnlStock.add(lblStockTxt);

        pnlTarjetas.add(pnlStock);

        pnlCentro.add(pnlTarjetas, java.awt.BorderLayout.PAGE_START);

        tabPedidos.setBackground(new java.awt.Color(255, 255, 255));
        tabPedidos.setLayout(new java.awt.BorderLayout());

        pnlFiltros.setBackground(new java.awt.Color(255, 255, 255));
        pnlFiltros.setPreferredSize(new java.awt.Dimension(100, 52));
        pnlFiltros.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));

        txtBuscarPedido.setText("Buscar pedido o cliente...");
        txtBuscarPedido.setPreferredSize(new java.awt.Dimension(260, 28));
        pnlFiltros.add(txtBuscarPedido);

        lblOrigen.setText("Origen");
        lblOrigen.setForeground(new java.awt.Color(100, 116, 139));
        pnlFiltros.add(lblOrigen);

        cboOrigen.setPreferredSize(new java.awt.Dimension(150, 28));
        cboOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Stock general", "Pedido cliente" }));
        pnlFiltros.add(cboOrigen);

        lblEstado.setText("Estado");
        lblEstado.setForeground(new java.awt.Color(100, 116, 139));
        pnlFiltros.add(lblEstado);

        cboEstado.setPreferredSize(new java.awt.Dimension(150, 28));
        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Entregado", "En proceso", "Por entregar", "Cancelado" }));
        pnlFiltros.add(cboEstado);

        btnFiltros.setText("Filtros");
        pnlFiltros.add(btnFiltros);

        tabPedidos.add(pnlFiltros, java.awt.BorderLayout.PAGE_START);

        tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(new Object [][] { {"PED-101", "Laura Gómez", "Stock general", "Verificado", "Entregado", "Ver / Editar"}, {"PED-102", "Carlos Ruiz", "Pedido cliente", "Pendiente", "En proceso", "Ver / Editar"}, {"PED-103", "Marta Díaz", "Stock general", "Verificado", "Por entregar", "Ver / Editar"}, {"PED-104", "Andrés Peña", "Pedido cliente", "Rechazado", "Cancelado", "Ver / Editar"} }, new String [] {"Código", "Cliente", "Origen", "Estado de pago", "Entrega", "Acciones"}));
        tablaPedidos.setRowHeight(28);
        scrollPedidos.setViewportView(tablaPedidos);

        tabPedidos.add(scrollPedidos, java.awt.BorderLayout.CENTER);

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

        tabPedidos.add(pnlPaginacion, java.awt.BorderLayout.PAGE_END);

        tabsVentas.addTab("Pedidos", tabPedidos);

        tabVerificacionPago.setBackground(new java.awt.Color(255, 255, 255));
        tabVerificacionPago.setLayout(new java.awt.BorderLayout());
        tabsVentas.addTab("Verificación de pago", tabVerificacionPago);

        tabEntregas.setBackground(new java.awt.Color(255, 255, 255));
        tabEntregas.setLayout(new java.awt.BorderLayout());
        tabsVentas.addTab("Entregas", tabEntregas);

        pnlCentro.add(tabsVentas, java.awt.BorderLayout.CENTER);

        pnlInfo.setBackground(new java.awt.Color(239, 246, 255));
        pnlInfo.setPreferredSize(new java.awt.Dimension(100, 44));
        pnlInfo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 16, 12));

        lblInfo.setText("Los pedidos con pago “Rechazado” se cancelan automáticamente después de 48 horas.");
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
                new VentasPedidos().setVisible(true);
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
    private javax.swing.JButton btnNuevoPedido;
    private javax.swing.JButton btnPag1;
    private javax.swing.JButton btnPag16;
    private javax.swing.JButton btnPag2;
    private javax.swing.JButton btnPag3;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnProduccion;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVentas;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JComboBox<String> cboOrigen;
    private javax.swing.JLabel lblEntregadosNum;
    private javax.swing.JLabel lblEntregadosTxt;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblPagosNum;
    private javax.swing.JLabel lblPagosTxt;
    private javax.swing.JLabel lblPendientesNum;
    private javax.swing.JLabel lblPendientesTxt;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JLabel lblStockNum;
    private javax.swing.JLabel lblStockTxt;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JPanel pnlEntregados;
    private javax.swing.JPanel pnlFiltros;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlMenuInferior;
    private javax.swing.JPanel pnlPaginacion;
    private javax.swing.JPanel pnlPagos;
    private javax.swing.JPanel pnlPendientes;
    private javax.swing.JPanel pnlSidebar;
    private javax.swing.JPanel pnlStock;
    private javax.swing.JPanel pnlTarjetas;
    private javax.swing.JPanel pnlTextoTitulo;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JScrollPane scrollPedidos;
    private javax.swing.JPanel tabEntregas;
    private javax.swing.JPanel tabPedidos;
    private javax.swing.JPanel tabVerificacionPago;
    private javax.swing.JTable tablaPedidos;
    private javax.swing.JTabbedPane tabsVentas;
    private javax.swing.JTextField txtBuscarGlobal;
    private javax.swing.JTextField txtBuscarPedido;
    // End of variables declaration//GEN-END:variables
}
