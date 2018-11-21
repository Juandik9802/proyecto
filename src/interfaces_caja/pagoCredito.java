/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_caja;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Juan Diego
 */
public class pagoCredito extends javax.swing.JFrame {

    String valores = "";
    JTable tabla_pedido;
    public int total_por_mesa = 0;

    /**
     * Creates new form pagoCredito
     */
    public pagoCredito(JTable tablaPedido) {
        initComponents();
        this.setLocation(500, 300);
        obtener_precio();
        tabla_pedido = tablaPedido;
    }

    private void obtener_precio() {
        int fila = tabla_pedido.getRowCount();
        for (int i = 0; i < fila; i++) {

            int valor = (int) tabla_pedido.getValueAt(i, 1);
            total_por_mesa = total_por_mesa + valor;
            // Con esta condición solo ponemos comas hasta el penúltimo valor :)
        }
        valores += total_por_mesa;
        cant_pagar.setText(valores);
        //JOptionPane.showMessageDialog(null, "valores de la columna1: " + valores);
    }

    private void guarda_precios() {
        FileWriter fichero = null;  //objeto principal (archivo)
        PrintWriter linea;   //objeto de contenido de archivo
        try {
            fichero = new FileWriter("src/ficheros/Precios efectivo.txt", true); //crea el archivo 
            linea = new PrintWriter(fichero); //apunta el PrintWriter al archivo creado
            // Inicia  
            String cadena = null;
            cadena = Integer.toString(total_por_mesa) + ";" + "Debito" + ";";
            linea.println(cadena);

            //escribiendo en el archivo            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error creando archivo");
        } finally {
            try {
                if (fichero != null) {
                    fichero.close();
                }
            } catch (IOException e1) {
                JOptionPane.showMessageDialog(null, "Error cerrando archivo");
            }
        }
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
        jLabel3 = new javax.swing.JLabel();
        cant_pagar = new javax.swing.JTextField();
        confirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("credito");

        jLabel3.setText("Cantidad a pagar:");

        cant_pagar.setEditable(false);

        confirmar.setText("Confirmar pago");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(confirmar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cant_pagar)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cant_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        guarda_precios();
    }//GEN-LAST:event_confirmarActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cant_pagar;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}