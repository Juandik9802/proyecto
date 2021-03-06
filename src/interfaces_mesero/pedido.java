/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_mesero;

import codigo.menusCarga;
import codigo.platillo;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan Diego
 */
public class pedido extends javax.swing.JPanel {

    int cont = 0;
    private String nombreMesero;

    /**
     * Creates new form pedido
     */
    public pedido(String nombre) {
        /**
         * "Mesa","Plato","Bebidas","Postre","Añadir","Quitar","Precio"
         */
        this.nombreMesero = nombre;
        initComponents();
        cargartabla();
        cargarComidas();
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
        combo_platos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cargar_pedido = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMesero = new javax.swing.JTable();
        numero_mesa = new javax.swing.JTextField();
        comboBebidas = new javax.swing.JComboBox<>();
        comboPostres = new javax.swing.JComboBox<>();
        bloquearPedido = new javax.swing.JButton();
        añadir = new javax.swing.JComboBox<>();
        quitar = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Mesa:");

        combo_platos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Comida--" }));
        combo_platos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_platosItemStateChanged(evt);
            }
        });

        jLabel3.setText("Quitar porcion:");

        jLabel5.setText("Añadir porcion:");

        cargar_pedido.setText("Cargar pedido");
        cargar_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargar_pedidoActionPerformed(evt);
            }
        });

        TablaMesero.setAutoCreateRowSorter(true);
        TablaMesero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaMesero.setColumnSelectionAllowed(true);
        TablaMesero.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaMesero);
        TablaMesero.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        numero_mesa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numero_mesaKeyTyped(evt);
            }
        });

        comboBebidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Bebida--" }));

        comboPostres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Postres--" }));

        bloquearPedido.setText("Enviar pedido");
        bloquearPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloquearPedidoActionPerformed(evt);
            }
        });

        añadir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));

        quitar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(numero_mesa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(384, 384, 384)
                                .addComponent(cargar_pedido))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo_platos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(comboBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quitar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(comboPostres, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bloquearPedido)
                .addGap(227, 227, 227))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addComponent(numero_mesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_platos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPostres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(añadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(quitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(cargar_pedido)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bloquearPedido)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private DefaultTableModel model = new DefaultTableModel();
    private ArrayList<codigo.pedido> Array = new ArrayList();

    private void cargar_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargar_pedidoActionPerformed
        if (combo_platos.getSelectedItem() == "--Comida--" || comboBebidas.getSelectedItem() == "--Bebida--" || comboPostres.getSelectedItem() == "--Postres--" || numero_mesa.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Error. verifique que los campos esten llenos");
        } else {
            int mesa = Integer.parseInt(numero_mesa.getText());
            if (!(mesa > codigo.archivoGeneral.buscar())) {
                Calendar calendario = Calendar.getInstance();
                String hora = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY));//tomar la hora del sistema
                hora = hora + ";" + String.valueOf(calendario.get(Calendar.MINUTE));//tomar los minutos del sistema
                //añadiendo al arreglo;
                codigo.archivoPedido.añadirArray(Integer.parseInt(numero_mesa.getText()), (String) combo_platos.getSelectedItem(), (String) comboBebidas.getSelectedItem(), (String) comboPostres.getSelectedItem(),
                        (String) añadir.getSelectedItem(), (String) quitar.getSelectedItem(), Integer.parseInt(codigo.archivoPlatos.busqueda((String) combo_platos.getSelectedItem())), hora, this.nombreMesero, true);
                codigo.archivoCocina.añadirArray(Integer.parseInt(numero_mesa.getText()), (String) combo_platos.getSelectedItem(), (String) comboBebidas.getSelectedItem(), (String) comboPostres.getSelectedItem(),
                        (String) añadir.getSelectedItem(), (String) quitar.getSelectedItem(), Integer.parseInt(codigo.archivoPlatos.busqueda((String) combo_platos.getSelectedItem())), hora, this.nombreMesero, true);

                codigo.archivoAdiciones.añadir(Integer.parseInt(numero_mesa.getText()), (String) combo_platos.getSelectedItem(), (String) comboBebidas.getSelectedItem(), (String) comboPostres.getSelectedItem(),
                        (String) añadir.getSelectedItem(), (String) quitar.getSelectedItem(), Integer.parseInt(codigo.archivoPlatos.busqueda((String) combo_platos.getSelectedItem())), hora, this.nombreMesero, true);;

                codigo.archivoPedido.crear();
                int contador = codigo.archivoPedido.pedidos.size() - 1;
                model.insertRow(cont, new Object[]{});
                model.setValueAt(codigo.archivoPedido.pedidos.get(contador).getNumMesas(), cont, 0);
                model.setValueAt(codigo.archivoPedido.pedidos.get(contador).getPlato(), cont, 1);
                model.setValueAt(codigo.archivoPedido.pedidos.get(contador).getBebida(), cont, 2);
                model.setValueAt(codigo.archivoPedido.pedidos.get(contador).getPostre(), cont, 3);
                model.setValueAt(codigo.archivoPedido.pedidos.get(contador).getAñadirPorcion(), cont, 4);
                model.setValueAt(codigo.archivoPedido.pedidos.get(contador).getQuitarPotcion(), cont, 5);
                model.setValueAt(codigo.archivoPedido.pedidos.get(contador).getPrecio(), cont, 6);
                cont++;
            } else {
                JOptionPane.showMessageDialog(null, "Mesa no existe");
            }
        }

    }//GEN-LAST:event_cargar_pedidoActionPerformed

    private void bloquearPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloquearPedidoActionPerformed
        comboBebidas.setEnabled(false);
        comboPostres.setEnabled(false);
        combo_platos.setEnabled(false);
        añadir.setEnabled(false);
        quitar.setEnabled(false);
        numero_mesa.setEnabled(false);
        cargar_pedido.setEnabled(false);
    }//GEN-LAST:event_bloquearPedidoActionPerformed

    private void numero_mesaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero_mesaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_numero_mesaKeyTyped

    private void combo_platosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_platosItemStateChanged
        añadir.removeAllItems();
        quitar.removeAllItems();
        añadir.addItem("Nada");
        quitar.addItem("Nada");
        llenarPorciones();
    }//GEN-LAST:event_combo_platosItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaMesero;
    private javax.swing.JComboBox<String> añadir;
    private javax.swing.JButton bloquearPedido;
    private javax.swing.JButton cargar_pedido;
    private javax.swing.JComboBox<String> comboBebidas;
    private javax.swing.JComboBox<String> comboPostres;
    private javax.swing.JComboBox<String> combo_platos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numero_mesa;
    private javax.swing.JComboBox<String> quitar;
    // End of variables declaration//GEN-END:variables

    private void cargarComidas() {
        String Dia = null;
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_WEEK);
        switch (dia) {
            case 1:
                Dia = "Domingo";
                break;
            case 2:
                Dia = "Lunes";
                break;
            case 3:
                Dia = "Martes";
                break;
            case 4:
                Dia = "Miercoles";
                break;
            case 5:
                Dia = "Jueves";
                break;
            case 6:
                Dia = "Viernes";
                break;
            case 7:
                Dia = "Sabado";
                break;
        }
        //codigo.archivoMenus.mostrarPlato;
        for (menusCarga carga : codigo.archivoMenus.mostrarMenu) {
            if (Dia.equals(carga.getDia())) {
                for (String string : carga.getAlmuerzos()) {
                    combo_platos.addItem(string);
                }
                for (String string : carga.getCenas()) {
                    combo_platos.addItem(string);
                }
                for (String string : carga.getBebidas()) {
                    comboBebidas.addItem(string);
                }
                for (String string : carga.getPostres()) {
                    comboPostres.addItem(string);
                }
            }
        }
    }

    private void cargartabla() {
        model.addColumn("Mesa");
        model.addColumn("Plato");
        model.addColumn("Bebidas");
        model.addColumn("Postre");
        model.addColumn("Añadir");
        model.addColumn("Quitar");
        model.addColumn("Precio");
        TablaMesero.setModel(model);
    }

    private void llenarPorciones() {
        for (platillo plato : codigo.archivoPlatos.platos) {
            if (plato.getNombre().equals(combo_platos.getSelectedItem())) {
                for (String object : plato.getPorcion()) {
                    añadir.addItem(object);
                    quitar.addItem(object);
                }
            }
        }
    }
}
