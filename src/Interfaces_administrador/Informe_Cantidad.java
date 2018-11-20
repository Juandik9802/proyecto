/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_administrador;

import codigo.datosMesero;
import java.text.MessageFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author josep
 */
public class Informe_Cantidad extends javax.swing.JPanel {
 DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form Informe_Cantidad
     */
    public Informe_Cantidad() {
        initComponents();
        iniciar_tabla();
        //incertarColunas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCantidad = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imprimir = new javax.swing.JButton();

        setLayout(null);

        tablaCantidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaCantidad);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 260, 452, 100);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2);
        jScrollPane2.setBounds(130, 390, 360, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Total:");
        add(jLabel1);
        jLabel1.setBounds(70, 400, 50, 17);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/platos.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(10, 10, 330, 210);

        imprimir.setText("Imprimir");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });
        add(imprimir);
        imprimir.setBounds(420, 230, 73, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        MessageFormat Header = new MessageFormat("Menu");
        MessageFormat footer = new MessageFormat("Page[0,number,integer]");
        //String valores=llenar_tabla();
        String valores="ñaosdhfñakjsdhfñausdjhf";
        try { 
            tablaCantidad.print(JTable.PrintMode.NORMAL,Header,footer);
        } catch (java.awt.print.PrinterException ex) {
            System.out.println("Error al crear el archivo. "+ex);
        }
    }//GEN-LAST:event_imprimirActionPerformed
    
    private void iniciar_tabla(){
        model.addColumn("Mesa");
        model.addColumn("Efectivo");
        model.addColumn("Débito");
        model.addColumn("Crédito");
        tablaCantidad.setModel(model);
    }
    
    private void incertarFila() {
        for (datosMesero carga : codigo.listaMeseros.meseros) {
            String[] agregar=new String[3];
            agregar[0]=String.valueOf(carga.getCodigo());
            agregar[1]=carga.getNombre();
            agregar[2]=carga.getApellido();
            model.addRow(agregar);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton imprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tablaCantidad;
    // End of variables declaration//GEN-END:variables
}
