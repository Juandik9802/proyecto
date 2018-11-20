/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_administrador;

import codigo.menusCarga;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan Diego
 */
public class muestraMenuSemana extends javax.swing.JPanel {

    /**
     * Creates new form muetraMenuSemana
     */
    public muestraMenuSemana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        muestraMenu = new javax.swing.JTable();
        menuDia = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Menu del Dia");

        muestraMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(muestraMenu);

        menuDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Dia--", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" }));
        menuDia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                menuDiaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuDia, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    DefaultTableModel model;
    private void menuDiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_menuDiaItemStateChanged
        if(menuDia.getSelectedItem()!="--Dia--"){
            model = new DefaultTableModel();
            String Dia =(String) menuDia.getSelectedItem();
            añadirColumnas();
            insertarFilas(Dia);
            
        }else{
            JOptionPane.showMessageDialog(null, "Seleccion incorrecta");
        }
            
        
    }//GEN-LAST:event_menuDiaItemStateChanged
    
    private void añadirColumnas(){
            model.addColumn("Nombre");
            model.addColumn("Tipo");
            muestraMenu.setModel(model);
        }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> menuDia;
    private javax.swing.JTable muestraMenu;
    // End of variables declaration//GEN-END:variables
int cont=0;
    private void insertarFilas(String Dia) {
        
        for (menusCarga carga : codigo.archivoMenus.mostrarMenu) {
            if (Dia.equals(carga.getDia())){
                String[] agregar=new String[2];
                for (String string : carga.getAlmuerzos()){
                    agregar[0]=string;
                    agregar[1]="Almuerzo";
                    model.addRow(agregar);
                }
                for (String string : carga.getCenas()){
                    agregar[0]=string;
                    agregar[1]="Cena";
                    model.addRow(agregar);
                }
                for (String string : carga.getBebidas()){
                    agregar[0]=string;
                    agregar[1]="Bebida";
                    model.addRow(agregar);
                }
                for (String string : carga.getPostres()){
                    agregar[0]=string;
                    agregar[1]="Postre";
                    model.addRow(agregar);
                }
            }            
        }
    }
}
