/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_administrador;

/**
 *
 * @author josep
 */
public class Informes extends javax.swing.JPanel {

    /**
     * Creates new form Informes
     */
    public Informes() {
        initComponents();
        Abrir_pagos();
        Abrir_platos();
    }
    Interfaces_administrador.Informe_modos_de_pago panelpagos;
    Interfaces_administrador.Informe_platos panelplatos;
    private String vp1="0";
    private String vp2="0";
    private String vp3="0";
    private String vp4="0";
    
    private void Abrir_pagos(){
        if(vp1.equals("0")){
        panelpagos=new Interfaces_administrador.Informe_modos_de_pago();
        principal_informes.addTab("Informe de pagos", panelpagos);
        principal_informes.setSelectedComponent(panelpagos);
        }else{
        principal_informes.setSelectedComponent(panelpagos);
        }
        vp1="1";
    }
    private void Abrir_platos(){
        if(vp2.equals("0")){
        panelplatos=new Interfaces_administrador.Informe_platos();
        principal_informes.addTab("menu", panelplatos);
        principal_informes.setSelectedComponent(panelplatos);
        }else{
        principal_informes.setSelectedComponent(panelplatos);
        }
        vp2="1";
    }
    /*private void Abrir_panel3(){
        if(vp3.equals("0")){
        panel3=new Interfaces_administrador.Informes();
        principal.addTab("Informes", panel3);
        principal.setSelectedComponent(panel3);
        }else{
        principal.setSelectedComponent(panel3);
        }
        vp3="1";
    }
    private void Abrir_panel4(){
        if(vp4.equals("0")){
        panel4=new Interfaces_administrador.meseros();
        principal.addTab("meseros", panel4);
        principal.setSelectedComponent(panel4);
        }else{
        principal.setSelectedComponent(panel4);
        }
        vp4="1";
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal_informes = new javax.swing.JTabbedPane();
        modo_pago = new javax.swing.JButton();
        platos_dia = new javax.swing.JButton();
        informe_meseros = new javax.swing.JButton();
        informe_tiempo = new javax.swing.JButton();

        modo_pago.setText("Modo de pago");

        platos_dia.setText("Platos pedidos en el dia");

        informe_meseros.setText("Meseros");

        informe_tiempo.setText("Tiempos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(principal_informes)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modo_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(platos_dia)
                        .addGap(18, 18, 18)
                        .addComponent(informe_meseros, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(informe_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modo_pago)
                    .addComponent(platos_dia)
                    .addComponent(informe_meseros)
                    .addComponent(informe_tiempo))
                .addGap(18, 18, 18)
                .addComponent(principal_informes, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton informe_meseros;
    private javax.swing.JButton informe_tiempo;
    private javax.swing.JButton modo_pago;
    private javax.swing.JButton platos_dia;
    private javax.swing.JTabbedPane principal_informes;
    // End of variables declaration//GEN-END:variables

    
}
