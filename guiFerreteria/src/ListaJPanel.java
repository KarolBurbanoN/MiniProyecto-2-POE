/**
 * @file ListaJPanel.java
 * @brief Este archivo contiene la implementación del inventario. CMP
 * @author
 *         - Sebastian Castro - 2359435
 *         - Karol Burbano - 2359305
 *         -Veronica Mujica - 2359406
 *         -Jeidy Murillo - 2359310 
 */



import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;



public class ListaJPanel extends javax.swing.JPanel {  
    //  lista donde se guarda los productos
    public ArrayList<Producto> productos;
    
    public ListaJPanel() {
        initComponents();
        productos = new ArrayList<>();
    }
    

    /**
     * 
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        //Componentes de la parte grafica
        jPanelSecbg = new javax.swing.JPanel();
        jLabelimg = new javax.swing.JLabel();
        jButtonEstadistica = new javax.swing.JButton();
        jLabeltitulo = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonAñadir = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jTextFieldCantidad = new javax.swing.JTextField();
        jTextFieldCodigo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaMaterial = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaEjemplos = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaHerramienta = new javax.swing.JTextArea();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProductos = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(663, 0));
        setPreferredSize(new java.awt.Dimension(663, 433));

        jPanelSecbg.setBackground(new java.awt.Color(255, 255, 255));

        jLabelimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("puntero2.png"))); // NOI18N

        jButtonEstadistica.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButtonEstadistica.setForeground(new java.awt.Color(51, 0, 51));
        jButtonEstadistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("inspeccion.png"))); // NOI18N
        jButtonEstadistica.setText("Estadistica");
        jButtonEstadistica.setToolTipText("");
        jButtonEstadistica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonEstadistica.setContentAreaFilled(false);
        jButtonEstadistica.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonEstadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstadisticaActionPerformed(evt);
            }
        });

        jLabeltitulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 36)); // NOI18N
        jLabeltitulo.setText("Inventario Ferreteria Tuluá Valle");

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("buscar.png"))); // NOI18N
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setContentAreaFilled(false);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonActualizar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(51, 0, 51));
        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("actualizar-flecha.png"))); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.setToolTipText("");
        jButtonActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonActualizar.setContentAreaFilled(false);
        jButtonActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jTextFieldBuscar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jTextFieldBuscar.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldBuscar.setToolTipText("");
        jTextFieldBuscar.setDragEnabled(true);

        jButtonAñadir.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButtonAñadir.setForeground(new java.awt.Color(51, 0, 51));
        jButtonAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("agregar-producto.png"))); // NOI18N
        jButtonAñadir.setText("Agregar");
        jButtonAñadir.setToolTipText("");
        jButtonAñadir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonAñadir.setContentAreaFilled(false);
        jButtonAñadir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
            }
        });

        jButtonBorrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButtonBorrar.setForeground(new java.awt.Color(51, 0, 51));
        jButtonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("contenedor-de-basura.png"))); // NOI18N
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.setToolTipText("");
        jButtonBorrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonBorrar.setContentAreaFilled(false);
        jButtonBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombre del producto");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Descripcion del producto");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Precio del producto");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Cantidad en stock");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Material de elaboración del producto");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Ejemplos de uso del producto");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Herramienta necesaria para poder usarse");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Categoria del producto");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Codigo del producto");

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(102, 102, 102));

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDescripcion);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setForeground(new java.awt.Color(102, 102, 102));

        jTextAreaMaterial.setColumns(20);
        jTextAreaMaterial.setRows(5);
        jScrollPane3.setViewportView(jTextAreaMaterial);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setForeground(new java.awt.Color(102, 102, 102));

        jTextAreaEjemplos.setColumns(20);
        jTextAreaEjemplos.setRows(5);
        jScrollPane4.setViewportView(jTextAreaEjemplos);

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setForeground(new java.awt.Color(102, 102, 102));

        jTextAreaHerramienta.setColumns(20);
        jTextAreaHerramienta.setRows(5);
        jScrollPane5.setViewportView(jTextAreaHerramienta);

        jComboBoxCategoria.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jComboBoxCategoria.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuerdas y amarres", "Abrasivos y silicona", "Adhesivos, lubricantes, pegantes ", "Grifos y valvulas", "Pinturas", "Electricos", "Tubos y Accesorios PVC", "Herramientas manuales", "Herrajes y cerraduras ", "Ferreteria especial", "Discos", "Seguridad industrial", "Agro y construccion" }));
        jComboBoxCategoria.setToolTipText("");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jListProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListProductos);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Buscar por codigo del producto");

        javax.swing.GroupLayout jPanelSecbgLayout = new javax.swing.GroupLayout(jPanelSecbg);
        jPanelSecbg.setLayout(jPanelSecbgLayout);
        jPanelSecbgLayout.setHorizontalGroup(
            jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSecbgLayout.createSequentialGroup()
                .addGroup(jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSecbgLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSecbgLayout.createSequentialGroup()
                                .addGroup(jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelSecbgLayout.createSequentialGroup()
                                .addGroup(jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSecbgLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39))
                                    .addGroup(jPanelSecbgLayout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addGroup(jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSecbgLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelSecbgLayout.createSequentialGroup()
                                        .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41))
                                    .addGroup(jPanelSecbgLayout.createSequentialGroup()
                                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelSecbgLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jButtonEstadistica, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSecbgLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelSecbgLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelSecbgLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabelimg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabeltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelSecbgLayout.createSequentialGroup()
                    .addGap(262, 262, 262)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1131, Short.MAX_VALUE)))
        );
        jPanelSecbgLayout.setVerticalGroup(
            jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSecbgLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeltitulo)
                    .addComponent(jLabelimg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSecbgLayout.createSequentialGroup()
                        .addGroup(jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSecbgLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelSecbgLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelSecbgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSecbgLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSecbgLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonBuscar)
                                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)))
                        .addGroup(jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelSecbgLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel4)
                                    .addGap(12, 12, 12)
                                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel5)
                                    .addGap(12, 12, 12)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSecbgLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEstadistica, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanelSecbgLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelSecbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSecbgLayout.createSequentialGroup()
                    .addContainerGap(78, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelSecbg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelSecbg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Boton que muestra las estadisticas de los productos en el inventario 
    private void jButtonEstadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstadisticaActionPerformed
        mostrarEstadisticas(productos);
    }//GEN-LAST:event_jButtonEstadisticaActionPerformed

    //Boton que actualiza los datos de un producto
    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        modificarProducto();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    //Boton que realiza la funcion de borrar un poducto en el inventario
    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        String inputBorrar = JOptionPane.showInputDialog("Formas de eliminar un producto \n 1. Eliminar por indice\n 2. Eliminar por codigo\n Escoge el numero de la manera que quieres eliminar el producto: ");
        //Condicional que valida si cancela la operacion realizada
        if (inputBorrar == null) {
            //Muestra el mensaje cuando se cancela la operación
            JOptionPane.showMessageDialog(null, "Operación cancelada.", "Cancelar", JOptionPane.CANCEL_OPTION);
        }else if (inputBorrar.isEmpty()) {//Condicional que verifica que al darle ok que el campo no este vacio
            //En caso de estar vacio le sale la siguiente advertencia
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                //Opciones de como eliminar un producto
                int opcion = Integer.parseInt(inputBorrar);
                if (opcion == 1) {
                    eliminarPorIndice();
                } else if (opcion == 2) {
                    eliminarPorCodigo();
                } else {
                    throw new InputMismatchException("Dato incorrecto, Opcion invalida");
                }
            //Excepciones en caso de algun error
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (InputMismatchException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } 
        

    }//GEN-LAST:event_jButtonBorrarActionPerformed

    //Boton que permite buscar un producto en el inventario por el codigo
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try{
            String codigo = jTextFieldBuscar.getText();
            int codigoBuscar = Integer.parseInt(codigo);
            buscarProductoPorCodigo(codigoBuscar);
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor ingresa un codigo del producto válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    //Boton que permite añadir un producto en el inventario 
    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        
        String nombres, descripcion,prec, cant, material, ejemplos, herramienta, categoria, cod; 
        int precio = 0;
        int cantidad = 0;
        int codigo = 0;
        
        prec = jTextFieldPrecio.getText();
        cant = jTextFieldCantidad.getText();
        cod = jTextFieldCodigo.getText();
        
        nombres = jTextFieldNombre.getText();
        descripcion = jTextAreaDescripcion.getText();
        material = jTextAreaMaterial.getText();
        ejemplos = jTextAreaEjemplos.getText();
        herramienta = jTextAreaHerramienta.getText();
        categoria = jComboBoxCategoria.getSelectedItem().toString();
        
        if (nombres.isEmpty() || descripcion.isEmpty() || prec.isEmpty() || cant.isEmpty() || material.isEmpty() || ejemplos.isEmpty()|| herramienta.isEmpty() || categoria.isEmpty()|| cod.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        String nomb = nombres;
                        String descrip = descripcion;
                        precio = Integer.parseInt(prec);
                        cantidad = Integer.parseInt(cant);
                        String mat = material;
                        String ejem = ejemplos;
                        String herra = herramienta;
                        String categ = categoria;
                        codigo = Integer.parseInt(cod);

                        if (precio < 0 || cantidad < 0 || codigo < 0) {
                            throw new InputMismatchException("Número de precio o de código o de cantidad inválido. Deben ser mayores que cero.");
                        }
                        // Verificar si el codigo ya existe en el inventario
                        for (Producto producto : productos) {
                            if (producto.getCodigo() == codigo) {
                                //Si existe le impide agregarlo hasta que escriba otro codigo
                                JOptionPane.showMessageDialog(null,"El codigo ya existe, debes ingresar otro codigo.", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }

                        productos.add(new Producto(nomb,descrip,precio,cantidad,mat,ejem,herra,categ,codigo));
                        listarInventario();
                    } catch (InputMismatchException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "El dato ingresado en precio o cantidad o codigo debe ser numerico");
                    }
                }
        
    }//GEN-LAST:event_jButtonAñadirActionPerformed
    //Evento que permite ver mas informacion del producto seleccionado
    private void jListProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProductosMouseClicked
        int info = jListProductos.getSelectedIndex();
        
        if(info == -1){
            JOptionPane.showMessageDialog(null, "El inventario se enuentra vacio", "Atencion!!!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,productos.get(info).getDatos(),"Mas información sobre el producto", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jListProductosMouseClicked
    
    //Funcion que comprueba si el inventario esta vacio
    public void infoVacio() {
        if (productos.isEmpty()) {
            throw new IllegalStateException("...El inventario se encuentra vacio...");
        }
    }
    
    //Funcion que muestra los productos
    @SuppressWarnings("unchecked")
    public void listarInventario() {
        @SuppressWarnings("rawtypes")
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < productos.size(); i++) {
            model.addElement("Indice: "+ i+" | Nombre del producto: "+productos.get(i).getNombre()+" | Descripcion del producto: "+ productos.get(i).getDescripcion()+" | Precio del producto: "+productos.get(i).getPrecio()+" | Cantidad en stock del producto: "+productos.get(i).getCantidad());
        }
        jListProductos.setModel(model);
    }
    
    //Funcion que elimina los productos por el indice
    public void eliminarPorIndice() {
        String indiceEliminar =JOptionPane.showInputDialog("Ingrese el índice del producto a eliminar (recuerda que empieza desde 0):");

        if (indiceEliminar == null || indiceEliminar.isEmpty()) {
            //Muestra el mensaje cuando se cancela la operación o el campo se encuentre vacio
            JOptionPane.showMessageDialog(null, "Operación cancelada  o el campo se encuentra vacio.", "Advertencia", JOptionPane.CANCEL_OPTION);
        }else {
            try {
                int indice = Integer.parseInt(indiceEliminar);
                infoVacio();
                if (indice < 0 || indice >= productos.size()) {
                    throw new ArrayIndexOutOfBoundsException("Índice de producto inválido.");
                }
                // Eliminar producto por su índice
                productos.remove((int)indice);
                JOptionPane.showMessageDialog(null, "Producto eliminado.", "Eliminacion realizada exitosamente", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
            }catch (IllegalStateException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Atencion!!!", JOptionPane.INFORMATION_MESSAGE);
            }
            listarInventario();
        }
    }
    
    //Funcion que elimina el producto por el codigo
    public void eliminarPorCodigo() {
        String codigoEliminar = JOptionPane.showInputDialog("Ingrese el codigo del producto a eliminar: ");
        
        if (codigoEliminar == null || codigoEliminar.isEmpty()) {
            //Muestra el mensaje cuando se cancela la operación o el campo se encuentra vacio
            JOptionPane.showMessageDialog(null, "Operación cancelada  o el campo se encuentra vacio.", "Advertencia", JOptionPane.CANCEL_OPTION);
        }else {
            try {
                int codigo = Integer.parseInt(codigoEliminar);
                infoVacio();
                Producto productoBuscado = null;
                boolean productoExiste = false;
                for (Producto producto : productos) {
                    if (producto.getCodigo() == codigo) {
                        productoExiste = true;
                        productoBuscado = producto;
                        break;
                    }
                }
                if(!productoExiste){
                        throw new ProductNotFoundException("Producto no encontrado");
                }
                
                if (productoBuscado !=null) {
                // Eliminar producto por su codigo
                    productos.remove(productoBuscado);
                    JOptionPane.showMessageDialog(null, "Producto eliminado.", "Eliminacion realizada exitosamente", JOptionPane.INFORMATION_MESSAGE);    
                    
                }
            }catch (IllegalStateException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Atencion!!!", JOptionPane.INFORMATION_MESSAGE);
            }catch(ProductNotFoundException e) { 
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Atencion!!!", JOptionPane.WARNING_MESSAGE);
            }catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Indice invalido","Error", JOptionPane.ERROR_MESSAGE);
            }
            listarInventario();
        }
    }

    //Funcion de una excepcion para cuando se cancela o se acepte un campo vacio
    public void campoVaciocancelado(String campo){
        if (campo == null || campo.isEmpty()) {
            //Muestra el mensaje cuando se cancela la operación o el campo se encuentra vacio
            throw new InputMismatchException("Operación cancelada  o el campo se encuentra vacio.");
        }
    }

    //Funcion que modifica el producto
    public void modificarProducto() {
        String codigo = JOptionPane.showInputDialog("Ingrese el código del producto a modificar:");
        if (codigo == null || codigo.isEmpty() ) {
            //Muestra el mensaje cuando se cancela la operación o el campo se encuentre vacio
            JOptionPane.showMessageDialog(null, "Operación cancelada o el campo se encuentra vacio.", "Advertencia", JOptionPane.CANCEL_OPTION);
        }else {
            try {
                int codigoModificar = Integer.parseInt(codigo);
                infoVacio();
                // Buscar el producto por su código
                Producto productoModificado = null;
                for (Producto producto : productos) {
                    if (producto.getCodigo() == codigoModificar) {
                        productoModificado = producto;
                        break;
                    }
                }

                // Si no se encontró el producto, mostrar un mensaje y salir del método
                if (productoModificado == null) {
                    JOptionPane.showMessageDialog(null, "Producto no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Pedir al usuario qué campo desea modificar
                String[] opciones = {"Nombre", "Descripción", "Precio", "Cantidad", "Material", "Ejemplos", "Herramienta", "Categoría"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione el campo que desea modificar:",
                        "Modificar Producto", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                if (opcionSeleccionada == null) {
                    //Muestra el mensaje cuando se cancela la operación
                    JOptionPane.showMessageDialog(null, "Operación cancelada.", "Advertencia", JOptionPane.CANCEL_OPTION);
                }else {

                    // Modificar el campo seleccionado
                    switch (opcionSeleccionada) {
                        case "Nombre":
                            String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
                            campoVaciocancelado(nuevoNombre);
                            productoModificado.setNombre(nuevoNombre);
                            break;
                            
                            
                        case "Descripción":
                            String nuevaDescripcion = JOptionPane.showInputDialog("Ingrese la nueva descripción:");
                            campoVaciocancelado(nuevaDescripcion);
                            productoModificado.setDescripcion(nuevaDescripcion);
                            break;
                        case "Precio":

                            int nuevoPrecio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo precio:"));
                            
                            if (nuevoPrecio < 0) {
                                throw new InputMismatchException("Número de precio inválido. Debe ser mayor que cero y no puede estar vacio.");
                            } 
                            productoModificado.setPrecio(nuevoPrecio);
                            break;
                        case "Cantidad":
                            int nuevaCantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantidad:"));
                            if (nuevaCantidad < 0) {
                                throw new InputMismatchException("Número de cantidad inválido. Debe ser mayor que cero y no puede estar vacio.");
                            }  
                            productoModificado.setCantidad(nuevaCantidad);
                            break;
                        case "Material":
                            String nuevoMaterial = JOptionPane.showInputDialog("Ingrese el nuevo material:");
                            campoVaciocancelado(nuevoMaterial); 
                            productoModificado.setMaterial(nuevoMaterial);
                            
                            break;
                        case "Ejemplos":
                            String nuevosEjemplos = JOptionPane.showInputDialog("Ingrese los nuevos ejemplos:");
                            campoVaciocancelado(nuevosEjemplos);
                            productoModificado.setEjemplos(nuevosEjemplos);
                            
                            break;
                        case "Herramienta":
                            String nuevaHerramienta = JOptionPane.showInputDialog("Ingrese la nueva herramienta:");
                            campoVaciocancelado(nuevaHerramienta);
                            productoModificado.setHerramienta(nuevaHerramienta);
                            
                            break;
                        case "Categoría":
                            
                            // Crear un JComboBox con las opciones de categoría
                            String[] opcionesCategoria = {"Cuerdas y amarres", "Abrasivos y silicona", "Adhesivos, lubricantes, pegantes ", "Grifos y valvulas", "Pinturas", "Electricos", "Tubos y Accesorios PVC", "Herramientas manuales", "Herrajes y cerraduras ", "Ferreteria especial", "Discos", "Seguridad industrial", "Agro y construccion"};
                            
                            JComboBox<String> comboBoxCategoria = new JComboBox<>(opcionesCategoria);
                            // Mostrar el JComboBox en un JOptionPane
                            JOptionPane.showMessageDialog(null, comboBoxCategoria, "Seleccione la nueva categoría:", JOptionPane.QUESTION_MESSAGE);
                            
                            // Obtener la categoría seleccionada del JComboBox
                            String nuevaCategoria = (String) comboBoxCategoria.getSelectedItem();
                            
                            // Actualizar la categoría del producto
                            productoModificado.setCategoria(nuevaCategoria);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción inválida.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                    }

                    // Mostrar un mensaje de éxito
                    JOptionPane.showMessageDialog(null, "Producto modificado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IllegalStateException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Atencion!", JOptionPane.INFORMATION_MESSAGE);
            }catch (InputMismatchException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El dato ingresado debe ser numerico");
            }
        // Listar el inventario actualizado
        listarInventario();
        }   
    }
    
    //Funcion que muestra las estaditicas
    public void mostrarEstadisticas(ArrayList<Producto>productos) {
        // a. Calcular el precio total de todos los productos en inventario
        
        int precioTotal = calcularPrecioTotal(productos);

        // b. Encontrar los 2 productos con más stock y los 2 con menos stock
        ArrayList<Producto> productosMasStock = encontrarProductosMasStock(productos);
        ArrayList<Producto> productosMenosStock = encontrarProductosMenosStock(productos);

        // c. Encontrar las herramientas que más se usan para los productos
        ArrayList<String>herramientaMasUsada = encontrarHerramientasMasUsadas(productos);
        // Convertir cada herramienta a minúsculas para comparación
        if (productosMasStock.isEmpty() || productosMenosStock.isEmpty() || herramientaMasUsada.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El inventario se enuentra vacio", "Atencion!!!", JOptionPane.INFORMATION_MESSAGE);
        } else{
            // Mostrar estadísticas en un JOptionPane
            String mensaje = "Estadísticas del inventario:\n\n" +
                    "Precio total de todos los productos: " + precioTotal + "\n\n" +
                    "Productos con más stock:\n" + convertirAString(productosMasStock) + "\n\n" +
                    "Productos con menos stock:\n" + convertirAString(productosMenosStock) + "\n\n" +
                    "Herramienta más usada para los productos:\n "+ herramientaMasUsada + "\n\n";
            
            JOptionPane.showMessageDialog(null, mensaje, "Estadísticas del inventario", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //Funcion para calcular el precio total
    private int calcularPrecioTotal(ArrayList<Producto>productos) {
        int precioTotal = 0;
        for (Producto producto : productos) {
            precioTotal += producto.getPrecio() * producto.getCantidad();
        }
        return precioTotal;
    }
    //Funcion para encontrar los productos con mas stock
    private ArrayList<Producto> encontrarProductosMasStock(ArrayList<Producto>productos) {
        ArrayList<Producto> productosMasStock = new ArrayList<>();
        Producto max1 = null, max2 = null;

        for (Producto producto : productos) {
            if (max1 == null || producto.getCantidad() > max1.getCantidad()) {
                max2 = max1;
                max1 = producto;
            } else if (max2 == null || producto.getCantidad() > max2.getCantidad()) {
                max2 = producto;
            }
        }

        if (max1 != null) {
            productosMasStock.add(max1);
        }
        if (max2 != null) {
            productosMasStock.add(max2);
        }

        return productosMasStock;
    }
    //Funcion para encontrar los productos con menos stock
    private ArrayList<Producto>encontrarProductosMenosStock(ArrayList<Producto>productos) {
        ArrayList<Producto>productosMenosStock = new ArrayList<>();
        Producto min1 = null, min2 = null;

        for (Producto producto : productos) {
            if (min1 == null || producto.getCantidad() < min1.getCantidad()) {
                min2 = min1;
                min1 = producto;
            } else if (min2 == null || producto.getCantidad() < min2.getCantidad()) {
                min2 = producto;
            }
        }

        if (min1 != null) {
            productosMenosStock.add(min1);
        }
        if (min2 != null) {
            productosMenosStock.add(min2);
        }

        return productosMenosStock;
    }
    
    //Funcion para encontrar las herramientas mas usadas
    private static ArrayList<String> encontrarHerramientasMasUsadas(ArrayList<Producto> productos) {
        // Inicializar variables para almacenar las herramientas más usadas
        ArrayList<String> herramientasMasUsadas = new ArrayList<>();
        int maximaCantidad = 0;
        
        // Iterar a través de la lista de productos
        for (Producto producto : productos) {
            // Contar las ocurrencias de cada herramienta
            int cantidad = contarHerramienta(productos, producto);
            
            // Actualizar las herramientas más usadas y maximaCantidad
            if (cantidad > maximaCantidad) {
                herramientasMasUsadas.clear();
                herramientasMasUsadas.add(producto.getHerramienta());
                maximaCantidad = cantidad;
            } else if (cantidad == maximaCantidad && !herramientasMasUsadas.contains(producto.getHerramienta())) {
                herramientasMasUsadas.add(producto.getHerramienta());
            }
        }
        
        return herramientasMasUsadas;
    }
    
    // Método auxiliar para contar las ocurrencias de una herramienta en la lista de productos
    private static int contarHerramienta(ArrayList<Producto> productos, Producto producto) {
        int cantidad = 0;
        for (Producto p : productos) {
            if (p.getHerramienta().equalsIgnoreCase(producto.getHerramienta())) {
                cantidad++;
            }
        }
        return cantidad;
    }

    //Funcion para que se convierta en string
    private static String convertirAString(ArrayList<Producto> productos) {
        String resultado = "";
        if (productos != null) {
            for (Producto producto : productos) {
                resultado += "Nombre: " + producto.getNombre() + "\n";
                resultado += "Descripción: " + producto.getDescripcion() + "\n";
                resultado += "Cantidad: " + producto.getCantidad() + " unidades\n\n";
            }
        }
        return resultado;
    }

    //Funcion para buscar por codigo el producto
    public void buscarProductoPorCodigo(int codigoBusqueda) {

        try {
            infoVacio();
            Producto productoBuscado = null;
            boolean productoExiste = false;
            for (Producto producto : productos) {
                if (producto.getCodigo() == codigoBusqueda) {
                    productoExiste = true;
                    productoBuscado = producto;
                    break;
                }
            }
            if (productoBuscado != null) {
                JOptionPane.showMessageDialog(null, "Producto encontrado", "Consulta realizada exitosamente", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Datos del producto buscado: \n"+ productoBuscado.getDatos());
            } 
            if(!productoExiste){
                throw new ProductNotFoundException("Producto no encontrado");
            }
        }catch (IllegalStateException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Atencion!", JOptionPane.INFORMATION_MESSAGE);
        }catch(ProductNotFoundException e) { 
            JOptionPane.showMessageDialog(null, e.getMessage(), "Atencion!", JOptionPane.WARNING_MESSAGE);
        }
    
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEstadistica;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelimg;
    private javax.swing.JLabel jLabeltitulo;
    private javax.swing.JList<String> jListProductos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelSecbg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextArea jTextAreaEjemplos;
    private javax.swing.JTextArea jTextAreaHerramienta;
    private javax.swing.JTextArea jTextAreaMaterial;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    // End of variables declaration//GEN-END:variables
}
