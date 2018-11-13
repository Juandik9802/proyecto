/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_administrador;

import codigo.platillo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Diego Pachón
 */
public class platos extends javax.swing.JPanel {

    ArrayList<platillo> listaPlatos;
    //private ArrayList<String> porcion;
    private String tipo,nombre;
    private int precio,intento=-1;
    
    /**
     * Creates new form platos
     */
    public platos() {
        initComponents();
        nombrePlato.setEnabled(false);            
        precioPlato.setEnabled(false);
        detalles.setEnabled(false);
        agregarPorcion.setEnabled(false);
        tomarPlato.setEnabled(false);
        tomarPlatillo.setEnabled(false);
        listaPlatos=new ArrayList();                        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        nombrePlato = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        precioPlato = new javax.swing.JTextField();
        comidas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        detalles = new javax.swing.JTextField();
        agregarPorcion = new javax.swing.JButton();
        tomarPlatillo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tomarPlato = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        labelNombre.setText("Nombre del plato");

        jLabel2.setText("Precio");

        precioPlato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioPlatoKeyTyped(evt);
            }
        });

        comidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Almuerzo", "Cena", "Postres", "Bebidas" }));
        comidas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comidasItemStateChanged(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Porcion");

        agregarPorcion.setText("Agregar");
        agregarPorcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPorcionActionPerformed(evt);
            }
        });

        tomarPlatillo.setText("Agregar platillo");
        tomarPlatillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomarPlatilloActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel5.setText("Comidas");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comida.jpg"))); // NOI18N

        tomarPlato.setText("Limpiar");
        tomarPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomarPlatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(comidas, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(nombrePlato, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(precioPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(tomarPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(agregarPorcion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(tomarPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(detalles, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)))
                .addComponent(jLabel6)
                .addGap(76, 76, 76))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(405, 405, 405))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comidas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombre)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombrePlato, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(tomarPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(detalles, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregarPorcion)
                            .addComponent(tomarPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comidasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comidasItemStateChanged
        if (comidas.getSelectedItem()=="Seleccionar"){
            nombrePlato.setEnabled(false);            
            precioPlato.setEnabled(false);
            detalles.setEnabled(false);
            agregarPorcion.setEnabled(false);
            tomarPlato.setEnabled(false);
            tomarPlatillo.setEnabled(false);
        }else{
            if (comidas.getSelectedItem()=="Bebidas"|| comidas.getSelectedItem()=="Postres"){
                detalles.setEnabled(false);
                agregarPorcion.setEnabled(false);
                labelNombre.setText("Nombre");
                nombrePlato.setEnabled(!false);            
                precioPlato.setEnabled(!false);
                tomarPlato.setEnabled(true);
                tomarPlatillo.setEnabled(true);
            }else{
                tomarPlato.setEnabled(true);
                tomarPlatillo.setEnabled(true);
                nombrePlato.setEnabled(!false);            
                precioPlato.setEnabled(!false);
                detalles.setEnabled(true);
                agregarPorcion.setEnabled(true);
                labelNombre.setText("Nombre del plato");
            }
        }
        
    }//GEN-LAST:event_comidasItemStateChanged

    private void agregarPorcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPorcionActionPerformed
        listaPlatos.get(intento).porcion(detalles.getText());
        detalles.setText("");
    }//GEN-LAST:event_agregarPorcionActionPerformed

    private void tomarPlatilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomarPlatilloActionPerformed
        if (comidas.getSelectedItem()=="Seleccionar"||nombrePlato.getText().equals("")||precioPlato.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        }else{
            nombre=nombrePlato.getText();
            precio=Integer.parseInt(precioPlato.getText());
            if (comidas.getSelectedItem()=="Almuerzo"){
                tipo="Almuerzo";
            }
            if (comidas.getSelectedItem()=="Cena"){
                tipo="Cena";
            }
            if (comidas.getSelectedItem()=="Postres"){
                tipo="Postres";
            }
            if (comidas.getSelectedItem()=="Bebidas"){
                tipo="Bebidas";
            }        
            cargar();
            /*
            nombrePlato.setEnabled(false);            
            precioPlato.setEnabled(false);
            detalles.setEnabled(true);
            agregarPorcion.setEnabled(true);
            comidas.setEnabled(false);
            tomarPlatillo.setEnabled(false);*/
        }
    }//GEN-LAST:event_tomarPlatilloActionPerformed

    private void tomarPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomarPlatoActionPerformed
        nombrePlato.setText("");
        precioPlato.setText("");
        nombrePlato.setEnabled(!false);            
        precioPlato.setEnabled(!false);
        detalles.setEnabled(false);
        agregarPorcion.setEnabled(false);
        comidas.setSelectedItem("Seleccionar");
        comidas.setEnabled(true);
        tomarPlatillo.setEnabled(!false);
        codigo.archivoPlatos.crear(listaPlatos);
    }//GEN-LAST:event_tomarPlatoActionPerformed

    private void precioPlatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioPlatoKeyTyped
        char c =evt.getKeyChar();
        if (c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_precioPlatoKeyTyped
    
    private void cargar() {
        listaPlatos.add(new platillo(tipo,nombre,precio));
        intento++;
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarPorcion;
    private javax.swing.JComboBox<String> comidas;
    private javax.swing.JTextField detalles;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JTextField nombrePlato;
    private javax.swing.JTextField precioPlato;
    private javax.swing.JButton tomarPlatillo;
    private javax.swing.JButton tomarPlato;
    // End of variables declaration//GEN-END:variables
}
