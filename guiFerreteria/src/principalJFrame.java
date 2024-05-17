/**
 * @file principalJFrame.java
 * @brief Este archivo contiene la implementación de la clase principal principalJFrame.
 * @author
 *         - Sebastian Castro - 2359435
 *         - Karol Burbano - 2359305
 *         -Veronica Mujica - 2359406
 *         -Jeidy Murillo - 2359310 
 */


import javax.swing.JPanel;

public class principalJFrame extends javax.swing.JFrame {
    private InicioJPanel inicioPanel;
    private ListaJPanel listaPanel;

    public principalJFrame(){
        initComponents();
        initContent();
    }

    //@SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    /**
     * Este método inicializa los componentes del JFrame.
     */
    private void initComponents() {
        //Componentes de la parte grafica
        jPanelMenu = new javax.swing.JPanel();
        jLabelConfig = new javax.swing.JLabel();
        jLabelInicio = new javax.swing.JLabel();
        jLabelConsulta = new javax.swing.JLabel();
        jPanelContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelMenu.setBackground(new java.awt.Color(51, 51, 51));

        jLabelConfig.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jLabelConfig.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConfig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("menu.png"))); // NOI18N
        jLabelConfig.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabelConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelConfig.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabelConfig.setIconTextGap(15);


        jLabelInicio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jLabelInicio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInicio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("hogar.png"))); // NOI18N
        jLabelInicio.setText("Pagina principal");
        jLabelInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabelInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelInicio.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabelInicio.setIconTextGap(15);
        jLabelInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInicioMouseClicked(evt);
            }
        });

        jLabelConsulta.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jLabelConsulta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConsulta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("inspeccion.png"))); // NOI18N
        jLabelConsulta.setText("Lista de inventario");
        jLabelConsulta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jLabelConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabelConsulta.setIconTextGap(15);
        jLabelConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelConsultaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabelConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        jPanelContent.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1003, Short.MAX_VALUE)
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



    private void initContent(){
        inicioPanel = new InicioJPanel();
        listaPanel = new ListaJPanel();
        mostrarContent(inicioPanel);
    }
    
    private void mostrarContent(JPanel ij){
        ij.setSize(1200, 1300);
        ij.setLocation(0,0);
        
        jPanelContent.removeAll();
        jPanelContent.add(ij,javax.swing.GroupLayout.Alignment.CENTER);
        jPanelContent.revalidate();
        jPanelContent.repaint();
    }

    //Muestra los Jpanel de inicio e inventario
    private void jLabelInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInicioMouseClicked
        mostrarContent(inicioPanel);
    }//GEN-LAST:event_jLabelInicioMouseClicked

    private void jLabelConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConsultaMouseClicked
        mostrarContent(listaPanel);
    }//GEN-LAST:event_jLabelConsultaMouseClicked
    

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
            java.util.logging.Logger.getLogger(principalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new principalJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelConfig;
    private javax.swing.JLabel jLabelConsulta;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelMenu;
    // End of variables declaration//GEN-END:variables
}
