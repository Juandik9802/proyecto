/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_administrador;

import codigo.facturacion;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josep
 */
public class Informe_Cantidad extends javax.swing.JPanel {

    DefaultTableModel model;
    Timer timer;
    TimerTask timerTask;

    /**
     * Creates new form Informe_Cantidad
     */
    public Informe_Cantidad() {
        initComponents();
        iniciar_tabla();
        llenarfila();
        catidad();
        timerTask = new TimerTask() {
            @Override
            public void run() {
                iniciar_tabla();
                llenarfila();
                catidad();
            }
        };
        timer=new Timer();
        timer.scheduleAtFixedRate(timerTask, 1000, 1000);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imprimir = new javax.swing.JButton();
        cantidad = new javax.swing.JTextField();

        setLayout(null);

        tablaCantidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaCantidad.setEnabled(false);
        tablaCantidad.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tablaCantidad);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 260, 452, 100);

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

        cantidad.setEditable(false);
        add(cantidad);
        cantidad.setBounds(169, 400, 140, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        MessageFormat Header = new MessageFormat("Informe cantida");
        MessageFormat footer = new MessageFormat("Page[0,number,integer]");
        try {
            tablaCantidad.print(JTable.PrintMode.NORMAL, Header, footer);
        } catch (java.awt.print.PrinterException ex) {
            System.out.println("Error al crear el archivo. " + ex);
        }
    }//GEN-LAST:event_imprimirActionPerformed

    private void iniciar_tabla() {
        model = new DefaultTableModel();
        model.addColumn("Se a despachado");
        model.addColumn("Cantidad");
        tablaCantidad.setModel(model);

    }

    int j = 0;

    private void llenarfila() {
        int i = 0;
        for (codigo.facturacion object : codigo.archivoFacturados.facturados) {
            for (String plato : object.getPlatos()) {
                if (platoBusqueda(plato) && !plato.equals("")) {
                    model.insertRow(i, new Object[]{});
                    model.setValueAt(plato, j, 0);
                    model.setValueAt(buscar(plato), j, 1);
                }
            }
            i++;
        }

    }

    private boolean platoBusqueda(String recibido) {
        boolean entregar = true;
        for (int i = 0; i < model.getDataVector().size(); i++) {
            if (model.getValueAt(i, 0).equals(recibido)) {
                entregar = false;
            }
        }
        return entregar;
    }

    private int buscar(String p) {
        int contador = 0;
        for (facturacion facturado : codigo.archivoFacturados.facturados) {
            for (String plato : facturado.getPlatos()) {
                if (plato.equals(p)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    private void catidad() {
        String valores = "";
        int fila = tablaCantidad.getRowCount();
        int total_por_mesa = 0;
        for (int i = 0; i < fila; i++) {
            int valor = (int) tablaCantidad.getValueAt(i, 1);
            total_por_mesa = total_por_mesa + valor;
        }
        valores += total_por_mesa;
        cantidad.setText(valores);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton imprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCantidad;
    // End of variables declaration//GEN-END:variables
}
