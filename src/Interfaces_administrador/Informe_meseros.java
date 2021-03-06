/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_administrador;

import codigo.datosMesero;
import codigo.facturacion;
import java.text.MessageFormat;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josep
 */
public class Informe_meseros extends javax.swing.JPanel {

    DefaultTableModel model;
    Timer timer;
    TimerTask timerTask;

    /**
     * Creates new form Informe_meseros
     */
    public Informe_meseros() {
        initComponents();
        iniciar_tabla();
        llenarTabla();
        timerTask = new TimerTask() {
            @Override
            public void run() {
                iniciar_tabla();
                llenarTabla();
            }
        };
        timer = new Timer();
        timer.scheduleAtFixedRate(timerTask, 1000, 1000);
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
        tabla_meseros = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabla_meseros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_meseros);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/meseros3.jpg"))); // NOI18N

        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MessageFormat Header = new MessageFormat("Menu");
        MessageFormat footer = new MessageFormat("Page[0,number,integer]");
        //String valores=llenar_tabla();
        try {
            tabla_meseros.print(JTable.PrintMode.NORMAL, Header, footer);
        } catch (java.awt.print.PrinterException ex) {
            System.out.println("Error al crear el archivo. " + ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void iniciar_tabla() {
        model=new DefaultTableModel();
        model.addColumn("Código");
        model.addColumn("Nombre");
        model.addColumn("Mesas atendidas");
        tabla_meseros.setModel(model);
    }

    private void llenarTabla() {
        for (codigo.facturacion carga : codigo.archivoFacturados.facturados) {
            if (verificarRepetido(carga.getNombre())) {
                String[] agregar = new String[3];
                agregar[0] = String.valueOf(busquedaCodigo(carga.getNombre()));
                agregar[1] = carga.getNombre();
                agregar[2] = String.valueOf(mesasAtendidas(carga.getNombre()));
                model.addRow(agregar);
            }

        }
    }

    private int busquedaCodigo(String nombre) {
        int cod = 0;
        for (datosMesero mesero : codigo.listaMeseros.meseros) {
            if (mesero.getNombre().equals(nombre)) {
                cod = mesero.getCodigo();
            }
        }
        return cod;
    }

    private int mesasAtendidas(String num) {
        int numero = 0;
        for (facturacion facturado : codigo.archivoFacturados.facturados) {
            if (facturado.getNombre().equals(num)) {
                numero++;
            }
        }
        return numero;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_meseros;
    // End of variables declaration//GEN-END:variables

    private boolean verificarRepetido(String nombre) {
        boolean retorno = true;
        for (int i = 0; i < model.getDataVector().size(); i++) {
            if (model.getValueAt(i, 1).equals(nombre)) {
                retorno = false;
            }
        }
        return retorno;
    }
}
