/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.restaurante;

import codigo.datosMesero;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 * @author @author juan diego
 * @author josep
 */
public class Principal extends javax.swing.JFrame {

    public static Principal i;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }
        });
    }
    private final String contra = "1";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuParaAdmin = new javax.swing.JButton();
        menuParaCocina = new javax.swing.JButton();
        menuParaCaja = new javax.swing.JButton();
        menumesero = new javax.swing.JButton();
        icono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);

        menuParaAdmin.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        menuParaAdmin.setText("Administrador");
        menuParaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuParaAdminActionPerformed(evt);
            }
        });

        menuParaCocina.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        menuParaCocina.setText("Cocina");
        menuParaCocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuParaCocinaActionPerformed(evt);
            }
        });

        menuParaCaja.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        menuParaCaja.setText("Caja");
        menuParaCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuParaCajaActionPerformed(evt);
            }
        });

        menumesero.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        menumesero.setText("Mesero");
        menumesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menumeseroActionPerformed(evt);
            }
        });

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menuParaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(menuParaCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuParaCocina, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menumesero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuParaAdmin)
                    .addComponent(menuParaCocina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuParaCaja)
                    .addComponent(menumesero))
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuParaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuParaAdminActionPerformed
        String pas = null;
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Ingrese la Contraseña:");
        JPasswordField pass = new JPasswordField(10);
        panel.add(label);
        panel.add(pass);
        String[] options = new String[]{"OK", "Cancel"};
        int option = JOptionPane.showOptionDialog(null, panel, "Contraseña Administrador",
                JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[1]);
        if (option == 0) {
            char[] password = pass.getPassword();
            pas = String.valueOf(password);
            if (this.contra.equals(pas)) {
                administrador adm = new administrador();
                adm.setVisible(true);
            } else {
                String vacio = "";
                if (pas.equals(vacio)) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar  una contraseña");
                } else {
                    JOptionPane.showMessageDialog(null, "Error de contraseña");
                }
            }

        }
    }//GEN-LAST:event_menuParaAdminActionPerformed

    private void menuParaCocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuParaCocinaActionPerformed
        cocina cocina = new cocina();
        cocina.setVisible(true);
    }//GEN-LAST:event_menuParaCocinaActionPerformed
    int cont = 0;
    private void menumeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menumeseroActionPerformed
        try {
            int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su codigo"));
            boolean exist = false;

            for (datosMesero object : codigo.listaMeseros.meseros) {
                if (object.getCodigo() == cod) {
                    mesero mesero = new mesero();
                    mesero.setVisible(true);
                    mesero.setTitle(object.getNombre());
                    exist = true;
                }
            }
            if (!exist) {
                JOptionPane.showMessageDialog(null, "codigo no existe");
            }
        } catch (Exception e) {

            System.out.println("cancelado");
        }


    }//GEN-LAST:event_menumeseroActionPerformed

    private void menuParaCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuParaCajaActionPerformed
        caja caja = new caja();
        caja.setVisible(true);
    }//GEN-LAST:event_menuParaCajaActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icono;
    private javax.swing.JButton menuParaAdmin;
    private javax.swing.JButton menuParaCaja;
    private javax.swing.JButton menuParaCocina;
    private javax.swing.JButton menumesero;
    // End of variables declaration//GEN-END:variables

    private void close() {
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}
