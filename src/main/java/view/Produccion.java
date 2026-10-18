package view;

public class Produccion extends javax.swing.JFrame {

    public Produccion() {
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
        btnNuevoDiseno = new javax.swing.JButton();
        pnlCentro = new javax.swing.JPanel();
        pnlTarjetas = new javax.swing.JPanel();
        pnlActivos = new javax.swing.JPanel();
        lblActivosNum = new javax.swing.JLabel();
        lblActivosTxt = new javax.swing.JLabel();
        pnlProceso = new javax.swing.JPanel();
        lblProcesoNum = new javax.swing.JLabel();
        lblProcesoTxt = new javax.swing.JLabel();
        pnlAprobados = new javax.swing.JPanel();
        lblAprobadosNum = new javax.swing.JLabel();
        lblAprobadosTxt = new javax.swing.JLabel();
        pnlRechazados = new javax.swing.JPanel();
        lblRechazadosNum = new javax.swing.JLabel();
        lblRechazadosTxt = new javax.swing.JLabel();
        tabsProduccion = new javax.swing.JTabbedPane();
        tabDisenos = new javax.swing.JPanel();
        pnlGaleria = new javax.swing.JPanel();
        pnlDiseno1 = new javax.swing.JPanel();
        pnlImagen1 = new javax.swing.JPanel();
        lblImagen1 = new javax.swing.JLabel();
        pnlDatosDiseno1 = new javax.swing.JPanel();
        lblNombreDiseno1 = new javax.swing.JLabel();
        lblEstadoDiseno1 = new javax.swing.JLabel();
        pnlDiseno2 = new javax.swing.JPanel();
        pnlImagen2 = new javax.swing.JPanel();
        lblImagen2 = new javax.swing.JLabel();
        pnlDatosDiseno2 = new javax.swing.JPanel();
        lblNombreDiseno2 = new javax.swing.JLabel();
        lblEstadoDiseno2 = new javax.swing.JLabel();
        pnlDiseno3 = new javax.swing.JPanel();
        pnlImagen3 = new javax.swing.JPanel();
        lblImagen3 = new javax.swing.JLabel();
        pnlDatosDiseno3 = new javax.swing.JPanel();
        lblNombreDiseno3 = new javax.swing.JLabel();
        lblEstadoDiseno3 = new javax.swing.JLabel();
        pnlDiseno4 = new javax.swing.JPanel();
        pnlImagen4 = new javax.swing.JPanel();
        lblImagen4 = new javax.swing.JLabel();
        pnlDatosDiseno4 = new javax.swing.JPanel();
        lblNombreDiseno4 = new javax.swing.JLabel();
        lblEstadoDiseno4 = new javax.swing.JLabel();
        pnlDiseno5 = new javax.swing.JPanel();
        pnlImagen5 = new javax.swing.JPanel();
        lblImagen5 = new javax.swing.JLabel();
        pnlDatosDiseno5 = new javax.swing.JPanel();
        lblNombreDiseno5 = new javax.swing.JLabel();
        lblEstadoDiseno5 = new javax.swing.JLabel();
        pnlDiseno6 = new javax.swing.JPanel();
        pnlImagen6 = new javax.swing.JPanel();
        lblImagen6 = new javax.swing.JLabel();
        pnlDatosDiseno6 = new javax.swing.JPanel();
        lblNombreDiseno6 = new javax.swing.JLabel();
        lblEstadoDiseno6 = new javax.swing.JLabel();
        pnlDiseno7 = new javax.swing.JPanel();
        pnlImagen7 = new javax.swing.JPanel();
        lblImagen7 = new javax.swing.JLabel();
        pnlDatosDiseno7 = new javax.swing.JPanel();
        lblNombreDiseno7 = new javax.swing.JLabel();
        lblEstadoDiseno7 = new javax.swing.JLabel();
        pnlDiseno8 = new javax.swing.JPanel();
        pnlImagen8 = new javax.swing.JPanel();
        lblImagen8 = new javax.swing.JLabel();
        pnlDatosDiseno8 = new javax.swing.JPanel();
        lblNombreDiseno8 = new javax.swing.JLabel();
        lblEstadoDiseno8 = new javax.swing.JLabel();
        tabEstampados = new javax.swing.JPanel();
        pnlInfo = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gambare - Producción");
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

        btnProduccion.setText("Producción");
        btnProduccion.setBackground(new java.awt.Color(124, 58, 237));
        btnProduccion.setForeground(new java.awt.Color(255, 255, 255));
        btnProduccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMenu.add(btnProduccion);

        btnVentas.setBackground(new java.awt.Color(46, 16, 101));
        btnVentas.setForeground(new java.awt.Color(196, 181, 253));
        btnVentas.setText("Ventas / Pedidos");
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

        btnPerfil.setBackground(new java.awt.Color(46, 16, 101));
        btnPerfil.setForeground(new java.awt.Color(196, 181, 253));
        btnPerfil.setText("Perfil / Configuración");
        btnPerfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlMenuInferior.add(btnPerfil);

        btnCerrarSesion.setBackground(new java.awt.Color(46, 16, 101));
        btnCerrarSesion.setForeground(new java.awt.Color(196, 181, 253));
        btnCerrarSesion.setText("Cerrar sesión");
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

        lblTitulo.setText("Producción");
        lblTitulo.setForeground(new java.awt.Color(30, 41, 59));
        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        pnlTextoTitulo.add(lblTitulo);

        lblSubtitulo.setText("Administra diseños y estampados en proceso.");
        lblSubtitulo.setForeground(new java.awt.Color(100, 116, 139));
        pnlTextoTitulo.add(lblSubtitulo);

        pnlTitulo.add(pnlTextoTitulo, java.awt.BorderLayout.LINE_START);

        btnNuevoDiseno.setText("+ Nuevo diseño");
        btnNuevoDiseno.setBackground(new java.awt.Color(37, 99, 235));
        btnNuevoDiseno.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoDiseno.setPreferredSize(new java.awt.Dimension(170, 40));
        pnlTitulo.add(btnNuevoDiseno, java.awt.BorderLayout.LINE_END);

        pnlContenido.add(pnlTitulo, java.awt.BorderLayout.PAGE_START);

        pnlCentro.setBackground(new java.awt.Color(241, 245, 249));
        pnlCentro.setLayout(new java.awt.BorderLayout(0, 16));

        pnlTarjetas.setBackground(new java.awt.Color(241, 245, 249));
        pnlTarjetas.setPreferredSize(new java.awt.Dimension(100, 80));
        pnlTarjetas.setLayout(new java.awt.GridLayout(1, 4, 14, 0));

        pnlActivos.setBackground(new java.awt.Color(255, 255, 255));
        pnlActivos.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 16, 12, 16));
        pnlActivos.setLayout(new java.awt.GridLayout(2, 1));

        lblActivosNum.setText("12");
        lblActivosNum.setForeground(new java.awt.Color(30, 41, 59));
        lblActivosNum.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        pnlActivos.add(lblActivosNum);

        lblActivosTxt.setForeground(new java.awt.Color(100, 116, 139));
        lblActivosTxt.setText("Diseños activos");
        pnlActivos.add(lblActivosTxt);

        pnlTarjetas.add(pnlActivos);

        pnlProceso.setBackground(new java.awt.Color(255, 255, 255));
        pnlProceso.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 16, 12, 16));
        pnlProceso.setLayout(new java.awt.GridLayout(2, 1));

        lblProcesoNum.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        lblProcesoNum.setForeground(new java.awt.Color(30, 41, 59));
        lblProcesoNum.setText("4");
        pnlProceso.add(lblProcesoNum);

        lblProcesoTxt.setForeground(new java.awt.Color(100, 116, 139));
        lblProcesoTxt.setText("Estampados en proceso");
        pnlProceso.add(lblProcesoTxt);

        pnlTarjetas.add(pnlProceso);

        pnlAprobados.setBackground(new java.awt.Color(255, 255, 255));
        pnlAprobados.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 16, 12, 16));
        pnlAprobados.setLayout(new java.awt.GridLayout(2, 1));

        lblAprobadosNum.setText("8");
        lblAprobadosNum.setForeground(new java.awt.Color(30, 41, 59));
        lblAprobadosNum.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        pnlAprobados.add(lblAprobadosNum);

        lblAprobadosTxt.setText("Diseños aprobados");
        lblAprobadosTxt.setForeground(new java.awt.Color(100, 116, 139));
        pnlAprobados.add(lblAprobadosTxt);

        pnlTarjetas.add(pnlAprobados);

        pnlRechazados.setBackground(new java.awt.Color(255, 255, 255));
        pnlRechazados.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 16, 12, 16));
        pnlRechazados.setLayout(new java.awt.GridLayout(2, 1));

        lblRechazadosNum.setText("1");
        lblRechazadosNum.setForeground(new java.awt.Color(30, 41, 59));
        lblRechazadosNum.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        pnlRechazados.add(lblRechazadosNum);

        lblRechazadosTxt.setText("Diseños rechazados");
        lblRechazadosTxt.setForeground(new java.awt.Color(100, 116, 139));
        pnlRechazados.add(lblRechazadosTxt);

        pnlTarjetas.add(pnlRechazados);

        pnlCentro.add(pnlTarjetas, java.awt.BorderLayout.PAGE_START);

        tabDisenos.setBackground(new java.awt.Color(255, 255, 255));
        tabDisenos.setLayout(new java.awt.BorderLayout());

        pnlGaleria.setBackground(new java.awt.Color(255, 255, 255));
        pnlGaleria.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16));
        pnlGaleria.setLayout(new java.awt.GridLayout(2, 4, 16, 16));

        pnlDiseno1.setBackground(new java.awt.Color(248, 250, 252));
        pnlDiseno1.setLayout(new java.awt.BorderLayout());

        pnlImagen1.setBackground(new java.awt.Color(237, 233, 254));
        pnlImagen1.setLayout(new java.awt.GridLayout(1, 1));

        lblImagen1.setForeground(new java.awt.Color(124, 58, 237));
        lblImagen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen1.setText("Imagen");
        pnlImagen1.add(lblImagen1);

        pnlDiseno1.add(pnlImagen1, java.awt.BorderLayout.CENTER);

        pnlDatosDiseno1.setBackground(new java.awt.Color(248, 250, 252));
        pnlDatosDiseno1.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12));
        pnlDatosDiseno1.setPreferredSize(new java.awt.Dimension(100, 64));
        pnlDatosDiseno1.setLayout(new java.awt.GridLayout(2, 1));

        lblNombreDiseno1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblNombreDiseno1.setForeground(new java.awt.Color(30, 41, 59));
        lblNombreDiseno1.setText("Estampado Floral 01");
        pnlDatosDiseno1.add(lblNombreDiseno1);

        lblEstadoDiseno1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblEstadoDiseno1.setForeground(new java.awt.Color(22, 163, 74));
        lblEstadoDiseno1.setText("Aprobado");
        pnlDatosDiseno1.add(lblEstadoDiseno1);

        pnlDiseno1.add(pnlDatosDiseno1, java.awt.BorderLayout.PAGE_END);

        pnlGaleria.add(pnlDiseno1);

        pnlDiseno2.setBackground(new java.awt.Color(248, 250, 252));
        pnlDiseno2.setLayout(new java.awt.BorderLayout());

        pnlImagen2.setBackground(new java.awt.Color(237, 233, 254));
        pnlImagen2.setLayout(new java.awt.GridLayout(1, 1));

        lblImagen2.setText("Imagen");
        lblImagen2.setForeground(new java.awt.Color(124, 58, 237));
        lblImagen2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlImagen2.add(lblImagen2);

        pnlDiseno2.add(pnlImagen2, java.awt.BorderLayout.CENTER);

        pnlDatosDiseno2.setBackground(new java.awt.Color(248, 250, 252));
        pnlDatosDiseno2.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12));
        pnlDatosDiseno2.setPreferredSize(new java.awt.Dimension(100, 64));
        pnlDatosDiseno2.setLayout(new java.awt.GridLayout(2, 1));

        lblNombreDiseno2.setText("Logo Cliente Andes");
        lblNombreDiseno2.setForeground(new java.awt.Color(30, 41, 59));
        lblNombreDiseno2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        pnlDatosDiseno2.add(lblNombreDiseno2);

        lblEstadoDiseno2.setText("En proceso");
        lblEstadoDiseno2.setForeground(new java.awt.Color(37, 99, 235));
        lblEstadoDiseno2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        pnlDatosDiseno2.add(lblEstadoDiseno2);

        pnlDiseno2.add(pnlDatosDiseno2, java.awt.BorderLayout.PAGE_END);

        pnlGaleria.add(pnlDiseno2);

        pnlDiseno3.setBackground(new java.awt.Color(248, 250, 252));
        pnlDiseno3.setLayout(new java.awt.BorderLayout());

        pnlImagen3.setBackground(new java.awt.Color(237, 233, 254));
        pnlImagen3.setLayout(new java.awt.GridLayout(1, 1));

        lblImagen3.setText("Imagen");
        lblImagen3.setForeground(new java.awt.Color(124, 58, 237));
        lblImagen3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlImagen3.add(lblImagen3);

        pnlDiseno3.add(pnlImagen3, java.awt.BorderLayout.CENTER);

        pnlDatosDiseno3.setBackground(new java.awt.Color(248, 250, 252));
        pnlDatosDiseno3.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12));
        pnlDatosDiseno3.setPreferredSize(new java.awt.Dimension(100, 64));
        pnlDatosDiseno3.setLayout(new java.awt.GridLayout(2, 1));

        lblNombreDiseno3.setText("Patrón Geométrico");
        lblNombreDiseno3.setForeground(new java.awt.Color(30, 41, 59));
        lblNombreDiseno3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        pnlDatosDiseno3.add(lblNombreDiseno3);

        lblEstadoDiseno3.setText("En proceso");
        lblEstadoDiseno3.setForeground(new java.awt.Color(37, 99, 235));
        lblEstadoDiseno3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        pnlDatosDiseno3.add(lblEstadoDiseno3);

        pnlDiseno3.add(pnlDatosDiseno3, java.awt.BorderLayout.PAGE_END);

        pnlGaleria.add(pnlDiseno3);

        pnlDiseno4.setBackground(new java.awt.Color(248, 250, 252));
        pnlDiseno4.setLayout(new java.awt.BorderLayout());

        pnlImagen4.setBackground(new java.awt.Color(237, 233, 254));
        pnlImagen4.setLayout(new java.awt.GridLayout(1, 1));

        lblImagen4.setText("Imagen");
        lblImagen4.setForeground(new java.awt.Color(124, 58, 237));
        lblImagen4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlImagen4.add(lblImagen4);

        pnlDiseno4.add(pnlImagen4, java.awt.BorderLayout.CENTER);

        pnlDatosDiseno4.setBackground(new java.awt.Color(248, 250, 252));
        pnlDatosDiseno4.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12));
        pnlDatosDiseno4.setPreferredSize(new java.awt.Dimension(100, 64));
        pnlDatosDiseno4.setLayout(new java.awt.GridLayout(2, 1));

        lblNombreDiseno4.setText("Diseño Navideño");
        lblNombreDiseno4.setForeground(new java.awt.Color(30, 41, 59));
        lblNombreDiseno4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        pnlDatosDiseno4.add(lblNombreDiseno4);

        lblEstadoDiseno4.setText("Pendiente");
        lblEstadoDiseno4.setForeground(new java.awt.Color(217, 119, 6));
        lblEstadoDiseno4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        pnlDatosDiseno4.add(lblEstadoDiseno4);

        pnlDiseno4.add(pnlDatosDiseno4, java.awt.BorderLayout.PAGE_END);

        pnlGaleria.add(pnlDiseno4);

        pnlDiseno5.setBackground(new java.awt.Color(248, 250, 252));
        pnlDiseno5.setLayout(new java.awt.BorderLayout());

        pnlImagen5.setBackground(new java.awt.Color(237, 233, 254));
        pnlImagen5.setLayout(new java.awt.GridLayout(1, 1));

        lblImagen5.setText("Imagen");
        lblImagen5.setForeground(new java.awt.Color(124, 58, 237));
        lblImagen5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlImagen5.add(lblImagen5);

        pnlDiseno5.add(pnlImagen5, java.awt.BorderLayout.CENTER);

        pnlDatosDiseno5.setBackground(new java.awt.Color(248, 250, 252));
        pnlDatosDiseno5.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12));
        pnlDatosDiseno5.setPreferredSize(new java.awt.Dimension(100, 64));
        pnlDatosDiseno5.setLayout(new java.awt.GridLayout(2, 1));

        lblNombreDiseno5.setText("Silueta Minimal");
        lblNombreDiseno5.setForeground(new java.awt.Color(30, 41, 59));
        lblNombreDiseno5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        pnlDatosDiseno5.add(lblNombreDiseno5);

        lblEstadoDiseno5.setText("Aprobado");
        lblEstadoDiseno5.setForeground(new java.awt.Color(22, 163, 74));
        lblEstadoDiseno5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        pnlDatosDiseno5.add(lblEstadoDiseno5);

        pnlDiseno5.add(pnlDatosDiseno5, java.awt.BorderLayout.PAGE_END);

        pnlGaleria.add(pnlDiseno5);

        pnlDiseno6.setBackground(new java.awt.Color(248, 250, 252));
        pnlDiseno6.setLayout(new java.awt.BorderLayout());

        pnlImagen6.setBackground(new java.awt.Color(237, 233, 254));
        pnlImagen6.setLayout(new java.awt.GridLayout(1, 1));

        lblImagen6.setText("Imagen");
        lblImagen6.setForeground(new java.awt.Color(124, 58, 237));
        lblImagen6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlImagen6.add(lblImagen6);

        pnlDiseno6.add(pnlImagen6, java.awt.BorderLayout.CENTER);

        pnlDatosDiseno6.setBackground(new java.awt.Color(248, 250, 252));
        pnlDatosDiseno6.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12));
        pnlDatosDiseno6.setPreferredSize(new java.awt.Dimension(100, 64));
        pnlDatosDiseno6.setLayout(new java.awt.GridLayout(2, 1));

        lblNombreDiseno6.setText("Estampado Retro");
        lblNombreDiseno6.setForeground(new java.awt.Color(30, 41, 59));
        lblNombreDiseno6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        pnlDatosDiseno6.add(lblNombreDiseno6);

        lblEstadoDiseno6.setText("Rechazado");
        lblEstadoDiseno6.setForeground(new java.awt.Color(220, 38, 38));
        lblEstadoDiseno6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        pnlDatosDiseno6.add(lblEstadoDiseno6);

        pnlDiseno6.add(pnlDatosDiseno6, java.awt.BorderLayout.PAGE_END);

        pnlGaleria.add(pnlDiseno6);

        pnlDiseno7.setBackground(new java.awt.Color(248, 250, 252));
        pnlDiseno7.setLayout(new java.awt.BorderLayout());

        pnlImagen7.setBackground(new java.awt.Color(237, 233, 254));
        pnlImagen7.setLayout(new java.awt.GridLayout(1, 1));

        lblImagen7.setText("Imagen");
        lblImagen7.setForeground(new java.awt.Color(124, 58, 237));
        lblImagen7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlImagen7.add(lblImagen7);

        pnlDiseno7.add(pnlImagen7, java.awt.BorderLayout.CENTER);

        pnlDatosDiseno7.setBackground(new java.awt.Color(248, 250, 252));
        pnlDatosDiseno7.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12));
        pnlDatosDiseno7.setPreferredSize(new java.awt.Dimension(100, 64));
        pnlDatosDiseno7.setLayout(new java.awt.GridLayout(2, 1));

        lblNombreDiseno7.setText("Diseño Corporativo X");
        lblNombreDiseno7.setForeground(new java.awt.Color(30, 41, 59));
        lblNombreDiseno7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        pnlDatosDiseno7.add(lblNombreDiseno7);

        lblEstadoDiseno7.setText("Aprobado");
        lblEstadoDiseno7.setForeground(new java.awt.Color(22, 163, 74));
        lblEstadoDiseno7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        pnlDatosDiseno7.add(lblEstadoDiseno7);

        pnlDiseno7.add(pnlDatosDiseno7, java.awt.BorderLayout.PAGE_END);

        pnlGaleria.add(pnlDiseno7);

        pnlDiseno8.setBackground(new java.awt.Color(248, 250, 252));
        pnlDiseno8.setLayout(new java.awt.BorderLayout());

        pnlImagen8.setBackground(new java.awt.Color(237, 233, 254));
        pnlImagen8.setLayout(new java.awt.GridLayout(1, 1));

        lblImagen8.setText("Imagen");
        lblImagen8.setForeground(new java.awt.Color(124, 58, 237));
        lblImagen8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlImagen8.add(lblImagen8);

        pnlDiseno8.add(pnlImagen8, java.awt.BorderLayout.CENTER);

        pnlDatosDiseno8.setBackground(new java.awt.Color(248, 250, 252));
        pnlDatosDiseno8.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12));
        pnlDatosDiseno8.setPreferredSize(new java.awt.Dimension(100, 64));
        pnlDatosDiseno8.setLayout(new java.awt.GridLayout(2, 1));

        lblNombreDiseno8.setText("Textura Denim");
        lblNombreDiseno8.setForeground(new java.awt.Color(30, 41, 59));
        lblNombreDiseno8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        pnlDatosDiseno8.add(lblNombreDiseno8);

        lblEstadoDiseno8.setText("En proceso");
        lblEstadoDiseno8.setForeground(new java.awt.Color(37, 99, 235));
        lblEstadoDiseno8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        pnlDatosDiseno8.add(lblEstadoDiseno8);

        pnlDiseno8.add(pnlDatosDiseno8, java.awt.BorderLayout.PAGE_END);

        pnlGaleria.add(pnlDiseno8);

        tabDisenos.add(pnlGaleria, java.awt.BorderLayout.CENTER);

        tabsProduccion.addTab("Diseños", tabDisenos);

        tabEstampados.setBackground(new java.awt.Color(255, 255, 255));
        tabEstampados.setLayout(new java.awt.BorderLayout());
        tabsProduccion.addTab("Estampados", tabEstampados);

        pnlCentro.add(tabsProduccion, java.awt.BorderLayout.CENTER);

        pnlInfo.setBackground(new java.awt.Color(239, 246, 255));
        pnlInfo.setPreferredSize(new java.awt.Dimension(100, 44));
        pnlInfo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 16, 12));

        lblInfo.setText("Los diseños en estado “Rechazado” deben revisarse con el Diseñador antes de continuar a producción.");
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
                new Produccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnContactenos;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnNotificaciones;
    private javax.swing.JButton btnNuevoDiseno;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnProduccion;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel lblActivosNum;
    private javax.swing.JLabel lblActivosTxt;
    private javax.swing.JLabel lblAprobadosNum;
    private javax.swing.JLabel lblAprobadosTxt;
    private javax.swing.JLabel lblEstadoDiseno1;
    private javax.swing.JLabel lblEstadoDiseno2;
    private javax.swing.JLabel lblEstadoDiseno3;
    private javax.swing.JLabel lblEstadoDiseno4;
    private javax.swing.JLabel lblEstadoDiseno5;
    private javax.swing.JLabel lblEstadoDiseno6;
    private javax.swing.JLabel lblEstadoDiseno7;
    private javax.swing.JLabel lblEstadoDiseno8;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblImagen3;
    private javax.swing.JLabel lblImagen4;
    private javax.swing.JLabel lblImagen5;
    private javax.swing.JLabel lblImagen6;
    private javax.swing.JLabel lblImagen7;
    private javax.swing.JLabel lblImagen8;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombreDiseno1;
    private javax.swing.JLabel lblNombreDiseno2;
    private javax.swing.JLabel lblNombreDiseno3;
    private javax.swing.JLabel lblNombreDiseno4;
    private javax.swing.JLabel lblNombreDiseno5;
    private javax.swing.JLabel lblNombreDiseno6;
    private javax.swing.JLabel lblNombreDiseno7;
    private javax.swing.JLabel lblNombreDiseno8;
    private javax.swing.JLabel lblProcesoNum;
    private javax.swing.JLabel lblProcesoTxt;
    private javax.swing.JLabel lblRechazadosNum;
    private javax.swing.JLabel lblRechazadosTxt;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlActivos;
    private javax.swing.JPanel pnlAprobados;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JPanel pnlDatosDiseno1;
    private javax.swing.JPanel pnlDatosDiseno2;
    private javax.swing.JPanel pnlDatosDiseno3;
    private javax.swing.JPanel pnlDatosDiseno4;
    private javax.swing.JPanel pnlDatosDiseno5;
    private javax.swing.JPanel pnlDatosDiseno6;
    private javax.swing.JPanel pnlDatosDiseno7;
    private javax.swing.JPanel pnlDatosDiseno8;
    private javax.swing.JPanel pnlDiseno1;
    private javax.swing.JPanel pnlDiseno2;
    private javax.swing.JPanel pnlDiseno3;
    private javax.swing.JPanel pnlDiseno4;
    private javax.swing.JPanel pnlDiseno5;
    private javax.swing.JPanel pnlDiseno6;
    private javax.swing.JPanel pnlDiseno7;
    private javax.swing.JPanel pnlDiseno8;
    private javax.swing.JPanel pnlGaleria;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlImagen1;
    private javax.swing.JPanel pnlImagen2;
    private javax.swing.JPanel pnlImagen3;
    private javax.swing.JPanel pnlImagen4;
    private javax.swing.JPanel pnlImagen5;
    private javax.swing.JPanel pnlImagen6;
    private javax.swing.JPanel pnlImagen7;
    private javax.swing.JPanel pnlImagen8;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlMenuInferior;
    private javax.swing.JPanel pnlProceso;
    private javax.swing.JPanel pnlRechazados;
    private javax.swing.JPanel pnlSidebar;
    private javax.swing.JPanel pnlTarjetas;
    private javax.swing.JPanel pnlTextoTitulo;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPanel tabDisenos;
    private javax.swing.JPanel tabEstampados;
    private javax.swing.JTabbedPane tabsProduccion;
    private javax.swing.JTextField txtBuscarGlobal;
    // End of variables declaration//GEN-END:variables
}
