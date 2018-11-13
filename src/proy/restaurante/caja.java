/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.restaurante;

import codigo.boton;
import interfaces_caja.pago_efectivo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;



/**
 *
 * @author Juan Diego
 */
public class caja extends javax.swing.JFrame{
    
    public void crea_mesas(){
        cant_mesas=codigo.archivoGeneral.buscar();
    }
    
    public ArrayList<boton> botones= new ArrayList();
    public int indice;
    public short cont=1;
    public int cant_mesas;
    public boton boton;
    
    /**
     * Creates new form caja
     */
    public caja() {
        initComponents();
        this.setLocationRelativeTo(null);
        indice=1;
        crea_mesas();
        espacio_mesas();
       
    }
    
    public void espacio_mesas(){
        while(cont<=cant_mesas){
            ImageIcon icono=new ImageIcon("src/imagenes/iconoMesa.png");
            boton=new boton(indice,false, "mesa "+String.valueOf(indice), icono);
            mesas_caja.add(boton);
            botones.add(boton); 
            
            indice++;
            mesas_caja.updateUI();
            cont++;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        mesas_caja = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        mesas_caja.setLayout(new java.awt.GridLayout(3, 0));
        jScrollPane1.setViewportView(mesas_caja);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mesas_caja;
    // End of variables declaration//GEN-END:variables
}
